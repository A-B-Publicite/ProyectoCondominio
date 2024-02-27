/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package guiCheckIn;

/**
 *
 * @author LENOVO
 */
public class CheckInGUI extends javax.swing.JPanel {

    /**
     * Creates new form CheckIn
     */
    public CheckInGUI() {
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

        containerCI = new javax.swing.JTabbedPane();
        pnVisitor = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtPersonInside = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaReason = new javax.swing.JTextArea();
        lblVehiculo = new javax.swing.JLabel();
        rbnYes = new javax.swing.JRadioButton();
        rbnNo = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        lblDate = new javax.swing.JLabel();
        lblHour = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        txtHour = new javax.swing.JTextField();
        pnProfile = new javax.swing.JPanel();
        lblName1 = new javax.swing.JLabel();
        txtName1 = new javax.swing.JTextField();
        lblVehiculo1 = new javax.swing.JLabel();
        rbnYes1 = new javax.swing.JRadioButton();
        rbnNo1 = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        lblDate1 = new javax.swing.JLabel();
        lblHour1 = new javax.swing.JLabel();
        txtDate1 = new javax.swing.JTextField();
        txtHour1 = new javax.swing.JTextField();
        pnService = new javax.swing.JPanel();
        lblName2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtName2 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtaReason2 = new javax.swing.JTextArea();
        lblVehiculo2 = new javax.swing.JLabel();
        rbnYes2 = new javax.swing.JRadioButton();
        rbnNo2 = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();
        lblDate2 = new javax.swing.JLabel();
        lblHour2 = new javax.swing.JLabel();
        txtDate2 = new javax.swing.JTextField();
        txtHour2 = new javax.swing.JTextField();

        containerCI.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "REGISTRAR INGRESO", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 2, 18), new java.awt.Color(51, 51, 51))); // NOI18N

        lblName.setText("Nombre:");

        jLabel2.setText("Persona a visitar:");

        jLabel3.setText("Motivo de visita:");

        txtaReason.setColumns(20);
        txtaReason.setRows(5);
        jScrollPane1.setViewportView(txtaReason);

        lblVehiculo.setText("¿Tiene vehículo?");

        rbnYes.setText("Si");

        rbnNo.setText("No");

        jButton1.setText("Solicitar autorización");
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        lblDate.setText("Fecha ingreso:");

        lblHour.setText("Hora ingreso:");

        javax.swing.GroupLayout pnVisitorLayout = new javax.swing.GroupLayout(pnVisitor);
        pnVisitor.setLayout(pnVisitorLayout);
        pnVisitorLayout.setHorizontalGroup(
            pnVisitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnVisitorLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(pnVisitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDate)
                    .addGroup(pnVisitorLayout.createSequentialGroup()
                        .addGroup(pnVisitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnVisitorLayout.createSequentialGroup()
                                .addGroup(pnVisitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(lblName)
                                    .addGroup(pnVisitorLayout.createSequentialGroup()
                                        .addComponent(lblVehiculo)
                                        .addGap(25, 25, 25)))
                                .addGap(18, 18, 18))
                            .addGroup(pnVisitorLayout.createSequentialGroup()
                                .addComponent(txtDate)
                                .addGap(55, 55, 55)))
                        .addGroup(pnVisitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtName)
                            .addComponent(txtPersonInside)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnVisitorLayout.createSequentialGroup()
                                .addComponent(rbnYes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                                .addGroup(pnVisitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnVisitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblHour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtHour))
                                    .addComponent(rbnNo, javax.swing.GroupLayout.Alignment.TRAILING))))))
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnVisitorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(132, 132, 132))
        );
        pnVisitorLayout.setVerticalGroup(
            pnVisitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnVisitorLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(pnVisitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(pnVisitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPersonInside, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(pnVisitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(pnVisitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVehiculo)
                    .addComponent(rbnYes)
                    .addComponent(rbnNo))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addGroup(pnVisitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDate)
                    .addComponent(lblHour, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnVisitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        containerCI.addTab("Visitante", pnVisitor);

        lblName1.setText("Nombre:");

        lblVehiculo1.setText("¿Tiene vehículo?");

        rbnYes1.setText("Si");

        rbnNo1.setText("No");

        jButton2.setText("Solicitar autorización");
        jButton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        lblDate1.setText("Fecha ingreso:");

        lblHour1.setText("Hora ingreso:");

        javax.swing.GroupLayout pnProfileLayout = new javax.swing.GroupLayout(pnProfile);
        pnProfile.setLayout(pnProfileLayout);
        pnProfileLayout.setHorizontalGroup(
            pnProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnProfileLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(pnProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDate1)
                    .addGroup(pnProfileLayout.createSequentialGroup()
                        .addGroup(pnProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnProfileLayout.createSequentialGroup()
                                .addComponent(txtDate1)
                                .addGap(55, 55, 55))
                            .addGroup(pnProfileLayout.createSequentialGroup()
                                .addGroup(pnProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblName1)
                                    .addComponent(lblVehiculo1))
                                .addGap(43, 43, 43)))
                        .addGroup(pnProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtName1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnProfileLayout.createSequentialGroup()
                                .addComponent(rbnYes1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                                .addGroup(pnProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblHour1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtHour1))
                                    .addComponent(rbnNo1, javax.swing.GroupLayout.Alignment.TRAILING))))))
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnProfileLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(132, 132, 132))
        );
        pnProfileLayout.setVerticalGroup(
            pnProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnProfileLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(pnProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName1))
                .addGap(40, 40, 40)
                .addGroup(pnProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVehiculo1)
                    .addComponent(rbnYes1)
                    .addComponent(rbnNo1))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addGroup(pnProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDate1)
                    .addComponent(lblHour1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHour1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(92, Short.MAX_VALUE))
        );

        containerCI.addTab("Perfil", pnProfile);

        lblName2.setText("Nombre:");

        jLabel7.setText("Motivo de ingreso:");

        txtaReason2.setColumns(20);
        txtaReason2.setRows(5);
        jScrollPane3.setViewportView(txtaReason2);

        lblVehiculo2.setText("¿Tiene vehículo?");

        rbnYes2.setText("Si");

        rbnNo2.setText("No");

        jButton3.setText("Solicitar autorización");
        jButton3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        lblDate2.setText("Fecha ingreso:");

        lblHour2.setText("Hora ingreso:");

        javax.swing.GroupLayout pnServiceLayout = new javax.swing.GroupLayout(pnService);
        pnService.setLayout(pnServiceLayout);
        pnServiceLayout.setHorizontalGroup(
            pnServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnServiceLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(pnServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDate2)
                    .addGroup(pnServiceLayout.createSequentialGroup()
                        .addGroup(pnServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnServiceLayout.createSequentialGroup()
                                .addGroup(pnServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(lblName2)
                                    .addGroup(pnServiceLayout.createSequentialGroup()
                                        .addComponent(lblVehiculo2)
                                        .addGap(25, 25, 25)))
                                .addGap(18, 18, 18))
                            .addGroup(pnServiceLayout.createSequentialGroup()
                                .addComponent(txtDate2)
                                .addGap(55, 55, 55)))
                        .addGroup(pnServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtName2)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnServiceLayout.createSequentialGroup()
                                .addComponent(rbnYes2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                                .addGroup(pnServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblHour2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtHour2))
                                    .addComponent(rbnNo2, javax.swing.GroupLayout.Alignment.TRAILING))))))
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnServiceLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(132, 132, 132))
        );
        pnServiceLayout.setVerticalGroup(
            pnServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnServiceLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(pnServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName2)
                    .addComponent(txtName2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnServiceLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel7))
                    .addGroup(pnServiceLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42)
                .addGroup(pnServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVehiculo2)
                    .addComponent(rbnYes2)
                    .addComponent(rbnNo2))
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addGroup(pnServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDate2)
                    .addComponent(lblHour2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDate2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHour2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        containerCI.addTab("Servicio", pnService);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(containerCI, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(containerCI, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane containerCI;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDate1;
    private javax.swing.JLabel lblDate2;
    private javax.swing.JLabel lblHour;
    private javax.swing.JLabel lblHour1;
    private javax.swing.JLabel lblHour2;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblName2;
    private javax.swing.JLabel lblVehiculo;
    private javax.swing.JLabel lblVehiculo1;
    private javax.swing.JLabel lblVehiculo2;
    private javax.swing.JPanel pnProfile;
    private javax.swing.JPanel pnService;
    private javax.swing.JPanel pnVisitor;
    private javax.swing.JRadioButton rbnNo;
    private javax.swing.JRadioButton rbnNo1;
    private javax.swing.JRadioButton rbnNo2;
    private javax.swing.JRadioButton rbnYes;
    private javax.swing.JRadioButton rbnYes1;
    private javax.swing.JRadioButton rbnYes2;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtDate1;
    private javax.swing.JTextField txtDate2;
    private javax.swing.JTextField txtHour;
    private javax.swing.JTextField txtHour1;
    private javax.swing.JTextField txtHour2;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtName1;
    private javax.swing.JTextField txtName2;
    private javax.swing.JTextField txtPersonInside;
    private javax.swing.JTextArea txtaReason;
    private javax.swing.JTextArea txtaReason2;
    // End of variables declaration//GEN-END:variables
}