/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Yelson
 */
public class WindowRegister extends javax.swing.JFrame {

    /**
     * Creates new form windowRegister
     */
    public WindowRegister() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        //Para que no sea permitido brincarse los pasos
        this.jTabbedPane.setSelectedIndex(0);
        this.jTabbedPane.setEnabledAt(1, false);
        this.jTabbedPane.setEnabledAt(2, false);
        this.rdBtnPremium.setSelected(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane = new javax.swing.JTabbedPane();
        jPanelUser = new javax.swing.JPanel();
        txtLastName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        jDateChooser = new com.toedter.calendar.JDateChooser();
        txtPassword = new javax.swing.JPasswordField();
        txtConfirmPassword = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnContinue1 = new javax.swing.JButton();
        jPanelService = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        btnBack2 = new javax.swing.JButton();
        btnContinue2 = new javax.swing.JButton();
        rdBtnPremium = new javax.swing.JRadioButton();
        rdBtnVideo = new javax.swing.JRadioButton();
        rdBtnMusic = new javax.swing.JRadioButton();
        rdBtnBasic = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanelPay = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        btnBack3 = new javax.swing.JButton();
        btnContinue3 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        txtCardNumber = new javax.swing.JTextField();
        jMonthChooser1 = new com.toedter.calendar.JMonthChooser();
        jYearChooser1 = new com.toedter.calendar.JYearChooser();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtCVV = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnQuestions = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();

        jButton2.setText("jButton2");

        jLabel27.setText("jLabel27");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(17, 31, 77));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(17, 31, 77), 2, true));

        jPanelUser.setBackground(new java.awt.Color(242, 244, 247));
        jPanelUser.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNameActionPerformed(evt);
            }
        });
        jPanelUser.add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 170, 30));
        jPanelUser.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 380, 30));

        txtName.setToolTipText("");
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        jPanelUser.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 170, 30));
        txtName.getAccessibleContext().setAccessibleName("");

        jPanelUser.add(jDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 200, 30));
        jPanelUser.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 150, 30));
        jPanelUser.add(txtConfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 150, 30));

        jLabel3.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Apellido:");
        jPanelUser.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, -1, 30));

        jLabel8.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(17, 31, 77));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("DATOS PERSONALES");
        jPanelUser.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel4.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Correo Electrónico:");
        jPanelUser.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, 30));

        jLabel5.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Nombre:");
        jPanelUser.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, 30));

        jLabel6.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Confirmar:");
        jPanelUser.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, -1, 30));

        jLabel7.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Contraseña:");
        jPanelUser.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 100, 30));

        jLabel9.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Fecha de Nacimiento:");
        jPanelUser.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, 30));

        btnContinue1.setBackground(new java.awt.Color(17, 31, 77));
        btnContinue1.setFont(new java.awt.Font("Corbel", 1, 16)); // NOI18N
        btnContinue1.setForeground(new java.awt.Color(242, 244, 247));
        btnContinue1.setText("CONTINUAR");
        btnContinue1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelUser.add(btnContinue1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 180, 40));

        jTabbedPane.addTab("Paso 1 ", jPanelUser);

        jPanelService.setBackground(new java.awt.Color(242, 244, 247));
        jPanelService.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(17, 31, 77));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("PLAN IDEAL");
        jPanelService.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        btnBack2.setBackground(new java.awt.Color(204, 204, 204));
        btnBack2.setFont(new java.awt.Font("Corbel", 1, 16)); // NOI18N
        btnBack2.setForeground(new java.awt.Color(17, 31, 77));
        btnBack2.setText("REGRESAR");
        btnBack2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelService.add(btnBack2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 180, 40));

        btnContinue2.setBackground(new java.awt.Color(17, 31, 77));
        btnContinue2.setFont(new java.awt.Font("Corbel", 1, 16)); // NOI18N
        btnContinue2.setForeground(new java.awt.Color(242, 244, 247));
        btnContinue2.setText("CONTINUAR");
        btnContinue2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelService.add(btnContinue2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 180, 40));

        rdBtnPremium.setBackground(new java.awt.Color(242, 244, 247));
        rdBtnPremium.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        rdBtnPremium.setText("Premium");
        rdBtnPremium.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelService.add(rdBtnPremium, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        rdBtnVideo.setBackground(new java.awt.Color(242, 244, 247));
        rdBtnVideo.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        rdBtnVideo.setText("Estándar Video");
        rdBtnVideo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rdBtnVideo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdBtnVideoActionPerformed(evt);
            }
        });
        jPanelService.add(rdBtnVideo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        rdBtnMusic.setBackground(new java.awt.Color(242, 244, 247));
        rdBtnMusic.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        rdBtnMusic.setText("Estándar Música");
        rdBtnMusic.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelService.add(rdBtnMusic, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        rdBtnBasic.setBackground(new java.awt.Color(242, 244, 247));
        rdBtnBasic.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        rdBtnBasic.setText("Básico");
        rdBtnBasic.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelService.add(rdBtnBasic, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jLabel12.setText("La mejor plataforma de videos en HD por tan solo $13 mensuales");
        jPanelService.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        jLabel13.setText("Musica y videos, todo en HD, juntos en una misma plataforma por tan solo $15 mensuales.");
        jPanelService.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        jLabel14.setText("Musica y videos a tu gusto, lleva sólo aquello que tú quieras y paga por producto");
        jPanelService.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        jLabel15.setText("Musica de la mejor calidad, lleva a tus artistas favoritos por tan solo $10 mensuales.");
        jPanelService.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        jTabbedPane.addTab("Paso 2 ", jPanelService);

        jPanelPay.setBackground(new java.awt.Color(242, 244, 247));
        jPanelPay.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(17, 31, 77));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("DATOS DE PAGO");
        jPanelPay.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        btnBack3.setBackground(new java.awt.Color(204, 204, 204));
        btnBack3.setFont(new java.awt.Font("Corbel", 1, 16)); // NOI18N
        btnBack3.setForeground(new java.awt.Color(17, 31, 77));
        btnBack3.setText("REGRESAR");
        btnBack3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelPay.add(btnBack3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 180, 40));

        btnContinue3.setBackground(new java.awt.Color(17, 31, 77));
        btnContinue3.setFont(new java.awt.Font("Corbel", 1, 16)); // NOI18N
        btnContinue3.setForeground(new java.awt.Color(242, 244, 247));
        btnContinue3.setText("CONTINUAR");
        btnContinue3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelPay.add(btnContinue3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 180, 40));

        jLabel16.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Fecha de Vencimiento:");
        jPanelPay.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, 30));

        txtCardNumber.setToolTipText("");
        txtCardNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCardNumberActionPerformed(evt);
            }
        });
        jPanelPay.add(txtCardNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 380, 30));
        jPanelPay.add(jMonthChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, -1, 30));
        jPanelPay.add(jYearChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 60, 30));

        jLabel17.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Número de Tarjeta:");
        jPanelPay.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 150, 30));

        jLabel18.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("CVV:");
        jPanelPay.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 40, 30));

        txtCVV.setToolTipText("");
        txtCVV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCVVActionPerformed(evt);
            }
        });
        jPanelPay.add(txtCVV, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 70, 30));

        jTabbedPane.addTab("Paso 3 ", jPanelPay);

        jPanel1.add(jTabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 630, 490));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Corbel", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(17, 31, 77));
        jLabel2.setText("REGISTRO DE USUARIO");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 30));

        btnQuestions.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        btnQuestions.setForeground(new java.awt.Color(17, 31, 77));
        btnQuestions.setText("Preguntas Frecuentes");
        btnQuestions.setBorder(null);
        btnQuestions.setBorderPainted(false);
        btnQuestions.setContentAreaFilled(false);
        btnQuestions.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQuestions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuestionsActionPerformed(evt);
            }
        });
        jPanel2.add(btnQuestions, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 160, -1));

        jLabel19.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 51));
        jLabel19.setText("Elige tu plan favorito");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        jLabel20.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 51));
        jLabel20.setText("Pronto vivirás una experiencia única.");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 220, -1));

        jLabel21.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 51, 51));
        jLabel21.setText("Sólo te quedan 3 sencillos pasos:");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 210, -1));

        jLabel22.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 51, 51));
        jLabel22.setText("Con StreamTEC disfruta de la mejor ");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        jLabel23.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(51, 51, 51));
        jLabel23.setText("Llena tus datos personales");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        jLabel24.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 51, 51));
        jLabel24.setText("Confirma el método de pago");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        jLabel25.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(51, 51, 51));
        jLabel25.setText("calidad en streaming del mundo");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        jLabel26.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(51, 51, 51));
        jLabel26.setText("¡Listo!");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, -1, -1));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/images/check.png"))); // NOI18N
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 20, 30));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/images/check.png"))); // NOI18N
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 20, 30));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/images/check.png"))); // NOI18N
        jPanel2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 20, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 230, 460));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/images/logo2.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        btnExit.setBackground(new java.awt.Color(102, 0, 0));
        btnExit.setFont(new java.awt.Font("Corbel", 1, 11)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("X");
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel1.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, 50, 30));

        btnLogin.setBackground(new java.awt.Color(17, 31, 77));
        btnLogin.setFont(new java.awt.Font("Corbel", 0, 16)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Iniciar Sesión");
        btnLogin.setBorder(null);
        btnLogin.setBorderPainted(false);
        btnLogin.setContentAreaFilled(false);
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 100, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastNameActionPerformed

    private void rdBtnVideoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdBtnVideoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdBtnVideoActionPerformed

    private void txtCardNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCardNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCardNumberActionPerformed

    private void txtCVVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCVVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCVVActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnQuestionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuestionsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnQuestionsActionPerformed

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
            java.util.logging.Logger.getLogger(WindowRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WindowRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WindowRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WindowRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WindowRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnBack2;
    public javax.swing.JButton btnBack3;
    public javax.swing.JButton btnContinue1;
    public javax.swing.JButton btnContinue2;
    public javax.swing.JButton btnContinue3;
    public javax.swing.JButton btnExit;
    public javax.swing.JButton btnLogin;
    public javax.swing.JButton btnQuestions;
    private javax.swing.JButton jButton2;
    public com.toedter.calendar.JDateChooser jDateChooser;
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
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public com.toedter.calendar.JMonthChooser jMonthChooser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelPay;
    private javax.swing.JPanel jPanelService;
    private javax.swing.JPanel jPanelUser;
    public javax.swing.JTabbedPane jTabbedPane;
    public com.toedter.calendar.JYearChooser jYearChooser1;
    public javax.swing.JRadioButton rdBtnBasic;
    public javax.swing.JRadioButton rdBtnMusic;
    public javax.swing.JRadioButton rdBtnPremium;
    public javax.swing.JRadioButton rdBtnVideo;
    public javax.swing.JTextField txtCVV;
    public javax.swing.JTextField txtCardNumber;
    public javax.swing.JPasswordField txtConfirmPassword;
    public javax.swing.JTextField txtEmail;
    public javax.swing.JTextField txtLastName;
    public javax.swing.JTextField txtName;
    public javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
