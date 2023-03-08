package vista.Components;

import javax.swing.JLabel;

public class Slide_3 extends javax.swing.JPanel {

    public Slide_3() {
        initComponents();
    }

    public JLabel getLink_BTN() {
        return Link_BTN;
    }

    public void setLink_BTN(JLabel Link_BTN) {
        this.Link_BTN = Link_BTN;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pictureBox1 = new CustomElements.ImgSlide.PictureBox();
        Link_BTN = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelTransparent1 = new CustomElements.ImgSlide.PanelTransparent();

        pictureBox1.setImage(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Product_2.jpg"))); // NOI18N

        Link_BTN.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        Link_BTN.setForeground(new java.awt.Color(255, 255, 255));
        Link_BTN.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Link_BTN.setText("Visitar pagiina web");

        jLabel2.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("El sabor de la felicidad en cada bocado");

        panelTransparent1.setBackground(new java.awt.Color(255, 255, 255));
        panelTransparent1.setAlpha(1.0F);

        pictureBox1.setLayer(Link_BTN, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pictureBox1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pictureBox1.setLayer(panelTransparent1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout pictureBox1Layout = new javax.swing.GroupLayout(pictureBox1);
        pictureBox1.setLayout(pictureBox1Layout);
        pictureBox1Layout.setHorizontalGroup(
            pictureBox1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pictureBox1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pictureBox1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelTransparent1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE))
                .addGap(215, 215, 215)
                .addComponent(Link_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        pictureBox1Layout.setVerticalGroup(
            pictureBox1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pictureBox1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(0, 0, 0)
                .addComponent(panelTransparent1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pictureBox1Layout.createSequentialGroup()
                .addContainerGap(300, Short.MAX_VALUE)
                .addComponent(Link_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1057, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pictureBox1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 323, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pictureBox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Link_BTN;
    private javax.swing.JLabel jLabel2;
    private CustomElements.ImgSlide.PanelTransparent panelTransparent1;
    private CustomElements.ImgSlide.PictureBox pictureBox1;
    // End of variables declaration//GEN-END:variables
}
