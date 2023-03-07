package vista.Components;

import CustomElements.Menu.ImageAvatar;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

public class Header extends javax.swing.JPanel {

    public Header() {
        initComponents();
    }

    public ImageAvatar getFoto_De_Perfil() {
        return Foto_De_Perfil;
    }

    public void setFoto_De_Perfil(ImageAvatar Foto_De_Perfil) {
        this.Foto_De_Perfil = Foto_De_Perfil;
    }

    public JLabel getRoleTXT() {
        return RoleTXT;
    }

    public void setRoleTXT(JLabel RoleTXT) {
        this.RoleTXT = RoleTXT;
    }

    public JLabel getTitleTXT() {
        return TitleTXT;
    }

    public void setTitleTXT(JLabel TitleTXT) {
        this.TitleTXT = TitleTXT;
    }

    public JLabel getUserNameTXT() {
        return UserNameTXT;
    }

    public void setUserNameTXT(JLabel UserNameTXT) {
        this.UserNameTXT = UserNameTXT;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AppLogo = new CustomElements.Menu.ImageAvatar();
        TitleTXT = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        UserNameTXT = new javax.swing.JLabel();
        RoleTXT = new javax.swing.JLabel();
        Foto_De_Perfil = new CustomElements.Menu.ImageAvatar();

        setBackground(new java.awt.Color(255, 255, 255));

        AppLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LOGO_RESTAURANT_PROYECT.png"))); // NOI18N

        TitleTXT.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        TitleTXT.setForeground(new java.awt.Color(127, 127, 127));
        TitleTXT.setText("Home");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        UserNameTXT.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        UserNameTXT.setForeground(new java.awt.Color(127, 127, 127));
        UserNameTXT.setText("Angel Cardenas");

        RoleTXT.setForeground(new java.awt.Color(127, 127, 127));
        RoleTXT.setText("Administrador");

        Foto_De_Perfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LOGO_RESTAURANT_PROYECT.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AppLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TitleTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 204, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UserNameTXT, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(RoleTXT, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Foto_De_Perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(AppLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TitleTXT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(UserNameTXT)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RoleTXT))
                            .addComponent(Foto_De_Perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private CustomElements.Menu.ImageAvatar AppLogo;
    private CustomElements.Menu.ImageAvatar Foto_De_Perfil;
    private javax.swing.JLabel RoleTXT;
    private javax.swing.JLabel TitleTXT;
    private javax.swing.JLabel UserNameTXT;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
