
package vista;

public class fmrAbrir extends javax.swing.JInternalFrame {
    private Persistencia.GestionParking control;// Variable global del formulario

    public fmrAbrir(Persistencia.GestionParking control) {
        initComponents();
        this.control = control; // Ahora la ventana sabe dónde guardar los datos
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtValorhoraCarro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtValorHoraMoto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCapacidad = new javax.swing.JTextField();
        btnAbrir = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 102, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Abrir Parqueadero");

        jLabel1.setFont(new java.awt.Font("MathJax_Main", 1, 18)); // NOI18N
        jLabel1.setText("Bienvenido Java parking");

        jLabel2.setText("Valor Hora Carro: ");

        jLabel3.setText("Valor hora Moto: ");

        jLabel4.setText("Total de Celdas: ");

        btnAbrir.setText("Abrir");
        btnAbrir.addActionListener(this::btnAbrirActionPerformed);

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(this::btnConsultarActionPerformed);

        btnModificar.setText("modificar");
        btnModificar.addActionListener(this::btnModificarActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(159, 159, 159))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtCapacidad))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtValorHoraMoto))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtValorhoraCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(btnAbrir)
                        .addGap(47, 47, 47)
                        .addComponent(btnConsultar)
                        .addGap(40, 40, 40)
                        .addComponent(btnModificar)))
                .addContainerGap(140, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtValorhoraCarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtValorHoraMoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAbrir)
                    .addComponent(btnConsultar)
                    .addComponent(btnModificar))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed
        abrirParqueadero();
    }//GEN-LAST:event_btnAbrirActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        consultarDatos();
    }//GEN-LAST:event_btnConsultarActionPerformed




    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
      modificarTarifas();
    }//GEN-LAST:event_btnModificarActionPerformed

    
    
 private void abrirParqueadero() {
    try {
        // 1. Validar campos vacíos
        if (txtValorhoraCarro.getText().isEmpty() || 
            txtValorHoraMoto.getText().isEmpty() || 
            txtCapacidad.getText().isEmpty()) {
            
            javax.swing.JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.");
            return;
        }

        // 2. Conversión de datos
        double tarifaCarro = Double.parseDouble(txtValorhoraCarro.getText());
        double tarifaMoto = Double.parseDouble(txtValorHoraMoto.getText());
        int capacidad = Integer.parseInt(txtCapacidad.getText());

        // 3. Llamada correcta a la lógica (Ojo al orden: Carro, Moto, Capacidad)
        control.abrirParqueadero(tarifaCarro, tarifaMoto, capacidad);

        javax.swing.JOptionPane.showMessageDialog(this, "¡Parqueadero configurado con éxito!");
        this.dispose(); 

    } catch (NumberFormatException e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Error: Verifique que los precios y capacidad sean números.");
    }
}
 
 private void consultarDatos() {
    // Verificamos si ya existe una configuración activa
    if (control.getListaUbicaciones() == null || control.getListaUbicaciones().isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "No hay configuración activa.");
        return;
    }

    txtValorhoraCarro.setText(String.valueOf(control.getValorHoraCarro()));
    txtValorHoraMoto.setText(String.valueOf(control.getValorHoraMoto()));
    txtCapacidad.setText(String.valueOf(control.getListaUbicaciones().size()));

    // Bloqueamos la capacidad (no se debería cambiar si ya está abierto)
    txtCapacidad.setEditable(false);
    javax.swing.JOptionPane.showMessageDialog(this, "Datos cargados correctamente.");
}
 
 
private void modificarTarifas() {
    // Para que este funcione, añade los métodos set a GestionParking o usa abrirParqueadero de nuevo
    // Una forma sencilla es llamar a abrirParqueadero con la misma capacidad actual:
    try {
        double vCarro = Double.parseDouble(txtValorhoraCarro.getText());
        double vMoto = Double.parseDouble(txtValorHoraMoto.getText());
        int capActual = control.getListaUbicaciones().size();
        
        control.abrirParqueadero(vCarro, vMoto, capActual);
        javax.swing.JOptionPane.showMessageDialog(this, "Tarifas actualizadas.");
    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Error al modificar.");
    }
}


    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrir;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtCapacidad;
    private javax.swing.JTextField txtValorHoraMoto;
    private javax.swing.JTextField txtValorhoraCarro;
    // End of variables declaration//GEN-END:variables
}