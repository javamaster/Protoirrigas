/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prototirrigas.relatorios;

import br.com.mau.dao.impl.GenericDAO;
import br.com.mau.model.Cultura;
import br.com.mau.util.JPAUtil;
import java.awt.Font;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellStyle;

/**
 *
 * @author Mauricio
 */
public class DataExportExcel {
    
    private FileOutputStream fos;
    private HSSFWorkbook workBook;
    private HSSFSheet sheet;

    public DataExportExcel() {
        this.workBook = new HSSFWorkbook();
    }
    
    public void expExcel(String fileName){
        sheet = workBook.createSheet("aba1");
        
        try {
            fos = new FileOutputStream(new File(fileName));
            
            GenericDAO dao = new GenericDAO(JPAUtil.createEntityManager(), Cultura.class);
            ArrayList<Cultura> culturas = (ArrayList<Cultura>) dao.findAll();
            
            int i = 1;
            HSSFRow rowTitle = sheet.createRow(0);
            HSSFCellStyle style = workBook.createCellStyle();
            style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
            rowTitle.setRowStyle(style);
            rowTitle.createCell(0).setCellValue("ID");
            rowTitle.createCell(1).setCellValue("NOME");
            rowTitle.createCell(2).setCellValue("DESCRICAO");
            rowTitle.createCell(3).setCellValue("CATEGORIA");
            
            for (Cultura cultura : culturas) {
                HSSFRow row = sheet.createRow(i);
                row.createCell(0).setCellValue(cultura.getId());
                row.createCell(1).setCellValue(cultura.getNome());
                row.createCell(2).setCellValue(cultura.getDescricao());
                row.createCell(3).setCellValue(cultura.getCategoria());
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
    
    
    public static void main(String[] args) {
        
        DataExportExcel excel = new DataExportExcel();
        excel.expExcel("D:\\file.xls");
        
    }
    
    
}
