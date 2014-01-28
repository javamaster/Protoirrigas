/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prototirrigas.relatorios;

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
import br.com.mau.model.Setor;

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
    
    public void expExcel(String fileName, List list){
        sheet = workBook.createSheet("aba1");
        String name = fileName.concat(".xls");
        ArrayList<Setor> setores = (ArrayList<Setor>) list;
        try {
            fos = new FileOutputStream(new File(name));
            
//            GenericDAO dao = new GenericDAO(JPAUtil.createEntityManager(), Setor.class);
//            ArrayList<Setor> culturas = (ArrayList<Setor>) dao.findAll();
            
            int i = 1;
            HSSFRow rowTitle = sheet.createRow(0);
            HSSFCellStyle style = workBook.createCellStyle();
            style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
            rowTitle.setRowStyle(style);
            
            rowTitle.createCell(0).setCellValue("ID");
            rowTitle.createCell(1).setCellValue("NOME");
            rowTitle.createCell(2).setCellValue("DESCRICAO");
            
            
            for (Setor setor : setores){
                HSSFRow row = sheet.createRow(i);
                row.createCell(0).setCellValue(setor.getId());
                row.createCell(1).setCellValue(setor.getNome());
                row.createCell(2).setCellValue(setor.getDescricao());
                
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
        //excel.expExcel("D:\\file.xls");
        
    }
    
 }
