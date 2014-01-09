/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mau.tablemodel;

import br.com.mau.model.Setor;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Mauricio
 */
public class SetorTableModel extends AbstractTableModel {

    
    private ArrayList<Setor> setores;
    private final int COLUMNS = 7;

    public SetorTableModel() {
    }

    public SetorTableModel(ArrayList<Setor> setores) {
        this.setores = setores;
    }    
    
    @Override
    public int getRowCount() {
        return setores.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMNS;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        Setor s = setores.get(rowIndex);
        
        switch(columnIndex){
            case 0:
                return s.getNome();
            case 1:
                return s.getCultura().getNome();
            case 2:
                return s.getTipoSolo();
            case 3:
                return s.getDescricao();
            case 4:
                return s.getComprimento();
            case 5:
                return s.getLargura();
            case 6:
                return s.isStatus();                
        }
        return null;
    }
    
    @Override
    public String getColumnName(int column) {
    
        switch(column){
            case 0:
                return "Nome";
            case 1:
                return "Cultura";
            case 2:
                return "TipoSolo";
            case 3:
                return "Descricao";
            case 4:
                return "Comprimento";
            case 5:
                return "Largura";
            case 6: 
                return "Status";
        }
        return "";
    }
    
    public Setor getSetorAt(int index){
        return setores.get(index);
    }
}
