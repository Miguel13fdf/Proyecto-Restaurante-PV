package CustomElements.Menu;

/**
 * Define un método menuSelected que debe ser implementado por las clases que
 * deseen recibir eventos de selección de elementos del menú.
 */
public interface EventMenuSelected {

    /**
     * Este método toma dos argumentos enteros: index e indexSubMenu, que
     * indican el índice del elemento de menú y el subíndice del elemento de
     * menú seleccionado, respectivamente.
     */
    public void menuSelected(int index, int indexSubMenu);
}
