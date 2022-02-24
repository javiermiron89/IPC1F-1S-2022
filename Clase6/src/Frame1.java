
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author javie
 */
public class Frame1 extends javax.swing.JFrame {

    Frame2 f2 = new Frame2();
    
    public Frame1() {
        initComponents();
        initComponents2();
    }
    
    public void initComponents2(){
        setLocationRelativeTo(null);
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
        Btt_Login = new javax.swing.JButton();
        Txt_Usuario = new javax.swing.JTextField();
        Txt_Password = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        Btt_Registrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 800));
        jPanel1.setLayout(null);

        Btt_Login.setText("LOGIN");
        Btt_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btt_LoginActionPerformed(evt);
            }
        });
        jPanel1.add(Btt_Login);
        Btt_Login.setBounds(260, 310, 230, 60);
        jPanel1.add(Txt_Usuario);
        Txt_Usuario.setBounds(250, 170, 260, 40);
        jPanel1.add(Txt_Password);
        Txt_Password.setBounds(250, 230, 260, 40);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 102));
        jLabel1.setText("LOGIN");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 10, 180, 70);

        Btt_Registrar.setText("Registrar");
        Btt_Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btt_RegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(Btt_Registrar);
        Btt_Registrar.setBounds(270, 430, 210, 60);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btt_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btt_RegistrarActionPerformed
        f2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Btt_RegistrarActionPerformed

    private void Btt_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btt_LoginActionPerformed
        Boolean existeUsuario = false;
        for (int i = 0; i < f2.getListaUsuarios().length; i++) {
            if(f2.getListaUsuarios()[i] != null){
                if(f2.getListaUsuarios()[i].getNombreUsuario().equals(Txt_Usuario.getText()) 
                        && f2.getListaUsuarios()[i].getPassword().equals(Txt_Password.getText())){
                    existeUsuario = true;
                    break;
                }
            }
        }
        if(existeUsuario) {
            JOptionPane.showMessageDialog(null, "EL USUARIO SI EXISTE!!!! :D");
        } else {
            JOptionPane.showMessageDialog(null, "NO EXISTE EL USUARIO :C");
        }
    }//GEN-LAST:event_Btt_LoginActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btt_Login;
    private javax.swing.JButton Btt_Registrar;
    private javax.swing.JPasswordField Txt_Password;
    private javax.swing.JTextField Txt_Usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
