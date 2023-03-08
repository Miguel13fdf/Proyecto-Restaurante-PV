package vista.Main;

import CustomElements.ButtonCustom;
import CustomElements.ComboBox.ComboBoxSuggestion;
import CustomElements.NormalTextField;
import com.toedter.calendar.JDateChooser;
import javax.swing.JLabel;
import javax.swing.JSpinner;

public class Menu extends javax.swing.JDialog {

    public Menu(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

   

    public NormalTextField getTextF_Nombre() {
        return TextM_descripcion;
    }

    public void setTextF_Nombre(NormalTextField TextF_Nombre) {
        this.TextM_descripcion = TextF_Nombre;
    }

  

    public ButtonCustom getCancelBtn() {
        return CancelBtn;
    }

    public void setCancelBtn(ButtonCustom CancelBtn) {
        this.CancelBtn = CancelBtn;
    }

    public JLabel getID_BD() {
        return ID_Mn;
    }

    public void setID_BD(JLabel ID_BD) {
        this.ID_Mn = ID_BD;
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

   

   


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ID_TXT = new javax.swing.JLabel();
        TextM_descripcion = new CustomElements.NormalTextField();
        CancelBtn = new CustomElements.ButtonCustom();
        OkBtn = new CustomElements.ButtonCustom();
        LimpiarDatos_Btn = new CustomElements.ButtonCustom();
        ID_Mn = new javax.swing.JLabel();
        Cargo_TXT = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new CustomElements.Table.Table();
        ID_Pro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        ID_TXT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ID_TXT.setText("ID:");

        TextM_descripcion.setHelperText("Ingresa la descriocion del menu");
        TextM_descripcion.setLabelText("Descripcion");
        TextM_descripcion.setLineColor(new java.awt.Color(255, 153, 51));

        CancelBtn.setBackground(new java.awt.Color(245, 71, 71));
        CancelBtn.setText("Cancelar");
        CancelBtn.setColorHover(new java.awt.Color(255, 74, 74));
        CancelBtn.setColorPressed(new java.awt.Color(235, 61, 61));
        CancelBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBtnActionPerformed(evt);
            }
        });

        OkBtn.setText("Crear Menu");
        OkBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        LimpiarDatos_Btn.setBackground(new java.awt.Color(255, 255, 255));
        LimpiarDatos_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Limpiar Datos.png"))); // NOI18N
        LimpiarDatos_Btn.setColorHover(new java.awt.Color(204, 204, 204));
        LimpiarDatos_Btn.setColorPressed(new java.awt.Color(153, 153, 153));

        ID_Mn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ID_Mn.setText("123456789");

        Cargo_TXT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cargo_TXT.setText("ID producto:");

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo del producto", "Nombre del porducto", "Precio", "Descripcion", "Tipo"
            }
        ));
        table1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        table1.setGridColor(new java.awt.Color(91, 0, 255));
        table1.setSelectionBackground(new java.awt.Color(255, 153, 0));
        jScrollPane1.setViewportView(table1);

        ID_Pro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ID_Pro.setText("000000000");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addComponent(ID_Mn, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(ID_TXT, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Cargo_TXT, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(ID_Pro, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(OkBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(CancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(LimpiarDatos_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 164, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextM_descripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ID_TXT)
                    .addComponent(ID_Mn))
                .addGap(28, 28, 28)
                .addComponent(TextM_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cargo_TXT)
                    .addComponent(ID_Pro))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(OkBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LimpiarDatos_Btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CancelBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private CustomElements.ButtonCustom CancelBtn;
    private javax.swing.JLabel Cargo_TXT;
    private javax.swing.JLabel ID_Mn;
    private javax.swing.JLabel ID_Pro;
    private javax.swing.JLabel ID_TXT;
    private CustomElements.ButtonCustom LimpiarDatos_Btn;
    private CustomElements.ButtonCustom OkBtn;
    private CustomElements.NormalTextField TextM_descripcion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private CustomElements.Table.Table table1;
    // End of variables declaration//GEN-END:variables
}
