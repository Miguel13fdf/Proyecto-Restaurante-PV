package CustomElements.Login;

/**
 * define un objeto que representa una animación que cambia los bordes de un
 * elemento gráfico en una interfaz de usuario. La animación se define por dos
 * formatos de cadena de texto que representan los valores iniciales y finales
 * de los bordes, y se utiliza la clase Border para convertir estos formatos de
 * cadena en puntos de borde.
 */
public class FancyAnimation {

    public FancyAnimation(String start, String end) {
        this.start = new Border(start).toArray();
        this.end = new Border(end).toArray();
    }

    public FancyAnimation start(String start) {
        this.start = new Border(start).toArray();
        return this;
    }

    public FancyAnimation end(String end) {
        this.end = new Border(end).toArray();
        return this;
    }

    private float start[];
    private float end[];

    public Border getAnimate(float f) {
        float b[] = new float[start.length];
        for (int i = 0; i < start.length; i++) {
            float t = end[i] - start[i];
            t = start[i] + t * f;
            b[i] = t;
        }
        Border border = new Border();
        border.setBorder(b[0], b[1], b[2], b[3], b[4], b[5], b[6], b[7]);
        return border;
    }
}
