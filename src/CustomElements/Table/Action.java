package CustomElements.Table;

import CustomElements.Menu.CircleButton;
import java.awt.Color;
import java.awt.Graphics;

public class Action extends javax.swing.JPanel {

    public CircleButton getDeleteBtn() {
        return DeleteBtn;
    }

    public void setDeleteBtn(CircleButton DeleteBtn) {
        this.DeleteBtn = DeleteBtn;
    }

    public CircleButton getEditBtn() {
        return EditBtn;
    }

    public void setEditBtn(CircleButton EditBtn) {
        this.EditBtn = EditBtn;
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        super.paintComponent(grphcs);
        grphcs.setColor(new Color(230, 230, 230));
        grphcs.drawLine(0, getHeight() - 1, getWidth(), getHeight() - 1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EditBtn = new CustomElements.Menu.CircleButton();
        DeleteBtn = new CustomElements.Menu.CircleButton();

        EditBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/edit.png"))); // NOI18N

        DeleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/delete.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DeleteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EditBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private CustomElements.Menu.CircleButton DeleteBtn;
    private CustomElements.Menu.CircleButton EditBtn;
    // End of variables declaration//GEN-END:variables
}
