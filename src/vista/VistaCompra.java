package vista;

import DAO.RolDAO;
import DAO.compraDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Compra;

public class VistaCompra extends javax.swing.JFrame {
    // Variables
    compraDAO controladores = new compraDAO();
    ArrayList<Compra> compra;
    
    public VistaCompra() {
        initComponents();
    }
    
public void ListarDatos() {
        compra = controladores.reportarCompra();
        DefaultTableModel tb = (DefaultTableModel) tblComp.getModel();
        for (Compra compras :compra) {
            tb.addRow(new Object[]{compras.getNroCompra(), compras.getProovedorid(), compras.getCantidad(), compras.getTipodocumento(), });
        }
    }
    
public void LimpiarFormulario() {
        DefaultTableModel tb = (DefaultTableModel) tblComp.getModel();
        for (int i = tb.getRowCount() - 1; i >= 0; i--) {
            tb.removeRow(i);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblComp = new javax.swing.JTable();
        btnListar = new javax.swing.JButton();
        LabelID = new javax.swing.JLabel();
        LabelNameR = new javax.swing.JLabel();
        LabelDescripcion = new javax.swing.JLabel();
        LabelRolValor = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        nrocom = new javax.swing.JTextField();
        provId = new javax.swing.JTextField();
        documento = new javax.swing.JTextField();
        cantid = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblComp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nro compras", "Provedor ID", "Cantidad", "Tipo de Doc."
            }
        ));
        jScrollPane1.setViewportView(tblComp);

        btnListar.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/listar.png"))); // NOI18N
        btnListar.setText("Reporte");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        LabelID.setText("NRO COMPRA");

        LabelNameR.setText("PROVEDOR ID");

        LabelDescripcion.setText("DOCUMENTO");

        LabelRolValor.setText("CANTIDAD");

        btnGuardar.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/eliminarr.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
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

        nrocom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nrocomActionPerformed(evt);
            }
        });

        provId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                provIdActionPerformed(evt);
            }
        });

        cantid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelNameR, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(provId, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelRolValor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cantid, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(17, 17, 17)
                        .addComponent(LabelDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(LabelID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nrocom, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(btnModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(documento, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(btnListar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelID, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nrocom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelNameR, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(provId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(documento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnListar)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LabelRolValor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cantid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnModificar)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        LimpiarFormulario();
        ListarDatos();
    }//GEN-LAST:event_btnListarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        Compra rolsave = new Compra();
        rolsave.setNroCompra(Integer.parseInt(nrocom.getText()));
        rolsave.setProovedorid(Integer.parseInt(provId.getText()));
        rolsave.setCantidad(Integer.parseInt(cantid.getText()));
        rolsave.setTipodocumento(documento.getText());
        
        
        if (!"".equals(nrocom.getText()) && !"".equals(provId.getText()) && !"".equals(documento.getText()) && !"".equals(cantid.getText()) ){
            controladores.insertarCompra(rolsave);
            JOptionPane.showMessageDialog(this, " Datos Registrados Correctamente ","",JOptionPane.INFORMATION_MESSAGE);
            LimpiarFormulario();
            ListarDatos();
        }else{
            JOptionPane.showMessageDialog(this, " Falta Rellenar Datos","",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (!"".equals(nrocom.getText()) ){
            controladores.eliminarCompra(Integer.parseInt(nrocom.getText()));
            JOptionPane.showMessageDialog(this, " Datos Eliminado Correctamente ","",JOptionPane.INFORMATION_MESSAGE);
            LimpiarFormulario();
            ListarDatos();

        }else{
            JOptionPane.showMessageDialog(this, " Falta Ingresar Id para Eliminar","",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        Compra compra = new Compra();
        compra.setNroCompra(Integer.parseInt(nrocom.getText()));
        compra.setProovedorid(Integer.parseInt(provId.getText()));
        compra.setTipodocumento(documento.getText());
        compra.setCantidad(Integer.parseInt(cantid.getText()));
        
        if (!"".equals(nrocom.getText()) && !"".equals(provId.getText()) && !"".equals(documento.getText()) && !"".equals(cantid.getText()) ){
            controladores.actualizarCompra(compra);
            JOptionPane.showMessageDialog(this, " Datos Actualizados Correctamente ","",JOptionPane.INFORMATION_MESSAGE);
            LimpiarFormulario();
            ListarDatos();
        }else{
            JOptionPane.showMessageDialog(this, " Falta Rellenar Datos","",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void nrocomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nrocomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nrocomActionPerformed

    private void provIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_provIdActionPerformed
        
    }//GEN-LAST:event_provIdActionPerformed


    private void cantidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidActionPerformed
        
    }//GEN-LAST:event_cantidActionPerformed

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
            java.util.logging.Logger.getLogger(VistaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaCompra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelDescripcion;
    private javax.swing.JLabel LabelID;
    private javax.swing.JLabel LabelNameR;
    private javax.swing.JLabel LabelRolValor;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JTextField cantid;
    private javax.swing.JTextField documento;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nrocom;
    private javax.swing.JTextField provId;
    private javax.swing.JTable tblComp;
    // End of variables declaration//GEN-END:variables
}
