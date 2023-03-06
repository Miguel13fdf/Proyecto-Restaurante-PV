package CustomElements.Menu;

import java.awt.AlphaComposite;
import java.awt.Composite;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;

/**
 * Se utiliza para mostrar una imagen de avatar en una interfaz gráfica Swing.
 */
public class ImageAvatar extends JComponent {

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public int getBorderSize() {
        return borderSize;
    }

    public void setBorderSize(int borderSize) {
        this.borderSize = borderSize;
    }

    private Icon icon;
    private int borderSize;

    @Override
    protected void paintComponent(Graphics grphcs) {
        if (icon != null) {
            int width = getWidth();
            int height = getHeight();
            int diameter = Math.min(width, height);
            int x = width / 2 - diameter / 2;
            int y = height / 2 - diameter / 2;
            int border = borderSize * 2;
            diameter -= border;
            // obtener el tamaño adecuado de la imagen y luego se crea una nueva imagen (BufferedImage) con ese tamaño.
            Rectangle size = getAutoSize(icon, diameter);
            BufferedImage img = new BufferedImage(size.width, size.height, BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2_img = img.createGraphics();
            // aplicar antialiasing y un efecto de transparencia
            g2_img.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2_img.fillOval(0, 0, diameter, diameter);
            Composite composite = g2_img.getComposite();
            g2_img.setComposite(AlphaComposite.SrcIn);
            g2_img.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            // Aplicar la imagen a la imagen del círculo.
            g2_img.drawImage(toImage(icon), size.x, size.y, size.width, size.height, null);
            g2_img.setComposite(composite);
            // restaura el objeto Composite original y se libera el objeto Graphics2D.
            g2_img.dispose();
            Graphics2D g2 = (Graphics2D) grphcs;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            // Si se ha especificado un tamaño de borde (borderSize), se dibuja un círculo adicional con el tamaño y la posición adecuados y se llena con el color de primer plano. 
            if (borderSize > 0) {
                diameter += border;
                g2.setColor(getForeground());
                g2.fillOval(x, y, diameter, diameter);
            }
            // SI es verdad se dibuja un círculo adicional con el tamaño y la posición adecuados y se llena con el color de fondo.
            if (isOpaque()) {
                g2.setColor(getBackground());
                diameter -= border;
                g2.fillOval(x + borderSize, y + borderSize, diameter, diameter);
            }
            // Aplicar la imagen a la interfaz gráfica de usuario en la posición y tamaño adecuados. 
            // El parámetro null se utiliza para indicar que no se necesita un objeto ImageObserver para el dibujo.
            g2.drawImage(img, x + borderSize, y + borderSize, null);
        }
        // Permitir que la clase base realice cualquier operación de dibujo adicional que pueda ser necesaria en el componente antes de que se realice el dibujo específico de la clase ImageAvatar.
        super.paintComponent(grphcs);
    }

    /**
     * Calcular el tamaño de la imagen
     */
    private Rectangle getAutoSize(Icon image, int size) {
        int w = size;
        int h = size;
        int iw = image.getIconWidth();
        int ih = image.getIconHeight();
        double xScale = (double) w / iw;
        double yScale = (double) h / ih;
        double scale = Math.max(xScale, yScale);
        int width = (int) (scale * iw);
        int height = (int) (scale * ih);
        if (width < 1) {
            width = 1;
        }
        if (height < 1) {
            height = 1;
        }
        int cw = size;
        int ch = size;
        int x = (cw - width) / 2;
        int y = (ch - height) / 2;
        return new Rectangle(new Point(x, y), new Dimension(width, height));
    }

    private Image toImage(Icon icon) {
        return ((ImageIcon) icon).getImage();
    }
}
