
package GUI.AdminGUI;

import Administracion.*;
import BD.BaseDeDatos;
import GUI.MensajeGUI.GUIBandejaDeEntrada;
import GUI.MensajeGUI.GUIMensaje;
import GUI.ReservasGUI.MenuReservas;
import GUI.MensajeGUI.ResidenteTabla;
import GUI.ModuloMueble.GUIMueble;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;


public class AdminMenu extends javax.swing.JFrame {

    private final Administrador administrador;

  
    public AdminMenu(Administrador administrador) {
        this.administrador = administrador;
        initComponents();
        lblBienvenida.setText(lblBienvenida.getText() + " " + administrador.getNombresCompletos());
        verificarExistenciaDeCondominio(administrador);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBienvenida = new java.awt.Label();
        btnGestionCondominio = new javax.swing.JButton();
        btnGestionContratos = new javax.swing.JButton();
        btnGestionPerfiles = new javax.swing.JButton();
        btnBandejaDeEntrada = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnRedactarMensaje = new javax.swing.JButton();
        btnVerPagos = new javax.swing.JButton();
        btnCrearCondominio = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnGestionReservas = new javax.swing.JButton();
        btnCrearAutorizacion = new javax.swing.JButton();
        btnGestionReservas1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblBienvenida.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblBienvenida.setName("mensajeBienvenidaLabel"); // NOI18N
        lblBienvenida.setText("¡Hola, bienvenido de vuelta!,");

        btnGestionCondominio.setText("Gestión del Condominio");
        btnGestionCondominio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestionCondominioButtomActionPerformed(evt);
            }
        });

        btnGestionContratos.setText("Gestión de contratos");
        btnGestionContratos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestionContratosButtonActionPerformed(evt);
            }
        });

        btnGestionPerfiles.setText("Gestión de perfiles");
        btnGestionPerfiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestionPerfilesButtonActionPerformed(evt);
            }
        });

        btnBandejaDeEntrada.setText("Bandeja de entrada");
        btnBandejaDeEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bandejaEntradaButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("¿Qué deseas hacer el día de hoy?");

        btnRedactarMensaje.setText("Redactar Mensaje");
        btnRedactarMensaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRedactarMensajebandejaEntradaButtonActionPerformed(evt);
            }
        });

        btnVerPagos.setText("Ver pagos");
        btnVerPagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerPagosActionPerformed(evt);
            }
        });

        btnCrearCondominio.setText("Crear Condominio");
        btnCrearCondominio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearCondominioActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnGestionReservas.setText("Gestión de reservas");
        btnGestionReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionReservasActionPerformed(evt);
            }
        });

        btnCrearAutorizacion.setText("Crear Autorización");
        btnCrearAutorizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearAutorizacionActionPerformed(evt);
            }
        });

        btnGestionReservas1.setText("Alquilar Muebles");
        btnGestionReservas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionReservas1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGestionReservas1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(450, 450, 450)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCrearAutorizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGestionCondominio, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnGestionReservas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnVerPagos, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnGestionContratos)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnGestionPerfiles)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnRedactarMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnBandejaDeEntrada)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addComponent(btnCrearCondominio, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(lblBienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btnCrearCondominio, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnGestionContratos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnGestionCondominio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnGestionPerfiles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBandejaDeEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCrearAutorizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnVerPagos, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnRedactarMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnGestionReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btnGestionReservas1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bandejaEntradaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bandejaEntradaButtonActionPerformed
        // TODO add your handling code here:
        GUIBandejaDeEntrada bandeja = new GUIBandejaDeEntrada(administrador, 0);
        //bandeja.setListaMensajes(administrador.getBandejaDeEntrada().getListaMensajes());
        bandeja.setVisible(true);
    }//GEN-LAST:event_bandejaEntradaButtonActionPerformed

    private void gestionCondominioButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestionCondominioButtomActionPerformed
        // TODO add your handling code here:
        GestionCondominio gestionCondominio = new GestionCondominio(administrador);
        gestionCondominio.setVisible(true);
    }//GEN-LAST:event_gestionCondominioButtomActionPerformed

    private void gestionContratosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestionContratosButtonActionPerformed
        GestionContratoAdmin gestionContrato = new GestionContratoAdmin(administrador);
        gestionContrato.setVisible(true);
    }//GEN-LAST:event_gestionContratosButtonActionPerformed

    private void gestionPerfilesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestionPerfilesButtonActionPerformed
        // TODO add your handling code here:
        GestionPerfil gestionPerfil = new GestionPerfil(administrador);
        gestionPerfil.setVisible(true);
    }//GEN-LAST:event_gestionPerfilesButtonActionPerformed

    private void btnRedactarMensajebandejaEntradaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRedactarMensajebandejaEntradaButtonActionPerformed
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
    }//GEN-LAST:event_btnRedactarMensajebandejaEntradaButtonActionPerformed

    private void btnVerPagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerPagosActionPerformed
        FinanzasAdministrador menuFinanzasAdministrador = new FinanzasAdministrador(administrador);
        menuFinanzasAdministrador.setVisible(true);
    }//GEN-LAST:event_btnVerPagosActionPerformed

    private void btnCrearCondominioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearCondominioActionPerformed
        CreacionCondominio nuevaCreacionCondominio = new CreacionCondominio(administrador);
        nuevaCreacionCondominio.setVisible(true);
        btnCrearCondominio.setVisible(false);
    }//GEN-LAST:event_btnCrearCondominioActionPerformed

    private void btnGestionReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionReservasActionPerformed
        MenuReservas menRes = new MenuReservas(administrador);
        menRes.setVisible(true);
    }//GEN-LAST:event_btnGestionReservasActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        BaseDeDatos.escribirAdmin(administrador);
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnCrearAutorizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearAutorizacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCrearAutorizacionActionPerformed

    private void btnGestionReservas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionReservas1ActionPerformed
//        GUIMueble guiMueble = new GUIMueble();
//    
//        // Hacer visible la nueva GUI
//        guiMueble.setVisible(true);
//
//        // Opcional: Puedes configurar el comportamiento al cerrar la nueva GUI si es necesario
//        guiMueble.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
          MenuReservas menRes = new MenuReservas(administrador);
        menRes.setVisible(true);
    }//GEN-LAST:event_btnGestionReservas1ActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBandejaDeEntrada;
    private javax.swing.JButton btnCrearAutorizacion;
    private javax.swing.JButton btnCrearCondominio;
    private javax.swing.JButton btnGestionCondominio;
    private javax.swing.JButton btnGestionContratos;
    private javax.swing.JButton btnGestionPerfiles;
    private javax.swing.JButton btnGestionReservas;
    private javax.swing.JButton btnGestionReservas1;
    private javax.swing.JButton btnRedactarMensaje;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVerPagos;
    private javax.swing.JLabel jLabel1;
    private java.awt.Label lblBienvenida;
    // End of variables declaration//GEN-END:variables

    private void verificarExistenciaDeCondominio(Administrador administrador) {
        if(administrador.getCondominio() != null){
            btnCrearCondominio.setVisible(false);
        }
    }
}
