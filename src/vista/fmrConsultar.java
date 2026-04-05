
package vista;

public class fmrConsultar extends javax.swing.JInternalFrame {
    private Persistencia.GestionParking control;
    public fmrConsultar(Persistencia.GestionParking control) {
        initComponents();
        this.control = control;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lbTipodeVehiculo = new javax.swing.JLabel();
        lbTipoCilindraje = new javax.swing.JLabel();
        lbUbicacion = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Consultar Vehiculo");

        jLabel1.setFont(new java.awt.Font("MathJax_SansSerif", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Consultar Vehiculo ");

        jLabel2.setText("Placa a Consultar : ");

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(this::btnConsultarActionPerformed);

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(this::btnLimpiarActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(151, 151, 151)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbTipodeVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(lbUbicacion, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                                .addComponent(lbTipoCilindraje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnConsultar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnLimpiar)))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultar)
                    .addComponent(btnLimpiar))
                .addGap(34, 34, 34)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbTipodeVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbTipoCilindraje, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
       realizarConsulta();
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
       limpiarCampos();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void realizarConsulta() {
    String placa = txtPlaca.getText().trim().toUpperCase();

    if (placa.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "Debe ingresar una placa para consultar.");
        txtPlaca.requestFocus();
        return;
    }

    Logica.Ubicacion encontrada = control.buscarVehiculoPorPlaca(placa);

    if (encontrada != null && encontrada.getVehiculo() != null) {
        Logica.Vehiculo v = encontrada.getVehiculo();

        lbTipodeVehiculo.setText("Tipo: " + (v instanceof Logica.Carro ? "Carro" : "Moto"));
        lbUbicacion.setText("Ubicación: " + encontrada.getIdUbicacion());

        // Casteo para acceder a atributos específicos
        if (v instanceof Logica.Carro) {
            // Verifica si en tu clase Carro el método es getTipodeCarro() o getTipoCarro()
            lbTipoCilindraje.setText("Tipo Carro: " + ((Logica.Carro) v).getTipodeCarro());
        } else if (v instanceof Logica.Moto) {
            lbTipoCilindraje.setText("Cilindraje: " + ((Logica.Moto) v).getCilindraje() + " cc");
        }
    } else {
        javax.swing.JOptionPane.showMessageDialog(this, "El vehículo con placa " + placa + " no se encuentra en el sistema.");
        limpiarCampos();
    }
}
    
    private void limpiarCampos() {
    // 1. Limpiamos el cuadro de texto de la placa
    txtPlaca.setText("");
    
    // 2. Limpiamos las etiquetas de información (JLabel)
    lbTipodeVehiculo.setText("Tipo: -");
    lbTipoCilindraje.setText("Detalle: -");
    lbUbicacion.setText("Ubicación: -");
    
    // 3. Devolvemos el foco al campo de texto para una nueva búsqueda
    txtPlaca.requestFocus();
    
    // Opcional: Si quieres que las etiquetas desaparezcan por completo
    // lbTipodeVehiculo.setText("");
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbTipoCilindraje;
    private javax.swing.JLabel lbTipodeVehiculo;
    private javax.swing.JLabel lbUbicacion;
    private javax.swing.JTextField txtPlaca;
    // End of variables declaration//GEN-END:variables
}
