
package vista;


public class fmrRetiro extends javax.swing.JInternalFrame {
    private Persistencia.GestionParking control;
    private String placaActual = "";
    public fmrRetiro(Persistencia.GestionParking control) {
        initComponents();
        this.control = control;
        btnConfirmarRetiro.setEnabled(false); // Bloqueado hasta que calculen el cobro
        limpiarCampos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPlacaRetiro = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        lbTiempo = new javax.swing.JLabel();
        lbTarifa = new javax.swing.JLabel();
        lbTotal = new javax.swing.JLabel();
        btnConfirmarRetiro = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtHoraSalida = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Retiro y Calculo de parqueo");

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Retirar Vehiculo ");

        jLabel2.setText("Placa de Vehiculo  a Retirar : ");

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(this::btnCalcularActionPerformed);

        btnConfirmarRetiro.setText("Retirar");
        btnConfirmarRetiro.addActionListener(this::btnConfirmarRetiroActionPerformed);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(this::btnCancelarActionPerformed);

        jLabel3.setText("Hora de Salida: ");

        txtHoraSalida.addActionListener(this::txtHoraSalidaActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(lbTarifa, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtHoraSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPlacaRetiro, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCalcular))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(btnConfirmarRetiro)
                                .addGap(143, 143, 143)
                                .addComponent(btnCancelar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPlacaRetiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalcular))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtHoraSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbTarifa, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnConfirmarRetiro)
                        .addComponent(btnCancelar)))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
      prepararCalculoRecibo();
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnConfirmarRetiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarRetiroActionPerformed
      ejecutarProcesoSalida();
    }//GEN-LAST:event_btnConfirmarRetiroActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtHoraSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoraSalidaActionPerformed
       
    }//GEN-LAST:event_txtHoraSalidaActionPerformed
        
    
    
private void prepararCalculoRecibo() {
    String placa = txtPlacaRetiro.getText().trim().toUpperCase();
    String horaSalidaStr = txtHoraSalida.getText().trim();

    if (placa.isEmpty() || horaSalidaStr.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "Debe ingresar placa y hora de salida.");
        return;
    }

    try {
        int horaSalida = Integer.parseInt(horaSalidaStr);
        Logica.Ubicacion u = control.buscarVehiculoPorPlaca(placa);

        if (u != null) {
            Logica.Vehiculo v = u.getVehiculo();
            
            // Cálculo de tiempo
            int tiempo = horaSalida - v.getHoraEntrada();
            if (tiempo <= 0) tiempo = 1;

            // Cálculo de tarifa
            double tarifa = (v instanceof Logica.Carro) ? control.getValorHoraCarro() : control.getValorHoraMoto();
            double total = tiempo * tarifa;

            // Actualización de Interfaz
            lbTiempo.setText("Horas: " + tiempo);
            lbTarifa.setText("Tarifa x Hora: $" + tarifa);
            lbTotal.setText("<html><font color='red' size='5'>Total: $" + total + "</font></html>");

            this.placaActual = placa;
            btnConfirmarRetiro.setEnabled(true);
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Vehículo no encontrado en el sistema.");
            limpiarCampos();
        }
    } catch (NumberFormatException e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Error: La hora debe ser un número entero.");
    }
}

    
private void procesarRetiro() {
    try {
        int horaSalida = Integer.parseInt(txtHoraSalida.getText().trim());
        
        // Llamamos al método que arreglamos en GestionParking
        String resultado = control.registrarSalidaYProcesar(placaActual, horaSalida);

        if (resultado.contains("exitoso")) {
            javax.swing.JOptionPane.showMessageDialog(this, resultado);
            limpiarCampos();
            txtHoraSalida.setText(""); // Limpiamos la hora también
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, resultado);
        }
    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Error al procesar el retiro.");
    }
}
    
    private void limpiarCampos() {
        txtPlacaRetiro.setText("");
        lbTiempo.setText("");
        lbTarifa.setText("");
        lbTotal.setText("");
        placaActual = "";
        btnConfirmarRetiro.setEnabled(false);
        txtPlacaRetiro.requestFocus();
}
    
private void ejecutarProcesoSalida() {
    try {
        int horaSalida = Integer.parseInt(txtHoraSalida.getText().trim());
        
        // Llamada al control de persistencia
        String resultado = control.registrarSalidaYProcesar(placaActual, horaSalida);

        if (resultado.contains("exitoso")) {
            javax.swing.JOptionPane.showMessageDialog(this, resultado);
            limpiarCampos();
            txtHoraSalida.setText(""); 
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "No se pudo procesar: " + resultado);
        }
    } catch (NumberFormatException e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Error en el formato de hora al confirmar.");
    }
}
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmarRetiro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbTarifa;
    private javax.swing.JLabel lbTiempo;
    private javax.swing.JLabel lbTotal;
    private javax.swing.JTextField txtHoraSalida;
    private javax.swing.JTextField txtPlacaRetiro;
    // End of variables declaration//GEN-END:variables
}
