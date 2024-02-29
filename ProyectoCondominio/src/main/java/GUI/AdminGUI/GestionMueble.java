/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI.AdminGUI;

import Administracion.Administrador;
import Administracion.Residente;
import BD.BaseDeDatos;
import Inmueble.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author usuario
 */
public class GestionMueble extends javax.swing.JFrame {
    private final Administrador administrador;
    private boolean verificacionSecretario;
    private boolean verificacionPresidente;

    public GestionMueble(Administrador administrador) {
        initComponents();
        System.out.println(administrador);
        this.administrador = administrador;
        this.verificacionPresidente = false;
        this.verificacionSecretario = false;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbInmueblesComunales = new javax.swing.JComboBox<>();
        txtMetrosCuadrado = new javax.swing.JTextField();
        btnAgregarInmueble = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cmbInmueblesComunales.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cmbInmueblesComunales.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Cancha", "Espacio de Parqueo", "Gimnasio", "Piscina", "Terraza" }));
        cmbInmueblesComunales.setToolTipText("");

        txtMetrosCuadrado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtMetrosCuadrado.setText("Ingrese los metros cuadrados");
        txtMetrosCuadrado.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMetrosCuadradoFocusGained(evt);
            }
        });
        txtMetrosCuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMetrosCuadradoActionPerformed(evt);
            }
        });

        btnAgregarInmueble.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAgregarInmueble.setText("Agregar inmueble");
        btnAgregarInmueble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarInmuebleActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Ingreso del muebles:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel3.setText("Ingrese el inmueble");

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
                                    .addComponent(txtMetrosCuadrado)
                                    .addComponent(cmbInmueblesComunales, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(62, 62, 62)
                                .addComponent(btnAgregarInmueble))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jLabel1)))
                .addContainerGap(95, Short.MAX_VALUE))
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
                    .addComponent(btnAgregarInmueble, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmbInmueblesComunales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtMetrosCuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarInmuebleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarInmuebleActionPerformed
        String opcionInmueble = (String)cmbInmueblesComunales.getSelectedItem();
        InmuebleComun nuevoInmuebleComun = null;
        System.out.println("HOLA ENTRE AL METODO TUYO");
        switch (opcionInmueble) {
            case "Cancha":
                nuevoInmuebleComun = new Cancha(Double.parseDouble(txtMetrosCuadrado.getText()));
                break;
            case "Espacio de Parqueo":
                nuevoInmuebleComun = new EspacioDeParqueadero(Double.parseDouble(txtMetrosCuadrado.getText()));
                break;
            case "Gimnasio":
                nuevoInmuebleComun = new Gimnasio(Double.parseDouble(txtMetrosCuadrado.getText()));
                break;
            case "Piscina":
                nuevoInmuebleComun = new Piscina(Double.parseDouble(txtMetrosCuadrado.getText()));
                break;
            case "Terraza":
                nuevoInmuebleComun = new Terraza(Double.parseDouble(txtMetrosCuadrado.getText()));
                break;
            default:
                javax.swing.JOptionPane.showMessageDialog(null, "Inserte una opcion correcta");
        }
        administrador.agregarInmuebleComun(nuevoInmuebleComun);
        BaseDeDatos.escribirAdmin(administrador);
        javax.swing.JOptionPane.showMessageDialog(null, "Se ha agregado un nuevo inmueble comunal");  
    }//GEN-LAST:event_btnAgregarInmuebleActionPerformed

    private void txtMetrosCuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMetrosCuadradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMetrosCuadradoActionPerformed

    private void txtMetrosCuadradoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMetrosCuadradoFocusGained
        txtMetrosCuadrado.setText("");
    }//GEN-LAST:event_txtMetrosCuadradoFocusGained
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarInmueble;
    private javax.swing.JComboBox<String> cmbInmueblesComunales;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtMetrosCuadrado;
    // End of variables declaration//GEN-END:variables
}
