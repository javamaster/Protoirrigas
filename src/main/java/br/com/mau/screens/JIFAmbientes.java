/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mau.screens;

import br.com.mau.communication.BluetoothCommunicator;
import gnu.io.CommPortIdentifier;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import br.com.mau.model.Ambiente;
import br.com.mau.dao.impl.GenericDAO;
import br.com.mau.controller.PersistenceController;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import br.com.mau.relatorios.DataExportExcel;
import br.com.mau.relatorios.FileCustomFilter;
import java.io.PrintWriter;
import javax.swing.JFileChooser;


/**
 *
 * @author Mauricio
 */
public class JIFAmbientes extends javax.swing.JInternalFrame {

    private int intervalo_logs = 6, contador = 0, max_columns = 15;
   
    private PersistenceController persistenceController;  
    
    private Date min_u_hora_hj = new Date();
    
    private Date max_u_hora_hj = new Date();
    
    private Date min_t_hora_hj = new Date();
    
    private Date max_t_hora_hj = new Date();
    
    private float min_u_valor_hj=0,max_u_valor_hj=0,min_t_valor_hj=0,max_t_valor_hj=0;
    
    private static final int CONNECTED = 1, NOT_CONNECTED = 0;
    
    /**
     * Creates new form JIFAmbientes
     */
    public JIFAmbientes() {
        initComponents();
        communicator = new BluetoothCommunicator();
        persistenceController = new PersistenceController();
        persistenceController.loadPersistenceContext();
        btStop.setEnabled(false);
        jbtnExportar.setEnabled(false);
        limparTabela();
        loadPorts();
        loadConnection();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable_ambiente = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jedit_exibicoes = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        panelConfig = new javax.swing.JPanel();
        labelImageStatus = new javax.swing.JLabel();
        cbPortas = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        tfRate = new javax.swing.JTextField();
        btStart = new javax.swing.JButton();
        btStop = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        labelStatus = new javax.swing.JLabel();
        jbtnExportar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        edt_minima_hj_t_hora = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        edt_minima_hj_t_valor = new javax.swing.JTextField();
        edt_maxima_hj_t_hora = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        edt_maxima_hj_t_valor = new javax.swing.JTextField();
        edt_minima_hj_u_hora = new javax.swing.JTextField();
        edt_maxima_hj_u_hora = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        edt_minima_hj_u_valor = new javax.swing.JTextField();
        edt_maxima_hj_u_valor = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 255, 204));
        setClosable(true);
        setIconifiable(true);
        setTitle("Ambientes");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jtable_ambiente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data", "Umidade (solo)", "Temperatura (Celsius)", "Luminosidade (Lums)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtable_ambiente);

        jLabel3.setText("Limpar a cada");

        jedit_exibicoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jedit_exibicoesActionPerformed(evt);
            }
        });

        jLabel4.setText("exibições");

        panelConfig.setBackground(new java.awt.Color(255, 255, 255));
        panelConfig.setBorder(javax.swing.BorderFactory.createTitledBorder("config"));

        labelImageStatus.setBackground(new java.awt.Color(255, 255, 255));
        labelImageStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/images/no_connected.png"))); // NOI18N

        cbPortas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPortasActionPerformed(evt);
            }
        });

        jLabel2.setText("Porta:");

        jLabel15.setText("Rate:");

        btStart.setText("START");
        btStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btStartActionPerformed(evt);
            }
        });

        btStop.setText("STOP");
        btStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btStopActionPerformed(evt);
            }
        });

        jLabel16.setText("Status:");

        labelStatus.setText("ok");

        javax.swing.GroupLayout panelConfigLayout = new javax.swing.GroupLayout(panelConfig);
        panelConfig.setLayout(panelConfigLayout);
        panelConfigLayout.setHorizontalGroup(
            panelConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConfigLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(labelImageStatus)
                .addGap(59, 59, 59)
                .addGroup(panelConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfRate, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbPortas, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelStatus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(panelConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btStop, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btStart, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );
        panelConfigLayout.setVerticalGroup(
            panelConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConfigLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panelConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelImageStatus)
                    .addGroup(panelConfigLayout.createSequentialGroup()
                        .addGroup(panelConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(labelStatus))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btStart)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cbPortas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(btStop))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jbtnExportar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/images/excel.png"))); // NOI18N
        jbtnExportar.setText("Exportar");
        jbtnExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExportarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jedit_exibicoes, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(27, 27, 27)
                .addComponent(jbtnExportar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(panelConfig, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelConfig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jedit_exibicoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jbtnExportar))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Ambientes", jPanel2);

        jPanel4.setBackground(new java.awt.Color(204, 255, 204));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Temperatura");

        jLabel6.setText("- minima aferida: as");

        jLabel7.setText("- maxima aferida: as");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setText("Umidade");

        jLabel9.setText("- minima aferida: as");

        jLabel10.setText("- maxima aferida: as");

        jLabel11.setText("foi");

        jLabel12.setText("foi");

        jLabel13.setText("foi");

        jLabel14.setText("foi");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(14, 14, 14)))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(edt_minima_hj_t_hora)
                                    .addComponent(edt_maxima_hj_t_hora, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(edt_minima_hj_u_hora)
                                    .addComponent(edt_maxima_hj_u_hora))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(edt_minima_hj_u_valor))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(edt_maxima_hj_t_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(edt_minima_hj_t_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(edt_maxima_hj_u_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(162, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(edt_minima_hj_t_hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(edt_maxima_hj_t_hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(edt_minima_hj_t_valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(edt_maxima_hj_t_valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(27, 27, 27)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(edt_minima_hj_u_hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(edt_minima_hj_u_valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(edt_maxima_hj_u_hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(edt_maxima_hj_u_valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(269, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Estatistica", jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jedit_exibicoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jedit_exibicoesActionPerformed
        
        max_columns = Integer.parseInt(jedit_exibicoes.getText());
        
    }//GEN-LAST:event_jedit_exibicoesActionPerformed

    private void cbPortasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPortasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbPortasActionPerformed

    private void btStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btStartActionPerformed
        //        showImageStatusConnection();
        Object[] params = loadConnectionPane();

        if (params != null){

            Integer index = (Integer)params[2];

            if(index != -1){
                Integer rate = (Integer)params[1];
                communicator.connect(portas.get(index), rate);
                labelStatus.setText("Conexão estabelecida!!");
                changeConnectionIcon(CONNECTED);
                btStop.setEnabled(true);
                btStart.setEnabled(false);
                //Atualizar a tabela de ambientes
                timer = task();
            }
        }
        else{
            labelStatus.setText("Error: Confira os valores!!");
        }
    }//GEN-LAST:event_btStartActionPerformed

    private void btStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btStopActionPerformed
        if(communicator != null){
            communicator.close();
            btStop.setEnabled(false);
            btStart.setEnabled(true);
            labelStatus.setText("Sistema Desconectado!!");
            changeConnectionIcon(NOT_CONNECTED);
        }
        if(timer != null){
            //Para a tarefa responsável pelo preenchimento da tabela de dados;
            timer.cancel();
        }
    }//GEN-LAST:event_btStopActionPerformed

    private void jbtnExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExportarActionPerformed
            
            //Recupera do banco
            ArrayList<Ambiente> ambientes = getHistoricoAmbientes();
            DataExportExcel excel = null;
            
            if(ambientes != null){            
                JFileChooser chooser = new JFileChooser();
                FileCustomFilter filtro = new FileCustomFilter("excel files", new String[]{"xls"});
                chooser.setFileFilter(filtro);
                chooser.setAcceptAllFileFilterUsed(false);

                    int result = chooser.showSaveDialog(null);

                    if(result == JFileChooser.APPROVE_OPTION){
                        PrintWriter pw = null;
                        try {
                            String filepath = chooser.getSelectedFile().getAbsolutePath();
                            String pathName = null;

                            excel = new DataExportExcel();
                            excel.expExcel(pathName, ambientes);
                            
                        }catch(Exception e){
                            e.printStackTrace();
                        }
        }
       }
            
    }//GEN-LAST:event_jbtnExportarActionPerformed

    private Object[] loadConnectionPane() {
        String portaName = (String) cbPortas.getSelectedItem();
        int index = cbPortas.getSelectedIndex();
        Integer rate = null;
        
        if(!tfRate.getText().trim().isEmpty()){
            rate = Integer.parseInt(tfRate.getText().trim());
        }
        
        Object[] parametros = {portaName,rate,index};
        
        if(portaName != null && rate!=null){
            return parametros;
        }
        return null;         
    }
    
    private void verifica_mx_min(float temperatura, float umidade){
        DateFormat formatedDate = new SimpleDateFormat("HH:mm:ss");
        
        if(min_u_valor_hj == 0){ // primeira execução
                min_u_valor_hj = umidade;
                max_u_valor_hj = umidade;
                min_t_valor_hj = temperatura;
                max_t_valor_hj = temperatura;
                
                min_u_hora_hj = new Date();
                max_u_hora_hj = new Date();
                min_t_hora_hj = new Date();
                max_t_hora_hj = new Date(); 
                
                edt_minima_hj_u_hora.setText((String)formatedDate.format(min_u_hora_hj));
                edt_minima_hj_u_valor.setText(""+min_u_valor_hj);
                
                edt_maxima_hj_u_hora.setText((String)formatedDate.format(max_u_hora_hj));
                edt_maxima_hj_u_valor.setText(""+max_u_valor_hj);
                
                edt_minima_hj_t_hora.setText((String)formatedDate.format(min_t_hora_hj));
                edt_minima_hj_t_valor.setText(""+min_t_valor_hj);
                
                edt_maxima_hj_t_hora.setText((String)formatedDate.format(max_t_hora_hj));
                edt_maxima_hj_t_valor.setText(""+max_t_valor_hj);
        }
        
        if(min_u_valor_hj > umidade){
            min_u_valor_hj = umidade;
            min_u_hora_hj = new Date();
            edt_minima_hj_u_hora.setText(formatedDate.format(min_u_hora_hj));
            edt_minima_hj_u_valor.setText(""+min_u_valor_hj);
        }
        if(max_u_valor_hj<umidade){
                max_u_valor_hj = umidade;
                max_u_hora_hj = new Date();
                edt_maxima_hj_u_hora.setText((String)formatedDate.format(max_u_hora_hj));
                edt_maxima_hj_u_valor.setText(""+max_u_valor_hj);
        }
        
        if(min_t_valor_hj>temperatura){
                min_t_valor_hj = temperatura;
                min_t_hora_hj = new Date();
                edt_minima_hj_t_hora.setText((String)formatedDate.format(min_t_hora_hj));
                edt_minima_hj_t_valor.setText(""+min_t_valor_hj);
        }
        
        if(max_t_valor_hj<temperatura){
            max_t_valor_hj = temperatura;
            max_t_hora_hj = new Date();
            edt_maxima_hj_t_hora.setText((String)formatedDate.format(max_t_hora_hj));
            edt_maxima_hj_t_valor.setText(""+max_t_valor_hj);
         }
        
    }
    
    private void loadPorts(){
        
        communicator.initialize();
        portas = communicator.getPorts();
        
        if(!portas.isEmpty()){
            for (CommPortIdentifier portId : portas){
                cbPortas.addItem(portId.getName()); 
                System.out.println("porta: "+portId.getName());
            }
            labelStatus.setText("Comunicação Serial autorizada!!");
        }
        else{
            labelStatus.setText("Nenhuma porta identificada!!");
        }
        
    }
    
    public Timer task(){
      long TEMPO = (1000 * intervalo_logs); 
      
      Timer timer = null;  
      
        if (timer == null) {  
            timer = new Timer();  
            
            TimerTask tarefa = new TimerTask() {  
            
                GenericDAO dao = new GenericDAO(persistenceController.getPersistenceContext(), Ambiente.class);
             
              @Override
              public void run() {  
                try {
                    
                    Long lastID = null;
                    Ambiente lastAmbiente = null;
                 
                    lastID = dao.getLastIdRecord();
                    
                    if(lastID != null){
                        lastAmbiente = (Ambiente) dao.getByID(lastID);
                        //atualizar dados preechendo a tabela
                        preencher_tabela(lastAmbiente);
                        verifica_mx_min(lastAmbiente.getTemperature(), lastAmbiente.getHumidity());
                        jbtnExportar.setEnabled(true);
                    }                   
                    
                    if(contador == max_columns){
                        DefaultTableModel model = (DefaultTableModel) jtable_ambiente.getModel();
                        model.setNumRows(0);     
                        contador = 0;
                    }
                  
                } catch (Exception e) {  
                    e.printStackTrace(); 
                }  
              }  
            };  
            
            timer.scheduleAtFixedRate(tarefa, 0, TEMPO);  
            
        }
        return timer;
  }
    
    public void preencher_tabela(Ambiente ambiente){
        
        
       DefaultTableModel model = (DefaultTableModel) jtable_ambiente.getModel();
        
        if(contador == 0) {
            model.setNumRows(0);            
        }
        
        try {            
                contador++;
                DateFormat formato = new SimpleDateFormat("HH:mm:ss");  
                String formattedDate = formato.format(ambiente.getRecordDate());
                
                model.addRow(new Object[]{formattedDate,ambiente.getHumidity(), 
                ambiente.getTemperature(),ambiente.getLuminosity()});                

            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro ao preencher tabela"+e);
        }
    }
    
    private void limparTabela(){
            DefaultTableModel model = (DefaultTableModel) jtable_ambiente.getModel();
            model.setNumRows(0);
            contador = 0;
    }
    
     private void loadConnection() {
        
        if(status_connect == Boolean.TRUE){
            
            changeConnectionIcon(CONNECTED);
            //habilita botao de parada e desabilita botao start
            btStart.setEnabled(false);
            btStop.setEnabled(true);
            //inicia tarefa de preenchimento de tabela
            timer = task();
            
        }
    }
     
     private void changeConnectionIcon(int status) {
       switch(status){
           case CONNECTED:
               labelImageStatus.setIcon(new ImageIcon(JIFAmbientes.class.getResource("/br/images/status_txrx.png")));        
               status_connect = true;
               break;
           case NOT_CONNECTED:
               labelImageStatus.setIcon(new ImageIcon(JIFAmbientes.class.getResource("/br/images/status_idle.png")));
               status_connect = false;
               break;
           default:
               throw new IllegalArgumentException("Option Not Exists!!");
       }
       
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btStart;
    private javax.swing.JButton btStop;
    private javax.swing.JComboBox cbPortas;
    private javax.swing.JTextField edt_maxima_hj_t_hora;
    private javax.swing.JTextField edt_maxima_hj_t_valor;
    private javax.swing.JTextField edt_maxima_hj_u_hora;
    private javax.swing.JTextField edt_maxima_hj_u_valor;
    private javax.swing.JTextField edt_minima_hj_t_hora;
    private javax.swing.JTextField edt_minima_hj_t_valor;
    private javax.swing.JTextField edt_minima_hj_u_hora;
    private javax.swing.JTextField edt_minima_hj_u_valor;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jbtnExportar;
    private javax.swing.JTextField jedit_exibicoes;
    private javax.swing.JTable jtable_ambiente;
    private javax.swing.JLabel labelImageStatus;
    private javax.swing.JLabel labelStatus;
    private javax.swing.JPanel panelConfig;
    private javax.swing.JTextField tfRate;
    // End of variables declaration//GEN-END:variables
    private BluetoothCommunicator communicator;
    private ArrayList<CommPortIdentifier> portas;
    private static GenericDAO dao;
    private Timer timer;
    private static boolean status_connect;
    private DataExportExcel exportExcel;

    private ArrayList<Ambiente> getHistoricoAmbientes() {
        dao = new GenericDAO(persistenceController.getPersistenceContext(), Ambiente.class);
        
        return (ArrayList<Ambiente>) dao.findAll();
    }
}
