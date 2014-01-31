/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mau.screens;

import br.com.mau.controller.PersistenceController;
import br.com.mau.dao.impl.GenericDAO;
import br.com.mau.model.Usuario;
import br.com.mau.util.JPAUtil;
import java.awt.Color;
import java.awt.Toolkit;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.metal.DefaultMetalTheme;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.plaf.metal.OceanTheme;

/**
 *
 * @author Mauricio
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        setSize(1000, 800);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setBackgroundDesktopPane();
        jDPCadastro.setEnabled(true);
        //desabilita menus
        disabledMenu();
        persistenceControler = new PersistenceController();
        persistenceControler.loadPersistenceContext();
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
        jDPCadastro = new javax.swing.JDesktopPane();
        panelLogin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfLogin = new javax.swing.JTextField();
        tfSenha = new javax.swing.JPasswordField();
        btEnter = new javax.swing.JButton();
        btCancel = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        menuBarMain = new javax.swing.JMenuBar();
        menuUsuario = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        menuAgenda = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jmenuComm = new javax.swing.JMenuItem();
        menuSetor = new javax.swing.JMenu();
        jmenuCadastrarSetor = new javax.swing.JMenuItem();
        menuCultura = new javax.swing.JMenu();
        jmenuCadastrarCultura = new javax.swing.JMenuItem();
        menuRelatorios = new javax.swing.JMenu();
        menuAmbientes = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Cadastro");

        jDPCadastro.setBackground(new java.awt.Color(240, 240, 240));

        panelLogin.setBackground(new java.awt.Color(153, 255, 153));
        panelLogin.setBorder(javax.swing.BorderFactory.createBevelBorder(0));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 0));
        jLabel1.setText("Login");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 0));
        jLabel2.setText("Senha");

        tfSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSenhaActionPerformed(evt);
            }
        });

        btEnter.setBackground(new java.awt.Color(102, 255, 102));
        btEnter.setForeground(new java.awt.Color(0, 102, 0));
        btEnter.setText("Enter");
        btEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEnterActionPerformed(evt);
            }
        });

        btCancel.setBackground(new java.awt.Color(102, 255, 102));
        btCancel.setForeground(new java.awt.Color(0, 102, 0));
        btCancel.setText("Cancel");

        jLabel3.setFont(new java.awt.Font("Script MT Bold", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 51));
        jLabel3.setText("Protoirrigas");

        javax.swing.GroupLayout panelLoginLayout = new javax.swing.GroupLayout(panelLogin);
        panelLogin.setLayout(panelLoginLayout);
        panelLoginLayout.setHorizontalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jLabel3))
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelLoginLayout.createSequentialGroup()
                                .addComponent(btEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                                .addComponent(btCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelLoginLayout.createSequentialGroup()
                                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                    .addComponent(tfSenha))))))
                .addContainerGap(119, Short.MAX_VALUE))
        );

        panelLoginLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btCancel, btEnter});

        panelLoginLayout.setVerticalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2))
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(tfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCancel)
                    .addComponent(btEnter))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        panelLoginLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btCancel, btEnter});

        panelLogin.setBounds(80, 30, 460, 250);
        jDPCadastro.add(panelLogin, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDPCadastro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 617, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDPCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
        );

        menuBarMain.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        menuUsuario.setText("Usuario");
        menuUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuUsuarioActionPerformed(evt);
            }
        });

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/images/user.png"))); // NOI18N
        jMenuItem1.setText("Cadastro Usuarios");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuUsuario.add(jMenuItem1);

        jMenuItem3.setText("Editar Usuario");
        menuUsuario.add(jMenuItem3);

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/images/cancel.png"))); // NOI18N
        jMenuItem4.setText("Sair");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        menuUsuario.add(jMenuItem4);

        menuBarMain.add(menuUsuario);

        menuAgenda.setText("Agenda");

        jMenuItem2.setText("Agendamento");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menuAgenda.add(jMenuItem2);

        jmenuComm.setText("Communication");
        jmenuComm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenuCommActionPerformed(evt);
            }
        });
        menuAgenda.add(jmenuComm);

        menuBarMain.add(menuAgenda);

        menuSetor.setText("Setor");

        jmenuCadastrarSetor.setText("Cadastrar Setor");
        jmenuCadastrarSetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenuCadastrarSetorActionPerformed(evt);
            }
        });
        menuSetor.add(jmenuCadastrarSetor);

        menuBarMain.add(menuSetor);

        menuCultura.setText("Cultura");

        jmenuCadastrarCultura.setText("Cadastrar Cultura");
        jmenuCadastrarCultura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenuCadastrarCulturaActionPerformed(evt);
            }
        });
        menuCultura.add(jmenuCadastrarCultura);

        menuBarMain.add(menuCultura);

        menuRelatorios.setText("Relatorios");
        menuRelatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRelatoriosActionPerformed(evt);
            }
        });

        menuAmbientes.setText("Ambientes");
        menuAmbientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAmbientesActionPerformed(evt);
            }
        });
        menuRelatorios.add(menuAmbientes);

        menuBarMain.add(menuRelatorios);

        jMenu1.setText("Ambiente");
        menuBarMain.add(jMenu1);

        setJMenuBar(menuBarMain);

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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
        
        JIFUser user = new JIFUser();
        
        jDPCadastro.add(user);
        
        user.setVisible(true);
                
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void menuUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuUsuarioActionPerformed
        // TODO add your handling code here:     
    }//GEN-LAST:event_menuUsuarioActionPerformed

    private void menuAmbientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAmbientesActionPerformed
            JIFAmbientes ambientes = new JIFAmbientes();
            jDPCadastro.add(ambientes);
            ambientes.setVisible(true);
    }//GEN-LAST:event_menuAmbientesActionPerformed

    private void menuRelatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRelatoriosActionPerformed
        
    }//GEN-LAST:event_menuRelatoriosActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        JIFGestaoAgenda agenda = new JIFGestaoAgenda();
        jDPCadastro.add(agenda);
        agenda.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jmenuCadastrarSetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenuCadastrarSetorActionPerformed
       
        JIFGestaoSetor gerenciadorSetor = new JIFGestaoSetor();
        jDPCadastro.add(gerenciadorSetor);
        gerenciadorSetor.setVisible(true);
    }//GEN-LAST:event_jmenuCadastrarSetorActionPerformed

    private void jmenuCadastrarCulturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenuCadastrarCulturaActionPerformed
        
        JIFGestao gerenciadorCultura = new JIFGestao();
        jDPCadastro.add(gerenciadorCultura);
        gerenciadorCultura.setVisible(true);
        
    }//GEN-LAST:event_jmenuCadastrarCulturaActionPerformed

    private void jmenuCommActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenuCommActionPerformed
        
        JIFConnection conn = new JIFConnection();
        jDPCadastro.add(conn);        
        conn.setVisible(true);        
        
    }//GEN-LAST:event_jmenuCommActionPerformed

    private void btEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEnterActionPerformed
        
        boolean status = loadAndAutenticatePane();
        if(status){
            panelLogin.setVisible(false);
            enabledMenu();
        }
        else{
            JOptionPane.showMessageDialog(null, "Não encontrado");
        }
    }//GEN-LAST:event_btEnterActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        //Sair do sistema
        System.exit(1);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void tfSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSenhaActionPerformed

    public static void setLookAndFeelAtSystem(String lookandfeel, String Theme) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException{
        String lookAndFeel = null;
       
        if (lookandfeel != null) {
            switch (lookandfeel) {
                case "Metal":
                    lookAndFeel = UIManager.getCrossPlatformLookAndFeelClassName();
                  //  an alternative way to set the Metal L&F is to replace the 
                  // previous line with:
                  // lookAndFeel = "javax.swing.plaf.metal.MetalLookAndFeel";
                    break;
                case "System":
                    lookAndFeel = UIManager.getSystemLookAndFeelClassName();
                    break;
                case "Nimbus":
                    lookAndFeel = "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel";
                    break;
                case "Motif":
                    lookAndFeel = "com.sun.java.swing.plaf.motif.MotifLookAndFeel";
                    break;
                case "GTK":
                    lookAndFeel = "com.sun.java.swing.plaf.gtk.GTKLookAndFeel";
                    break;
                case "Liquid":
                        lookAndFeel = "com.birosoft.liquid.LiquidLookAndFeel";
                        break;
                default:
                    System.err.println("Unexpected value of LOOKANDFEEL specified: "
                                       + lookandfeel);
                    lookAndFeel = UIManager.getCrossPlatformLookAndFeelClassName();
                    break;
            }

    }
        
            UIManager.setLookAndFeel(lookAndFeel);
            if (lookandfeel.equals("Metal")) {
                switch (Theme) {
                    case "DefaultMetal":
                        MetalLookAndFeel.setCurrentTheme(new DefaultMetalTheme());
                        break;
                    case "Ocean":
                        MetalLookAndFeel.setCurrentTheme(new OceanTheme());
                        break;
                }
                                       
                  UIManager.setLookAndFeel(new MetalLookAndFeel()); 
                }	
        
   }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            /* Set the Nimbus look and feel */
            //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
            /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
             * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
             */
    //        try {
    //            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
    //                if ("Nimbus".equals(info.getName())) {
    //                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
    //                    break;
    //                }
    //            }
    //        } catch (ClassNotFoundException ex) {
    //            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //        } catch (InstantiationException ex) {
    //            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //        } catch (IllegalAccessException ex) {
    //            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
    //            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //        }
            //</editor-fold>
//            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
            setLookAndFeelAtSystem("System", null);
//            setLookAndFeelAtSystem("Metal", "");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancel;
    private javax.swing.JButton btEnter;
    private javax.swing.JDesktopPane jDPCadastro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JMenuItem jmenuCadastrarCultura;
    private javax.swing.JMenuItem jmenuCadastrarSetor;
    private javax.swing.JMenuItem jmenuComm;
    private javax.swing.JMenu menuAgenda;
    private javax.swing.JMenuItem menuAmbientes;
    private javax.swing.JMenuBar menuBarMain;
    private javax.swing.JMenu menuCultura;
    private javax.swing.JMenu menuRelatorios;
    private javax.swing.JMenu menuSetor;
    private javax.swing.JMenu menuUsuario;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JTextField tfLogin;
    private javax.swing.JPasswordField tfSenha;
    // End of variables declaration//GEN-END:variables
    private br.com.mau.controller.PersistenceController persistenceControler;
    
    private void setBackgroundDesktopPane() {
        
        JLabel label = new JLabel(new ImageIcon(getClass().getResource("/br/images/jardins.jpg")));
        
        double altura = Toolkit.getDefaultToolkit().getScreenSize().getHeight();
        double largura = Toolkit.getDefaultToolkit().getScreenSize().getWidth();
        
        int alt  = (int) altura;
        int larg  = (int) largura;
        
        label.setBounds(0,0, larg,alt);
//        panelLogin.setUI(new PainelFormUIGreen());
        centralizaPanel(panelLogin);
        label.add(panelLogin);       
        jDPCadastro.add(label);        
    }

    public void centraliza(JInternalFrame janela) {
        int alturaPrincipal = (int)Toolkit.getDefaultToolkit().getScreenSize().getHeight();
        int larguraPrincipal =(int)Toolkit.getDefaultToolkit().getScreenSize().getWidth();
        
        int lIFrame = janela.getWidth();    
        int aIFrame = janela.getHeight();    
        
        janela.setLocation((larguraPrincipal/2) - lIFrame/2 ,alturaPrincipal/2 - aIFrame/2);
        
    }
    
    public void centralizaPanel(JPanel p){
        int alturaPrincipal = (int)Toolkit.getDefaultToolkit().getScreenSize().getHeight();
        int larguraPrincipal =(int)Toolkit.getDefaultToolkit().getScreenSize().getWidth();
        
        int lIFrame = p.getWidth();    
        int aIFrame = p.getHeight();    
        
        p.setLocation((larguraPrincipal/2) - lIFrame/2 ,alturaPrincipal/2 - aIFrame/2);
    }

    public void disabledMenu() {
        if(menuBarMain.isEnabled()){
            menuUsuario.setEnabled(false);
            menuAgenda.setEnabled(false);
            menuCultura.setEnabled(false);
            menuSetor.setEnabled(false);
            menuRelatorios.setEnabled(false);
            menuBarMain.setEnabled(false);
        }
    }
    
    public void enabledMenu(){
        if(!menuBarMain.isEnabled()){
            menuUsuario.setEnabled(true);
            menuAgenda.setEnabled(true);
            menuCultura.setEnabled(true);
            menuSetor.setEnabled(true);
            menuRelatorios.setEnabled(true);
            menuBarMain.setEnabled(true);
        }
    }

    private String md5(String senha, String algorithm){
        
            String sen = "";
            MessageDigest md = null;
         try {
    
                    md = MessageDigest.getInstance(algorithm);        
                    BigInteger hash = new BigInteger(1, md.digest(senha.getBytes("UTF-8")));
                    sen = hash.toString(16);
                
           
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(JIFAuth.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(JIFAuth.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sen;
}

private boolean loadAndAutenticatePane() {

    String login = null;

    if(!tfLogin.getText().trim().isEmpty()){
        login = tfLogin.getText().trim();
    }
    
    String senha = null;
    if(tfSenha.getPassword() != null) {
        senha = new String(tfSenha.getPassword()).trim();
    }
   
    if(login != null && senha != null){
        //Cria um hash e compara no banco
        String sen = md5(senha, "md5");            
        Usuario authenticatedUser = null;
        GenericDAO dao = new GenericDAO(persistenceControler.getPersistenceContext(), Usuario.class);
        try{
           authenticatedUser = (Usuario) dao.authenticate(login, sen);
        }catch(Exception e){
            System.out.println("Nada Retornado"+ e.getMessage());
        }
        if(authenticatedUser != null){
            return true;
        }            
    }
    return false;
}

}
