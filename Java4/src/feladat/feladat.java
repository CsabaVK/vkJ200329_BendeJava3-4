
package feladat;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.*;

public class feladat extends javax.swing.JFrame {

    String host = "jdbc:mysql://localhost:3306/javakonyvek";
    String user = "root";
    String pass = "";
    public feladat() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblAdatok = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        tfDB = new javax.swing.JTextField();
        tfAr = new javax.swing.JTextField();
        tfKolcson = new javax.swing.JTextField();
        tfAzon = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfKeszletDb = new javax.swing.JTextField();
        tfKeszletAtlagAr = new javax.swing.JTextField();
        tfLegregebbiK = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 808, 225));

        jLabel1.setText("Darabszám:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 253, -1, -1));

        jLabel2.setText("Ár:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 289, -1, -1));

        jLabel3.setText("Kölcsönözhető:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 325, -1, -1));

        jLabel4.setText("Azonosító:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 355, -1, -1));

        btnUpdate.setText("Frissíteni");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 381, 118, -1));
        getContentPane().add(tfDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 249, 200, -1));
        getContentPane().add(tfAr, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 285, 200, -1));
        getContentPane().add(tfKolcson, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 200, -1));

        tfAzon.setEditable(false);
        getContentPane().add(tfAzon, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 200, -1));

        jLabel5.setText("Az adatok megjeelnítéséhez használja a menüt!");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 253, -1, -1));

        jLabel6.setText("Készlet darabszáma:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 289, -1, -1));

        jLabel7.setText("Készlet átlagos ára:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 325, -1, -1));

        jLabel8.setText("Legrégebbi könyv:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, -1, -1));

        tfKeszletDb.setEditable(false);
        getContentPane().add(tfKeszletDb, new org.netbeans.lib.awtextra.AbsoluteConstraints(561, 285, 160, -1));

        tfKeszletAtlagAr.setEditable(false);
        getContentPane().add(tfKeszletAtlagAr, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 320, 160, -1));

        tfLegregebbiK.setEditable(false);
        getContentPane().add(tfLegregebbiK, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 360, 160, -1));

        jMenu1.setText("Fájl");

        jMenuItem1.setText("Kilépés");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Adatkezelés");

        jMenuItem2.setText("Lista frissítése");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Darabszám");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Átlagos ár");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Legrégebbi könyv");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setText("Olvasótermi könyvek");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblAdatok.getModel();
        int sorokszama = model.getRowCount();
        
        for (int i = sorokszama-1; i >= 0; i--) {
            model.removeRow(i);
        }
        try {
            Connection con = DriverManager.getConnection(host,user,pass);
            String sql = "SELECT * FROM javakonyvek";
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
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void tblAdatokMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAdatokMouseClicked
        int sor = tblAdatok.getSelectedRow();
        
        tfAr.setText(tblAdatok.getModel().getValueAt(sor, 5).toString());
        tfAzon.setText(tblAdatok.getModel().getValueAt(sor, 0).toString());
        tfDB.setText(tblAdatok.getModel().getValueAt(sor, 4).toString());
        tfKolcson.setText(tblAdatok.getModel().getValueAt(sor, 6).toString());
    }//GEN-LAST:event_tblAdatokMouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try {
            Connection con = DriverManager.getConnection(host,user,pass);
            String sql = "UPDATE javakonyvek SET mennyiseg=" + tfDB.getText()+","
                    +"ar = "+tfAr.getText()+","
                    +"kolcsonozheto = '" + tfKolcson.getText() + "' "
                    + "WHERE azon = '" + tfAzon.getText() + "' ";
            Statement sta = con.createStatement();
            sta.executeUpdate(sql);
            sta.close();
            con.close();
            JOptionPane.showMessageDialog(null, "Frissítse a táblát!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Hiba: "+e);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        try {
            Connection con = DriverManager.getConnection(host,user,pass);
            String sql = "SELECT sum(mennyiseg) as osszeg FROM javakonyvek";
            Statement sta = con.createStatement();
            ResultSet rs = sta.executeQuery(sql);
            rs.next();
            tfKeszletDb.setText(rs.getString("osszeg"));
            sta.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Hiba: "+e);
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        try {
            Connection con = DriverManager.getConnection(host,user,pass);
            String sql = "SELECT avg(ar) as atlag FROM javakonyvek";
            Statement sta = con.createStatement();
            ResultSet rs = sta.executeQuery(sql);
            rs.next();
            tfKeszletAtlagAr.setText(rs.getString("atlag"));
            sta.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Hiba: "+e);
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        try {
            Connection con = DriverManager.getConnection(host,user,pass);
            String sql = "SELECT cim FROM javakonyvek "
                    +"ORDER BY kiadasev "+
                    "LIMIT 1";
            Statement sta = con.createStatement();
            ResultSet rs = sta.executeQuery(sql);
            rs.next();
            tfLegregebbiK.setText(rs.getString("cim"));
            sta.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Hiba: "+e);
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        olvasoterem ot = new olvasoterem();
        ot.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(feladat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(feladat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(feladat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(feladat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new feladat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAdatok;
    private javax.swing.JTextField tfAr;
    private javax.swing.JTextField tfAzon;
    private javax.swing.JTextField tfDB;
    private javax.swing.JTextField tfKeszletAtlagAr;
    private javax.swing.JTextField tfKeszletDb;
    private javax.swing.JTextField tfKolcson;
    private javax.swing.JTextField tfLegregebbiK;
    // End of variables declaration//GEN-END:variables
}
