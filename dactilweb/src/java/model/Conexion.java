/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Manu
 */
public class Conexion {
   public String basededatos="bd_dactil";
   public String url="jdbc:mysql://127.0.0.1/"+basededatos;
   public String usuario="root";
   public String password="";
   public Conexion(){
   }
   public Connection conectar(){
       Connection conexion=null;
       try {
           Class.forName("org.gjt.mm.mysql.Driver");
           conexion=(Connection) DriverManager.getConnection(this.url,this.usuario,this.password);
           //JOptionPane.showMessageDialog(null,"Conexion Exitosa");
       } catch (Exception ex) {
  
          JOptionPane.showMessageDialog(null, ex);
       }
       return conexion;
       
   }
}
