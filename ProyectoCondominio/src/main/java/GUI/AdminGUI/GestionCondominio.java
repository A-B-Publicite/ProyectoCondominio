/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI.AdminGUI;

import Administracion.Administrador;
import BD.BaseDeDatos;
import Inmueble.*;

/**
 *
 * @author usuario
 */
public class GestionCondominio extends javax.swing.JFrame {
    private final Administrador administrador;

    public GestionCondominio(Administrador administrador) {
        initComponents();
        System.out.println(administrador);
        this.administrador = administrador;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbInmueblesComunales = new javax.swing.JComboBox<>();
        txtMetrosCuadrado = new javax.swing.JTextField();
        btnAgregarInmueble = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtNumerosDeDepartamentos = new javax.swing.JTextField();
        btnAceptarIngresoDepartamentos = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

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
        jLabel1.setText("Ingreso del inmueble comunal:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Departamentos para agregar:");

        txtNumerosDeDepartamentos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtNumerosDeDepartamentos.setText("Ingrese el numero de departamentos:");
        txtNumerosDeDepartamentos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNumerosDeDepartamentosFocusGained(evt);
            }
        });
        txtNumerosDeDepartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumerosDeDepartamentosActionPerformed(evt);
            }
        });

        btnAceptarIngresoDepartamentos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAceptarIngresoDepartamentos.setText("Aceptar");
        btnAceptarIngresoDepartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarIngresoDepartamentosActionPerformed(evt);
            }
        });

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel3.setText("Ingrese el inmueble");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(200, 200, 200))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtMetrosCuadrado)
                                    .addComponent(cmbInmueblesComunales, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(62, 62, 62)
                                .addComponent(btnAgregarInmueble))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(txtNumerosDeDepartamentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 43, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(btnAceptarIngresoDepartamentos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVolver)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregarInmueble, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmbInmueblesComunales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtMetrosCuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNumerosDeDepartamentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptarIngresoDepartamentos)
                    .addComponent(btnVolver, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarIngresoDepartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarIngresoDepartamentosActionPerformed
        //administrador.agregarCondominio()
        administrador.agregarDepartamentos(Integer.parseInt(txtNumerosDeDepartamentos.getText()));
        javax.swing.JOptionPane.showMessageDialog(null, "Se han anadido " + txtNumerosDeDepartamentos.getText() + " departamentos");
    }//GEN-LAST:event_btnAceptarIngresoDepartamentosActionPerformed

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

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void txtNumerosDeDepartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumerosDeDepartamentosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumerosDeDepartamentosActionPerformed

    private void txtNumerosDeDepartamentosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNumerosDeDepartamentosFocusGained
        txtNumerosDeDepartamentos.setText("");
    }//GEN-LAST:event_txtNumerosDeDepartamentosFocusGained

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptarIngresoDepartamentos;
    private javax.swing.JButton btnAgregarInmueble;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cmbInmueblesComunales;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtMetrosCuadrado;
    private javax.swing.JTextField txtNumerosDeDepartamentos;
    // End of variables declaration//GEN-END:variables
}
