/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mau.relatorios;

import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author Mauricio
 */
public class FileCustomFilter extends FileFilter{

    private String descricao;
    private String[] extensoes;
    
    public FileCustomFilter(String descricao, String[] extensoes) {
        this.descricao = descricao;
        this.extensoes = extensoes;        
    }

    @Override
    public boolean accept(File f) {
        if(f.isDirectory()){
            return true;
        }
        else{
            String path = f.getAbsolutePath().toLowerCase();
            for (int i = 0; i < extensoes.length; i++) {
                String extensao = extensoes[i];
                if((path.endsWith(extensao))){
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String getDescription() {
        return descricao;
    }
    
}
