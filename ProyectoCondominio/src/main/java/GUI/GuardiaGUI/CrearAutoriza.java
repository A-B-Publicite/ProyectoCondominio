/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI.GuardiaGUI;

import Administracion.Administrador;

/**
 *
 * @author MARQUEZ
 */
public class CrearAutoriza extends javax.swing.JFrame {

    private final Administrador administrador;

    /**
     * Creates new form CrearAutoriza
     */
    public CrearAutoriza(Administrador administrador) {
        initComponents();
        this.administrador = administrador;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAutorizador = new javax.swing.JLabel();
        txtAutorizador = new javax.swing.JTextField();
        lblAutorizado = new javax.swing.JLabel();
        txtAutorizado = new javax.swing.JTextField();
        lblFechaInicio = new javax.swing.JLabel();
        txtDateIn = new javax.swing.JTextField();
        lblFechaFin = new javax.swing.JLabel();
        txtDateOut = new javax.swing.JTextField();
        btCrearAutorizacion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblAutorizador.setText("Autorizador:");

        lblAutorizado.setText("Autorizado:");

        lblFechaInicio.setText("Fecha de inicio:");

        lblFechaFin.setText("Fecha de fin:");

        btCrearAutorizacion.setText("Crear autorizacion");
        btCrearAutorizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCrearAutorizacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAutorizador)
                    .addComponent(lblAutorizado)
                    .addComponent(lblFechaInicio)
                    .addComponent(lblFechaFin))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtAutorizador)
                    .addComponent(txtAutorizado)
                    .addComponent(txtDateIn)
                    .addComponent(txtDateOut, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(92, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btCrearAutorizacion)
                .addGap(135, 135, 135))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAutorizador)
                    .addComponent(txtAutorizador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAutorizado)
                    .addComponent(txtAutorizado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaInicio)
                    .addComponent(txtDateIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaFin)
                    .addComponent(txtDateOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(btCrearAutorizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCrearAutorizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCrearAutorizacionActionPerformed
        txtAutorizador.setText(administrador.getNombreApellido());
        administrador.crearAutorizacion(txtAutorizado.getText(), txtDateIn.getText(), txtDateOut.getText());
        administrador.enviarAutorizacionesGuardia();
        this.dispose();
    }//GEN-LAST:event_btCrearAutorizacionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCrearAutorizacion;
    private javax.swing.JLabel lblAutorizado;
    private javax.swing.JLabel lblAutorizador;
    private javax.swing.JLabel lblFechaFin;
    private javax.swing.JLabel lblFechaInicio;
    private javax.swing.JTextField txtAutorizado;
    private javax.swing.JTextField txtAutorizador;
    private javax.swing.JTextField txtDateIn;
    private javax.swing.JTextField txtDateOut;
    // End of variables declaration//GEN-END:variables
}
