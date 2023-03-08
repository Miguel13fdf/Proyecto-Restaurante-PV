package CustomElements.ImgSlide;

import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JComponent;

public class PanelTransparent extends JComponent {

    public float getAlpha() {
        return alpha;
    }

    public void setAlpha(float alpha) {
        this.alpha = alpha;
        repaint();
    }

    private float alpha;

    /**
     * Este código es un método "paint" sobreescrito de la clase JComponent. El
     * método "paint" se utiliza para dibujar o re-dibujar un componente de
     * interfaz gráfica de usuario. Este código especificamente está
     * personalizando cómo se dibuja el componente.
     *
     * La primera línea crea un objeto Graphics2D a partir del objeto Graphics
     * recibido como parámetro. Graphics2D es una clase más avanzada que
     * proporciona más funciones de dibujo que Graphics.
     *
     * La siguiente línea habilita el suavizado de bordes (antialiasing)
     * utilizando el método setRenderingHint.
     *
     * La línea siguiente establece el color de fondo actual del componente
     * utilizando el método getBackground().
     *
     * La línea siguiente establece un objeto AlphaComposite utilizando el
     * método getInstance, es utilizado para controlar la transparencia de los
     * elementos dibujados.
     *
     * La siguiente línea define dos arreglos "x" e "y" que contienen las
     * coordenadas x e y de los puntos de un polígono. El último argumento es el
     * numero de puntos en el poligono.
     *
     * La siguiente línea llama al método fillPolygon para dibujar el polígono
     * en el componente con las coordenadas especificadas y con el color y
     * transparencia establecidos anteriormente.
     *
     * La última línea llama al método dispose en el objeto Graphics2D para
     * liberar los recursos utilizados. Finalmente se llama al metodo paint del
     * padre (super) para pintar el componente.
     */
    @Override
    public void paint(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha));
        int x[] = {0, getWidth(), getWidth() - 100, 0};
        int y[] = {0, 0, getHeight(), getHeight()};
        g2.fillPolygon(x, y, x.length);
        g2.dispose();
        super.paint(grphcs);
    }
}
