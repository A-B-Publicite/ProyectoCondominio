/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Administracion.*;
import BD.BaseDeDatos;
import GUI.AdminGUI.AdminMenu;
import GUI.GuardiaGUI.GuardiaMenu;
import GUI.MensajeGUI.GUIMensaje;
import GUI.MensajeGUI.ResidenteTabla;
import GUI.ResidenteGUI.ResidenteMenu;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author intel
 */
public class AutenticadorMenu extends javax.swing.JFrame {
    //Administrador administrador;
    ArrayList<Residente> residentes;
    /**
     * Creates new form login
     */
    public AutenticadorMenu() {
        initComponents();
        registrarAdminBoton.setVisible(true);
        verificarAdminCreado();
        this.setVisible(true);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        correo = new java.awt.TextField();
        txtContrasena = new javax.swing.JPasswordField();
        selectorPerfilCombo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ingresarBoton = new javax.swing.JButton();
        registrarAdminBoton = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Bienvenido");

        correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correoActionPerformed(evt);
            }
        });

        txtContrasena.setText("jPasswordField1");
        txtContrasena.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtContrasenaFocusGained(evt);
            }
        });
        txtContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContrasenaActionPerformed(evt);
            }
        });

        selectorPerfilCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Residente", "Guardia" }));
        selectorPerfilCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectorPerfilComboActionPerformed(evt);
            }
        });

        jLabel2.setText("Correo:");

        jLabel3.setText("Contraseña:");

        ingresarBoton.setText("INGRESAR");
        ingresarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarBotonActionPerformed(evt);
            }
        });

        registrarAdminBoton.setText("Registrar Admin");
        registrarAdminBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarAdminBotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(selectorPerfilCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(registrarAdminBoton)
                .addGap(15, 15, 15))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(correo, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(89, 89, 89)
                            .addComponent(ingresarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(125, 125, 125))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectorPerfilCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registrarAdminBoton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(34, 34, 34)
                .addComponent(ingresarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correoActionPerformed

    private void selectorPerfilComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectorPerfilComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectorPerfilComboActionPerformed

    private void ingresarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarBotonActionPerformed
        try {
            switch ((String) selectorPerfilCombo.getSelectedItem()) {
                case "Administrador":
                    Administrador administrador = BaseDeDatos.leerAdministrador();
                    if (!estaAutenticado(administrador, correo.getText(), txtContrasena.getText())) {
                        javax.swing.JOptionPane.showMessageDialog(null, "El usuario no existe en el sistema");
                    }
                    AdminMenu adminMenu = new AdminMenu(administrador);
                    adminMenu.setVisible(true);
                    this.setVisible(false);
                    // Configurar el comportamiento al cerrar la ventana de ListaResidente
                    adminMenu.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    adminMenu.addWindowListener(new WindowAdapter() {
                        @Override
                        public void windowClosed(WindowEvent e) {
                            // Se ejecuta cuando el frame se cierra
                            
                            // Hacer visible la ventana actual al cerrar la ventana de ListaResidente
                            setVisible(true);
                        }
                    });
                    break;
                case "Residente":
                    BaseDeDatos.combinarListaResidente(BaseDeDatos.leerAdministrador().getResidentes());
                    Residente residente = BaseDeDatos.getResidente(correo.getText(), txtContrasena.getText());
                    ResidenteMenu residenteMenu = new ResidenteMenu(residente);
                    residenteMenu.setVisible(true);
                    this.setVisible(false);
                    break;
                case "Guardia":
                    
                    Guardia guardia = BaseDeDatos.leerGuardia();
                    if(correo.getText().equals(guardia.getCorreo()) && txtContrasena.getText().equals(guardia.getContrasenia())) {
                            System.out.println("ENTROO");
                            GuardiaMenu guardiaMenu = new GuardiaMenu(guardia);
                            guardiaMenu.setVisible(true);
                            //guardiaMenu.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                            this.setVisible(false);
                            
                            guardiaMenu.addWindowListener(new WindowAdapter() {
                                @Override
                                public void windowClosed(WindowEvent e) {
                                    setVisible(true);
                                }
                            });
                    }
                    
                    break;
                default:

                    break;
            }
        } catch (Exception e) {
            e.getCause();
        }
        
       
        // Default secuencia de sentencias.
    


    }//GEN-LAST:event_ingresarBotonActionPerformed

    private void registrarAdminBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarAdminBotonActionPerformed
        RegistroAdminGUI nuevoMenuRegistroAdminGUI = new RegistroAdminGUI();
        nuevoMenuRegistroAdminGUI.setVisible(true);
        registrarAdminBoton.setVisible(false);
    }//GEN-LAST:event_registrarAdminBotonActionPerformed

    private void txtContrasenaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContrasenaFocusGained
        txtContrasena.setText("");
    }//GEN-LAST:event_txtContrasenaFocusGained

    private void txtContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContrasenaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.TextField correo;
    private javax.swing.JButton ingresarBoton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton registrarAdminBoton;
    private javax.swing.JComboBox<String> selectorPerfilCombo;
    private javax.swing.JPasswordField txtContrasena;
    // End of variables declaration//GEN-END:variables

    private void verificarAdminCreado() {
        if (BaseDeDatos.leerAdministrador() == null) {
            registrarAdminBoton.setVisible(true);
        } else {
            registrarAdminBoton.setVisible(false);
        }
        //registrarAdminBoton.setVisible(false);
    }

    private boolean estaAutenticado(Perfil perfil, String correo, String contrasenia) {
        return perfil.getCorreo().equals(correo) && perfil.getContrasenia().equals(contrasenia);

    }

}
