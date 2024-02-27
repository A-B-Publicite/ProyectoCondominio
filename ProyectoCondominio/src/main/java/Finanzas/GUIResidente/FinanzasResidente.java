package Finanzas.GUIResidente;

import Administracion.Residente;
import Finanzas.Efectivo;
import Finanzas.MetodoRecarga;
import Finanzas.ObligacionFinanciera;
import Finanzas.Tarjeta;
import Finanzas.Transferencia;
import javax.swing.JOptionPane;

public class FinanzasResidente extends javax.swing.JFrame {

    static Residente residente = new Residente();

    public FinanzasResidente(Residente residente) {
        initComponents();
        this.setVisible(true);
        this.residente = residente;
        lblNumCuenta.setVisible(false);
        lblNumTarjeta.setVisible(false);
        lblCodSeg.setVisible(false);
        txtNumTarjeta.setVisible(false);
        txtCodSeg.setVisible(false);
        txtNumCuenta.setVisible(false);
        lblSaldoCuentaObligaciones.setText(String.valueOf(residente.getCuenta().getSaldo()));
        lblSaldoCuentaRecarga.setText(String.valueOf(residente.getCuenta().getSaldo()));
        setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        btnVisualizarObligaciones = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAObligaciones = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblSaldoCuentaObligaciones = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtIDObligacion = new javax.swing.JTextField();
        btnPagar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnMostrarListaPagos = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTAListaPagos = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        lblSaldoPagos = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblSaldoCuentaRecarga = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jCBMetodoRecarga = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtMontoAbonar = new javax.swing.JTextField();
        lblNumTarjeta = new javax.swing.JLabel();
        btnRecargar = new javax.swing.JButton();
        txtNumTarjeta = new javax.swing.JTextField();
        lblCodSeg = new javax.swing.JLabel();
        txtCodSeg = new javax.swing.JTextField();
        lblNumCuenta = new javax.swing.JLabel();
        txtNumCuenta = new javax.swing.JTextField();
        btnMostrarRecargas = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTAListaRecargas = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnVisualizarObligaciones.setText("Visualizar obligaciones");
        btnVisualizarObligaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarObligacionesActionPerformed(evt);
            }
        });

        jTAObligaciones.setColumns(20);
        jTAObligaciones.setRows(5);
        jTAObligaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de obligaciones a pagar"));
        jScrollPane1.setViewportView(jTAObligaciones);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Pagar obligacion"));

        jLabel1.setText("Saldo de la cuenta:");

        jLabel2.setText("Ingrese el ID de la obligación a pagar :");

        btnPagar.setText("PAGAR");
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSaldoCuentaObligaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtIDObligacion, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(416, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblSaldoCuentaObligaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtIDObligacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPagar)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(btnVisualizarObligaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btnVisualizarObligaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Pagar", jPanel1);

        btnMostrarListaPagos.setText("Mostar lista de pagos");
        btnMostrarListaPagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarListaPagosActionPerformed(evt);
            }
        });

        jTAListaPagos.setColumns(20);
        jTAListaPagos.setRows(5);
        jTAListaPagos.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de pagos"));
        jScrollPane3.setViewportView(jTAListaPagos);

        jLabel6.setText("Saldo actual:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblSaldoPagos, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102)
                        .addComponent(btnMostrarListaPagos, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMostrarListaPagos, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(lblSaldoPagos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(156, 156, 156))
        );

        jTabbedPane3.addTab("Pagos", jPanel3);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Recargar"));

        jLabel3.setText("Saldo en la cuenta:");

        lblSaldoCuentaRecarga.setToolTipText("");

        jLabel4.setText("Elige el metodo de recarga:");

        jCBMetodoRecarga.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Efectivo", "Tarjeta", "Transferencia" }));
        jCBMetodoRecarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBMetodoRecargaActionPerformed(evt);
            }
        });

        jLabel5.setText("Ingresa el monto a abonar a la cuenta:");

        lblNumTarjeta.setText("Ingresa el numero de la tarjeta:");

        btnRecargar.setText("Recargar");
        btnRecargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecargarActionPerformed(evt);
            }
        });

        lblCodSeg.setText("Ingresa el PIN de la tarjeta:");

        lblNumCuenta.setText("Ingresa el numero de cuenta");

        btnMostrarRecargas.setText("Mostrar recargas realizadas");
        btnMostrarRecargas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarRecargasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSaldoCuentaRecarga, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCBMetodoRecarga, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMontoAbonar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                            .addComponent(lblNumTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                            .addComponent(lblCodSeg, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(49, 49, 49)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                        .addComponent(lblNumCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(62, 62, 62)))
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNumTarjeta)
                                    .addComponent(txtCodSeg)
                                    .addComponent(txtNumCuenta))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRecargar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMostrarRecargas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(585, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCBMetodoRecarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblSaldoCuentaRecarga, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtMontoAbonar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRecargar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumTarjeta)
                    .addComponent(txtNumTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMostrarRecargas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodSeg)
                    .addComponent(txtCodSeg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumCuenta)
                    .addComponent(txtNumCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jTAListaRecargas.setColumns(20);
        jTAListaRecargas.setRows(5);
        jTAListaRecargas.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de recargas realizadas"));
        jScrollPane2.setViewportView(jTAListaRecargas);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane2))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Recargar", jPanel2);

        jMenu1.setText("Archivo");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jMenuItem1.setText("Regresar");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVisualizarObligacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarObligacionesActionPerformed
        lblSaldoCuentaObligaciones.setText(String.valueOf(residente.getCuenta().getSaldo()));
        jTAObligaciones.setText(residente.getCuenta().mostrarObligaciones());
        if (residente.getNombre() != null) {
            System.out.println(residente.getNombre());
            //jTAObligaciones.setText(residente.getNombre());
        } else {
            System.out.println("uy vali papito");
        }
    }//GEN-LAST:event_btnVisualizarObligacionesActionPerformed

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
        ObligacionFinanciera obligacionAPagar = residente.getCuenta().getGestorObligaciones().recuperarObligacion(txtIDObligacion.getText());
        if (obligacionAPagar != null) {
            residente.pagar(obligacionAPagar);
            lblSaldoCuentaObligaciones.setText(String.valueOf(residente.getCuenta().getSaldo()));
            limpiarDatosObligaciones();
        } else {
            JOptionPane.showMessageDialog(null, "No se encontro a la obligacion financiera");
            limpiarDatosObligaciones();
        }
    }//GEN-LAST:event_btnPagarActionPerformed

    private void jCBMetodoRecargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBMetodoRecargaActionPerformed
        switch (jCBMetodoRecarga.getSelectedIndex()) {
            case 0:
                lblNumCuenta.setVisible(false);
                lblNumTarjeta.setVisible(false);
                lblCodSeg.setVisible(false);
                txtNumTarjeta.setVisible(false);
                txtCodSeg.setVisible(false);
                txtNumCuenta.setVisible(false);
                break;
            case 1:
                lblNumCuenta.setVisible(false);
                lblNumTarjeta.setVisible(true);
                lblCodSeg.setVisible(true);
                txtNumTarjeta.setVisible(true);
                txtCodSeg.setVisible(true);
                txtNumCuenta.setVisible(false);
                break;
            case 2:
                lblNumCuenta.setVisible(true);
                lblNumTarjeta.setVisible(false);
                lblCodSeg.setVisible(false);
                txtNumTarjeta.setVisible(false);
                txtCodSeg.setVisible(false);
                txtNumCuenta.setVisible(true);
                break;
        }
    }//GEN-LAST:event_jCBMetodoRecargaActionPerformed

    private void btnRecargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecargarActionPerformed
        if (txtMontoAbonar.getText() != null) {
            switch (jCBMetodoRecarga.getSelectedIndex()) {
                case 0:
                    MetodoRecarga efectivo = new Efectivo();
                    residente.getCuenta().recargarSaldo(Double.parseDouble(txtMontoAbonar.getText()), efectivo);
                    JOptionPane.showMessageDialog(null, "Recarga realizada con exito");
                    lblSaldoCuentaRecarga.setText(String.valueOf(residente.getCuenta().getSaldo()));
                    limpiarDatosRecarga();
                    break;
                case 1:
                    MetodoRecarga tarjeta = new Tarjeta(txtNumTarjeta.getText(), txtCodSeg.getText());
                    residente.getCuenta().recargarSaldo(Double.parseDouble(txtMontoAbonar.getText()), tarjeta);
                    JOptionPane.showMessageDialog(null, "Recarga realizada con exito");
                    lblSaldoCuentaRecarga.setText(String.valueOf(residente.getCuenta().getSaldo()));
                    limpiarDatosRecarga();
                    break;
                case 2:
                    MetodoRecarga transferecia = new Transferencia(txtNumCuenta.getText(), "123");
                    residente.getCuenta().recargarSaldo(Double.parseDouble(txtMontoAbonar.getText()), transferecia);
                    JOptionPane.showMessageDialog(null, "Recarga realizada con exito");
                    lblSaldoCuentaRecarga.setText(String.valueOf(residente.getCuenta().getSaldo()));
                    limpiarDatosRecarga();
                    break;
                default:
                    throw new AssertionError();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Ingrese un valor valido");
        }

    }//GEN-LAST:event_btnRecargarActionPerformed

    private void btnMostrarRecargasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarRecargasActionPerformed
        jTAListaRecargas.setText(residente.getCuenta().mostrarRecargas());
    }//GEN-LAST:event_btnMostrarRecargasActionPerformed

    private void btnMostrarListaPagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarListaPagosActionPerformed
        lblSaldoPagos.setText(String.valueOf(residente.getCuenta().getSaldo()));
        jTAListaPagos.setText(residente.getCuenta().mostrarRegistros());
    }//GEN-LAST:event_btnMostrarListaPagosActionPerformed

    public void limpiarDatosObligaciones() {
        jTAObligaciones.setText("");
        txtIDObligacion.setText("");
    }

    public void limpiarDatosRecarga() {
        lblNumCuenta.setVisible(false);
        lblNumTarjeta.setVisible(false);
        lblCodSeg.setVisible(false);
        txtNumTarjeta.setVisible(false);
        txtCodSeg.setVisible(false);
        txtNumCuenta.setVisible(false);
        txtMontoAbonar.setText("");
        jTAListaRecargas.setText("");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FinanzasResidente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FinanzasResidente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FinanzasResidente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FinanzasResidente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FinanzasResidente(residente).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMostrarListaPagos;
    private javax.swing.JButton btnMostrarRecargas;
    private javax.swing.JButton btnPagar;
    private javax.swing.JButton btnRecargar;
    private javax.swing.JButton btnVisualizarObligaciones;
    private javax.swing.JComboBox<String> jCBMetodoRecarga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTAListaPagos;
    private javax.swing.JTextArea jTAListaRecargas;
    private javax.swing.JTextArea jTAObligaciones;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JLabel lblCodSeg;
    private javax.swing.JLabel lblNumCuenta;
    private javax.swing.JLabel lblNumTarjeta;
    private javax.swing.JLabel lblSaldoCuentaObligaciones;
    private javax.swing.JLabel lblSaldoCuentaRecarga;
    private javax.swing.JLabel lblSaldoPagos;
    private javax.swing.JTextField txtCodSeg;
    private javax.swing.JTextField txtIDObligacion;
    private javax.swing.JTextField txtMontoAbonar;
    private javax.swing.JTextField txtNumCuenta;
    private javax.swing.JTextField txtNumTarjeta;
    // End of variables declaration//GEN-END:variables
}
