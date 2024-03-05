package GUI.AlquilerGUI;

import GUI.AdminGUI.*;
import Administracion.Administrador;
import Administracion.Residente;
import BD.BaseDeDatos;
import static GUI.AdminGUI.GestionMueble.inventario;
import ModuloMuebles.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Grupo3
 */
public class MenuAlquiler extends javax.swing.JFrame {

    Administrador administrador;

    AdministracionAlquiler administracionAlquiler;
    
    private int idAlquiler = 0;

    public MenuAlquiler(Administrador administrador) {
        initComponents();
        this.setLocationRelativeTo(this);
        administracionAlquiler= new AdministracionAlquiler();
        this.administrador = administrador;
        this.jTFIdAlquiler.setEditable(false);
        actualizarCantidadMuebles();
        
        jTAAlquileresFinalizados.setText(String.valueOf(administrador.getCondominio().obtenerResidentes().get(0).getCorreo()));

        //ArrayList<Residente> listaResidente = administrador.getResidentes();
        //actualizarCantidadMuebles();
        //jTAAlquileresActivos.setText(administracionAlquiler.alquileresFinalizados(true).toString());
        //jTAAlquileresFinalizados.setText(administracionAlquiler.alquileresFinalizados(false).toString());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTFIdAlquiler = new javax.swing.JTextField();
        jTFDias = new javax.swing.JTextField();
        jTFCantidad = new javax.swing.JTextField();
        jCBTipoMueble = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jTFPrecio = new javax.swing.JTextField();
        jButtonAceptar1 = new javax.swing.JButton();
        jTFCorreo = new javax.swing.JTextField();
        jBAceptar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAAlquileresFinalizados = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTAAlquileresActivos = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        jLabel9 = new javax.swing.JLabel();
        jBBuscar = new java.awt.Button();
        TFBuscarPorCorreo = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jTFIdAlquilerD = new javax.swing.JTextField();
        jTFFechaDevolución = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTADevolución = new javax.swing.JTextArea();
        jBDevolver = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTFNumeroSillas = new javax.swing.JTextField();
        jTFNumeroMesas = new javax.swing.JTextField();
        jTFNumeroCarpas = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTFSillasPorReparar = new javax.swing.JTextField();
        jTFMesasPorReparar = new javax.swing.JTextField();
        jTFCarpasPorReparar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Gestion Alquiler Muebles");

        btnVolver.setBackground(new java.awt.Color(0, 204, 204));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jTabbedPane5.setBackground(new java.awt.Color(0, 204, 204));
        jTabbedPane5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(153, 255, 204));

        jLabel2.setText("Datos Alquiler");

        jLabel3.setText("Días");

        jLabel5.setText("Tipo Mueble");

        jLabel6.setText("Cantidad");

        jLabel7.setText("ID Alquiler");

        jTFIdAlquiler.setEditable(false);

        jTFDias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFDiasActionPerformed(evt);
            }
        });

        jCBTipoMueble.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Carpa", "Silla", "Mesa", " " }));
        jCBTipoMueble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBTipoMuebleActionPerformed(evt);
            }
        });

        jLabel10.setText("Correo");

        jLabel27.setText("Precio inicial");

        jTFPrecio.setEditable(false);

        jButtonAceptar1.setBackground(new java.awt.Color(0, 204, 204));
        jButtonAceptar1.setText("Verificar");
        jButtonAceptar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptar1ActionPerformed(evt);
            }
        });

        jBAceptar.setBackground(new java.awt.Color(0, 204, 204));
        jBAceptar.setText("Aceptar");
        jBAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel27))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTFCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(jBAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTFPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFDias, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCBTipoMueble, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 278, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAceptar1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel7))
                                    .addComponent(jLabel10))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTFIdAlquiler, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                                    .addComponent(jTFCorreo))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTFIdAlquiler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTFCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTFDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jCBTipoMueble, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTFCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jTFPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAceptar1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("Alquilar", jPanel1);

        jPanel2.setBackground(new java.awt.Color(153, 255, 204));

        jTAAlquileresFinalizados.setColumns(20);
        jTAAlquileresFinalizados.setRows(5);
        jScrollPane1.setViewportView(jTAAlquileresFinalizados);

        jTAAlquileresActivos.setColumns(20);
        jTAAlquileresActivos.setRows(5);
        jScrollPane2.setViewportView(jTAAlquileresActivos);

        jLabel8.setText("Alquileres en curso");

        label1.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        label1.setText("Buscar Residente: ");

        jLabel9.setText("Alquileres Finalizados");

        jBBuscar.setLabel("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        TFBuscarPorCorreo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TFBuscarPorCorreo.setText("Ingrese correo");
        TFBuscarPorCorreo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TFBuscarPorCorreoFocusGained(evt);
            }
        });
        TFBuscarPorCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFBuscarPorCorreoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFBuscarPorCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TFBuscarPorCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("Lista Alquileres", jPanel2);

        jPanel3.setBackground(new java.awt.Color(153, 255, 204));

        jLabel20.setText("Días ");

        jLabel23.setText("ID Alquiler");

        jTFIdAlquilerD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFIdAlquilerDActionPerformed(evt);
            }
        });

        jLabel24.setText("Datos Devolución");

        jTADevolución.setColumns(20);
        jTADevolución.setRows(5);
        jScrollPane3.setViewportView(jTADevolución);

        jBDevolver.setText("Devolver");
        jBDevolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDevolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addGap(239, 500, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel23))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jTFIdAlquilerD, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                                .addGap(276, 276, 276))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jTFFechaDevolución, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jBDevolver))
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jTFIdAlquilerD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jTFFechaDevolución, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBDevolver))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("Devolución", jPanel3);

        jPanel4.setBackground(new java.awt.Color(153, 255, 204));

        jLabel11.setText("Cantidades");

        jLabel12.setText("Muebles Disponibles");

        jLabel14.setText("Mesas");

        jLabel15.setText("Carpas");

        jLabel16.setText("Sillas");

        jTFNumeroSillas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNumeroSillasActionPerformed(evt);
            }
        });

        jTFNumeroMesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNumeroMesasActionPerformed(evt);
            }
        });

        jButton1.setText("Actualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFNumeroCarpas, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFNumeroSillas, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFNumeroMesas, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 243, Short.MAX_VALUE)
                                .addComponent(jButton1)))))
                .addGap(84, 84, 84))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jTFNumeroMesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jButton1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jTFNumeroSillas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTFNumeroCarpas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(128, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("Lista Muebles", jPanel4);

        jPanel6.setBackground(new java.awt.Color(153, 255, 204));

        jLabel13.setText("Cantidades");

        jLabel17.setText("Muebles que requieren Reparar");

        jLabel18.setText("Mesas");

        jLabel19.setText("Carpas");

        jLabel21.setText("Sillas");

        jTFMesasPorReparar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFMesasPorRepararActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel17))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFCarpasPorReparar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFSillasPorReparar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFMesasPorReparar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))))
                .addContainerGap(411, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addGap(27, 27, 27)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jTFMesasPorReparar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jTFSillasPorReparar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jTFCarpasPorReparar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(128, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("Lista Reparaciones", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane5)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(60, 60, 60)
                .addComponent(jTabbedPane5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void jTFMesasPorRepararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFMesasPorRepararActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFMesasPorRepararActionPerformed

    private void jTFNumeroMesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNumeroMesasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNumeroMesasActionPerformed

    private void jBDevolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDevolverActionPerformed
        // TODO add your handling code here:

        int idAquiler = Integer.parseInt(jTFIdAlquilerD.getText());
        
        //alquiler = administracionAlquiler.finalizarAlquiler(idAlquiler,fecha);
    }//GEN-LAST:event_jBDevolverActionPerformed

    private void jTFIdAlquilerDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFIdAlquilerDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFIdAlquilerDActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAceptarActionPerformed
        idAlquiler++;
        jTFIdAlquiler.setText(String.valueOf(idAlquiler));

        int id = idAlquiler;
        String correo = jTFIdAlquiler.getText();
        int dias = Integer.parseInt(jTFDias.getText());
        String tipoMueble = jCBTipoMueble.getSelectedItem().toString();
        int cantidad = Integer.parseInt(jTFCantidad.getText());
        
       jTAAlquileresActivos.setText( administracionAlquiler.alquilar(administrador, tipoMueble, cantidad, correo, dias).toString());
        jTFPrecio.setText(String.valueOf(administracionAlquiler.calcularPrecioTotal(tipoMueble, cantidad, dias)));
        
    }//GEN-LAST:event_jBAceptarActionPerformed

    private void jButtonAceptar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptar1ActionPerformed

    }//GEN-LAST:event_jButtonAceptar1ActionPerformed

    private void jCBTipoMuebleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBTipoMuebleActionPerformed

    }//GEN-LAST:event_jCBTipoMuebleActionPerformed

    private void jTFDiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFDiasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFDiasActionPerformed

    private void jTFNumeroSillasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNumeroSillasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNumeroSillasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        actualizarCantidadMuebles();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TFBuscarPorCorreoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TFBuscarPorCorreoFocusGained
        TFBuscarPorCorreo.setText("");
    }//GEN-LAST:event_TFBuscarPorCorreoFocusGained

    private void TFBuscarPorCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFBuscarPorCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFBuscarPorCorreoActionPerformed
    
//    
//    private void establecerFechaActual() {
//        // Obtener la fecha actual
//        Date fechaActual = new Date();
//
//        // Formatear la fecha como una cadena
//        SimpleDateFormat formatoFecha = new SimpleDateFormat("YY/MM/DD");
//        String fechaActualStr = formatoFecha.format(fechaActual);
//
//        // Establecer la fecha en el JTextField
//        jTFDias.setText(fechaActualStr);
//    }
  
    private void actualizarCantidadMuebles() {
        jTFNumeroMesas.setText(String.valueOf(inventario.contarMesas()));
        jTFNumeroSillas.setText(String.valueOf(inventario.contarSillas()));
        jTFNumeroCarpas.setText(String.valueOf(inventario.contarCarpas()));

        jTFMesasPorReparar.setText(String.valueOf(inventario.contarMesasReparar()));
        jTFSillasPorReparar.setText(String.valueOf(inventario.contarSillasReparar()));
        jTFCarpasPorReparar.setText(String.valueOf(inventario.contarCarpasReparar()));
    }
       
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TFBuscarPorCorreo;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton jBAceptar;
    private java.awt.Button jBBuscar;
    private javax.swing.JButton jBDevolver;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAceptar1;
    private javax.swing.JComboBox<String> jCBTipoMueble;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTAAlquileresActivos;
    private javax.swing.JTextArea jTAAlquileresFinalizados;
    private javax.swing.JTextArea jTADevolución;
    private javax.swing.JTextField jTFCantidad;
    private javax.swing.JTextField jTFCarpasPorReparar;
    private javax.swing.JTextField jTFCorreo;
    private javax.swing.JTextField jTFDias;
    private javax.swing.JTextField jTFFechaDevolución;
    private javax.swing.JTextField jTFIdAlquiler;
    private javax.swing.JTextField jTFIdAlquilerD;
    private javax.swing.JTextField jTFMesasPorReparar;
    private javax.swing.JTextField jTFNumeroCarpas;
    private javax.swing.JTextField jTFNumeroMesas;
    private javax.swing.JTextField jTFNumeroSillas;
    private javax.swing.JTextField jTFPrecio;
    private javax.swing.JTextField jTFSillasPorReparar;
    private javax.swing.JTabbedPane jTabbedPane5;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables
}
