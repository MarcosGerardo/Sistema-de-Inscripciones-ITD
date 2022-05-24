/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aproyectu4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Marcos Mata
 */
public class Conexion {
     Connection con=null; 
   public Connection conexion(){
       try {
           //Driver
           Class.forName("com.mysql.jdbc.Driver");
           //Tipo de conexion, el servidor, base de datos, usuario, password
           con=DriverManager.getConnection("jdbc:mysql://localhost/techday","root","");
           System.out.println("Conexion realizada");
       } catch (ClassNotFoundException | SQLException e) {
           JOptionPane.showMessageDialog(null,"Problemas al conectar"+ e);
       }
       return con;
   }
   public ResultSet consulta(String sql){
       ResultSet res=null;
       try {
           PreparedStatement pstm=con.prepareStatement(sql);
           res=pstm.executeQuery();
           
       } catch (Exception e) {
           System.err.println("Error consulta"+ e.getMessage());
           
       }
       return res;
       
   }
       public DefaultComboBoxModel TWK(){
          DefaultComboBoxModel listaModelo= new DefaultComboBoxModel();
          listaModelo.addElement("Seleccione Una conferencia");
          ResultSet res=this.consulta("SELECT * FROM conferencistas");
           try {
               while (res.next()) {                   
                   listaModelo.addElement(res.getString("Conferencia"));
                   
               }
               res.close();
           } catch (Exception e) {
               System.err.println(e.getMessage());
           }
           return  listaModelo;
       }
       public int idIncremento(){
           int id=1;
           PreparedStatement ps= null;
           ResultSet res=this.consulta("SELECT * FROM alumnos WHERE clave");
           
           try {
               while (res.next()) {                   
                   id=res.getInt(1)+1;
               }
           } catch (Exception e) {
               System.out.println("ERROR" +e.getMessage());
           }
           
           
           return id;
           
       }
       public void total( ){
             String sql= "";
     
                sql= "SELECT SUM * FROM alumnos WHERE Pago";
                
            }
           
           
       
          
           
       }
   
    

