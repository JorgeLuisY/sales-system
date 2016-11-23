package vista;

import DAO.empleadoDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Empleado;
import fechasv.FechasV;
import java.sql.Timestamp;

public class VistaEmplado extends javax.swing.JFrame {
    // Variables
    empleadoDAO controladores = new empleadoDAO();
    ArrayList<Empleado> empleado;
    String fechaactualidad = new FechasV().getFA().toString();
    String fechamodificada;
    
    
    public VistaEmplado() {
        initComponents();
        rol.setText(" "+fechaactualidad);
        rol.disable();
        celular.setText(" "+fechaactualidad);
    }
    
public void ListarDatos() {
        empleado = controladores.reportarEmpleado();
        DefaultTableModel tb = (DefaultTableModel) tblUser.getModel();
        for (Empleado emplea : empleado) {
            tb.addRow(new Object[]{emplea.getId_empleado(), emplea.getTipoUsuario(), emplea.getRol(), emplea.getNombre(), emplea.getApellido(),
            emplea.getSexo(),emplea.getFechNacimiento(),emplea.getDireccion(),emplea.getTelefono(),emplea.getCelular(),emplea.getDni(),emplea.getEmail(),emplea.getSueldo(),emplea.getEstado()});
        }
    }
public String getfecham(){

        if(!fechaactualidad.equals(celular.getText())){
            return fechamodificada = celular.getText();
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
        LabelFI = new javax.swing.JLabel();
        LabelFF = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        idempleado = new javax.swing.JTextField();
        tipodeusuario = new javax.swing.JTextField();
        rol = new javax.swing.JTextField();
        celular = new javax.swing.JTextField();
        LabelFI1 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        LabelFI2 = new javax.swing.JLabel();
        apellido = new javax.swing.JTextField();
        LabelFI3 = new javax.swing.JLabel();
        LabelFI4 = new javax.swing.JLabel();
        Fechanaci = new javax.swing.JTextField();
        LabelFI5 = new javax.swing.JLabel();
        direccion = new javax.swing.JTextField();
        LabelFI6 = new javax.swing.JLabel();
        telefono = new javax.swing.JTextField();
        dni = new javax.swing.JTextField();
        LabelFF1 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        LabelFF2 = new javax.swing.JLabel();
        sueldo = new javax.swing.JTextField();
        LabelFF3 = new javax.swing.JLabel();
        estado = new javax.swing.JTextField();
        LabelFF4 = new javax.swing.JLabel();
        sexo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "TIPO DE USUARIO", "ROL", "NOMBRE", "APELLIDO", "SEXO", "FECHA DE NACIMIENTO", "DIRECCION", "TELEFONO", "CELULAR", "DNI", "EMAIL", "SUELDO", "ESTADO"
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

        LabelID.setText("ID EMPLEADO");

        LabelUsuario.setText("TIPO DE USUARIO");

        LabelFI.setText("ROL");

        LabelFF.setText("CELULAR");

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

        idempleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idempleadoActionPerformed(evt);
            }
        });

        tipodeusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipodeusuarioActionPerformed(evt);
            }
        });

        rol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rolActionPerformed(evt);
            }
        });

        celular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                celularActionPerformed(evt);
            }
        });

        LabelFI1.setText("NOMBRE");

        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });

        LabelFI2.setText("APELLIDO");

        apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoActionPerformed(evt);
            }
        });

        LabelFI3.setText("SEXO");

        LabelFI4.setText("FECHA DE NACIMIENTO");

        Fechanaci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FechanaciActionPerformed(evt);
            }
        });

        LabelFI5.setText("DIRECCION");

        direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccionActionPerformed(evt);
            }
        });

        LabelFI6.setText("TELEFONO");

        telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoActionPerformed(evt);
            }
        });

        dni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dniActionPerformed(evt);
            }
        });

        LabelFF1.setText("DNI");

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        LabelFF2.setText("EMAIL");

        sueldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sueldoActionPerformed(evt);
            }
        });

        LabelFF3.setText("SUELDO");

        estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadoActionPerformed(evt);
            }
        });

        LabelFF4.setText("ESTADO");

        sexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(LabelUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tipodeusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(LabelFI1)
                                    .addComponent(LabelFI))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rol, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(LabelFI3)
                                        .addGap(18, 18, 18)
                                        .addComponent(sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(LabelFI2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(LabelFI4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Fechanaci, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(LabelFI5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(LabelFI6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(92, 92, 92))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LabelID)
                        .addGap(18, 18, 18)
                        .addComponent(idempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelFF, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(celular, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelFF1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)
                                .addComponent(dni, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(LabelFF2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)
                                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(LabelFF3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(9, 9, 9)
                            .addComponent(sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelFF4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
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
                    .addComponent(btnListar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idempleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelID, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tipodeusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(celular, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelFF, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelFI, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rol, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelFI1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelFI2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelFI3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelFF1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dni, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelFF2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelFF3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelFF4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelFI4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Fechanaci, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelFI5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelFI6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        LimpiarFormulario();
        ListarDatos();
    }//GEN-LAST:event_btnListarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        Empleado emplead = new  Empleado();
        emplead.setId_empleado(Integer.parseInt(idempleado.getText()));
        emplead.setTipoUsuario(Integer.parseInt(tipodeusuario.getText()));
        emplead.setRol(Integer.parseInt(rol.getText()));
        emplead.setNombre(nombre.getText());
        emplead.setApellido(apellido.getText());
        emplead.setSexo(sexo.getText());
        emplead.setFechNacimiento(Timestamp.valueOf(Fechanaci.getText()));
        emplead.setDireccion(direccion.getText());
        emplead .setTelefono(telefono.getText());
        emplead.setCelular(Integer.parseInt(celular.getText()));
        emplead.setDni(Integer.parseInt(dni.getText()));
        emplead.setEmail(email.getText());
        emplead.setSueldo(Double.parseDouble(sueldo.getText()));
       emplead.setEstado(estado.getText());

        if (!"".equals(idempleado.getText()) && !"".equals(tipodeusuario.getText()) && !"".equals(rol.getText()) && !"".equals(nombre.getText()) && !"".equals(apellido.getText())
                && !"".equals(sexo.getText())&& !"".equals(Fechanaci.getText())&& !"".equals(direccion.getText())&& !"".equals(telefono.getText())&& !"".equals(celular.getText())
                && !"".equals(dni.getText())&& !"".equals(email.getText())&& !"".equals(sueldo.getText())&& !"".equals(estado.getText())){
            controladores.insertarPersona(emplead);;
            JOptionPane.showMessageDialog(this, " Datos Registrados Correctamente ","",JOptionPane.INFORMATION_MESSAGE);
            LimpiarFormulario();
            ListarDatos();
        }else{
            JOptionPane.showMessageDialog(this, " Falta Rellenar Datos","",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (!"".equals(idempleado.getText()) ){
            controladores.eliminarPersona(Integer.parseInt(idempleado.getText()));
            JOptionPane.showMessageDialog(this, " Datos Eliminado Correctamente ","",JOptionPane.INFORMATION_MESSAGE);
            LimpiarFormulario();
            ListarDatos();

        }else{
            JOptionPane.showMessageDialog(this, " Falta Ingresar Id a Eliminar","",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        Empleado useremplead = new Empleado();
        useremplead.setId_empleado(Integer.parseInt(idempleado.getText()));
        useremplead.setTipoUsuario(Integer.parseInt(tipodeusuario.getText()));
        useremplead.setRol(Integer.parseInt(rol.getText()));
        useremplead.setNombre(nombre.getText());
        useremplead.setApellido(apellido.getText());
        useremplead.setSexo(sexo.getText());
        useremplead.setFechNacimiento(Timestamp.valueOf(Fechanaci.getText()));
        useremplead.setDireccion(direccion.getText());
        useremplead .setTelefono(telefono.getText());
        useremplead.setCelular(Integer.parseInt(celular.getText()));
        useremplead.setDni(Integer.parseInt(dni.getText()));
        useremplead.setEmail(email.getText());
        useremplead.setSueldo(Double.parseDouble(sueldo.getText()));
        useremplead.setEstado(estado.getText());
        if (!"".equals(idempleado.getText()) && !"".equals(tipodeusuario.getText()) && !"".equals(rol.getText()) && !"".equals(nombre.getText()) && !"".equals(apellido.getText())
                && !"".equals(sexo.getText())&& !"".equals(Fechanaci.getText())&& !"".equals(direccion.getText())&& !"".equals(telefono.getText())&& !"".equals(celular.getText())
                && !"".equals(dni.getText())&& !"".equals(email.getText())&& !"".equals(sueldo.getText())&& !"".equals(estado.getText()) ){
            controladores.actualizarPersona(useremplead);
            JOptionPane.showMessageDialog(this, " Datos Actualizados Correctamente ","",JOptionPane.INFORMATION_MESSAGE);
            LimpiarFormulario();
            ListarDatos();
        }else{
            JOptionPane.showMessageDialog(this, " Falta Rellenar Datos","",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void idempleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idempleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idempleadoActionPerformed

    private void tipodeusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipodeusuarioActionPerformed
        
    }//GEN-LAST:event_tipodeusuarioActionPerformed


    private void rolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rolActionPerformed
        
    }//GEN-LAST:event_rolActionPerformed

    private void celularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_celularActionPerformed

    }//GEN-LAST:event_celularActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoActionPerformed

    private void FechanaciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FechanaciActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FechanaciActionPerformed

    private void direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_direccionActionPerformed

    private void telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoActionPerformed

    private void dniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dniActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void sueldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sueldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sueldoActionPerformed

    private void estadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estadoActionPerformed

    private void sexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sexoActionPerformed

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
            java.util.logging.Logger.getLogger(VistaEmplado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaEmplado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaEmplado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaEmplado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaEmplado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Fechanaci;
    private javax.swing.JLabel LabelFF;
    private javax.swing.JLabel LabelFF1;
    private javax.swing.JLabel LabelFF2;
    private javax.swing.JLabel LabelFF3;
    private javax.swing.JLabel LabelFF4;
    private javax.swing.JLabel LabelFI;
    private javax.swing.JLabel LabelFI1;
    private javax.swing.JLabel LabelFI2;
    private javax.swing.JLabel LabelFI3;
    private javax.swing.JLabel LabelFI4;
    private javax.swing.JLabel LabelFI5;
    private javax.swing.JLabel LabelFI6;
    private javax.swing.JLabel LabelID;
    private javax.swing.JLabel LabelUsuario;
    private javax.swing.JTextField apellido;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JTextField celular;
    private javax.swing.JTextField direccion;
    private javax.swing.JTextField dni;
    private javax.swing.JTextField email;
    private javax.swing.JTextField estado;
    private javax.swing.JTextField idempleado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField rol;
    private javax.swing.JTextField sexo;
    private javax.swing.JTextField sueldo;
    private javax.swing.JTable tblUser;
    private javax.swing.JTextField telefono;
    private javax.swing.JTextField tipodeusuario;
    // End of variables declaration//GEN-END:variables
}
