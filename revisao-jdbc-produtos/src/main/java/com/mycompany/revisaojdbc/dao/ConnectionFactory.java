package com.mycompany.revisaojdbc.dao;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class ConnectionFactory {

    private static final Properties DB_PROPERTIES = new Properties();

    static {
        try (InputStream input = ConnectionFactory.class.getClassLoader().getResourceAsStream("db.properties")) {
            if (input == null) {
                throw new IllegalStateException("Arquivo db.properties nao encontrado no classpath.");
            }
            DB_PROPERTIES.load(input);
        } catch (IOException ex) {
            throw new IllegalStateException("Erro ao carregar db.properties.", ex);
        }
    }

    private ConnectionFactory() {
    }

    public static Connection getConnection() throws SQLException {
        String url = DB_PROPERTIES.getProperty("db.url");
        String user = DB_PROPERTIES.getProperty("db.user");
        String password = DB_PROPERTIES.getProperty("db.password");
        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            String hostPort = extrairHostPorta(url);
            throw new SQLException(
                    "Falha ao conectar no banco em " + hostPort
                    + ". Verifique src/main/resources/db.properties (db.url, db.user, db.password), "
                    + "se o servico do banco esta ativo e se o banco 'revisao_jdbc' foi criado.",
                    ex);
        }
    }

    private static String extrairHostPorta(String url) {
        if (url == null) {
            return "host desconhecido";
        }
        Pattern pattern = Pattern.compile("jdbc:[^:]+://([^/?]+)");
        Matcher matcher = pattern.matcher(url);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return "url invalida";
    }
}
