/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentacion;

import Entidad.Tareas;
import conexion.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aleja
 */
public class frmTareas extends javax.swing.JFrame {

    Conexion c;

    /**
     * Creates new form frmTareas
     */
    public frmTareas() {
        initComponents();
        c = new Conexion();
        this.llenarTabla();
        this.setTitle("Programa Gestor de Tareas Ing. Ochoa  e Ing. Arellano");
        this.setResizable(false); // Desactiva la redimensión
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        EtiquetaID = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaTareas = new javax.swing.JTable();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnMarcar = new javax.swing.JButton();
        EtiquetaNombre = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        EtiquetaTarea = new javax.swing.JLabel();
        Tarea = new javax.swing.JTextField();
        EtiquetaFecha = new javax.swing.JLabel();
        Fecha = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnCancelar1 = new javax.swing.JButton();
        EtiquetaGestorTareas = new javax.swing.JLabel();
        btnEntregadas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Fondo.setBackground(new java.awt.Color(0, 51, 102));

        EtiquetaID.setFont(new java.awt.Font("Roboto Medium", 2, 18)); // NOI18N
        EtiquetaID.setText("ID");

        ID.setEditable(false);
        ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDActionPerformed(evt);
            }
        });

        TablaTareas.setBackground(new java.awt.Color(153, 153, 255));
        TablaTareas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Asignatura", "Tarea", "Fecha De Entrega"
            }
        ));
        jScrollPane1.setViewportView(TablaTareas);

        btnEditar.setBackground(new java.awt.Color(255, 255, 51));
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 0, 0));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnMarcar.setBackground(new java.awt.Color(0, 255, 51));
        btnMarcar.setText("Marcar Terminada");
        btnMarcar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMarcarActionPerformed(evt);
            }
        });

        EtiquetaNombre.setFont(new java.awt.Font("Roboto Medium", 2, 18)); // NOI18N
        EtiquetaNombre.setText("Nombre Asignatura");

        Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreActionPerformed(evt);
            }
        });

        EtiquetaTarea.setFont(new java.awt.Font("Roboto Medium", 2, 18)); // NOI18N
        EtiquetaTarea.setText("Tarea");

        Tarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TareaActionPerformed(evt);
            }
        });

        EtiquetaFecha.setFont(new java.awt.Font("Roboto Medium", 2, 18)); // NOI18N
        EtiquetaFecha.setText("Fecha Entragada");

        Fecha.setForeground(new java.awt.Color(0, 0, 0));
        Fecha.setText("AAAA/MM/DD");
        Fecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FechaMouseClicked(evt);
            }
        });
        Fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FechaActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(0, 0, 102));
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(0, 255, 51));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar1.setBackground(new java.awt.Color(204, 204, 204));
        btnCancelar1.setText("Cancelar");
        btnCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar1ActionPerformed(evt);
            }
        });

        EtiquetaGestorTareas.setFont(new java.awt.Font("Roboto Medium", 3, 36)); // NOI18N
        EtiquetaGestorTareas.setForeground(new java.awt.Color(255, 255, 255));
        EtiquetaGestorTareas.setText("Gestor De Tareas");
        EtiquetaGestorTareas.setToolTipText("");

        btnEntregadas.setBackground(new java.awt.Color(0, 0, 102));
        btnEntregadas.setForeground(new java.awt.Color(255, 255, 255));
        btnEntregadas.setText("Lista Tareas Entregadas");
        btnEntregadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntregadasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(EtiquetaTarea, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EtiquetaNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(EtiquetaFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EtiquetaID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                            .addComponent(Tarea)
                            .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ID)))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btnCancelar1)
                        .addGap(39, 39, 39)
                        .addComponent(btnGuardar))
                    .addComponent(EtiquetaGestorTareas, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE))
                                .addGap(33, 33, 33))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout.createSequentialGroup()
                                .addComponent(btnMarcar)
                                .addContainerGap())))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addComponent(btnEntregadas)
                        .addGap(199, 199, 199)
                        .addComponent(btnSalir)
                        .addGap(147, 147, 147))))
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(btnEditar)
                        .addGap(27, 27, 27)
                        .addComponent(btnEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(btnMarcar))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(btnSalir)
                        .addGap(25, 25, 25))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnEntregadas)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(EtiquetaGestorTareas, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtiquetaID)
                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtiquetaNombre)
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EtiquetaTarea)
                    .addComponent(Tarea, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EtiquetaFecha))
                .addGap(42, 42, 42)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar1))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TareaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TareaActionPerformed

    private void FechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FechaActionPerformed

    private void btnCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar1ActionPerformed
        TablaTareas.clearSelection();
        this.limpiarTXT();
    }//GEN-LAST:event_btnCancelar1ActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        String nombre = Nombre.getText().trim();
        String tarea = Tarea.getText().trim();
        String fecha = Fecha.getText().trim();

        // Validaciones
        if (nombre.isEmpty() || tarea.isEmpty() || fecha.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor completa todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validar que la tarea tenga al menos 5 caracteres
        if (tarea.length() < 5) {
            JOptionPane.showMessageDialog(null, "La descripción de la tarea debe tener al menos 5 caracteres.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validar el formato de la fecha (AAAA/MM/DD)
        if (!fecha.matches("\\d{4}/\\d{2}/\\d{2}")) {
            JOptionPane.showMessageDialog(null, "Formato de fecha incorrecto. Debe ser AAAA/MM/DD.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validar que la fecha sea real
        try {
            java.sql.Date.valueOf(fecha.replace("/", "-"));
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "La fecha ingresada no es válida.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Si el ID no está vacío, editar la tarea
        if (!ID.getText().equals("")) {
            int idTarea = Integer.parseInt(ID.getText());
            this.editarTarea(idTarea, nombre, tarea, fecha);
        } else {
            // Agregar una nueva tarea
            this.agregarTarea(nombre, tarea, fecha);
        }

        // Limpiar los campos después de guardar o editar
        limpiarTXT();
        this.llenarTabla();


    }//GEN-LAST:event_btnGuardarActionPerformed

    private void FechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FechaMouseClicked
        Fecha.setText("");
    }//GEN-LAST:event_FechaMouseClicked

    private void NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int filaSeleccionada = TablaTareas.getSelectedRow();
        if (filaSeleccionada != -1) {
            int confirmacion = JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar esta tarea?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);
            if (confirmacion == JOptionPane.YES_OPTION) {
                int idTarea = Integer.parseInt(TablaTareas.getValueAt(filaSeleccionada, 0).toString());
                eliminarTarea(idTarea);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una tarea para eliminar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
        this.llenarTabla();
        TablaTareas.clearSelection();
        this.limpiarTXT();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        int filaSeleccionada = TablaTareas.getSelectedRow(); // Verificar si se ha seleccionado una fila

        // Validar que haya una fila seleccionada
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una tarea para editar.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String idTarea = TablaTareas.getValueAt(filaSeleccionada, 0).toString();  // Obtener el ID de la tarea

        // Validar que el ID sea un número válido
        if (!idTarea.matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "ID de tarea inválido.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            Connection con = c.conexion();
            Statement st = con.createStatement();

            // Consulta para obtener los datos de la tarea seleccionada
            String codigoSQL = "SELECT * FROM tareas WHERE id = " + idTarea;
            ResultSet resultado = st.executeQuery(codigoSQL);

            // Si la consulta devuelve resultados, llenar los campos de texto
            if (resultado.next()) {
                ID.setText(String.valueOf(resultado.getInt("id")));
                Nombre.setText(resultado.getString("Nombre"));
                Tarea.setText(resultado.getString("Tarea"));
                Fecha.setText(resultado.getDate("Fecha").toString());
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró la tarea con el ID especificado.", "Error", JOptionPane.ERROR_MESSAGE);
            }

            // Cerrar conexiones
            resultado.close();
            st.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al cargar datos de la tarea: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }

    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnMarcarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarcarActionPerformed
        int filaSeleccionada = TablaTareas.getSelectedRow();
        if (filaSeleccionada != -1) {
            int confirmacion = JOptionPane.showConfirmDialog(null, "¿Está seguro de marcar esta tarea como entregada?", "Confirmar", JOptionPane.YES_NO_OPTION);
            if (confirmacion == JOptionPane.YES_OPTION) {
                String idTarea = TablaTareas.getValueAt(filaSeleccionada, 0).toString(); // Obtiene el ID de la tarea seleccionada
                marcarTareaEntregada(Integer.parseInt(idTarea)); // Llama al método para marcar la tarea como entregada
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una tarea para marcar como entregada.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
        this.llenarTabla(); // Refresca la tabla después de marcar la tarea
        TablaTareas.clearSelection(); // Limpia la selección de la tabla
        this.limpiarTXT(); // Limpia los campos de texto
    }//GEN-LAST:event_btnMarcarActionPerformed

    private void btnEntregadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntregadasActionPerformed
        frmTareaTerminadas terminadas = new frmTareaTerminadas();
        this.dispose();
        terminadas.setVisible(true);
    }//GEN-LAST:event_btnEntregadasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(frmTareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmTareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmTareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmTareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmTareas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EtiquetaFecha;
    private javax.swing.JLabel EtiquetaGestorTareas;
    private javax.swing.JLabel EtiquetaID;
    private javax.swing.JLabel EtiquetaNombre;
    private javax.swing.JLabel EtiquetaTarea;
    private javax.swing.JTextField Fecha;
    private javax.swing.JPanel Fondo;
    private javax.swing.JTextField ID;
    private javax.swing.JTextField Nombre;
    private javax.swing.JTable TablaTareas;
    private javax.swing.JTextField Tarea;
    private javax.swing.JButton btnCancelar1;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEntregadas;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnMarcar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public List<Tareas> consultarTareasPendientes() {
        List<Tareas> listaTareas = new ArrayList<>();
        Conexion c = new Conexion(); // Instancia de tu clase de conexión

        try {
            Statement st = c.conexion().createStatement(); // Crear la consulta
            String codigoSQL = "SELECT * FROM tareas WHERE Entrega = 0"; // Consulta directa
            ResultSet resultado = st.executeQuery(codigoSQL); // Ejecutar la consulta

            while (resultado.next()) {
                int id = resultado.getInt("id");
                String nombre = resultado.getString("Nombre");
                String tarea = resultado.getString("Tarea");
                Date fecha = resultado.getDate("Fecha");
                Tareas tareas = new Tareas(id, nombre, tarea, fecha);
                listaTareas.add(tareas);
            }

            resultado.close();
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listaTareas; // Retorna la lista de tareas pendientes
    }

    public void agregarTarea(String nombre, String tarea, String fecha) {
        Connection con = null;
        CallableStatement stmt = null;

        try {
            // Obtiene la conexión usando tu clase Conexion
            Conexion conexionBD = new Conexion();
            con = conexionBD.conexion();

            // Convierte el String de fecha a formato Date para MySQL
            java.sql.Date fechaSQL = java.sql.Date.valueOf(fecha.replace("/", "-"));

            // Prepara el llamado al Stored Procedure
            stmt = con.prepareCall("{CALL sp_CrearTarea(?, ?, ?)}");
            stmt.setString(1, nombre);
            stmt.setString(2, tarea);
            stmt.setDate(3, fechaSQL);

            // Ejecuta el SP
            stmt.execute();
            JOptionPane.showMessageDialog(null, "¡Tarea agregada exitosamente!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al agregar tarea: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // Cierra las conexiones
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void eliminarTarea(int idTarea) {
        try {
            Connection con = new Conexion().conexion();
            String sql = "DELETE FROM tareas WHERE ID = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idTarea);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Tarea eliminada con éxito.");
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar tarea: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void editarTarea(int id, String nombre, String tarea, String fecha) {
        Connection con = null;
        CallableStatement stmt = null;

        // Validaciones antes de ejecutar la consulta
        if (id <= 0) {
            JOptionPane.showMessageDialog(null, "ID de tarea inválido.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (nombre.trim().isEmpty() || tarea.trim().isEmpty() || fecha.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (tarea.length() < 5) {
            JOptionPane.showMessageDialog(null, "La descripción de la tarea debe tener al menos 5 caracteres.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        java.sql.Date fechaSQL;
        try {
            fechaSQL = java.sql.Date.valueOf(fecha.replace("/", "-"));
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "La fecha ingresada no es válida.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            // Obtiene la conexión usando tu clase Conexion
            Conexion conexionBD = new Conexion();
            con = conexionBD.conexion();

            // Prepara el llamado al Stored Procedure
            stmt = con.prepareCall("{CALL sp_ActualizarTarea(?, ?, ?, ?)}");
            stmt.setInt(1, id);           // ID de la tarea que se va a actualizar
            stmt.setString(2, nombre);    // Nuevo nombre de la tarea
            stmt.setString(3, tarea);     // Nueva descripción de la tarea
            stmt.setDate(4, fechaSQL);    // Nueva fecha de la tarea

            // Ejecuta el SP
            stmt.execute();
            JOptionPane.showMessageDialog(null, "¡Tarea actualizada exitosamente!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar tarea: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        } finally {
            // Cierra las conexiones
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private void marcarTareaEntregada(int idTarea) {
        // Validación del ID
        if (idTarea <= 0) {
            JOptionPane.showMessageDialog(null, "ID de tarea inválido.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            Connection con = new Conexion().conexion();
            String sql = "UPDATE tareas SET entrega = 1 WHERE ID = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idTarea); // Establece el ID de la tarea que se va a marcar como entregada
            int filasAfectadas = ps.executeUpdate();

            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Tarea marcada como entregada.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró la tarea con el ID especificado.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al marcar la tarea como entregada: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void llenarTabla() {
        List<Tareas> listaTareas = this.consultarTareasPendientes();
        DefaultTableModel modeloTabla = (DefaultTableModel) this.TablaTareas.getModel();
        modeloTabla.setRowCount(0); // Limpiar la tabla antes de llenarla

        listaTareas.forEach(tarea -> {
            Object[] fila = new Object[4];
            fila[0] = tarea.getIdTarea();
            fila[1] = tarea.getNombreAsignatura();
            fila[2] = tarea.getTarea();
            fila[3] = tarea.getFechaEntrega();
            modeloTabla.addRow(fila);
        });

    }

    public void limpiarTXT() {
        ID.setText(null);
        Nombre.setText(null);
        Tarea.setText(null);
        Nombre.setText(null);
        Fecha.setText(null);
    }

}
