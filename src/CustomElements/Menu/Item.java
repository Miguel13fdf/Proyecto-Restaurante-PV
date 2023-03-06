package CustomElements.Menu;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javaswingdev.GoogleMaterialDesignIcon;
import javaswingdev.GoogleMaterialIcon;
import javaswingdev.GradientType;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTargetAdapter;

/**
 * Se utilizada para personalizar la apariencia y el comportamiento de un botón
 * del menú. 
 * 
 * Representa el botón en sí. Tiene animaciones para cambiar el color
 * y el tamaño del botón cuando el usuario pasa el mouse sobre él. También tiene
 * un icono y un color principal que se utilizan para mostrar el botón
 * seleccionado.
 */
public class Item extends JButton {

    private final Color mainColor = SystemColor.MAIN_COLOR_2;
    private final int index;
    private Animator animator;
    private GoogleMaterialDesignIcon icon;
    private final boolean mainMenu;
    private boolean mouseEnter;
    private float alpha;

    /**
     * El parámetro mainMenu indica si el elemento pertenece al menú principal o
     * a un submenú. El parámetro index indica la posición del elemento en el
     * menú.
     */
    public Item(boolean mainMenu, int index) {
        this.mainMenu = mainMenu;
        this.index = index;
        init();
    }

    /**
     * Inicializar las propiedades del botón, como el borde y el color de
     * fuente. El método agrega un MouseListener para detectar eventos de
     * entrada del mouse y cambiar la apariencia del botón.
     */
    private void init() {
        setContentAreaFilled(false);
        setHorizontalAlignment(JButton.LEFT);
        setForeground(new Color(50, 50, 50));
        if (mainMenu) {
            setBorder(new EmptyBorder(0, 20, 0, 0));
        } else {
            setBorder(new EmptyBorder(0, 51, 0, 0));
        }
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                setForeground(mainColor);
                setGoogleIcon(icon);
                if (!mainMenu) {
                    mouseEnter = true;
                    startAnimator();
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (!isSelected()) {
                    setForeground(new Color(50, 50, 50));
                    setGoogleIcon(icon);
                }
                if (!mainMenu) {
                    mouseEnter = false;
                    startAnimator();
                }
            }
        });
        if (!mainMenu) {
            animator = new Animator(350, new TimingTargetAdapter() {
                @Override
                public void timingEvent(float fraction) {
                    alpha = mouseEnter ? fraction : 1f - fraction;
                    repaint();
                }
            });
            animator.setResolution(0);
            animator.setAcceleration(.5f);
            animator.setDeceleration(.5f);
        }
    }

    /**
     * Iniciar una animación que cambia la transparencia de un círculo que se
     * encuentra en el borde del botón. El círculo es dibujado en el método
     * paintComponent().
     */
    private void startAnimator() {
        if (animator.isRunning()) {
            float f = animator.getTimingFraction();
            animator.stop();
            animator.setStartFraction(1f - f);
        } else {
            animator.setStartFraction(0f);
        }
        animator.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (!mainMenu) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(new Color(170, 170, 170));
            int height = getHeight();
            int size = 6;
            int y = (height - size) / 2;
            g2.drawOval(27, y, size, size);
            g2.setColor(mainColor);
            if (isSelected()) {
                alpha = 1;
            }
            g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha));
            g2.fillOval(27, y, size + 1, size + 1);
            g2.dispose();
        } else {
            if (isSelected()) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g2.setPaint(new GradientPaint(0, 3, SystemColor.MAIN_COLOR_1, 3, getHeight() - 6, SystemColor.MAIN_COLOR_2));
                g2.fillRect(0, 3, 3, getHeight() - 6);
                g2.dispose();
            }
        }
    }

    /**
     * Es utilizado para establecer un ícono para el botón. El ícono es un
     * objeto de la clase GoogleMaterialIcon que representa un ícono de Material
     * Design de Google.
     */
    public void setGoogleIcon(GoogleMaterialDesignIcon icon) {
        if (icon != null) {
            this.icon = icon;
            setIcon(new GoogleMaterialIcon(icon, GradientType.HORIZONTAL, SystemColor.MAIN_COLOR_1, SystemColor.MAIN_COLOR_2, 19).toIcon());
        }
    }

    // Es utilizado para establecer el estado seleccionado del botón y cambiar su apariencia en consecuencia.
    @Override
    public void setSelected(boolean b) {
        super.setSelected(b);
        if (b || mouseEnter) {
            setForeground(mainColor);
        } else {
            alpha = 0;
            setForeground(new Color(50, 50, 50));
        }
        setGoogleIcon(icon);
    }

    public Color getMainColor() {
        return mainColor;
    }

    public int getIndex() {
        return index;
    }

    public boolean isMainMenu() {
        return mainMenu;
    }
}
