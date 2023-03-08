package vista.Main;

import CustomElements.Menu.CircleButton;
import CustomElements.SearchBar.TextFieldAnimation;
import CustomElements.Table.Table;
import javax.swing.JLabel;

public class Crud_View extends javax.swing.JPanel {

    public Crud_View() {
        initComponents();
    }

    public CircleButton getImprimirBtn() {
        return ImprimirBtn;
    }

    public void setImprimirBtn(CircleButton ImprimirBtn) {
        this.ImprimirBtn = ImprimirBtn;
    }

    public CircleButton getAddBtn() {
        return AddBtn;
    }

    public void setAddBtn(CircleButton AddBtn) {
        this.AddBtn = AddBtn;
    }

    public CircleButton getDeleteBtn() {
        return DeleteBtn;
    }

    public void setDeleteBtn(CircleButton DeleteBtn) {
        this.DeleteBtn = DeleteBtn;
    }

    public CircleButton getEditBtn() {
        return EditBtn;
    }

    public void setEditBtn(CircleButton EditBtn) {
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
        AddBtn = new CustomElements.Menu.CircleButton();
        EditBtn = new CustomElements.Menu.CircleButton();
        DeleteBtn = new CustomElements.Menu.CircleButton();
        ImprimirBtn = new CustomElements.Menu.CircleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new CustomElements.Table.Table();

        setBackground(new java.awt.Color(241, 241, 241));

        SearchBar.setAnimationColor(new java.awt.Color(29, 146, 255));
        SearchBar.setHintText("Buscar Personas");

        SubTitleTxt.setFont(new java.awt.Font("sansserif", 1, 15)); // NOI18N
        SubTitleTxt.setForeground(new java.awt.Color(76, 76, 76));
        SubTitleTxt.setText("Registro De Personas");
        SubTitleTxt.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

        jLabelSinCoincidencias.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelSinCoincidencias.setForeground(new java.awt.Color(204, 0, 0));
        jLabelSinCoincidencias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
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
        table1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        table1.setGridColor(new java.awt.Color(91, 0, 255));
        table1.setSelectionBackground(new java.awt.Color(255, 153, 0));
        table1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        table1.setShowGrid(false);
        table1.setShowHorizontalLines(true);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(SubTitleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelSinCoincidencias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(SearchBar, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ImprimirBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelSinCoincidencias)
                .addGap(2, 2, 2)
                .addComponent(SubTitleTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private CustomElements.Menu.CircleButton AddBtn;
    private CustomElements.Menu.CircleButton DeleteBtn;
    private CustomElements.Menu.CircleButton EditBtn;
    private CustomElements.Menu.CircleButton ImprimirBtn;
    private CustomElements.SearchBar.TextFieldAnimation SearchBar;
    private javax.swing.JLabel SubTitleTxt;
    private javax.swing.JLabel jLabelSinCoincidencias;
    private javax.swing.JScrollPane jScrollPane1;
    private CustomElements.Table.Table table1;
    // End of variables declaration//GEN-END:variables
}
