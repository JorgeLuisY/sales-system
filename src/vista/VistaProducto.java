package vista;
import DAO.ProductoDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Producto;

public class VistaProducto extends javax.swing.JFrame {
    ProductoDAO controladores = new ProductoDAO();
    ArrayList<Producto>producto;
   
public void ListarDatos(){
     producto = controladores.reportaProducto();
     DefaultTableModel tb = (DefaultTableModel)tblProducto.getModel();
     for(Producto pL: producto){
      tb.addRow(new Object[]{pL.getId_Producto(),pL.getCodigoBarra(),pL.getNombre(),pL.getDescripcion(),pL.getPreCosto(),pL.getPreVenta(),pL.getCategoria(),pL.getCodigoAltern(),pL.getUtilidad()});
     }
}
    
public void LimpiarFormulario(){
     DefaultTableModel tb = (DefaultTableModel)tblProducto.getModel();
     for(int i =tb.getRowCount()-1;i>=0;i--)
        tb.removeRow(i);
}
    
    public VistaProducto() {
      initComponents();
      LimpiarFormulario();
      ListarDatos();
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Tcodigobarra = new javax.swing.JLabel();
        Tcodigo = new javax.swing.JLabel();
        TxtId = new javax.swing.JTextField();
        TxtCodigoAlter = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProducto = new javax.swing.JTable();
        TxtCodBar = new javax.swing.JTextField();
        Tid = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        Tdescripcion = new javax.swing.JLabel();
        Tnombre = new javax.swing.JLabel();
        Tdescripcion2 = new javax.swing.JLabel();
        Tdescripcion3 = new javax.swing.JLabel();
        Tdescripcion4 = new javax.swing.JLabel();
        Tdescripcion5 = new javax.swing.JLabel();
        TxtDescripcion = new javax.swing.JTextField();
        TxtPC = new javax.swing.JTextField();
        TxtPV = new javax.swing.JTextField();
        TxtUtilidad = new javax.swing.JTextField();
        TxtNombre = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Tcodigobarra.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Tcodigobarra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tcodigobarra.setText("Codigo de Barra");

        Tcodigo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Tcodigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tcodigo.setText("Codigo Alternativo");

        TxtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtIdActionPerformed(evt);
            }
        });

        TxtCodigoAlter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCodigoAlterActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        tblProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CODIGO DE BARRA", "NOMBRE", "DESCRIPCION", "PRECIO COSTO", "PRECIO VENTA", "CATEGORIA", "CODIGO BARRA ALT.", "UTILIDAD"
            }
        ));
        jScrollPane1.setViewportView(tblProducto);

        TxtCodBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCodBarActionPerformed(evt);
            }
        });

        Tid.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Tid.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tid.setText("Id");

        btnEliminar.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/eliminarr.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnListar.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/listar.png"))); // NOI18N
        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/modificarr.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        Tdescripcion.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Tdescripcion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tdescripcion.setText("Descripcion");

        Tnombre.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Tnombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tnombre.setText("Nombre");

        Tdescripcion2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Tdescripcion2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tdescripcion2.setText("Precio Costo");

        Tdescripcion3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Tdescripcion3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tdescripcion3.setText("Categoria");

        Tdescripcion4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Tdescripcion4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tdescripcion4.setText("Precio Venta");

        Tdescripcion5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Tdescripcion5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tdescripcion5.setText("Utilidad");

        TxtDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtDescripcionActionPerformed(evt);
            }
        });

        TxtPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPCActionPerformed(evt);
            }
        });

        TxtPV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPVActionPerformed(evt);
            }
        });

        TxtUtilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtUtilidadActionPerformed(evt);
            }
        });

        TxtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNombreActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(Tcodigobarra)
                                .addGap(18, 18, 18)
                                .addComponent(TxtCodBar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Tdescripcion2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Tdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(TxtPC, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(140, 140, 140)
                                        .addComponent(TxtPV, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Tcodigo)
                                .addGap(34, 34, 34)
                                .addComponent(TxtCodigoAlter, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Tdescripcion3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Tdescripcion5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(TxtUtilidad, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 219, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Tnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(195, 195, 195)
                                .addComponent(Tdescripcion4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(13, 13, 13)
                        .addComponent(Tid, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TxtId, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnListar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tid))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Tcodigobarra, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtCodBar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(Tnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Tdescripcion4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tdescripcion2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tdescripcion5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtPC, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtPV, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TxtCodigoAlter, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Tcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Tdescripcion3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TxtUtilidad, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(Tdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TxtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(16, 16, 16)
                                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(8, 8, 8)
                                .addComponent(btnListar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtIdActionPerformed

    private void TxtCodigoAlterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCodigoAlterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCodigoAlterActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
      Producto iP = new Producto();
      iP.setId_Producto(Integer.parseInt(TxtId.getText()));
      iP.setCodigoBarra(Integer.parseInt(TxtCodBar.getText()));
      iP.setNombre(TxtNombre.getText());
      iP.setDescripcion(TxtDescripcion.getText());
      iP.setPreCosto(Double.parseDouble(TxtPC.getText()));
      iP.setPreVenta(Double.parseDouble(TxtPV.getText()));
      iP.setCategoria(jComboBox1.getToolTipText());
      iP.setCodigoAltern(TxtCodigoAlter.getText());
      iP.setUtilidad(Double.parseDouble(TxtUtilidad.getText()));
              
        if (!"".equals(TxtId.getText()) && !"".equals(TxtCodigoAlter.getText())){
            JOptionPane.showMessageDialog(this, " Datos Registrados Correctamente ","",JOptionPane.INFORMATION_MESSAGE);
            controladores.insertarProducto(iP);
        LimpiarFormulario();
        ListarDatos();    
            
        }else{
            JOptionPane.showMessageDialog(this, " Falta Rellenar Datos","",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void TxtCodBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCodBarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCodBarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

      if (!"".equals(TxtId.getText()) ){
            JOptionPane.showMessageDialog(this, " Datos Eliminado Correctamente ","",JOptionPane.INFORMATION_MESSAGE);
            controladores.eliminarProducto(Integer.parseInt(TxtId.getText()));
        LimpiarFormulario();
        ListarDatos();    
            
      }else{
            JOptionPane.showMessageDialog(this, " Falta Ingresar Id a Eliminar","",JOptionPane.INFORMATION_MESSAGE);
       }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        LimpiarFormulario();
        ListarDatos();
    }//GEN-LAST:event_btnListarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
      Producto mP =new Producto();
      mP.setId_Producto(Integer.parseInt(TxtId.getText()));
      mP.setCodigoBarra(Integer.parseInt(TxtCodBar.getText()));
      mP.setNombre(TxtNombre.getText());
      mP.setDescripcion(TxtDescripcion.getText());
      mP.setPreCosto(Double.parseDouble(TxtPC.getText()));
      mP.setPreVenta(Double.parseDouble(TxtPV.getText()));
      mP.setCategoria(jComboBox1.getToolTipText());
      mP.setCodigoAltern(TxtCodigoAlter.getText());
      mP.setUtilidad(Double.parseDouble(TxtUtilidad.getText()));
      if (!"".equals(TxtId.getText()) && !"".equals(TxtCodBar.getText()) && !"".equals(TxtPC.getText()) ){
            JOptionPane.showMessageDialog(this, " Datos Registrados Correctamente ","",JOptionPane.INFORMATION_MESSAGE);
            controladores.actualizarProducto(mP);
        LimpiarFormulario();
        ListarDatos();
      
      }else{
            JOptionPane.showMessageDialog(this, " Falta Rellenar Datos","",JOptionPane.INFORMATION_MESSAGE);
       }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void TxtDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtDescripcionActionPerformed

    private void TxtPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPCActionPerformed

    private void TxtPVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPVActionPerformed

    private void TxtUtilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtUtilidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtUtilidadActionPerformed

    private void TxtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNombreActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

   
    public static void main(String args[]) {
       
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Tcodigo;
    private javax.swing.JLabel Tcodigobarra;
    private javax.swing.JLabel Tdescripcion;
    private javax.swing.JLabel Tdescripcion2;
    private javax.swing.JLabel Tdescripcion3;
    private javax.swing.JLabel Tdescripcion4;
    private javax.swing.JLabel Tdescripcion5;
    private javax.swing.JLabel Tid;
    private javax.swing.JLabel Tnombre;
    private javax.swing.JTextField TxtCodBar;
    private javax.swing.JTextField TxtCodigoAlter;
    private javax.swing.JTextField TxtDescripcion;
    private javax.swing.JTextField TxtId;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JTextField TxtPC;
    private javax.swing.JTextField TxtPV;
    private javax.swing.JTextField TxtUtilidad;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProducto;
    // End of variables declaration//GEN-END:variables
}
