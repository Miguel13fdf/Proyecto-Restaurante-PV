package CustomElements.MessageDialog;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;

// Para usarlo, se debe arrastrar esta clase dentro de un JDialog, de preferencia.
public class MssBackground extends JPanel {

    public MssBackground() {
        init();
    }

    private void init() {
        // Establecer transparencia del panel
        setOpaque(false);
        // Establecer los colores de fondo y primer plano, respectivamente.
        setBackground(new Color(245, 245, 245));
        setForeground(new Color(118, 118, 118));
    }

    // Dibujar el panel. 
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        // Activar el suavizado de bordes para mejorar la calidad visual de los elementos dibujados.
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        // variables para calcular las dimensiones y ubicaciones de los elementos del panel.
        int x = 0;
        int y = 40;
        int width = getWidth();
        int height = getHeight();
        int iconSpace = 7;
        int totalIconSpace = iconSpace * 2;
        int iconSize = y * 2;
        int iconX = (width - (iconSize + totalIconSpace)) / 2;
        int iconY = 0;
        // Crea un rectángulo que cubre todo el panel y luego se sustrae un círculo que representa el área en la que se dibujará la icono.
        Area area = new Area(new Rectangle2D.Double(x, y, width, height - y));
        // Crear dos circulso el 1ro tendra un fondo gris el otro blanco
        // Agregar un círculo más pequeño para crear un espacio para el icono del pregunta o de realizado.
        area.subtract(new Area(new Ellipse2D.Double(iconX, iconY - iconSpace, iconSize + totalIconSpace, iconSize + totalIconSpace)));
        area.add(new Area(new Ellipse2D.Double(iconX + iconSpace, 0, iconSize, iconSize)));
        g2.setColor(getBackground());
        g2.fill(area);
        g2.dispose();
        super.paintComponent(g);
    }
}
