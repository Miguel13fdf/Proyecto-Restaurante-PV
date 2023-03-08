package CustomElements.ImgSlide;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;

/**
 * Este código es de una clase llamada Pagination que extiende JComponent (un
 * componente de interfaz gráfica de usuario de Java Swing). La clase Pagination
 * tiene varios métodos y una clase interna llamada Item. Los métodos permiten
 * configurar un evento de paginación, establecer el índice actual y total de
 * páginas, animar entre páginas y dibujar los elementos de paginación. La clase
 * Item es un JButton personalizado que se utiliza para dibujar una serie de
 * botones redondos para navegar entre las páginas. Cada botón tiene una
 * transparencia ajustable y se activa cuando se hace clic en él, llamando al
 * evento de paginación correspondiente.
 */
public class Pagination extends JComponent {

    private int index;
    private int currentIndex;
    private EventPagination event;

    public void setEventPagination(EventPagination event) {
        this.event = event;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setCurrentIndex(int currentIndex) {
        this.currentIndex = currentIndex;
        Item item = (Item) getComponent(currentIndex);
        item.setAlpha(1f);
    }

    public void setTotalPage(int totalPage) {
        removeAll();
        for (int i = 0; i < totalPage; i++) {
            add(new Item(i, event));
        }
        repaint();
        revalidate();
    }

    public void setAnimation(float alpha) {
        Item item = (Item) getComponent(index);
        item.setAlpha(alpha);
        Item itemOut = (Item) getComponent(currentIndex);
        itemOut.setAlpha(1f - alpha);
        if (alpha == 1) {
            currentIndex = index;
        }
    }

    public Pagination() {
        setLayout(new MigLayout("inset 15", "[center]10[center]"));
    }

    private class Item extends JButton {

        private float alpha;

        public void setAlpha(float alpha) {
            this.alpha = alpha;
            repaint();
        }

        public Item(int index, EventPagination event) {
            setContentAreaFilled(false);
            setBorder(new EmptyBorder(5, 5, 5, 5));
            setBackground(Color.WHITE);
            setCursor(new Cursor(Cursor.HAND_CURSOR));
            addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    event.onClick(index);
                }
            });
        }

        @Override
        public void paint(Graphics grphcs) {
            super.paint(grphcs);
            int width = getWidth();
            int height = getHeight();
            Graphics2D g2 = (Graphics2D) grphcs.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.3f));
            g2.setColor(getBackground());
            g2.fillOval(0, 0, width, height);
            g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha));
            g2.setColor(new Color(11, 124, 173));
            g2.fillOval(0, 0, width, height);
            g2.dispose();
        }
    }
}
