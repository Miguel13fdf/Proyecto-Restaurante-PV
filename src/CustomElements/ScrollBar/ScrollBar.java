package CustomElements.ScrollBar;

import java.awt.Dimension;
import javax.swing.JScrollBar;

/**
 * Establece una dimensión preferida de 5x5, se establece como no opaco y se configura el incremento de unidad en 20.
 * Nota: utiliza la interfaz de usuario personalizada ModernScrollBarUI
 */
public class ScrollBar extends JScrollBar {

    public ScrollBar() {
        setUI(new ModernScrollBarUI());
        setPreferredSize(new Dimension(5, 5));
        setOpaque(false);
        setUnitIncrement(20);
    }
}
