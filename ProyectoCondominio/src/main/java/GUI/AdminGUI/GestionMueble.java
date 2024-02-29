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
    private Inventario inventario;
    private int cantidad;
    private final Administrador administrador;
    private boolean verificacionSecretario;
    private boolean verificacionPresidente;

    public GestionMueble(Administrador administrador) {
        initComponents();
        System.out.println(administrador); 
        this.administrador = administrador;
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
                                .addComponent(JBAgregarMueble))))
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
                        .addComponent(CBMuebles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TFCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(TFPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBAgregarMuebleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAgregarMuebleActionPerformed
        cantidad = Integer.parseInt(TFCantidad.getText());
        String opcionMueble = (String)CBMuebles.getSelectedItem();
        Mueble mueble = null;
        System.out.println("AGREGAR MUEBLE");
        switch (opcionMueble) {
            case "Carpa":
                for (int i = 0; i < cantidad; i++) {
                administrador.agregarMueble(new Carpa(Double.parseDouble(TFPrecio.getText())));
                }
                break;
            case "Mesa":
                for (int i = 0; i < cantidad; i++) {
                administrador.agregarMueble(new Mesa(Double.parseDouble(TFPrecio.getText())));
                }
                break;
            case "Silla":
                
                for (int i = 0; i < cantidad; i++) {
                administrador.agregarMueble(new Silla(Double.parseDouble(TFPrecio.getText())));
                }
                break;
            default:
                javax.swing.JOptionPane.showMessageDialog(null, "Inserte una opcion correcta");
        }
        
        BaseDeDatos.escribirAdmin(administrador);
        javax.swing.JOptionPane.showMessageDialog(null, "Se ha agregado un nuevo inmueble comunal");  
    }//GEN-LAST:event_JBAgregarMuebleActionPerformed

    private void TFCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFCantidadActionPerformed

    private void TFCantidadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TFCantidadFocusGained
        TFCantidad.setText("");
    }//GEN-LAST:event_TFCantidadFocusGained

    private void TFPrecioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TFPrecioFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_TFPrecioFocusGained

    private void TFPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFPrecioActionPerformed

    private void CBMueblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBMueblesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBMueblesActionPerformed
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBMuebles;
    private javax.swing.JButton JBAgregarMueble;
    private javax.swing.JTextField TFCantidad;
    private javax.swing.JTextField TFPrecio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
