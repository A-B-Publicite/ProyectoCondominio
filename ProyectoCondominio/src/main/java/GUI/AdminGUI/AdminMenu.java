/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI.AdminGUI;

import Administracion.*;
import Comunicacion.GUIBandejaDeEntrada;
import Comunicacion.GUIMensaje;
import Comunicacion.ListaResidente;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author intel
 */
public class AdminMenu extends javax.swing.JFrame {

    private final Administrador administrador;

    /**
     * Creates new form adminMeni
     */
    public AdminMenu(Administrador administrador) {
        this.administrador = administrador;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label1.setName("mensajeBienvenidaLabel"); // NOI18N
        label1.setText("¡Hola, bienvenido de vuelta!,");

        label2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label2.setName("adminNameLabel"); // NOI18N
        label2.setText("Cristian Zambrano");

        jButton1.setText("Gestión del Condominio");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestionCondominioButtomActionPerformed(evt);
            }
        });

        jButton2.setText("Gestión de contratos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestionContratosButtonActionPerformed(evt);
            }
        });

        jButton3.setText("Gestión de perfiles");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestionPerfilesButtonActionPerformed(evt);
            }
        });

        jButton4.setText("Bandeja de entrada");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bandejaEntradaButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("¿Qué deseas hacer el día de hoy?");

        jButton5.setText("Redactar Mensaje");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5bandejaEntradaButtonActionPerformed(evt);
            }
        });

        jButton6.setText("Gestión finanzas");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton3))))
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bandejaEntradaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bandejaEntradaButtonActionPerformed
        // TODO add your handling code here:
        GUIBandejaDeEntrada bandeja = new GUIBandejaDeEntrada(administrador, 0);
        bandeja.setListaMensajes(administrador.getBandejaDeEntrada().getListaMensajes());
        bandeja.setVisible(true);
    }//GEN-LAST:event_bandejaEntradaButtonActionPerformed

    private void gestionCondominioButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestionCondominioButtomActionPerformed
        // TODO add your handling code here:
        GestionCondominio gestionCondominio = new GestionCondominio(administrador);
        gestionCondominio.setVisible(true);
    }//GEN-LAST:event_gestionCondominioButtomActionPerformed

    private void gestionContratosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestionContratosButtonActionPerformed
        // TODO add your handling code here:
        GestionContrato gestionContrato = new GestionContrato(administrador);
        gestionContrato.setVisible(true);
    }//GEN-LAST:event_gestionContratosButtonActionPerformed

    private void gestionPerfilesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestionPerfilesButtonActionPerformed
        // TODO add your handling code here:
        GestionPerfil gestionPerfil = new GestionPerfil(administrador);
        gestionPerfil.setVisible(true);
    }//GEN-LAST:event_gestionPerfilesButtonActionPerformed

    private void jButton5bandejaEntradaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5bandejaEntradaButtonActionPerformed
        // TODO add your handling code here:
        GUIMensaje gUIMensaje = new GUIMensaje(administrador,0);
        // Hacer visible la nueva ventana
        gUIMensaje.setVisible(true);
        // Hacer invisible la ventana actual
        this.setVisible(false);
        // Configurar el comportamiento al cerrar la ventana de ListaResidente
        gUIMensaje.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        gUIMensaje.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
   
                // Hacer visible la ventana actual al cerrar la ventana de ListaResidente
                setVisible(true);
            }
        });
    }//GEN-LAST:event_jButton5bandejaEntradaButtonActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        FinanzasAdministrador menuFinanzasAdministrador = new FinanzasAdministrador(administrador);
        menuFinanzasAdministrador.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    // End of variables declaration//GEN-END:variables
}
