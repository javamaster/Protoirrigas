/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mau.relatorios;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import br.com.mau.model.Ambiente;

/**
 *
 * @author Mauricio
 */
public class DataExportExcel {
    
    private FileOutputStream fos;
    private HSSFWorkbook workBook;
    private HSSFSheet sheet;
    private ArrayList<Ambiente> ambientes;
    

    public DataExportExcel() {
        this.workBook = new HSSFWorkbook();
    }
    
    public void expExcel(String fileName, List list){
        sheet = workBook.createSheet("Dados");
        String name = fileName.concat(".xls");
        
        ambientes = (ArrayList<Ambiente>) list;
        
        try {
            fos = new FileOutputStream(new File(name));            
            int i = 1;            
            //Cria cabeçalho
            createHeader(sheet.createRow(0));
            
            for (Ambiente ambiente : ambientes){
              HSSFRow row = sheet.createRow(i);
              row.createCell(0).setCellValue(ambiente.getRecordDate());
              row.createCell(1).setCellValue(ambiente.getHumidity());
              row.createCell(2).setCellValue(ambiente.getTemperature());                
              row.createCell(3).setCellValue(ambiente.getLuminosity());                
              i++;
            }
             
            workBook.write(fos);           
                
            
        } catch (Exception ex) {
            Logger.getLogger(DataExportExcel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error ao exportar");
        }finally{
            try {
                fos.flush();
                fos.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    
    public void createHeader(HSSFRow rowTitle){
        
        HSSFCellStyle style = workBook.createCellStyle();
            style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
            rowTitle.setRowStyle(style);
            
            rowTitle.createCell(0).setCellValue("DATA");
            rowTitle.createCell(1).setCellValue("UMIDADE");
            rowTitle.createCell(2).setCellValue("TEMPERATURA");
            rowTitle.createCell(3).setCellValue("LUMINOSIDADE");       
           
    }
    
}
