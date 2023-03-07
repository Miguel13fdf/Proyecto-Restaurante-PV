package vista.Main;

public class Update_Personal extends javax.swing.JDialog {

    public Update_Personal(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ID_TXT = new javax.swing.JLabel();
        normalTextField1 = new CustomElements.NormalTextField();
        normalTextField2 = new CustomElements.NormalTextField();
        normalTextField3 = new CustomElements.NormalTextField();
        normalTextField4 = new CustomElements.NormalTextField();
        CancelBtn2 = new CustomElements.ButtonCustom();
        OkBtn = new CustomElements.ButtonCustom();
        LimpiarDatos_Btn = new CustomElements.ButtonCustom();
        Edad_TXT = new javax.swing.JLabel();
        jSpinnerEdad = new javax.swing.JSpinner();
        ID_BD = new javax.swing.JLabel();
        normalTextField5 = new CustomElements.NormalTextField();
        normalTextField6 = new CustomElements.NormalTextField();
        Cargo_TXT = new javax.swing.JLabel();
        comboBox_Cargo = new CustomElements.ComboBox.ComboBoxSuggestion();
        HEntrada_TXT = new javax.swing.JLabel();
        jdc_HEntrada = new com.toedter.calendar.JDateChooser();
        HSalida_TXT = new javax.swing.JLabel();
        jdc_HSalida = new com.toedter.calendar.JDateChooser();
        Foto_De_Perfil_TXT = new javax.swing.JLabel();
        lbl_foto = new javax.swing.JLabel();
        Subir_Foto_Btn = new CustomElements.ButtonCustom();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        ID_TXT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ID_TXT.setText("ID:");

        normalTextField1.setHelperText("Ingresa tu nombre");
        normalTextField1.setLabelText("Nombre");
        normalTextField1.setLineColor(new java.awt.Color(255, 153, 51));

        normalTextField2.setHelperText("Ingresa tu apellido");
        normalTextField2.setLabelText("Apellido");
        normalTextField2.setLineColor(new java.awt.Color(255, 153, 51));

        normalTextField3.setHelperText("Ingresa tu segundo apellido");
        normalTextField3.setLabelText("Segundo apellido");
        normalTextField3.setLineColor(new java.awt.Color(255, 153, 51));

        normalTextField4.setHelperText("Ingresa tu correo");
        normalTextField4.setLabelText("Correo");
        normalTextField4.setLineColor(new java.awt.Color(255, 153, 51));

        CancelBtn2.setBackground(new java.awt.Color(245, 71, 71));
        CancelBtn2.setText("Cancelar");
        CancelBtn2.setColorHover(new java.awt.Color(255, 74, 74));
        CancelBtn2.setColorPressed(new java.awt.Color(235, 61, 61));

        OkBtn.setText("Listo");

        LimpiarDatos_Btn.setBackground(new java.awt.Color(255, 255, 255));
        LimpiarDatos_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Limpiar Datos.png"))); // NOI18N
        LimpiarDatos_Btn.setColorHover(new java.awt.Color(204, 204, 204));
        LimpiarDatos_Btn.setColorPressed(new java.awt.Color(153, 153, 153));

        Edad_TXT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Edad_TXT.setText("Edad:");

        ID_BD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ID_BD.setText("123456789");

        normalTextField5.setHelperText("Ingresa tu nombre usuario");
        normalTextField5.setLabelText("Nombre usuario");
        normalTextField5.setLineColor(new java.awt.Color(255, 153, 51));

        normalTextField6.setToolTipText("");
        normalTextField6.setHelperText("Ingresa tu contraseña");
        normalTextField6.setLabelText("Contraseña");
        normalTextField6.setLineColor(new java.awt.Color(255, 153, 51));

        Cargo_TXT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cargo_TXT.setText("Cargo:");

        comboBox_Cargo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administrador", "Gerente", "Secretaria", "Cocinero", "Contador", " " }));

        HEntrada_TXT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        HEntrada_TXT.setText("Hora de entrada");

        HSalida_TXT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        HSalida_TXT.setText("Hora de salida");

        Foto_De_Perfil_TXT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Foto_De_Perfil_TXT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Foto_De_Perfil_TXT.setText("Foto De Perfil");

        lbl_foto.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Subir_Foto_Btn.setBackground(new java.awt.Color(255, 153, 0));
        Subir_Foto_Btn.setText("Subir Foto");
        Subir_Foto_Btn.setToolTipText("");
        Subir_Foto_Btn.setColorHover(new java.awt.Color(255, 174, 52));
        Subir_Foto_Btn.setColorPressed(new java.awt.Color(183, 110, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ID_TXT, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(ID_BD, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(normalTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(normalTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(normalTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(Edad_TXT, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jSpinnerEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(normalTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(normalTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(normalTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Cargo_TXT, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(comboBox_Cargo, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))
                                    .addComponent(jdc_HEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jdc_HSalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(HEntrada_TXT, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(HSalida_TXT, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(4, 4, 4)))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Foto_De_Perfil_TXT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_foto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(Subir_Foto_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 34, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(OkBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CancelBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(LimpiarDatos_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(55, 55, 55))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ID_TXT)
                            .addComponent(ID_BD))
                        .addGap(20, 20, 20)
                        .addComponent(normalTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(normalTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(normalTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(normalTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSpinnerEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Edad_TXT)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(normalTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(normalTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(comboBox_Cargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Cargo_TXT))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addComponent(jdc_HEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(HEntrada_TXT))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Foto_De_Perfil_TXT)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbl_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Subir_Foto_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(HSalida_TXT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jdc_HSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CancelBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(OkBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LimpiarDatos_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private CustomElements.ButtonCustom CancelBtn2;
    private javax.swing.JLabel Cargo_TXT;
    private javax.swing.JLabel Edad_TXT;
    private javax.swing.JLabel Foto_De_Perfil_TXT;
    private javax.swing.JLabel HEntrada_TXT;
    private javax.swing.JLabel HSalida_TXT;
    private javax.swing.JLabel ID_BD;
    private javax.swing.JLabel ID_TXT;
    private CustomElements.ButtonCustom LimpiarDatos_Btn;
    private CustomElements.ButtonCustom OkBtn;
    private CustomElements.ButtonCustom Subir_Foto_Btn;
    private CustomElements.ComboBox.ComboBoxSuggestion comboBox_Cargo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinnerEdad;
    private com.toedter.calendar.JDateChooser jdc_HEntrada;
    private com.toedter.calendar.JDateChooser jdc_HSalida;
    private javax.swing.JLabel lbl_foto;
    private CustomElements.NormalTextField normalTextField1;
    private CustomElements.NormalTextField normalTextField2;
    private CustomElements.NormalTextField normalTextField3;
    private CustomElements.NormalTextField normalTextField4;
    private CustomElements.NormalTextField normalTextField5;
    private CustomElements.NormalTextField normalTextField6;
    // End of variables declaration//GEN-END:variables
}
