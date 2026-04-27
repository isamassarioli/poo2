package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class ConexaoBD {

    private static final String URL = System.getProperty("db.url", "jdbc:postgresql://localhost:5432/vacinacao");
    private static final String USUARIO = System.getProperty("db.user", "postgres");
    private static final String SENHA = System.getProperty("db.password", "isadora"); //essa é a minha senha aqui do notebook!!!

    private ConexaoBD() {
    }

    public static Connection getConexao() throws SQLException {
        return DriverManager.getConnection(URL, USUARIO, SENHA);
    }
}
