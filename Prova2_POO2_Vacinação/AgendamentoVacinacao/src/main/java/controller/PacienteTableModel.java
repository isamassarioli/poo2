/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Paciente;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author jean_
 */
public class PacienteTableModel extends AbstractTableModel {
    List<Paciente> lista = new ArrayList();
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Paciente pac = lista.get(rowIndex);
        return switch (columnIndex) {
            case 0 -> pac.getIdPaciente();
            case 1 -> pac.getNomePaciente();
            case 2 -> pac.getCpf();
            case 3 -> pac.getVacina().getNomeVacina();
            case 4 -> pac.getDataDose1();
            case 5 -> pac.getDataDose2();
            case 6 -> pac.getPrecisaDose2();
            default -> "";
        };
         
    }
    
    
    @Override
    public String getColumnName(int columnIndex ) {
        String[] nomes = {"ID", "Nome", "CPF", "Vacina" , "Data 1ª", "Data 2ª", "Precisa 2ª" };      
        return nomes[columnIndex];        
    }
    
    
    public void adicionar(Paciente pac) {
        lista.add(pac);
        fireTableRowsInserted( lista.size() - 1 , lista.size() - 1);
    }
    
    public Paciente getPaciente(int row) {
        return lista.get(row);
    }
    
    public void remover(int row) {
        lista.remove(row);
        fireTableRowsDeleted(lista.size() - 1 , lista.size() - 1);
    }
    
    public void setLista(List novaLista) {
        if ( novaLista == null || novaLista.isEmpty()) {
            if ( !lista.isEmpty() ) {
                lista.clear();
                fireTableRowsDeleted(0,0);
            }
        } else {
            lista = novaLista;
            fireTableRowsInserted( 0, lista.size() - 1);
        }
        
    }
    
    public List getLista() {
        return lista;
    }
    
}
