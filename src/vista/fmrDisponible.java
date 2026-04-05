/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vista;

/**
 *
 * @author juan
 */
public class fmrDisponible extends javax.swing.JInternalFrame {
    private Persistencia.GestionParking control;
    public fmrDisponible(Persistencia.GestionParking control) {
        initComponents();
        this.control = control;
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        lbDisponibles = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Gestion Ubicaciones");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID Ubicacion", "Estado"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Consultar Ubicaciones (Celdas)");

        btnConsultar.setText("Consultar ");
        btnConsultar.addActionListener(this::btnConsultarActionPerformed);

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(this::btnActualizarActionPerformed);

        btnCerrar.setText("cerrar");
        btnCerrar.addActionListener(this::btnCerrarActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(btnConsultar)
                        .addGap(73, 73, 73)
                        .addComponent(btnActualizar)
                        .addGap(75, 75, 75)
                        .addComponent(btnCerrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(lbDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar)
                    .addComponent(btnActualizar)
                    .addComponent(btnCerrar))
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        realizarConsulta();
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        realizarConsulta();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

private void realizarConsulta() {
    // 1. Validar que la lista no sea nula
    if (control.getListaUbicaciones() == null) {
        javax.swing.JOptionPane.showMessageDialog(this, "Error: No hay datos de ubicaciones.");
        return;
    }

    java.util.ArrayList<Logica.Ubicacion> todas = control.getListaUbicaciones();

    // 2. Contar ocupados/libres
    int total = todas.size();
    int libres = 0;
    for(Logica.Ubicacion u : todas) {
        if(u.isDisponible()) libres++;
    }

    // 3. Actualizar Label con diseño
    lbDisponibles.setText("<html><body style='padding: 5px;'>"
            + "<b style='color: #2c3e50;'>Estado del Parqueadero</b><br>"
            + "<span style='font-size: 14pt; color: green;'>" + libres + "</span> Libres<br>"
            + "<span style='font-size: 14pt; color: red;'>" + (total - libres) + "</span> Ocupados"
            + "</body></html>");

    // 4. Llenar tabla
    llenarTablaGeneral(todas);
}
    

    private void llenarTablaGeneral(java.util.ArrayList<Logica.Ubicacion> lista) {
        javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) jTable1.getModel();
        modelo.setRowCount(0); // Limpiar

        // Ajustar columnas si es necesario en el diseño (ID, Estado, Placa, Tipo)
        // Si tu tabla solo tiene 2 columnas, usa este código:
        for (Logica.Ubicacion u : lista) {
            Object[] fila = new Object[2];
            fila[0] = u.getIdUbicacion();

            if (u.isDisponible()) {
                fila[1] = "LIBRE";
            } else {
                // Si está ocupada, mostramos la placa para que sea más informativo
                fila[1] = "OCUPADO (" + u.getVehiculo().getPlaca() + ")";
            }

            modelo.addRow(fila);
        }
}
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbDisponibles;
    // End of variables declaration//GEN-END:variables
}
