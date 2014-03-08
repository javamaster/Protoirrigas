/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mau.relatorios;

import javax.swing.JFileChooser;

/**
 *
 * @author Mauricio
 */
public class ControlFileChooser {
    
    private static JFileChooser choosers;
    
    public static void main(String[] args) {
        
        JFileChooser chooser = new JFileChooser();
        int retorno = chooser.showOpenDialog(null);
        
        if(retorno == JFileChooser.APPROVE_OPTION){
              String path = chooser.getSelectedFile().getAbsolutePath();
              System.out.println("Diretorio retornado: "+path);
        }
        else{
            System.out.println("Cancelou ou aconteceu um erro!!");
        }
    }
    
}
