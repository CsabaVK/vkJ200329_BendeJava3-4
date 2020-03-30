package feladat;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.*;

public class olvasoterem extends javax.swing.JFrame {

    String host = "jdbc:mysql://localhost:3306/javakonyvek";
    String user = "root";
    String pass = "";
    
    public olvasoterem() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblAdatok = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblAdatok.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Azonosító", "Szerző", "Cím", "Kiadás éve", "Darabszám", "Ár", "Kölcsönözhető"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAdatok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAdatokMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAdatok);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 808, 225));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Üdv az olvasóteremben!");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblAdatokMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAdatokMouseClicked
    }//GEN-LAST:event_tblAdatokMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        DefaultTableModel model = (DefaultTableModel) tblAdatok.getModel();
        int sorokszama = model.getRowCount();
        
        for (int i = sorokszama-1; i >= 0; i--) {
            model.removeRow(i);
        }
        try {
            Connection con = DriverManager.getConnection(host,user,pass);
            String sql = "SELECT * FROM javakonyvek WHERE kolcsonozheto LIKE 'Nem'";
            Statement sta = con.createStatement();
            ResultSet rs = sta.executeQuery(sql);
            
            while (rs.next()) {                
                model.addRow(new Object[]{rs.getString("azon"),rs.getString("szerzo"),rs.getString("cim"),
                rs.getInt("kiadasev"),rs.getInt("mennyiseg"),rs.getInt("ar"),rs.getString("kolcsonozheto")});
            }
            sta.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Hiba: "+e);
        }
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(olvasoterem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(olvasoterem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(olvasoterem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(olvasoterem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new olvasoterem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAdatok;
    // End of variables declaration//GEN-END:variables
}
