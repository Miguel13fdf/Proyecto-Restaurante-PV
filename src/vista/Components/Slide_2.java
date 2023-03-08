package vista.Components;

public class Slide_2 extends javax.swing.JPanel {

    public Slide_2() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pictureBox1 = new CustomElements.ImgSlide.PictureBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        pictureBox1.setImage(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Product_2.jpg"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Visitar pagiina web");
        pictureBox1.add(jLabel1);
        jLabel1.setBounds(730, 280, 160, 17);

        jLabel2.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("El sabor de la felicidad en cada bocado");
        pictureBox1.add(jLabel2);
        jLabel2.setBounds(20, 260, 600, 33);

        jSeparator1.setBackground(new java.awt.Color(255, 204, 51));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jSeparator1.setName(""); // NOI18N
        pictureBox1.add(jSeparator1);
        jSeparator1.setBounds(20, 290, 540, 10);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 896, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pictureBox1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 896, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 307, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pictureBox1, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private CustomElements.ImgSlide.PictureBox pictureBox1;
    // End of variables declaration//GEN-END:variables
}
