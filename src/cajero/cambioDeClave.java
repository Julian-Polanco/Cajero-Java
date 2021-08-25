package cajero;
import java.sql.*;
//import java.sql.ResultSet;
//import java.sql.Statement;
import javax.swing.JOptionPane;

public class cambioDeClave extends javax.swing.JFrame {
 
        public static String cuentaUsu;
    public cambioDeClave() {
        initComponents();
        setLocationRelativeTo(null);
        idCuenta.setText(""+cuentaUsu);
        System.out.println(cuentaUsu);
    }
    void limpiar(){
    idCuenta.setText("");
    oldPassword.setText("");
    newPassword.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        updateData = new javax.swing.JButton();
        idCuenta = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        oldPassword = new javax.swing.JPasswordField();
        newPassword = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cancelUpdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel1.setText("Cambio de clave");

        updateData.setBackground(new java.awt.Color(51, 255, 51));
        updateData.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        updateData.setText("Actualizar clave");
        updateData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateDataActionPerformed(evt);
            }
        });

        idCuenta.setEditable(false);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Cuenta");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Clave antigua");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Clave nueva");

        oldPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oldPasswordActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cajero/twitter_header_photo_1.png"))); // NOI18N

        cancelUpdate.setBackground(new java.awt.Color(255, 51, 0));
        cancelUpdate.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        cancelUpdate.setText("Regresar");
        cancelUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(48, 48, 48))
                            .addComponent(updateData))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(idCuenta)
                                    .addComponent(oldPassword)
                                    .addComponent(newPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(cancelUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)))
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(oldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(newPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateData)
                    .addComponent(cancelUpdate))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void oldPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oldPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oldPasswordActionPerformed

    private void updateDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateDataActionPerformed
        // TODO add your handling code here:
        conexion con = new conexion();
        String numDoc = idCuenta.getText();
        Integer oldPasswordData = Integer.parseInt(oldPassword.getText());
        Integer newPasswordData = Integer.parseInt(newPassword.getText());
        con.conexion();
        String SQL = "SELECT numCuenta, contra FROM cuenta WHERE numCuenta='"+cuentaUsu+"' AND contra='"+oldPasswordData+"'";
        
        try {
            con.resultado = con.sentencia.executeQuery(SQL);            
            if(con.resultado.next()){
                JOptionPane.showMessageDialog(null, "Usuario existente, trámite en proceso....\nEspere por favor...");
                PreparedStatement pst = cn.prepareStatement("UPDATE cuenta SET contra='"+newPasswordData+"' WHERE numCuenta='"+cuentaUsu+"'");
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Datos de la cuenta #"+numDoc+" actualizados correctamente.");
                limpiar();
                interfazCajero redireccion = new interfazCajero();
                redireccion.setVisible(true);
                this.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(null, "Usuario/Contraseña inválido o inexistente. \n Revise por favor");
        }
      
        } catch (SQLException ex) {
            //Logger.getLogger(cambioDeClave.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_updateDataActionPerformed

    private void cancelUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelUpdateActionPerformed
        interfazCajero redireccion = new interfazCajero();
        redireccion.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_cancelUpdateActionPerformed

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
            java.util.logging.Logger.getLogger(cambioDeClave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cambioDeClave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cambioDeClave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cambioDeClave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cambioDeClave().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelUpdate;
    private javax.swing.JTextField idCuenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField newPassword;
    private javax.swing.JPasswordField oldPassword;
    private javax.swing.JButton updateData;
    // End of variables declaration//GEN-END:variables

conexion cc = new conexion();
Connection cn = cc.conexion();

}
