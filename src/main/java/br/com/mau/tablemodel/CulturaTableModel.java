/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mau.tablemodel;

import br.com.mau.model.Cultura;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Mauricio
 */
public class CulturaTableModel extends AbstractTableModel{

    private ArrayList<Cultura> culturas;
    private final int COLUMNS = 4;
    
    public CulturaTableModel(ArrayList<Cultura> culturas) {
        this.culturas = culturas;
    }    
    

    @Override
    public int getRowCount() {
        return this.culturas.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMNS;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Cultura c = culturas.get(rowIndex);
        
        switch(columnIndex){
            case 0:
                return c.getId();
            case 1:
                return c.getNome();
            case 2:
                return c.getDescricao();
            case 3:
                return c.getCategoria();
        }
        
        return null;
    }

    @Override
    public String getColumnName(int column) {
    
        switch(column){
            case 0:
                return "Id";
            case 1:
                return "Nome";
            case 2:
                return "Descrição";
            case 3:
                return "Categoria";
        }
        return "";
    }
    
    public Cultura getCulturaAt(int i){
        return culturas.get(i);
    }
    
    
}
