package controlador;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import modelo.ModeloPersonal;
import vista.LoginView;

public class ControlLogin {

    private ImageIcon iFondo = new ImageIcon("src\\Imagenes\\Login\\fondo.png"),
            idFondos1 = new ImageIcon("src\\Imagenes\\Login\\imagen1.png"),
            idiconoLogin = new ImageIcon("src\\Imagenes\\Login\\logoLogin.png"),
            fotoAnimal3 = new ImageIcon("src\\Imagenes\\CatAnimales.jpg"),
            showPassword = new ImageIcon("src\\Imagenes\\Login\\eye-open1.png"),
            imagenJirafa = new ImageIcon("src\\Imagenes\\JirafaPro.jpg");
    
    private LoginView loginView;
    private ModeloPersonal mPersonal;

    public ControlLogin(LoginView loginView, ModeloPersonal mPersonal) {
        this.loginView = loginView;
        this.mPersonal = mPersonal;
    }

    public void IniciarControl() {
        loginView.setVisible(true);
        //Icono de app
        loginView.setIconImage(new ImageIcon(getClass().getResource("../Imagenes/LOGO_RESTAURANT_PROYECT.png")).getImage());
        loginView.setLocationRelativeTo(null);
        loginView.setTitle("Login");
//        crarImagenesDeLaInterfaz();
//        loginView.alertusuBtxt.setVisible(false);
//        loginView.alertContraBtxt.setVisible(false);
    }

//    public void crarImagenesDeLaInterfaz() {
//        loginView.jlabelShowPassword.setIcon(EscalarImagen(showPassword, jlabelShowPassword));
//        loginView.showPassword = new ImageIcon("src\\Imagenes\\Login\\eye-close.png");
//        loginView.jlabelDismissPassword.setIcon(EscalarImagen(showPassword, jlabelDismissPassword));
//        loginView.jImagenmorsa.setIcon(EscalarImagen(fotoAnimal3, jImagenmorsa));
//        loginView.jImageFAnimal.setIcon(EscalarImagen(imagenJirafa, jImageFAnimal));
//        loginView.jPanelFondo.setBackground(Color.WHITE);
//        loginView.jImageFondo.setIcon(EscalarImagen(iFondo, jImageFondo));
//        loginView.jImageFPassword.setIcon(EscalarImagen(idFondos1, jImageFPassword));
//        loginView.jImageIconoLogin.setIcon(EscalarImagen(idiconoLogin, jImageIconoLogin));
//        loginView.jlabelDismissPassword.setVisible(false);
//    }
    public ImageIcon EscalarImagen(ImageIcon imagenATransformar, JLabel tamañoPanel) {
        ImageIcon imagenEscalada = new ImageIcon(imagenATransformar.getImage().getScaledInstance(tamañoPanel.getWidth(),
                tamañoPanel.getHeight(), Image.SCALE_AREA_AVERAGING));
        return imagenEscalada;
    }

}
