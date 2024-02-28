/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI.MensajeGUI;

import Administracion.Administrador;
import Administracion.Perfil;
import Administracion.Residente;
import BD.BaseDeDatos;
import Comunicacion.Mensaje;
import Finanzas.ObligacionFinanciera;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author sebas
 */
public class GUIBandejaDeEntrada extends javax.swing.JFrame {

    private javax.swing.table.DefaultTableModel modeloTabla;
    private javax.swing.table.DefaultTableModel modeloTabla2;
    int tipo;
    Perfil perf;
    ArrayList<Residente> residentes;
    ArrayList<Mensaje> mensajes;
    int mensajeSeleccionado;
    int obligacionSeleccionada;
    
    /**
     * Creates new form GUIBandejaDeEntrada
     */
    public GUIBandejaDeEntrada(Perfil perfil, int tipo) {
        initComponents();
        this.perf=perfil;
        modeloTabla = (javax.swing.table.DefaultTableModel) jTable1.getModel();
        modeloTabla2 = (javax.swing.table.DefaultTableModel) jTable2.getModel();
        jTable1.setDefaultEditor(Object.class, null);
        jTable2.setDefaultEditor(Object.class, null);
        this.tipo=tipo;
        jTable1.setVisible(false);
        jTable2.setVisible(false);
    }

    
    public void setListaMensajes(ArrayList<Mensaje> listaMensajes) throws IOException, ClassNotFoundException {
        
        
        this.mensajes=listaMensajes;
        modeloTabla2.setRowCount(0);
        if (tipo==0) {
            for (Residente res : residentes) {
                for (ObligacionFinanciera obligaciones : res.getCuenta().getGestorObligaciones().getObligacionesFinancieras()) {
                    modeloTabla2.addRow(new Object[]{obligaciones.getEstado(), obligaciones.getMonto(), res.getNombreApellido()});
                }
            }
        }
                
        
        modeloTabla.setRowCount(0);

        // Agrega cada mensaje a la tabla
        for (Mensaje mensaje : listaMensajes) {
            modeloTabla.addRow(new Object[]{mensaje.getFecha(), mensaje.getTitulo(), mensaje.getOrigen()});
        }
        this.setResizable(false);
        switch (tipo) {
            case 0:
                this.setSize(800,500);
                jTable1.setVisible(true);
                jTable2.setVisible(true);
            break;
            case 1:
                this.setSize(350,500);
                jTable1.setVisible(true);
                jTable2.setVisible(false);
            break;
                
            default:
                throw new AssertionError();
        }
        
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Fecha", "Titulo", "Origen"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Estado", "Monto", "Nombre"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jButton1.setText("Cerrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("OBLIGACIONES RESIDENTES");

        jLabel2.setText("MENSAJES");

        jLabel3.setText("Haga doble clic en una obligación para redactar recordatorio");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(244, 244, 244)
                        .addComponent(jLabel3)
                        .addGap(103, 103, 103))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(195, 195, 195))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 29, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        
        if (evt.getClickCount() == 2 && evt.getButton() == MouseEvent.BUTTON1) {
            mensajeSeleccionado = jTable1.getSelectedRow();
            JOptionPane.showMessageDialog(null, "Titulo: " + mensajes.get(mensajeSeleccionado).getTitulo() +
                    "\nOrigen: " + mensajes.get(mensajeSeleccionado).getOrigen() +
                    "\nFecha: " +  mensajes.get(mensajeSeleccionado).getFecha() + 
                    "\nContenido: " +  mensajes.get(mensajeSeleccionado).getContenido());
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2 && evt.getButton() == MouseEvent.BUTTON1) {
            obligacionSeleccionada = jTable2.getSelectedRow();
            for (Residente res : residentes) {
            if (res.getNombreApellido() == jTable2.getValueAt(obligacionSeleccionada, 2)) {
                GUIMensaje guiMen = new GUIMensaje((Administrador) perf,tipo);
                guiMen.setVisible(true);
                try {
                    guiMen.llenarObligacion("REPORTE DE PAGO", Double.parseDouble(jTable2.getValueAt(obligacionSeleccionada, 1).toString()), jTable2.getValueAt(obligacionSeleccionada, 2).toString(), jTable2.getValueAt(obligacionSeleccionada, 0).toString());
                } catch (IOException ex) {
                    Logger.getLogger(GUIBandejaDeEntrada.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(GUIBandejaDeEntrada.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        }
        
    }//GEN-LAST:event_jTable2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
