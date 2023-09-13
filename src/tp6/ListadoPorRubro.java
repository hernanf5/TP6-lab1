package tp6;

import javax.swing.table.DefaultTableModel;
import models.Categoria;
import models.Producto;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */

/**
 *
 * @author Hernán Funes
 */
public class ListadoPorRubro extends javax.swing.JInternalFrame {

    DefaultTableModel tabla = new DefaultTableModel();
    /**
     * Creates new form ListadoPorRubro
     */
    public ListadoPorRubro() {
        initComponents();
        String id [] = {"Codigo" , "Descripcion", "Precio", "Stock"};
        tabla.setColumnIdentifiers(id);
        jTRubro.setModel(tabla);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCRubro = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCRubro1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTRubro = new javax.swing.JTable();

        jCRubro.setModel(new javax.swing.DefaultComboBoxModel<>(new Categoria[] { Categoria.COMESTIBLE,Categoria.LIMPIEZA,Categoria.PERFUMERIA }));

        setClosable(true);

        jLabel1.setText("Listado de productos por rubro");

        jLabel2.setText("Elija Rubro:");

        jCRubro1.setModel(new javax.swing.DefaultComboBoxModel<>(new Categoria[] { Categoria.COMESTIBLE,Categoria.LIMPIEZA,Categoria.PERFUMERIA }));
        jCRubro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCRubro1ActionPerformed(evt);
            }
        });

        jTRubro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTRubro);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel2)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCRubro1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jCRubro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCRubro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCRubro1ActionPerformed
        
        Categoria categoria = (Categoria)jCRubro1.getSelectedItem();
        borrarFilas();
        for(Producto producto : MenuGeneral.productList){
            if(producto.getRubro().equals(categoria)){
                
                tabla.addRow(new Object[]{producto.getCodigo(), producto.getDescripcion(), producto.getPrecio(), producto.getStock()});
            }
        }
    }//GEN-LAST:event_jCRubro1ActionPerformed

    private void borrarFilas(){
        int indice = tabla.getRowCount()-1;
        for (int i = indice;i>=0;i--){
            tabla.removeRow(i);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Categoria> jCRubro;
    private javax.swing.JComboBox<Categoria> jCRubro1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTRubro;
    // End of variables declaration//GEN-END:variables
}
