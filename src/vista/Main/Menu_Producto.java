package vista.Main;

import CustomElements.ButtonCustom;
import CustomElements.ComboBox.ComboBoxSuggestion;
import CustomElements.NormalTextField;
import com.toedter.calendar.JDateChooser;
import javax.swing.JLabel;
import javax.swing.JSpinner;

public class Menu_Producto extends javax.swing.JDialog {

    public Menu_Producto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public NormalTextField getTextF_2Apellido() {
        return TextF_2Apellido;
    }

    public void setTextF_2Apellido(NormalTextField TextF_2Apellido) {
        this.TextF_2Apellido = TextF_2Apellido;
    }

    public NormalTextField getTextF_Apellido() {
        return TextF_Apellido;
    }

    public void setTextF_Apellido(NormalTextField TextF_Apellido) {
        this.TextF_Apellido = TextF_Apellido;
    }

    public NormalTextField getTextF_Contraseña() {
        return TextF_Contraseña;
    }

    public void setTextF_Contraseña(NormalTextField TextF_Contraseña) {
        this.TextF_Contraseña = TextF_Contraseña;
    }

    public NormalTextField getTextF_Correo() {
        return TextF_Correo;
    }

    public void setTextF_Correo(NormalTextField TextF_Correo) {
        this.TextF_Correo = TextF_Correo;
    }

    public NormalTextField getTextF_Nombre() {
        return TextF_Nombre;
    }

    public void setTextF_Nombre(NormalTextField TextF_Nombre) {
        this.TextF_Nombre = TextF_Nombre;
    }

    public NormalTextField getTextF_Usuario() {
        return TextF_Usuario;
    }

    public void setTextF_Usuario(NormalTextField TextF_Usuario) {
        this.TextF_Usuario = TextF_Usuario;
    }

    public ButtonCustom getCancelBtn() {
        return CancelBtn;
    }

    public void setCancelBtn(ButtonCustom CancelBtn) {
        this.CancelBtn = CancelBtn;
    }

    public JLabel getID_BD() {
        return ID_BD;
    }

    public void setID_BD(JLabel ID_BD) {
        this.ID_BD = ID_BD;
    }

    public ButtonCustom getLimpiarDatos_Btn() {
        return LimpiarDatos_Btn;
    }

    public void setLimpiarDatos_Btn(ButtonCustom LimpiarDatos_Btn) {
        this.LimpiarDatos_Btn = LimpiarDatos_Btn;
    }

    public ButtonCustom getOkBtn() {
        return OkBtn;
    }

    public void setOkBtn(ButtonCustom OkBtn) {
        this.OkBtn = OkBtn;
    }

    public ButtonCustom getSubir_Foto_Btn() {
        return Subir_Foto_Btn;
    }

    public void setSubir_Foto_Btn(ButtonCustom Subir_Foto_Btn) {
        this.Subir_Foto_Btn = Subir_Foto_Btn;
    }

    public ComboBoxSuggestion getComboBox_Cargo() {
        return comboBox_Cargo;
    }

    public void setComboBox_Cargo(ComboBoxSuggestion comboBox_Cargo) {
        this.comboBox_Cargo = comboBox_Cargo;
    }

    public JSpinner getjSpinnerEdad() {
        return jSpinnerEdad;
    }

    public void setjSpinnerEdad(JSpinner jSpinnerEdad) {
        this.jSpinnerEdad = jSpinnerEdad;
    }

    public JDateChooser getJdc_HEntrada() {
        return jdc_HEntrada;
    }

    public void setJdc_HEntrada(JDateChooser jdc_HEntrada) {
        this.jdc_HEntrada = jdc_HEntrada;
    }

    public JDateChooser getJdc_HSalida() {
        return jdc_HSalida;
    }

    public void setJdc_HSalida(JDateChooser jdc_HSalida) {
        this.jdc_HSalida = jdc_HSalida;
    }

    public JLabel getLbl_foto() {
        return lbl_foto;
    }

    public void setLbl_foto(JLabel lbl_foto) {
        this.lbl_foto = lbl_foto;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ID_TXT = new javax.swing.JLabel();
        TextF_Nombre = new CustomElements.NormalTextField();
        TextF_Apellido = new CustomElements.NormalTextField();
        TextF_2Apellido = new CustomElements.NormalTextField();
        TextF_Correo = new CustomElements.NormalTextField();
        CancelBtn = new CustomElements.ButtonCustom();
        OkBtn = new CustomElements.ButtonCustom();
        LimpiarDatos_Btn = new CustomElements.ButtonCustom();
        Edad_TXT = new javax.swing.JLabel();
        jSpinnerEdad = new javax.swing.JSpinner();
        ID_BD = new javax.swing.JLabel();
        TextF_Usuario = new CustomElements.NormalTextField();
        TextF_Contraseña = new CustomElements.NormalTextField();
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

        TextF_Nombre.setHelperText("Ingresa tu nombre");
        TextF_Nombre.setLabelText("Nombre");
        TextF_Nombre.setLineColor(new java.awt.Color(255, 153, 51));

        TextF_Apellido.setHelperText("Ingresa tu apellido");
        TextF_Apellido.setLabelText("Apellido");
        TextF_Apellido.setLineColor(new java.awt.Color(255, 153, 51));

        TextF_2Apellido.setHelperText("Ingresa tu segundo apellido");
        TextF_2Apellido.setLabelText("Segundo apellido");
        TextF_2Apellido.setLineColor(new java.awt.Color(255, 153, 51));

        TextF_Correo.setHelperText("Ingresa tu correo");
        TextF_Correo.setLabelText("Correo");
        TextF_Correo.setLineColor(new java.awt.Color(255, 153, 51));

        CancelBtn.setBackground(new java.awt.Color(245, 71, 71));
        CancelBtn.setText("Cancelar");
        CancelBtn.setColorHover(new java.awt.Color(255, 74, 74));
        CancelBtn.setColorPressed(new java.awt.Color(235, 61, 61));
        CancelBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        OkBtn.setText("Crear Personal");
        OkBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        LimpiarDatos_Btn.setBackground(new java.awt.Color(255, 255, 255));
        LimpiarDatos_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Limpiar Datos.png"))); // NOI18N
        LimpiarDatos_Btn.setColorHover(new java.awt.Color(204, 204, 204));
        LimpiarDatos_Btn.setColorPressed(new java.awt.Color(153, 153, 153));

        Edad_TXT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Edad_TXT.setText("Edad:");

        ID_BD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ID_BD.setText("123456789");

        TextF_Usuario.setHelperText("Ingresa tu nombre usuario");
        TextF_Usuario.setLabelText("Nombre usuario");
        TextF_Usuario.setLineColor(new java.awt.Color(255, 153, 51));

        TextF_Contraseña.setToolTipText("");
        TextF_Contraseña.setHelperText("Ingresa tu contraseña");
        TextF_Contraseña.setLabelText("Contraseña");
        TextF_Contraseña.setLineColor(new java.awt.Color(255, 153, 51));

        Cargo_TXT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cargo_TXT.setText("Cargo:");

        comboBox_Cargo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administrador", "Gerente", "Secretaria", "Cocinero", "Contador", " " }));

        HEntrada_TXT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        HEntrada_TXT.setText("Hora de entrada");

        jdc_HEntrada.setDateFormatString("d/MM/yyyy HH:MM");

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
                                        .addComponent(TextF_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(TextF_2Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(TextF_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(Edad_TXT, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jSpinnerEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(TextF_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextF_Usuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TextF_Contraseña, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addComponent(CancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(TextF_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(TextF_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(TextF_2Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(TextF_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSpinnerEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Edad_TXT)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(TextF_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TextF_Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(CancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    private CustomElements.ButtonCustom CancelBtn;
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
    private CustomElements.NormalTextField TextF_2Apellido;
    private CustomElements.NormalTextField TextF_Apellido;
    private CustomElements.NormalTextField TextF_Contraseña;
    private CustomElements.NormalTextField TextF_Correo;
    private CustomElements.NormalTextField TextF_Nombre;
    private CustomElements.NormalTextField TextF_Usuario;
    private CustomElements.ComboBox.ComboBoxSuggestion comboBox_Cargo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinnerEdad;
    private com.toedter.calendar.JDateChooser jdc_HEntrada;
    private com.toedter.calendar.JDateChooser jdc_HSalida;
    private javax.swing.JLabel lbl_foto;
    // End of variables declaration//GEN-END:variables
}
