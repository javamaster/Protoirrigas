/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mau.screens;

import br.com.mau.model.Agenda;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import br.com.mau.dao.impl.GenericDAO;
import br.com.mau.controller.PersistenceController;

/**
 *
 * @author Mauricio
 */
public class JIFAgendamento extends javax.swing.JInternalFrame {

    /**
     * Creates new form JIFAgendamento
     */
    public JIFAgendamento() {
        initComponents();
        persistence = new PersistenceController();
        persistence.loadPersistenceContext();
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
        panelAgendamento = new javax.swing.JPanel();
        jboxSegunda = new javax.swing.JCheckBox();
        jboxTerca = new javax.swing.JCheckBox();
        jboxQuarta = new javax.swing.JCheckBox();
        jboxQuinta = new javax.swing.JCheckBox();
        jboxSexta = new javax.swing.JCheckBox();
        jboxSabado = new javax.swing.JCheckBox();
        jboxDomingo = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Date date = new Date();
        SpinnerDateModel sm = new SpinnerDateModel(date, null, null, Calendar.HOUR_OF_DAY);
        jspinnerInicial = new javax.swing.JSpinner(sm);
        Date dateFinal = new Date();
        SpinnerDateModel sm2 = new SpinnerDateModel(dateFinal, null, null, Calendar.HOUR_OF_DAY);
        jspinnerTermino = new javax.swing.JSpinner(sm2);
        jbSalvar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        panelTarefaBasica = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taDescricao = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Agendamento");

        panelAgendamento.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Agendamento", 0, 0, null, java.awt.Color.blue));

        jboxSegunda.setText("segunda");
        jboxSegunda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jboxSegundaActionPerformed(evt);
            }
        });

        jboxTerca.setText("terça-feira");

        jboxQuarta.setText("quarta-feira");

        jboxQuinta.setText("quinta-feira");

        jboxSexta.setText("sexta-feira");
        jboxSexta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jboxSextaActionPerformed(evt);
            }
        });

        jboxSabado.setText("sábado");
        jboxSabado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jboxSabadoActionPerformed(evt);
            }
        });

        jboxDomingo.setText("domingo");
        jboxDomingo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jboxDomingoActionPerformed(evt);
            }
        });

        jLabel1.setText("Hora inicial:");

        jLabel3.setText("Hora término:");

        JSpinner.DateEditor de = new JSpinner.DateEditor(jspinnerInicial, "HH:mm:ss");
        jspinnerInicial.setEditor(de);

        JSpinner.DateEditor de2 = new JSpinner.DateEditor(jspinnerTermino, "HH:mm:ss");
        jspinnerTermino.setEditor(de2);

        javax.swing.GroupLayout panelAgendamentoLayout = new javax.swing.GroupLayout(panelAgendamento);
        panelAgendamento.setLayout(panelAgendamentoLayout);
        panelAgendamentoLayout.setHorizontalGroup(
            panelAgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAgendamentoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAgendamentoLayout.createSequentialGroup()
                        .addGroup(panelAgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jboxSegunda)
                            .addComponent(jboxTerca))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelAgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jboxQuinta)
                            .addComponent(jboxQuarta)))
                    .addGroup(panelAgendamentoLayout.createSequentialGroup()
                        .addGroup(panelAgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAgendamentoLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(panelAgendamentoLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(21, 21, 21)))
                        .addGroup(panelAgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jspinnerInicial, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                            .addComponent(jspinnerTermino))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(93, 93, 93)
                .addGroup(panelAgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jboxSabado)
                    .addGroup(panelAgendamentoLayout.createSequentialGroup()
                        .addComponent(jboxSexta)
                        .addGap(31, 31, 31)
                        .addComponent(jboxDomingo)))
                .addGap(62, 62, 62))
        );
        panelAgendamentoLayout.setVerticalGroup(
            panelAgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAgendamentoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panelAgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jboxSegunda)
                    .addComponent(jboxQuarta)
                    .addComponent(jboxSexta)
                    .addComponent(jboxDomingo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jboxTerca)
                    .addComponent(jboxQuinta)
                    .addComponent(jboxSabado))
                .addGroup(panelAgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAgendamentoLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(panelAgendamentoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(panelAgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jspinnerInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelAgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jspinnerTermino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jbSalvar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jbCancelar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        panelTarefaBasica.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tarefa Básica", 0, 0, null, new java.awt.Color(51, 102, 255)));

        jLabel4.setText("Nome:");

        jLabel5.setText("Descrição: ");

        taDescricao.setColumns(20);
        taDescricao.setRows(5);
        jScrollPane1.setViewportView(taDescricao);

        jLabel6.setText("Use este assistente para agendar o inicio e o termino do processo de irrigação.");

        javax.swing.GroupLayout panelTarefaBasicaLayout = new javax.swing.GroupLayout(panelTarefaBasica);
        panelTarefaBasica.setLayout(panelTarefaBasicaLayout);
        panelTarefaBasicaLayout.setHorizontalGroup(
            panelTarefaBasicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTarefaBasicaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTarefaBasicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTarefaBasicaLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(26, 26, 26)
                        .addComponent(tfNome))
                    .addGroup(panelTarefaBasicaLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelTarefaBasicaLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        panelTarefaBasicaLayout.setVerticalGroup(
            panelTarefaBasicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTarefaBasicaLayout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTarefaBasicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTarefaBasicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelAgendamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelTarefaBasica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jbCancelar, jbSalvar});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTarefaBasica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jbCancelar, jbSalvar});

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
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jboxSegundaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jboxSegundaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jboxSegundaActionPerformed

    private void jboxSextaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jboxSextaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jboxSextaActionPerformed

    private void jboxDomingoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jboxDomingoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jboxDomingoActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        Agenda agenda = getAgenda();
        persistAgenda(agenda);        
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jboxSabadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jboxSabadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jboxSabadoActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jbCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JCheckBox jboxDomingo;
    private javax.swing.JCheckBox jboxQuarta;
    private javax.swing.JCheckBox jboxQuinta;
    private javax.swing.JCheckBox jboxSabado;
    private javax.swing.JCheckBox jboxSegunda;
    private javax.swing.JCheckBox jboxSexta;
    private javax.swing.JCheckBox jboxTerca;
    private javax.swing.JSpinner jspinnerInicial;
    private javax.swing.JSpinner jspinnerTermino;
    private javax.swing.JPanel panelAgendamento;
    private javax.swing.JPanel panelTarefaBasica;
    private javax.swing.JTextArea taDescricao;
    private javax.swing.JTextField tfNome;
    // End of variables declaration//GEN-END:variables
    private PersistenceController persistence;
    
    public Agenda loadAgendaFromPanel(){
        String nome= null;
        
        if(!tfNome.getText().trim().isEmpty()){
            nome = tfNome.getText().trim();
        }
        
        String descricao = null;
        
        if(!taDescricao.getText().trim().isEmpty()){
            descricao = taDescricao.getText().trim();
        }
        
        boolean[] dias = {jboxSegunda.isSelected(),jboxTerca.isSelected(),jboxQuarta.isSelected(),
            jboxQuinta.isSelected(),jboxSexta.isSelected(),jboxSabado.isSelected(),jboxDomingo.isSelected()};
        
        SpinnerDateModel dateModelInicial = (SpinnerDateModel) jspinnerInicial.getModel();
        Date inicialDate = dateModelInicial.getDate();
        Calendar inicial = Calendar.getInstance();
        inicial.setTime(inicialDate);
        
        SpinnerDateModel dateModelTermino = (SpinnerDateModel) jspinnerTermino.getModel();
        Date terminoDate = dateModelTermino.getDate();
        Calendar termino = Calendar.getInstance();
        termino.setTime(terminoDate);
        
        return new Agenda(null, nome, descricao, dias, inicial ,termino);        
    }
    
    public Agenda getAgenda(){
        return loadAgendaFromPanel();
    }

    private void persistAgenda(Agenda agenda) {
        GenericDAO dao = new GenericDAO(persistence.getPersistenceContext(), Agenda.class);
        dao.save(agenda);
    }
    
}
