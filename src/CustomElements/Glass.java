package CustomElements;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Esta clase proporciona una manera fácil de agregar un efecto de vidrio esmerilado a una ventana o panel java Swing.
 * Se la utiliza en las alertas (Message Dialog)
 */
public class Glass extends JComponent {

    public float getAlpha() {
        return alpha;
    }

    public void setAlpha(float alpha) {
        this.alpha = alpha;
        repaint();
    }

    public Glass() {
    }

    private float alpha = 0f;

    // Nota: El método "paintComponent" es un método que se sobrescribe de la clase JComponent 
    // y se utiliza para personalizar la representación visual del componente.
    @Override
    protected void paintComponent(Graphics g) {
        // Este método toma un objeto Graphics como parámetro, que se utiliza para dibujar en el componente.
        Graphics2D g2 = (Graphics2D) g.create();
        // Aquí, se crea un objeto Graphics2D a partir del objeto Graphics original. 
        // El método "create()" se utiliza para crear una copia del objeto Graphics original 
        // que se puede modificar sin afectar al original.
        g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha));
        // Aqui se combina el color del panel actual con el color que le pasamos como parametro
        g2.setColor(Color.gray);
        // Aquí se establece el color de dibujo en gris.
        g2.fillRect(0, 0, getWidth(), getHeight());
        // Se dibuja un rectángulo gris que cubre todo el componente. 
        // Los parámetros son las coordenadas x e y del punto de inicio del rectángulo y el ancho 
        // y alto del rectángulo que se dibuja.
        g2.dispose();
        // Liberar los recursos de memoria utilizados por el objeto Graphics2D.
        super.paintComponent(g);
    }
}
