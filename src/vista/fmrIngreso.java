
package vista;

import Logica.Vehiculo;

public class fmrIngreso extends javax.swing.JInternalFrame {
private Persistencia.GestionParking control;
    public fmrIngreso(Persistencia.GestionParking control) {
    initComponents();
    this.control = control;
    // Estado inicial: como el combo empieza en "Carro", bloqueamos cilindraje
    txtCilindraje.setEnabled(false);
    txtTipoCarro.setEnabled(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbxVehiculo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtCilindraje = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTipoCarro = new javax.swing.JTextField();
        btnParquear = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        txtDetalles = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtHoraEntrada = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 102, 204));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Gestion de Ingreso");

        jLabel1.setFont(new java.awt.Font("DejaVu Sans Condensed", 1, 14)); // NOI18N
        jLabel1.setText("Registro de Ingreso Vehicular :");

        jLabel2.setText("Placa :");

        jLabel3.setText("Tipo de Vehiculo: ");

        cbxVehiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Carro", "Moto" }));
        cbxVehiculo.addActionListener(this::cbxVehiculoActionPerformed);

        jLabel4.setText("Cilindraje: ");

        jLabel5.setText("Tipo Carro:");

        btnParquear.setText("Parquear");
        btnParquear.addActionListener(this::btnParquearActionPerformed);

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(this::btnModificarActionPerformed);

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(this::btnLimpiarActionPerformed);

        jLabel6.setText("Hora de Entrada");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(btnParquear)
                .addGap(18, 18, 18)
                .addComponent(btnModificar)
                .addGap(18, 18, 18)
                .addComponent(btnLimpiar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(175, 175, 175))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTipoCarro))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbxVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCilindraje))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtHoraEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(txtDetalles, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(txtDetalles, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cbxVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtHoraEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtTipoCarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtCilindraje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnParquear)
                    .addComponent(btnModificar)
                    .addComponent(btnLimpiar))
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxVehiculoActionPerformed
        gestionarCambioVehiculo();
    }//GEN-LAST:event_cbxVehiculoActionPerformed

    private void btnParquearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParquearActionPerformed
        ejecutarParqueo();
    }//GEN-LAST:event_btnParquearActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarFormulario();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        modificarDatosVehiculo();
    }//GEN-LAST:event_btnModificarActionPerformed
    
    
private void ejecutarParqueo() {
    String placa = txtPlaca.getText().trim().toUpperCase();
    String tipo = cbxVehiculo.getSelectedItem().toString();
    String extra = (tipo.equals("Carro")) ? txtTipoCarro.getText().trim() : txtCilindraje.getText().trim();
    String horaManual = txtHoraEntrada.getText().trim();

    // Validaciones básicas
    if (placa.isEmpty() || extra.isEmpty() || horaManual.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "Complete todos los campos, incluyendo la hora.");
        return;
    }

    try {
        // Convertimos la hora de texto a entero
        int horaEntrada = Integer.parseInt(horaManual);

        String respuesta = control.ingresarAleatorio(placa, tipo, extra, horaEntrada);

        if (respuesta.contains("asignado")) {
            actualizarPanelDetalles(placa, tipo, respuesta);
            javax.swing.JOptionPane.showMessageDialog(this, "¡Ingreso Exitoso!");
           // limpiarFormulario();
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, respuesta);
        }
        
    } catch (NumberFormatException e) {
        javax.swing.JOptionPane.showMessageDialog(this, "La hora y el cilindraje deben ser números enteros.");
    }
}
    
    private void actualizarPanelDetalles(String placa, String tipo, String respuesta) {
        // Extraemos solo el número del puesto de la respuesta
        String puesto = respuesta.replaceAll("[^0-9]", ""); 

        txtDetalles.setText("<html><body>"
                + "<font color='black'><b>ÚLTIMO INGRESO</b></font><br><br>"
                + "<b>Tipo:</b> " + tipo + "<br>"
                + "<b>Placa:</b> " + placa + "<br>"
                + "<font size='5' color='blue'><b>Puesto: #" + puesto + "</b></font>"
                + "</body></html>");
    }
    
    
    private void gestionarCambioVehiculo() {
        boolean esCarro = cbxVehiculo.getSelectedItem().toString().equals("Carro");

        txtTipoCarro.setEnabled(esCarro);
        txtCilindraje.setEnabled(!esCarro);

        // Limpiar el campo que se deshabilita para no enviar datos basura
        if (esCarro) txtCilindraje.setText(""); else txtTipoCarro.setText("");
    }
    

private void modificarDatosVehiculo() {
    String placaBusqueda = txtPlaca.getText().trim().toUpperCase();

    if (placaBusqueda.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "Ingrese una placa para buscar y modificar.");
        return;
    }

    // 1. Buscamos la ubicación del vehículo en el control
    Logica.Ubicacion u = control.buscarVehiculoPorPlaca(placaBusqueda);

    if (u != null) {
        Logica.Vehiculo v = u.getVehiculo();
        
        // 2. Cargamos la hora de entrada original
        txtHoraEntrada.setText(String.valueOf(v.getHoraEntrada()));
        
        // 3. Identificamos el tipo y cargamos sus datos específicos
        if (v instanceof Logica.Carro) {
            cbxVehiculo.setSelectedItem("Carro");
            txtTipoCarro.setText(((Logica.Carro) v).getTipodeCarro());
            // Aseguramos que los campos se habiliten correctamente
            txtTipoCarro.setEnabled(true);
            txtCilindraje.setEnabled(false);
            txtCilindraje.setText("");
        } else if (v instanceof Logica.Moto) {
            cbxVehiculo.setSelectedItem("Moto");
            txtCilindraje.setText(String.valueOf(((Logica.Moto) v).getCilindraje()));
            // Aseguramos que los campos se habiliten correctamente
            txtCilindraje.setEnabled(true);
            txtTipoCarro.setEnabled(false);
            txtTipoCarro.setText("");
        }
        
        javax.swing.JOptionPane.showMessageDialog(this, "Datos cargados. Modifique y presione 'Parquear' para actualizar.");
        
    } else {
        javax.swing.JOptionPane.showMessageDialog(this, "El vehículo con placa " + placaBusqueda + " no se encuentra en el parqueadero.");
    }
}

    private void limpiarFormulario() {
    txtPlaca.setText("");
    txtCilindraje.setText("");
    txtTipoCarro.setText("");
    txtHoraEntrada.setText(""); // Limpiar campo de hora
    txtDetalles.setText(""); 
    cbxVehiculo.setSelectedIndex(0); 

    txtTipoCarro.setEnabled(true);
    txtCilindraje.setEnabled(false);

    txtPlaca.requestFocus(); 
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnParquear;
    private javax.swing.JComboBox<String> cbxVehiculo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtCilindraje;
    private javax.swing.JLabel txtDetalles;
    private javax.swing.JTextField txtHoraEntrada;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtTipoCarro;
    // End of variables declaration//GEN-END:variables
}
