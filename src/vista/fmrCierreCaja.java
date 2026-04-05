
package vista;

public class fmrCierreCaja extends javax.swing.JInternalFrame {
    private Persistencia.GestionParking control;

    public fmrCierreCaja(Persistencia.GestionParking control) {
        initComponents();
        this.control = control;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnCalcular = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        lbTotal = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Reporte de Caja Diario");

        jLabel1.setFont(new java.awt.Font("Liberation Mono", 3, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Reporte de Cierre de Caja Diaro");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Ubicacion", "Placa", "Tipo de Vehiculo", "Monto Cobrado"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(this::btnCalcularActionPerformed);

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(this::btnActualizarActionPerformed);

        btnCerrar.setText("Cerrrar");
        btnCerrar.addActionListener(this::btnCerrarActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(btnCalcular)
                        .addGap(60, 60, 60)
                        .addComponent(btnActualizar)
                        .addGap(56, 56, 56)
                        .addComponent(btnCerrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(lbTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalcular)
                    .addComponent(btnActualizar)
                    .addComponent(btnCerrar))
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        procesarCierreCaja();
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
       actualizarVistaCaja();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
       this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    
    private void actualizarVistaCaja() {
    renderizarTabla();
    double saldoActual = control.getSaldoCaja();
    lbTotal.setText("Saldo acumulado: $" + saldoActual);
    }
    
private void procesarCierreCaja() {
    double saldoActual = control.getSaldoCaja();
    
    if (saldoActual <= 0) {
        javax.swing.JOptionPane.showMessageDialog(this, "No hay ingresos registrados en el turno.");
        return;
    }

    renderizarTabla();
    
    lbTotal.setText("<html><div style='text-align: center; background-color: #f0f0f0; padding: 10px;'>"
            + "<b style='font-size: 12pt; color: #333;'>REPORTE FINAL DE RECAUDO</b><br>"
            + "<h1 style='color: #2e7d32; margin: 5px;'>$ " + saldoActual + "</h1>"
            + "<i style='font-size: 9pt;'>Cierre de caja generado con éxito.</i>"
            + "</div></html>");
}

    
  private void renderizarTabla() {
    java.util.ArrayList<Object[]> registros = control.getHistorialPagos();
    String[] columnas = {"ID Ubicacion", "Placa", "Tipo", "Monto"};
    
    javax.swing.table.DefaultTableModel modelo = new javax.swing.table.DefaultTableModel(columnas, 0);

    if (registros != null && !registros.isEmpty()) {
        for (Object[] row : registros) {
            modelo.addRow(row);
        }
    } else {
        System.out.println("DEBUG: Historial de pagos vacío.");
    }

    jTable1.setModel(modelo);
}
    
    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbTotal;
    // End of variables declaration//GEN-END:variables
}
