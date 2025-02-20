/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author aleja
 */
public class Conexion {

    /*Datos del Servidor MYSQL*/
    String url = "jdbc:mysql://localhost:3306";
    String nombreBD = "Tareas";
    String usuario = "root";
    String contra = "56234512";
    String driver = "com.mysql.jdbc.Driver";

    Connection conexion = null;

    // Metodo para establecer la conexion con la BD
    public Connection conexion() {
        // Establecemos el intento de la conexion
        try {
            // Cargar los driver de la base de datos en tiempo real o dinámico
            Class.forName(driver);
            // Establecer la conexion
            conexion = DriverManager.getConnection(url + "/" + nombreBD, usuario, contra);
            //Mostrar un mensaje en dado caso que la conexion sea correcta
            /*JOptionPane.showMessageDialog(null,"Conexión Exitosa");*/
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Conexión fallida: " + e);
        }
        return conexion;
    }

    public void desconectar() {
        try {
            if (conexion != null && !conexion.isClosed()) {
                conexion.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
