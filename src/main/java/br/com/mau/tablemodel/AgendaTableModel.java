/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mau.tablemodel;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import br.com.mau.model.Agenda;

/**
 *
 * @author Mauricio
 */
public class AgendaTableModel extends AbstractTableModel{
    
    private ArrayList<Agenda> listaAgenda;
    private final int COLUMNS = 5;

    public AgendaTableModel(ArrayList<Agenda> lista) {
        listaAgenda = lista;
    }
    
    @Override
    public int getRowCount() {
        return listaAgenda.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMNS;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Agenda agenda = listaAgenda.get(rowIndex);
        
        switch(columnIndex){
            case 0:
                return agenda.getNome();
            case 1: 
                return agenda.getDescricao();
            case 2:
                return agenda.getHora_inicio();
            case 3:
                return agenda.getHora_fim();
            case 4:
                return agenda.getAgenda();
        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0:
                return "Nome";
            case 1:
                return "Descricao";
            case 2:
                return "Hora_inicial";
            case 3:
                return "Hora_final";
            case 4:
                return "Agenda";            
        }
        return "";
    }
    public Agenda getAgendaAt(int index){
        return listaAgenda.get(index);
    }
    
    
}
