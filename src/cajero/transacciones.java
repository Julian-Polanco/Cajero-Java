package cajero;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author MEDIA LIBRA DE AGUA :v
 */
public class transacciones extends javax.swing.JFrame {

    public transacciones() {
        initComponents();
        setLocationRelativeTo(null);
    }
    

    void limpiar(){
        idDocumento.setText("");
        valorATratar.setText("");
        idCuenta.setText("");
        
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        generarTransaccion = new javax.swing.JButton();
        cancelarTransaccion = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        idDocumento = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        proceso = new javax.swing.JComboBox<>();
        idCuenta = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        valorATratar = new javax.swing.JTextField();
        limpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cajero/twitter_header_photo_1.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Transacciones");

        generarTransaccion.setBackground(new java.awt.Color(102, 255, 102));
        generarTransaccion.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        generarTransaccion.setText("Generar Transacción");
        generarTransaccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarTransaccionActionPerformed(evt);
            }
        });

        cancelarTransaccion.setBackground(new java.awt.Color(255, 0, 0));
        cancelarTransaccion.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        cancelarTransaccion.setText("Cancelar");
        cancelarTransaccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarTransaccionActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Documento del titular de la cuenta");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Tipo de transacción");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Número de cuenta");

        idDocumento.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        proceso.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        proceso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Retiro", "Consignación" }));
        proceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procesoActionPerformed(evt);
            }
        });

        idCuenta.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        idCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idCuentaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Cantidad en cuestión");

        valorATratar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        limpiar.setBackground(new java.awt.Color(255, 255, 51));
        limpiar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        limpiar.setText("Limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(jLabel2)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(proceso, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valorATratar, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(generarTransaccion)
                .addGap(70, 70, 70)
                .addComponent(cancelarTransaccion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(limpiar)
                .addGap(64, 64, 64))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(idDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(proceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addComponent(valorATratar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(generarTransaccion)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(limpiar)
                        .addComponent(cancelarTransaccion)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarTransaccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarTransaccionActionPerformed
        // TODO add your handling code here:
        interfazCajero redireccion = new interfazCajero();
        redireccion.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_cancelarTransaccionActionPerformed

    private void procesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_procesoActionPerformed

    private void idCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idCuentaActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_limpiarActionPerformed

    private void generarTransaccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarTransaccionActionPerformed
        String numDoc = idDocumento.getText();
        String operacionARealizar = (String) proceso.getSelectedItem();
        Integer numCuenta = Integer.parseInt(idCuenta.getText());
        Integer dineroEnCuestion = Integer.parseInt(valorATratar.getText());
        Integer Porcentaje = dineroEnCuestion / 10;
        String tipo = (String) proceso.getSelectedItem();
        String SQL = "SELECT numDoc FROM usuarios WHERE numDoc='"+numDoc+"'";
        String SQL2 = "SELECT numCuenta FROM cuenta WHERE numCuenta='"+numCuenta+"'";
        String SQL3 = "INSERT INTO transacciones (numDoc, tipoTrans, numCuenta, cantidadDeDinero, valorTrans) VALUES (?,?,?,?,?)";
        String SQL4 = "UPDATE cuenta SET saldo = ? WHERE numCuenta = ?";
        String SQL5 = "SELECT * FROM cuenta WHERE numCuenta= '"+numCuenta+"' && numDoc= '"+numDoc+"'";
        String SLQ6 = "SELECT * FROM transacciones ORDER BY idTrans DESC LIMIT 1";
        String saldo = "", a = "", b = "", c = "", d = "", e2 = "", f = "", g="";
        int parcial = 0, parcialAEntrar = 0;
        conexion cc = new conexion();
        Connection con = cc.conexion();
        try {
            Statement busqueda1 = con.createStatement();
            ResultSet b1 = busqueda1.executeQuery(SQL);
            if(b1.next()){
                Statement busqueda2 = con.createStatement();
                ResultSet b2 = busqueda2.executeQuery(SQL2);
                JOptionPane.showMessageDialog(null, "Usuario existente, trámite en proceso....\nEspere por favor...");
                if(b2.next()){
                    JOptionPane.showMessageDialog(null, "Cuenta existente, trámite en proceso....\nEspere por favor...");
                     if(operacionARealizar == "Consignación"){
                         PreparedStatement busqueda3 = con.prepareStatement(SQL3);
                         busqueda3.setString(1, numDoc);
                         busqueda3.setString(2, tipo);
                         busqueda3.setInt(3, numCuenta);
                         busqueda3.setInt(4, dineroEnCuestion);
                         busqueda3.setInt(5, dineroEnCuestion / 10);
                         busqueda3.executeUpdate();
                         Statement ejecucion1 = con.createStatement();
                         ResultSet ejecicion1_1 = ejecucion1.executeQuery(SQL5);
                         while(ejecicion1_1.next()){
                             saldo = ejecicion1_1.getString(4);
                             parcial = Integer.parseInt(saldo);
                             parcialAEntrar = parcial + (dineroEnCuestion - Porcentaje);
                             try{
                                PreparedStatement actualizacion = con.prepareStatement(SQL4);
                                actualizacion.setInt(1, parcialAEntrar);
                                actualizacion.setInt(2, numCuenta);
                                actualizacion.executeUpdate();
                                JOptionPane.showMessageDialog(null, "Saldo de la cuenta #"+numCuenta+" actualizado.");
                             }catch(Exception e){
                                 System.out.println(e.getMessage());
                             }
                        Statement recibo = con.createStatement();
                        ResultSet reciboo = recibo.executeQuery(SLQ6);
                         while(reciboo.next()){
                             a = reciboo.getString(1);
                             b = reciboo.getString(2);
                             c = reciboo.getString(3);
                             d = reciboo.getString(4);
                             e2 = reciboo.getString(5);
                             f = reciboo.getString(6);
                             g = reciboo.getString(7);                             
                         }
                        
                        JOptionPane.showMessageDialog(null, "Código de lla transacción: " +a+
                                                            "\nNúmero del titular: " +b+
                                                            "\nTipo de la transacción: " +c+
                                                            "\nNúmero de la cuenta cuenta consignado: " +d+
                                                            "\nCantidad de dinero consignado:" +e2+
                                                            "\nFecha de la transacción: " +f+
                                                            "\nValor transacción: "+g);
                        JOptionPane.showMessageDialog(null, "Transacción realizada.");
                        limpiar();
                        interfazCajero redireccion = new interfazCajero();
                        redireccion.setVisible(true);
                        this.setVisible(false);
                        }
                    }else if(operacionARealizar == "Retiro"){
                        Statement busqueda5 = con.createStatement();
                        ResultSet busqueda5ejecucion = busqueda5.executeQuery(SQL5);
                        while(busqueda5ejecucion.next()){
                            saldo = busqueda5ejecucion.getString(4);
                            parcial = Integer.parseInt(saldo);
                            if(parcial<dineroEnCuestion){
                                JOptionPane.showMessageDialog(null, "...ERROR FONDOS INSUFICIENTES...");
                            }else{
                                parcialAEntrar = parcial - dineroEnCuestion;
                                PreparedStatement actualizacion = con.prepareStatement(SQL4);
                                actualizacion.setInt(1, parcialAEntrar);
                                actualizacion.setInt(2, numCuenta);
                                actualizacion.executeUpdate();
                                try{
                                    PreparedStatement busqueda3 = con.prepareStatement(SQL3);
                                    busqueda3.setString(1, numDoc);
                                    busqueda3.setString(2, tipo);
                                    busqueda3.setInt(3, numCuenta);
                                    busqueda3.setInt(4, -dineroEnCuestion);
                                    busqueda3.setInt(5, 0);
                                    busqueda3.executeUpdate();
                                }catch(Exception e){
                                    System.out.println(e.getMessage());
                                }
                            }
                        }
                        Statement recibo = con.createStatement();
                        ResultSet reciboo = recibo.executeQuery(SLQ6);
                         while(reciboo.next()){
                             a = reciboo.getString(1);
                             b = reciboo.getString(2);
                             c = reciboo.getString(3);
                             d = reciboo.getString(4);
                             e2 = reciboo.getString(5);
                             f = reciboo.getString(6);
                             g = reciboo.getString(7);                             
                         }
                        
                        JOptionPane.showMessageDialog(null, "Código de lla transacción: " +a+
                                                            "\nNúmero del titular: " +b+
                                                            "\nTipo de la transacción: " +c+
                                                            "\nNúmero de la cuenta cuenta consignado: " +d+
                                                            "\nCantidad de dinero consignado:" +e2+
                                                            "\nFecha de la transacción: " +f+
                                                            "\nValor transacción: "+g);
                        
                        JOptionPane.showMessageDialog(null, "Transacción realizada.");
                        limpiar();
                        interfazCajero redireccion = new interfazCajero();
                        redireccion.setVisible(true);
                        this.setVisible(false);
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Cuenta inválida o inexistente, inténtelo de nuevo.");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Usuario inválido o inexistente, inténtelo de nuevo.");
            }
        } catch(SQLException ex){
            System.out.println(ex.getMessage());
        }   
    }//GEN-LAST:event_generarTransaccionActionPerformed

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
            java.util.logging.Logger.getLogger(transacciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(transacciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(transacciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(transacciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new transacciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarTransaccion;
    private javax.swing.JButton generarTransaccion;
    private javax.swing.JTextField idCuenta;
    private javax.swing.JTextField idDocumento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton limpiar;
    private javax.swing.JComboBox<String> proceso;
    private javax.swing.JTextField valorATratar;
    // End of variables declaration//GEN-END:variables
    
}