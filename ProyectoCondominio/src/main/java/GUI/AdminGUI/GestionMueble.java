package GUI.AdminGUI;

import ModuloMuebles.Inventario;
import ModuloMuebles.Carpa;
import ModuloMuebles.Mesa;
import ModuloMuebles.Mueble;
import ModuloMuebles.Silla;
import Administracion.Administrador;
import Administracion.Residente;
import BD.BaseDeDatos;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GestionMueble extends javax.swing.JFrame {
    public static Inventario inventario;
    private final Administrador administrador;
    private boolean verificacionSecretario;
    private boolean verificacionPresidente;

    public GestionMueble(Administrador administrador) {
        initComponents();
        System.out.println(administrador); 
        this.administrador = administrador;
        this.inventario = new Inventario();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CBMuebles = new javax.swing.JComboBox<>();
        TFCantidad = new javax.swing.JTextField();
        JBAgregarMueble = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        TFPrecio = new javax.swing.JTextField();
        btnVolver1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CBMuebles.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CBMuebles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Carpa", "Silla", "Mesa" }));
        CBMuebles.setToolTipText("");
        CBMuebles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBMueblesActionPerformed(evt);
            }
        });

        TFCantidad.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TFCantidad.setText("Ingrese cantidad");
        TFCantidad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TFCantidadFocusGained(evt);
            }
        });
        TFCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFCantidadActionPerformed(evt);
            }
        });

        JBAgregarMueble.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JBAgregarMueble.setText("Agregar mueble");
        JBAgregarMueble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAgregarMuebleActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Ingreso de muebles:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel3.setText("Ingrese el mueble");

        TFPrecio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TFPrecio.setText("Ingrese precio");
        TFPrecio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TFPrecioFocusGained(evt);
            }
        });
        TFPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFPrecioActionPerformed(evt);
            }
        });

        btnVolver1.setText("Volver");
        btnVolver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolver1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TFCantidad)
                                    .addComponent(CBMuebles, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TFPrecio, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(62, 62, 62)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JBAgregarMueble)
                                    .addComponent(btnVolver1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jLabel1)))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JBAgregarMueble, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnVolver1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CBMuebles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(TFCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(TFPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(36, 36, 36)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBAgregarMuebleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAgregarMuebleActionPerformed
        try {
            // Obtener la cantidad y el precio de los campos de texto
            int cantidad = Integer.parseInt(TFCantidad.getText());
            double precio = Double.parseDouble(TFPrecio.getText());
            String opcionMueble = (String) CBMuebles.getSelectedItem();

            // Crear el mueble basado en la selección del JComboBox
            Mueble mueble = null;
            switch (opcionMueble) {
                case "Carpa":
                    mueble = new Carpa(precio);
                    break;
                case "Mesa":
                    mueble = new Mesa(precio);
                    break;
                case "Silla":
                    mueble = new Silla(precio);
                    break;
                default:
                    javax.swing.JOptionPane.showMessageDialog(null, "Inserte una opcion correcta");
                    return; // Salir del método si la opción no es válida
            }

            // Agregar el mueble al inventario
            inventario.agregarMueble(mueble, cantidad, precio);

            // Guardar los cambios en la base de datos
            BaseDeDatos.escribirMueble(mueble);

            // Mostrar mensaje de confirmación
            javax.swing.JOptionPane.showMessageDialog(null, "Se ha agregado el mueble correctamente al inventario.");

            // Opcional: Limpieza de los campos de texto
            TFCantidad.setText("");
            TFPrecio.setText("");

        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(null, "Por favor, ingrese números válidos en los campos de cantidad y precio.");
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null, "Ocurrió un error al agregar el mueble al inventario: " + e.getMessage());
        }
    }//GEN-LAST:event_JBAgregarMuebleActionPerformed

    private void TFCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFCantidadActionPerformed

    private void TFCantidadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TFCantidadFocusGained
        TFCantidad.setText("");
    }//GEN-LAST:event_TFCantidadFocusGained

    private void TFPrecioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TFPrecioFocusGained
         TFPrecio.setText("");
    }//GEN-LAST:event_TFPrecioFocusGained

    private void TFPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFPrecioActionPerformed

    private void CBMueblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBMueblesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBMueblesActionPerformed

    private void btnVolver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnVolver1ActionPerformed
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBMuebles;
    private javax.swing.JButton JBAgregarMueble;
    private javax.swing.JTextField TFCantidad;
    private javax.swing.JTextField TFPrecio;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton btnVolver1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
