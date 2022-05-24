
package aproyectu4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Marcos Mata
 */
public class InsCon extends javax.swing.JFrame {
     Conexion cone=new Conexion();
Connection rege=cone.conexion();
 String sql="";

    
    public InsCon() {
        initComponents();
         verTablaConferencistas("");
         this.setLocationRelativeTo(null);
    }
     void verTablaConferencistas(String nombre){
         

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
            Logger.getLogger(InsCon.class.getName()).log(Level.SEVERE,null,ex);
        }

    }
      private void limpiar(){
          
          
         txtControl.setText("");
         txtConferencia.setText("");
         txtNombre.setText("");
         txtCuota.setText("");
         txtLimite.setText("");
 
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boton1 = new Swings.Boton();
        boton2 = new Swings.Boton();
        boton3 = new Swings.Boton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtLimite = new javax.swing.JTextField();
        txtControl = new javax.swing.JTextField();
        txtCuota = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtConferencia = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        ZfOndo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        boton1.setBackground(new java.awt.Color(204, 255, 255));
        boton1.setText("Regresar");
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });
        getContentPane().add(boton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, -1));

        boton2.setBackground(new java.awt.Color(204, 255, 255));
        boton2.setText("INSCRIBIR");
        boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2ActionPerformed(evt);
            }
        });
        getContentPane().add(boton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, -1, -1));

        boton3.setBackground(new java.awt.Color(204, 255, 255));
        boton3.setText("BAJA");
        boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton3ActionPerformed(evt);
            }
        });
        getContentPane().add(boton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 460, -1, -1));

        jLabel2.setFont(new java.awt.Font("Rockwell Condensed", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 204));
        jLabel2.setText("Limite");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 50, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Inscripción conferencista....");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Rockwell Condensed", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 204));
        jLabel4.setText("Nombre");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 70, -1));

        jLabel6.setFont(new java.awt.Font("Rockwell Condensed", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 204));
        jLabel6.setText("Cuota");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 50, -1));

        jLabel5.setFont(new java.awt.Font("Rockwell Condensed", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 204));
        jLabel5.setText("Clave");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 90, -1));

        jLabel7.setFont(new java.awt.Font("Rockwell Condensed", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 204));
        jLabel7.setText("Conferencia");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 100, -1));
        getContentPane().add(txtLimite, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 70, -1));
        getContentPane().add(txtControl, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 160, -1));
        getContentPane().add(txtCuota, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 160, -1));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 160, -1));
        getContentPane().add(txtConferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 160, -1));

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

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 490, 230));

        ZfOndo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/INVERTIR-EN-TECNOLOGIA.png"))); // NOI18N
        getContentPane().add(ZfOndo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
   
    }//GEN-LAST:event_txtNombreActionPerformed

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
   Pincipal o=new Pincipal();
o.setVisible(true);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_boton1ActionPerformed

    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ActionPerformed
 try {

            String cla,con,nom,cu,lim;
            String sql= "";
            cla=txtControl.getText();
            con=txtConferencia.getText();
            nom=txtNombre.getText();
            cu=txtCuota.getText();
            lim=txtLimite.getText();
    

         
            if("".equals(cla) || "".equals(con) || "".equals(nom)|| "".equals(cu)|| "".equals(lim)){
                JOptionPane.showMessageDialog(null, "Componentes vacios");
                 JOptionPane.showMessageDialog(null, "Inserta tus datos");
            }
            else
            {
                sql="INSERT INTO conferencistas(CLAVE,conferencia,asesor,costo,carga)VALUES(?,?,?,?,?)";

                PreparedStatement ps=rege.prepareStatement(sql);
                ps.setString(1, cla);
                ps.setString(2, con);
                ps.setString(3,nom);
                ps.setString(4,cu);
                ps.setString(5,lim);
                
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null,"Registro Guardado Con Exito");
                verTablaConferencistas("");
                limpiar();
            }}catch (SQLException ex) {
                Logger.getLogger(InsCon.class.getName()).log(Level.SEVERE, null, ex);
            }        // TODO add your handling code here:
    }//GEN-LAST:event_boton2ActionPerformed

    private void boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton3ActionPerformed
 try {
            int file=jTable1.getSelectedRow();
            if (file<0) {
                JOptionPane.showMessageDialog(null, "Seleccione datos para eliminar");

            }
            String valor=jTable1.getValueAt(file,0).toString();
            if (file>=0) {
                int res;
                res=JOptionPane.showConfirmDialog(null, "¿Estas seguro de querer eliminar tus datos?","CONFIRMAR",JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

                PreparedStatement rg=rege.prepareStatement("DELETE FROM  conferencistas WHERE clave ='"+valor+"'");
                rg.executeUpdate();
                JOptionPane.showMessageDialog(null,"Regitro borrado con exito");
                verTablaConferencistas("");
            }
        } catch (Exception e) {
        }       
    }//GEN-LAST:event_boton3ActionPerformed

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
            java.util.logging.Logger.getLogger(InsCon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsCon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsCon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsCon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsCon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ZfOndo;
    private Swings.Boton boton1;
    private Swings.Boton boton2;
    private Swings.Boton boton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable jTable1;
    private javax.swing.JTextField txtConferencia;
    private javax.swing.JTextField txtControl;
    private javax.swing.JTextField txtCuota;
    private javax.swing.JTextField txtLimite;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
