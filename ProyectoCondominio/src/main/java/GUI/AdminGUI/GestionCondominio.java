/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI.AdminGUI;

import Administracion.Administrador;
import Administracion.Residente;
import BD.BaseDeDatos;
import GUI.AlquilerGUI.MenuAlquiler;
import Inmueble.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GestionCondominio extends javax.swing.JFrame {
    private final Administrador administrador;
    private boolean verificacionSecretario;
    private boolean verificacionPresidente;

    public GestionCondominio(Administrador administrador) {
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
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtNumerosDeDepartamentos = new javax.swing.JTextField();
        btnAceptarIngresoDepartamentos = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCorreoPresidente = new javax.swing.JTextField();
        txtCorreoSecretario = new javax.swing.JTextField();
        btnAgregarDirectiva = new javax.swing.JButton();
        btnBuscarPresidente = new javax.swing.JButton();
        btnBuscarSecretario = new javax.swing.JButton();
        btnAgregarInmueble1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cmbInmueblesComunales.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cmbInmueblesComunales.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Cancha", "Espacio de Parqueo", "Gimnasio", "Piscina", "Terraza" }));
        cmbInmueblesComunales.setToolTipText("");
        cmbInmueblesComunales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbInmueblesComunalesActionPerformed(evt);
            }
        });

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

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Agregar una directiva:");

        jLabel5.setText("Presidente:");

        jLabel6.setText("Secretario/a:");

        txtCorreoPresidente.setText("Inserte el correo del presidente:");
        txtCorreoPresidente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCorreoPresidenteFocusGained(evt);
            }
        });
        txtCorreoPresidente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoPresidenteActionPerformed(evt);
            }
        });

        txtCorreoSecretario.setText("Inserte el correo del secretario/a:");
        txtCorreoSecretario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCorreoSecretarioFocusGained(evt);
            }
        });
        txtCorreoSecretario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoSecretarioActionPerformed(evt);
            }
        });

        btnAgregarDirectiva.setText("Agregar Directiva");
        btnAgregarDirectiva.setEnabled(false);
        btnAgregarDirectiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarDirectivaActionPerformed(evt);
            }
        });

        btnBuscarPresidente.setText("Buscar");
        btnBuscarPresidente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPresidenteActionPerformed(evt);
            }
        });

        btnBuscarSecretario.setText("Buscar");
        btnBuscarSecretario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarSecretarioActionPerformed(evt);
            }
        });

        btnAgregarInmueble1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAgregarInmueble1.setText("Agregar mueble");
        btnAgregarInmueble1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarInmueble1ActionPerformed(evt);
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
                        .addGap(118, 118, 118)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCorreoPresidente)
                                    .addComponent(txtCorreoSecretario, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(186, 186, 186)
                                .addComponent(btnAgregarDirectiva)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBuscarPresidente)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnBuscarSecretario))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(txtNumerosDeDepartamentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(btnAceptarIngresoDepartamentos))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(jLabel1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(jLabel3)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtMetrosCuadrado)
                                    .addComponent(cmbInmueblesComunales, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAgregarInmueble)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                                .addComponent(btnAgregarInmueble1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAgregarInmueble, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAgregarInmueble1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmbInmueblesComunales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtMetrosCuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNumerosDeDepartamentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAceptarIngresoDepartamentos)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCorreoPresidente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarPresidente))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCorreoSecretario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarSecretario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarDirectiva, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarIngresoDepartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarIngresoDepartamentosActionPerformed
        //administrador.agregarCondominio()
        administrador.getCondominio().agregarDepartamentos(Integer.parseInt(txtNumerosDeDepartamentos.getText()));
        javax.swing.JOptionPane.showMessageDialog(null, "Se han anadido " + txtNumerosDeDepartamentos.getText() + " departamentos");
    }//GEN-LAST:event_btnAceptarIngresoDepartamentosActionPerformed

    private void btnAgregarInmuebleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarInmuebleActionPerformed
        InmuebleComun nuevoInmuebleComun = new InmuebleComun();
        administrador.getCondominio().agregarInmuebleComun(nuevoInmuebleComun.crearInmueble((String)cmbInmueblesComunales.getSelectedItem(), txtMetrosCuadrado.getText()));
        BaseDeDatos.escribirAdmin(administrador);
        javax.swing.JOptionPane.showMessageDialog(null, "Se ha agregado un nuevo inmueble comunal");  
        cmbInmueblesComunales.setSelectedIndex(-1);
        txtMetrosCuadrado.setText("");
    }//GEN-LAST:event_btnAgregarInmuebleActionPerformed

    private void txtMetrosCuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMetrosCuadradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMetrosCuadradoActionPerformed

    private void txtMetrosCuadradoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMetrosCuadradoFocusGained
        txtMetrosCuadrado.setText("");
    }//GEN-LAST:event_txtMetrosCuadradoFocusGained

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void txtNumerosDeDepartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumerosDeDepartamentosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumerosDeDepartamentosActionPerformed

    private void txtNumerosDeDepartamentosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNumerosDeDepartamentosFocusGained
        txtNumerosDeDepartamentos.setText("");
    }//GEN-LAST:event_txtNumerosDeDepartamentosFocusGained

    private void txtCorreoPresidenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoPresidenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoPresidenteActionPerformed

    private void txtCorreoPresidenteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCorreoPresidenteFocusGained
        txtCorreoPresidente.setText("");
    }//GEN-LAST:event_txtCorreoPresidenteFocusGained

    private void txtCorreoSecretarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoSecretarioActionPerformed
        txtCorreoSecretario.setText("");
    }//GEN-LAST:event_txtCorreoSecretarioActionPerformed

    private void btnBuscarPresidenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPresidenteActionPerformed
        try {
            Residente presidenteAux = administrador.getResidentePorCorreo(txtCorreoPresidente.getText());
            if(presidenteAux.esPropietario()){
                javax.swing.JOptionPane.showMessageDialog(null, "Si existe el residente con correo: " + txtCorreoPresidente.getText());
                this.verificacionPresidente = true;
            } else {
                javax.swing.JOptionPane.showMessageDialog(null, "Si existe el residente pero no es propietario");
            }
        } catch (Exception ex) {
            javax.swing.JOptionPane.showMessageDialog(null, "No existe el usuario con ese correo");
            Logger.getLogger(GestionCondominio.class.getName()).log(Level.SEVERE, null, ex); 
        }finally{
            btnAgregarDirectiva.setEnabled(verificacionSecretario && verificacionPresidente);
        }
    }//GEN-LAST:event_btnBuscarPresidenteActionPerformed

    private void btnBuscarSecretarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarSecretarioActionPerformed
        try {
            Residente secretarioAux = administrador.getResidentePorCorreo(txtCorreoSecretario.getText());
            if(secretarioAux.esPropietario()){
                javax.swing.JOptionPane.showMessageDialog(null, "Si existe el residente con correo: " + txtCorreoSecretario.getText());
                this.verificacionSecretario = true;
            } else {
                javax.swing.JOptionPane.showMessageDialog(null, "Si existe el residente pero no es propietario");
            } 
        } catch (Exception ex) {
            javax.swing.JOptionPane.showMessageDialog(null, "No existe el usuario con ese correo");
            Logger.getLogger(GestionCondominio.class.getName()).log(Level.SEVERE, null, ex); 
        }
        finally{
            btnAgregarDirectiva.setEnabled(verificacionSecretario && verificacionPresidente);
        }
    }//GEN-LAST:event_btnBuscarSecretarioActionPerformed

    private void btnAgregarDirectivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarDirectivaActionPerformed
        administrador.getCondominio().agregarDirectiva(administrador.getResidentePorCorreo(txtCorreoPresidente.getText()), administrador.getResidentePorCorreo(txtCorreoSecretario.getText()));
        BaseDeDatos.escribirAdmin(administrador);
        javax.swing.JOptionPane.showMessageDialog(null, "Se ha agregado a la directiva");

    }//GEN-LAST:event_btnAgregarDirectivaActionPerformed

    private void cmbInmueblesComunalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbInmueblesComunalesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbInmueblesComunalesActionPerformed

    private void btnAgregarInmueble1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarInmueble1ActionPerformed
        
        GestionMueble gestionMueble = new GestionMueble(administrador);
        gestionMueble.setVisible(true);
    }//GEN-LAST:event_btnAgregarInmueble1ActionPerformed

    private void txtCorreoSecretarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCorreoSecretarioFocusGained
        txtCorreoSecretario.setText("");
    }//GEN-LAST:event_txtCorreoSecretarioFocusGained
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptarIngresoDepartamentos;
    private javax.swing.JButton btnAgregarDirectiva;
    private javax.swing.JButton btnAgregarInmueble;
    private javax.swing.JButton btnAgregarInmueble1;
    private javax.swing.JButton btnBuscarPresidente;
    private javax.swing.JButton btnBuscarSecretario;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cmbInmueblesComunales;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtCorreoPresidente;
    private javax.swing.JTextField txtCorreoSecretario;
    private javax.swing.JTextField txtMetrosCuadrado;
    private javax.swing.JTextField txtNumerosDeDepartamentos;
    // End of variables declaration//GEN-END:variables
}
