package vista.Components;

import CustomElements.Glass;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTargetAdapter;

import javax.swing.JFrame;

public class MssDialog extends javax.swing.JDialog {

    private final JFrame fram;
    private Animator animator;
    private Glass glass;
    private boolean show;
    private MessageType messageType = MessageType.CANCEL;

    enum MssType {
        Error,
        TodoBien,
        Correcto,
        Pregunta
    }

    private MssType mssType;
    private ImageIcon todoBienIcon = new ImageIcon("src\\CustomElements\\MessageDialog\\TodoBienIcon.png"),
            confirmacionIcon = new ImageIcon("src\\CustomElements\\MessageDialog\\ConfirmacionIcon.png"),
            correctoIcon = new ImageIcon("src\\CustomElements\\MessageDialog\\CorrectoIcon.png"),
            errorIcon = new ImageIcon("src\\CustomElements\\MessageDialog\\ErrorIcon.png");

    public MssDialog(JFrame fram) {
        // invocar al constructor de la clase JDialog
        // El segundo argumento indica si la ventana emergente de mensaje personalizada es modal o no
        // Si es "true" es modal, lo que significa que el usuario debe cerrar la ventana antes de continuar con la aplicación. 
        // Si es "false" no es modal, el usuario puede interactuar con la aplicación mientras se muestra la ventana emergente.
        super(fram, true);
        this.fram = fram;
        initComponents();
        init();
    }

    private void init() {
        // Color de fondo
        setBackground(new Color(0, 0, 0, 0));
        // se utiliza para aplicar estilos y atributos de formato al texto en el JTextPane.
        StyledDocument doc = txt.getStyledDocument();
        // crea un objeto SimpleAttributeSet que se utiliza para centrar el texto en el JTextPane.
        SimpleAttributeSet center = new SimpleAttributeSet();
        // establece el atributo de alineación del texto en el objeto SimpleAttributeSet a centrado.
        StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
        // establece los atributos de párrafo del texto en el JTextPane utilizando el objeto SimpleAttributeSet creado anteriormente.
        doc.setParagraphAttributes(0, doc.getLength(), center, false);
        //  establece la opacidad del JTextPane a falso.
        txt.setOpaque(false);
        // establece el color de fondo del JTextPane como transparente.
        txt.setBackground(new Color(0, 0, 0, 0));
        // establece el comportamiento de cierre de la ventana emergente 
        setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        // se utiliza para cerrar la ventana emergente 
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                closeMessage();
            }
        });
        // Toma 2 argumentos: duración de animación en milisegundos y un objeto TimingTarget.
        animator = new Animator(350, new TimingTargetAdapter() {
            // se utiliza para actualizar el valor de opacidad de la ventana emergente 
            // y el valor de transparencia del objeto Glass que se superpone sobre la ventana
            @Override
            public void timingEvent(float fraction) {
                float f = show ? fraction : 1f - fraction;
                // f - f por que el glass es ligeramente mas transparente
                glass.setAlpha(f - f * 0.3f);
                setOpacity(f);
            }

            // limpiar la ventana emergente y el objeto Glass después de que se completa la animación.
            @Override
            public void end() {
                if (show == false) {
                    dispose();
                    glass.setVisible(false);
                }
            }
        });
        // Con el valor 0 la animación se ejecuta tan rápido como sea posible
        animator.setResolution(0);
        animator.setAcceleration(.5f);
        animator.setDeceleration(.5f);
        // Opacidad inicial de la ventana emergente
        setOpacity(0f);
        glass = new Glass();
    }

    private void startAnimator(boolean show) {
        if (animator.isRunning()) {
            float f = animator.getTimingFraction();
            animator.stop();
            animator.setStartFraction(1f - f);
        } else {
            animator.setStartFraction(0f);
        }
        this.show = show;
        animator.start();
    }

    public void showMessage(String title, String message, MssType type) {
        switch (type) {
            case Correcto:
                lbIcon.setIcon(correctoIcon);
                OkBtn.setBackground(new Color(65, 147, 210));
                OkBtn.setColorHover(new Color(65, 142, 204));
                OkBtn.setColorPressed(new Color(46, 106, 153));
                lbTitle.setForeground(new Color(65, 147, 210));
                CancelBtn.setVisible(false);
                OkBtn.setSize(398, OkBtn.getHeight());
                break;
            case Pregunta:
                lbIcon.setIcon(confirmacionIcon);
                break;
            case TodoBien:
                lbIcon.setIcon(todoBienIcon);
                lbTitle.setForeground(new Color(111, 213, 1));
                CancelBtn.setVisible(false);
                OkBtn.setSize(398, OkBtn.getHeight());
                break;
            case Error:
                lbIcon.setIcon(errorIcon);
                CancelBtn.setVisible(false);
                OkBtn.setSize(398, OkBtn.getHeight());
                break;
        }
        fram.setGlassPane(glass);
        glass.setVisible(true);
        lbTitle.setText(title);
        txt.setText(message);
        setLocationRelativeTo(fram);
        startAnimator(true);
        setVisible(true);
    }

    public void closeMessage() {
        startAnimator(false);
    }

    public MessageType getMessageType() {
        return messageType;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new CustomElements.MessageDialog.MssBackground();
        lbIcon = new javax.swing.JLabel();
        lbTitle = new javax.swing.JLabel();
        txt = new javax.swing.JTextPane();
        CancelBtn = new CustomElements.ButtonCustom();
        OkBtn = new CustomElements.ButtonCustom();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lbIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CustomElements/MessageDialog/ErrorIcon.png"))); // NOI18N

        lbTitle.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(111, 213, 1));
        lbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle.setText("Titulo del Mensaje");

        txt.setEditable(false);
        txt.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txt.setForeground(new java.awt.Color(76, 76, 76));
        txt.setText("Descripción del mensaje");
        txt.setFocusable(false);

        CancelBtn.setBackground(new java.awt.Color(245, 71, 71));
        CancelBtn.setText("Cancelar");
        CancelBtn.setColorHover(new java.awt.Color(255, 74, 74));
        CancelBtn.setColorPressed(new java.awt.Color(235, 61, 61));
        CancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBtnActionPerformed(evt);
            }
        });

        OkBtn.setText("Listo");
        OkBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(CancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(OkBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addComponent(lbIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OkBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBtnActionPerformed
        messageType = MessageType.CANCEL;
        closeMessage();
    }//GEN-LAST:event_CancelBtnActionPerformed

    private void OkBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkBtnActionPerformed
        messageType = MessageType.OK;
        closeMessage();
    }//GEN-LAST:event_OkBtnActionPerformed

    public static enum MessageType {
        CANCEL, OK
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private CustomElements.MessageDialog.MssBackground Background;
    private CustomElements.ButtonCustom CancelBtn;
    private CustomElements.ButtonCustom OkBtn;
    private javax.swing.JLabel lbIcon;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JTextPane txt;
    // End of variables declaration//GEN-END:variables
}
