package vista;

import DAO.UsuarioDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Usuario;
import fechasv.FechasV;
import java.sql.Timestamp;

public class VistaUsuario extends javax.swing.JFrame {
    // Variables
    UsuarioDAO controladores = new UsuarioDAO();
    ArrayList<Usuario> usuario;
    String fechaactualidad = new FechasV().getFA().toString();
    String fechamodificada;
    
    
    public VistaUsuario() {
        initComponents();
        FechaIni.setText(" "+fechaactualidad);
        FechaIni.disable();
        FechaFin.setText(" "+fechaactualidad);
    }
    
public void ListarDatos() {
        usuario = controladores.reportaUsuario();
        DefaultTableModel tb = (DefaultTableModel) tblUser.getModel();
        for (Usuario user : usuario) {
            tb.addRow(new Object[]{user.getId_usuario(), user.getUsuario(), user.getPassword(), user.getFechaInicio(), user.getFechaFin()});
        }
    }
public String getfecham(){

        if(!fechaactualidad.equals(FechaFin.getText())){
            return fechamodificada = FechaFin.getText();
        }else{
            return fechamodificada = fechaactualidad;
        }
}
    
public void LimpiarFormulario() {
        DefaultTableModel tb = (DefaultTableModel) tblUser.getModel();
        for (int i = tb.getRowCount() - 1; i >= 0; i--) {
            tb.removeRow(i);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblUser = new javax.swing.JTable();
        btnListar = new javax.swing.JButton();
        LabelID = new javax.swing.JLabel();
        LabelUsuario = new javax.swing.JLabel();
        LabelPass = new javax.swing.JLabel();
        LabelFI = new javax.swing.JLabel();
        LabelFF = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        iduser = new javax.swing.JTextField();
        login = new javax.swing.JTextField();
        pass = new javax.swing.JTextField();
        FechaIni = new javax.swing.JTextField();
        FechaFin = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "USUARIO", "PASSWORD", "FECHA INICIO", "FECHA FIN"
            }
        ));
        jScrollPane1.setViewportView(tblUser);

        btnListar.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/listar.png"))); // NOI18N
        btnListar.setText("Reporte");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        LabelID.setText("ID USUARIO");

        LabelUsuario.setText("USUARIO");

        LabelPass.setText("CONTRASEÑA");

        LabelFI.setText("FECHA DE INICIO");

        LabelFF.setText("FECHA FIN");

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

        iduser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iduserActionPerformed(evt);
            }
        });

        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        FechaIni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FechaIniActionPerformed(evt);
            }
        });

        FechaFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FechaFinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(iduser, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(LabelFI)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(FechaIni, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelPass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelFF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(FechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnListar, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelID, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iduser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16))
                    .addComponent(btnListar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelPass, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelFI, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelFF, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FechaIni, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnModificar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        Usuario usersave = new Usuario();
        Timestamp fechainicio = new FechasV().getFA();
        usersave.setId_usuario(Integer.parseInt(iduser.getText()));
        usersave.setUsuario(login.getText());
        usersave.setPassword(pass.getText());
        usersave.setFechaInicio(fechainicio);
        usersave.setFechaFin(Timestamp.valueOf(getfecham()));
        
        if (!"".equals(iduser.getText()) && !"".equals(login.getText()) && !"".equals(pass.getText()) && !"".equals(FechaFin.getText()) ){
            controladores.insertarUsuario(usersave);
            JOptionPane.showMessageDialog(this, " Datos Registrados Correctamente ","",JOptionPane.INFORMATION_MESSAGE);
            LimpiarFormulario();
            ListarDatos();
        }else{
            JOptionPane.showMessageDialog(this, " Falta Rellenar Datos","",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (!"".equals(iduser.getText()) ){
            controladores.eliminarUsuario(Integer.parseInt(iduser.getText()));
            JOptionPane.showMessageDialog(this, " Datos Eliminado Correctamente ","",JOptionPane.INFORMATION_MESSAGE);
            LimpiarFormulario();
            ListarDatos();

        }else{
            JOptionPane.showMessageDialog(this, " Falta Ingresar Id a Eliminar","",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        Usuario userm = new Usuario();
        userm.setId_usuario(Integer.parseInt(iduser.getText()));
        userm.setUsuario(login.getText());
        userm.setPassword(pass.getText());
        userm.setFechaFin(Timestamp.valueOf(getfecham()));
        if (!"".equals(iduser.getText()) && !"".equals(login.getText()) && !"".equals(pass.getText()) && !"".equals(FechaFin.getText()) ){
            controladores.actualizarUsuario(userm);
            JOptionPane.showMessageDialog(this, " Datos Actualizados Correctamente ","",JOptionPane.INFORMATION_MESSAGE);
            LimpiarFormulario();
            ListarDatos();
        }else{
            JOptionPane.showMessageDialog(this, " Falta Rellenar Datos","",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void iduserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iduserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iduserActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        
    }//GEN-LAST:event_loginActionPerformed


    private void FechaIniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FechaIniActionPerformed
        
    }//GEN-LAST:event_FechaIniActionPerformed

    private void FechaFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FechaFinActionPerformed

    }//GEN-LAST:event_FechaFinActionPerformed

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
            java.util.logging.Logger.getLogger(VistaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FechaFin;
    private javax.swing.JTextField FechaIni;
    private javax.swing.JLabel LabelFF;
    private javax.swing.JLabel LabelFI;
    private javax.swing.JLabel LabelID;
    private javax.swing.JLabel LabelPass;
    private javax.swing.JLabel LabelUsuario;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JTextField iduser;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField login;
    private javax.swing.JTextField pass;
    private javax.swing.JTable tblUser;
    // End of variables declaration//GEN-END:variables
}
