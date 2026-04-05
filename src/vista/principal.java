
package vista;
import Persistencia.GestionParking;
public class principal extends javax.swing.JFrame {
    // 1. DECLARACIÓN DE LA PERSISTENCIA (Instancia única para todo el programa)
    GestionParking controlGeneral = new GestionParking();
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(principal.class.getName());

  
    public principal() {
        initComponents();
        // Ajustes iniciales de la ventana
        this.setExtendedState(MAXIMIZED_BOTH); // Inicia maximizada
        this.setTitle("Sistema de Gestión de Parqueadero - Java Parking");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 445, Short.MAX_VALUE)
        );

        jMenu1.setText("Gestion");

        jMenuItem2.setText("Abrir Parqueadero");
        jMenuItem2.addActionListener(this::jMenuItem2ActionPerformed);
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Ingresar Vehiculos");
        jMenuItem3.addActionListener(this::jMenuItem3ActionPerformed);
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Consultar Vehiculo");
        jMenuItem4.addActionListener(this::jMenuItem4ActionPerformed);
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("Retirar Vehiculo");
        jMenuItem5.addActionListener(this::jMenuItem5ActionPerformed);
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Reporte");

        jMenuItem6.setText("Verificar Ubicaciones");
        jMenuItem6.addActionListener(this::jMenuItem6ActionPerformed);
        jMenu2.add(jMenuItem6);

        jMenuItem7.setText("Reporte Caja");
        jMenuItem7.addActionListener(this::jMenuItem7ActionPerformed);
        jMenu2.add(jMenuItem7);

        jMenuBar1.add(jMenu2);
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       fmrAbrir ventanaAbrir = new fmrAbrir(this.controlGeneral); 
       jDesktopPane1.add(ventanaAbrir);
       ventanaAbrir.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
       fmrIngreso ventanaIn = new fmrIngreso(this.controlGeneral); 
       jDesktopPane1.add(ventanaIn);
       ventanaIn.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        fmrConsultar ventanaCo = new fmrConsultar(this.controlGeneral); 
       jDesktopPane1.add(ventanaCo);
       ventanaCo.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        fmrRetiro ventanaRe = new fmrRetiro(controlGeneral);
        jDesktopPane1.add(ventanaRe);
        ventanaRe.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        fmrDisponible ventanaDis = new fmrDisponible(controlGeneral);
        jDesktopPane1.add(ventanaDis);
        ventanaDis.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
       fmrCierreCaja ventanaCierre = new fmrCierreCaja(controlGeneral);
       jDesktopPane1.add(ventanaCierre);
       ventanaCierre.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable() {
    public void run() {
        new principal().setVisible(true);
    }
});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    // End of variables declaration//GEN-END:variables
}
