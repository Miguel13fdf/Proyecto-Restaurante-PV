package CustomElements.ComboBox;

import javax.swing.JComboBox;

/**
 * Que hace?: Proporciona una funcionalidad adicional para la sugerencia de
 * autocompletado de texto dentro del JComboBox. 
 * Nota: La "<E>" es un parámetro de tipo genérico,se utiliza en la definición de clases genéricas
 */
public class ComboBoxSuggestion<E> extends JComboBox<E> {

    public ComboBoxSuggestion() {
        setUI(new ComboSuggestionUI());
    }
}
