package vista.Main;

import CustomElements.Menu.Button;
import CustomElements.SearchBar.TextFieldAnimation;
import CustomElements.Table.Table;
import javax.swing.JLabel;

public class Crud_View extends javax.swing.JPanel {

    public Crud_View() {
        initComponents();
    }

    public Button getImprimirBtn() {
        return ImprimirBtn;
    }

    public void setImprimirBtn(Button ImprimirBtn) {
        this.ImprimirBtn = ImprimirBtn;
    }

    public Button getAddBtn() {
        return AddBtn;
    }

    public void setAddBtn(Button AddBtn) {
        this.AddBtn = AddBtn;
    }

    public Button getDeleteBtn() {
        return DeleteBtn;
    }

    public void setDeleteBtn(Button DeleteBtn) {
        this.DeleteBtn = DeleteBtn;
    }

    public Button getEditBtn() {
        return EditBtn;
    }

    public void setEditBtn(Button EditBtn) {
        this.EditBtn = EditBtn;
    }

    public JLabel getSubTitleTxt() {
        return SubTitleTxt;
    }

    public void setSubTitleTxt(JLabel SubTitleTxt) {
        this.SubTitleTxt = SubTitleTxt;
    }

    public JLabel getjLabelSinCoincidencias() {
        return jLabelSinCoincidencias;
    }

    public void setjLabelSinCoincidencias(JLabel jLabelSinCoincidencias) {
        this.jLabelSinCoincidencias = jLabelSinCoincidencias;
    }

    public Table getTable1() {
        return table1;
    }

    public void setTable1(Table table1) {
        this.table1 = table1;
    }

    public TextFieldAnimation getSearchBar() {
        return SearchBar;
    }

    public void setSearchBar(TextFieldAnimation SearchBar) {
        this.SearchBar = SearchBar;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SearchBar = new CustomElements.SearchBar.TextFieldAnimation();
        SubTitleTxt = new javax.swing.JLabel();
        jLabelSinCoincidencias = new javax.swing.JLabel();
        AddBtn = new CustomElements.Menu.Button();
        EditBtn = new CustomElements.Menu.Button();
        DeleteBtn = new CustomElements.Menu.Button();
        ImprimirBtn = new CustomElements.Menu.Button();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new CustomElements.Table.Table();

        setBackground(new java.awt.Color(241, 241, 241));

        SearchBar.setAnimationColor(new java.awt.Color(29, 146, 255));
        SearchBar.setHintText("Buscar Personas");

        SubTitleTxt.setFont(new java.awt.Font("sansserif", 1, 15)); // NOI18N
        SubTitleTxt.setForeground(new java.awt.Color(76, 76, 76));
        SubTitleTxt.setText("Registro De Personas");
        SubTitleTxt.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

        jLabelSinCoincidencias.setForeground(new java.awt.Color(204, 0, 0));
        jLabelSinCoincidencias.setText("No hay coincidencias");

        AddBtn.setBackground(new java.awt.Color(102, 102, 102));
        AddBtn.setForeground(new java.awt.Color(255, 255, 255));
        AddBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar.png"))); // NOI18N
        AddBtn.setText("Agregar");
        AddBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        EditBtn.setBackground(new java.awt.Color(100, 48, 255));
        EditBtn.setForeground(new java.awt.Color(255, 255, 255));
        EditBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar.png"))); // NOI18N
        EditBtn.setText("Modificar");
        EditBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        DeleteBtn.setBackground(new java.awt.Color(255, 60, 22));
        DeleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        DeleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario.png"))); // NOI18N
        DeleteBtn.setText("Eliminar");
        DeleteBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        ImprimirBtn.setBackground(new java.awt.Color(181, 155, 77));
        ImprimirBtn.setForeground(new java.awt.Color(255, 255, 255));
        ImprimirBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imprimir.png"))); // NOI18N
        ImprimirBtn.setText("Imprimir");
        ImprimirBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Cedula", "Nombre", "Apellidos", "Correo", "Edad"
            }
        ));
        jScrollPane1.setViewportView(table1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1137, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(SearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ImprimirBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SubTitleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(36, 36, 36)
                    .addComponent(jLabelSinCoincidencias, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(873, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ImprimirBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(SearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(SubTitleTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
                .addGap(16, 16, 16))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(51, 51, 51)
                    .addComponent(jLabelSinCoincidencias)
                    .addContainerGap(509, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private CustomElements.Menu.Button AddBtn;
    private CustomElements.Menu.Button DeleteBtn;
    private CustomElements.Menu.Button EditBtn;
    private CustomElements.Menu.Button ImprimirBtn;
    private CustomElements.SearchBar.TextFieldAnimation SearchBar;
    private javax.swing.JLabel SubTitleTxt;
    private javax.swing.JLabel jLabelSinCoincidencias;
    private javax.swing.JScrollPane jScrollPane1;
    private CustomElements.Table.Table table1;
    // End of variables declaration//GEN-END:variables
}
