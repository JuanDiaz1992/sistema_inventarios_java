package model;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ranaclay
 */
public class Conexion {
    Connection con;
    public Connection getConnection(){
       try{
            String myBD = "jdbc:mysql://localhost:3306/gestion_restaurante_mysql?Timezone=UTC";
            String usuario = "administrador";
            String contraseña = "3118514322s";
            con = DriverManager.getConnection(myBD, usuario, contraseña);
            return con;
       } catch(SQLException e){
           System.out.println(e.toString());
       }
       return null;
    }
}
