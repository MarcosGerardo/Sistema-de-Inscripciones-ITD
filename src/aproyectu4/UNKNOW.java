
package aproyectu4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Marcos Mata
 */
public class UNKNOW extends javax.swing.JFrame {
  Conexion cone=new Conexion();
Connection rege=cone.conexion();



    public UNKNOW() {
        initComponents();
         verTablaConferencistas("");
         verTablaAlumnos("");
        
          this.setLocationRelativeTo(null);
          this.combox.setModel(cone.TWK());
         // this.txtTotal.setText(cone.total(txtTotal.toString());
        
      
         // combox.addItem(lista);
          
    }
 
    
    
    void verTablaAlumnos(String clav){
        DefaultTableModel modeloDos=new DefaultTableModel();
        String sql="";
        modeloDos.addColumn("Clave");
        modeloDos.addColumn("Nombre");
        modeloDos.addColumn("Control");
        modeloDos.addColumn("Correo");
        modeloDos.addColumn("Conferencia");
        modeloDos.addColumn("Pago");
        
        jTable2.setModel(modeloDos);
        String [] dataje=new String[6];
        
        if (clav.equals("")) {
            sql="SELECT * FROM alumnos";
            
        }
        else{
            sql="SELECT* FROM alumnos WHERE CLAVE='"+clav+"'";

    }
        try {
              Statement sentencia= rege.createStatement();

           ResultSet rs=sentencia.executeQuery(sql);
            while (rs.next()) {  
                dataje[0]=rs.getString(1);
                dataje[1]=rs.getString(2);
                dataje[2]=rs.getString(3);
                dataje[3]=rs.getString(4);
                dataje[4]=rs.getString(5);
                dataje[5]=rs.getString(6);
                modeloDos.addRow(dataje);
            }
            
        } catch (Exception e) {
        }
        
        
        
        
        
        
        
    }
     void verTablaConferencistas(String nombre){
         

 String sql="";
        DefaultTableModel miModelo=new  DefaultTableModel();
        miModelo.addColumn("Clave");
        miModelo.addColumn("Conferencia");
        miModelo.addColumn("Asesor");
        miModelo.addColumn("Costo");
        miModelo.addColumn("Carga");
        jTable1.setModel(miModelo);
        String [] datos= new String[5];
       
        if (nombre.equals("")) {
             sql = "SELECT * FROM CONFERENCISTAS";
            
        }else {
             sql = "SELECT * FROM CONFERENCISTAS WHERE CLAVE ='"+nombre+"'";
            
        }
        
          
      
            
            
        
        try {
            
           Statement sentencia= rege.createStatement();

           ResultSet rs=sentencia.executeQuery(sql);
            while (rs.next()) {  
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                miModelo.addRow(datos);
             
                
                
            }
            jTable1.setModel(miModelo);
        } catch (SQLException ex) {
            Logger.getLogger(UNKNOW.class.getName()).log(Level.SEVERE,null,ex);
        }
        
        
    }
     
     void ActualizarCarga(){

    
    try {

        String sql = "UPDATE conferencistas SET clave=? "  + "WHERE carga=carga-1";

  Statement prest = rege.createStatement();
  prest.executeQuery(sql);

    } catch (SQLException e) {
    
    }
         
    }
     
    


 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boton1 = new Swings.Boton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        boton2 = new Swings.Boton();
        txtControl = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        combox = new javax.swing.JComboBox<>();
        txtNombre2 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        boton5 = new Swings.Boton();
        boton4 = new Swings.Boton();
        boton3 = new Swings.Boton();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tField3 = new javax.swing.JTextField();
        txtPago = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tField4 = new javax.swing.JTextField();
        ZfOndo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        boton1.setBackground(new java.awt.Color(204, 255, 255));
        boton1.setText("Modificar mis datos");
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });
        getContentPane().add(boton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, -1, 30));

        jLabel2.setFont(new java.awt.Font("Rockwell Condensed", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 204));
        jLabel2.setText("CLAVE ALUMNO PARA MODIFICAR");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 130, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Inscripción....");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Rockwell Condensed", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 204));
        jLabel4.setText("Nombre:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        jLabel6.setFont(new java.awt.Font("Rockwell Condensed", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 204));
        jLabel6.setText("Correo Electronico");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, -1, -1));

        jLabel5.setFont(new java.awt.Font("Rockwell Condensed", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 204));
        jLabel5.setText("No. control");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 90, -1));

        boton2.setBackground(new java.awt.Color(204, 255, 255));
        boton2.setText("INSCRIBIRME..");
        boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2ActionPerformed(evt);
            }
        });
        getContentPane().add(boton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, -1, -1));
        getContentPane().add(txtControl, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 160, -1));
        getContentPane().add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 160, -1));

        combox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(combox, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, -1, -1));

        txtNombre2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombre2ActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 160, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 420, 230));

        jLabel10.setFont(new java.awt.Font("Rockwell Condensed", 3, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 204));
        jLabel10.setText("Pago");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(jTable2);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, 420, 230));

        boton5.setBackground(new java.awt.Color(204, 255, 255));
        boton5.setText("OK");
        boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton5ActionPerformed(evt);
            }
        });
        getContentPane().add(boton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, -1, -1));

        boton4.setBackground(new java.awt.Color(204, 255, 255));
        boton4.setText("Realizar Modificación");
        boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton4ActionPerformed(evt);
            }
        });
        getContentPane().add(boton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 110, -1, -1));

        boton3.setBackground(new java.awt.Color(255, 255, 204));
        boton3.setText("Regresar");
        boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton3ActionPerformed(evt);
            }
        });
        getContentPane().add(boton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 180, -1, -1));

        jLabel9.setFont(new java.awt.Font("Rockwell Condensed", 3, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 204));
        jLabel9.setText("Conferencistas");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 120, -1));

        jLabel8.setFont(new java.awt.Font("Rockwell Condensed", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 204));
        jLabel8.setText("Conferencia");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));
        getContentPane().add(tField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 40, -1));
        getContentPane().add(txtPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 70, -1));

        jLabel11.setFont(new java.awt.Font("Rockwell Condensed", 3, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 204));
        jLabel11.setText("Alumnos Inscritos ");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, 180, -1));

        jLabel7.setFont(new java.awt.Font("Rockwell Condensed", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 204));
        jLabel7.setText("Consultar Conferencista");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 180, -1));
        getContentPane().add(tField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, 40, -1));

        ZfOndo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/INVERTIR-EN-TECNOLOGIA.png"))); // NOI18N
        getContentPane().add(ZfOndo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombre2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombre2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombre2ActionPerformed

    private void boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton3ActionPerformed
        Pincipal o=new Pincipal();
o.setVisible(true);
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_boton3ActionPerformed

    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ActionPerformed
try {
//Conexion s= new Conexion();
//int id=s.idIncremento();

            String cla,con,nom,cu,lim;
            String sql= "";
            nom=txtNombre2.getText();
            con=txtControl.getText();
            cu=txtCorreo.getText();
            cla=combox.getSelectedItem().toString();
            lim=txtPago.getText();
            
            
    

         
            if("".equals(nom) || "".equals(con) || "".equals(cla)|| "".equals(cu)){
                JOptionPane.showMessageDialog(null, "Componentes vacios");
                 JOptionPane.showMessageDialog(null, "Inserta tus datos");
            }
            else
            {
                sql="INSERT INTO alumnos(NOMBRE,CONTROL,CORREO,CONFERENCIA,Pago)VALUES(?,?,?,?,?)";

                PreparedStatement ps=rege.prepareStatement(sql);
               
                ps.setString(1, nom);
                ps.setString(2,con);
                ps.setString(3,cu);
                ps.setString(4, cla);
                ps.setString(5,lim);
                
                
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null,"Inscripción Guardadada Con Exito");
                verTablaAlumnos("");
            }}catch (SQLException ex) {
                Logger.getLogger(InsCon.class.getName()).log(Level.SEVERE, null, ex);
            }    
        try {
            String sql="UPDATE conferencistas SET clave=? WHERE NOMBRE =?";
            
        } catch (Exception e) {
        }

// TODO add your handling code here:
    }//GEN-LAST:event_boton2ActionPerformed

    private void boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton5ActionPerformed
      String consulta;
        consulta=tField4.getText();

        verTablaConferencistas(consulta);
        
    }//GEN-LAST:event_boton5ActionPerformed

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
        String mod="", sql="";

        String []datos=new String[6];
        mod=tField3.getText();
        sql="SELECT * FROM alumnos WHERE clave ='"+mod+"'";
        if(mod.equals("")){
            JOptionPane.showMessageDialog(null,"No existe ");
        }else{  //para traer la informacion
            try{
                Statement sentencia=rege.createStatement();
                ResultSet rs= sentencia.executeQuery(sql);
                while(rs.next()){
                    datos[0]= rs.getString(1);
                    datos[1]= rs.getString(2);
                    datos[2]= rs.getString(3);
                    datos[3]= rs.getString(4);
                    datos[4]= rs.getString(5);
                     datos[5]= rs.getString(6);
                    
                    
                }
                  
                txtNombre2.setText(datos[1]);
                txtControl.setText(datos[2]);
                   txtCorreo.setText(datos[3]);
                   txtPago.setText(datos[5]);
                combox.getModel().setSelectedItem(datos[4]);
             
                verTablaAlumnos("");
                

            }catch(SQLException ex){
                Logger.getLogger(UNKNOW.class.getName()).log(Level.SEVERE,null,ex);
            }
        }  // TODO add your handling code here:
    }//GEN-LAST:event_boton1ActionPerformed

    private void boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton4ActionPerformed
      try {
            //DECIRLE QUE ACTUALIZE LOS DATOS
            PreparedStatement ps=rege.prepareStatement("UPDATE alumnos SET NOMBRE='"+txtNombre2.getText()+"',CONTROL='"+txtControl.getText()+"',Correo='"+txtCorreo.getText()+"',Conferencia='"+combox.getSelectedItem()+"',Pago='"+txtPago.getText()+"'WHERE CLAVE='"+tField3.getText()+"'");
            ps.executeUpdate();
          verTablaConferencistas("");
            JOptionPane.showMessageDialog(null, "Modificación realizada");
verTablaAlumnos("");
        } catch (SQLException ex) {
            Logger.getLogger(UNKNOW.class.getName()).log(Level.SEVERE,null,ex);
        }  // TODO add your handling code here:
    }//GEN-LAST:event_boton4ActionPerformed

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
            java.util.logging.Logger.getLogger(UNKNOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UNKNOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UNKNOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UNKNOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UNKNOW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ZfOndo;
    private Swings.Boton boton1;
    private Swings.Boton boton2;
    private Swings.Boton boton3;
    private Swings.Boton boton4;
    private Swings.Boton boton5;
    private javax.swing.JComboBox<String> combox;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    public static javax.swing.JTable jTable1;
    public static javax.swing.JTable jTable2;
    private javax.swing.JTextField tField3;
    private javax.swing.JTextField tField4;
    private javax.swing.JTextField txtControl;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre2;
    private javax.swing.JTextField txtPago;
    // End of variables declaration//GEN-END:variables
}
