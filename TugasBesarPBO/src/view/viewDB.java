package view;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rog
 */
public class viewDB extends javax.swing.JFrame {

    /**
     * Creates new form Mahasiswa
     */
    
    public viewDB() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        menuProfile = new javax.swing.JButton();
        menuRencanaStudi = new javax.swing.JButton();
        menuTranskripNilai = new javax.swing.JButton();
        menuKeuangan = new javax.swing.JButton();
        menuJadwalAbsen = new javax.swing.JButton();
        contohTampilanMenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(67, 50, 103));

        menuProfile.setBackground(new java.awt.Color(67, 50, 103));
        menuProfile.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menuProfile.setForeground(new java.awt.Color(255, 255, 255));
        menuProfile.setText("Profile");
        menuProfile.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 12, 0, 0, new java.awt.Color(255, 255, 255)));
        menuProfile.setContentAreaFilled(false);
        menuProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuProfileMouseClicked(evt);
            }
        });
        menuProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuProfileActionPerformed(evt);
            }
        });

        menuRencanaStudi.setBackground(new java.awt.Color(67, 50, 103));
        menuRencanaStudi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menuRencanaStudi.setForeground(new java.awt.Color(153, 153, 153));
        menuRencanaStudi.setText("Rencana Studi");
        menuRencanaStudi.setBorderPainted(false);
        menuRencanaStudi.setContentAreaFilled(false);
        menuRencanaStudi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuRencanaStudiMouseClicked(evt);
            }
        });
        menuRencanaStudi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRencanaStudiActionPerformed(evt);
            }
        });

        menuTranskripNilai.setBackground(new java.awt.Color(67, 50, 103));
        menuTranskripNilai.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menuTranskripNilai.setForeground(new java.awt.Color(153, 153, 153));
        menuTranskripNilai.setText("Transkrip Nilai");
        menuTranskripNilai.setBorderPainted(false);
        menuTranskripNilai.setContentAreaFilled(false);
        menuTranskripNilai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTranskripNilaiActionPerformed(evt);
            }
        });

        menuKeuangan.setBackground(new java.awt.Color(67, 50, 103));
        menuKeuangan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menuKeuangan.setForeground(new java.awt.Color(153, 153, 153));
        menuKeuangan.setText("Keuangan");
        menuKeuangan.setBorderPainted(false);
        menuKeuangan.setContentAreaFilled(false);
        menuKeuangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuKeuanganActionPerformed(evt);
            }
        });

        menuJadwalAbsen.setBackground(new java.awt.Color(67, 50, 103));
        menuJadwalAbsen.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menuJadwalAbsen.setForeground(new java.awt.Color(153, 153, 153));
        menuJadwalAbsen.setText("Jadwal & Absensi");
        menuJadwalAbsen.setBorderPainted(false);
        menuJadwalAbsen.setContentAreaFilled(false);
        menuJadwalAbsen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuJadwalAbsenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(menuRencanaStudi, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
            .addComponent(menuTranskripNilai, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
            .addComponent(menuJadwalAbsen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(menuKeuangan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(menuProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(menuRencanaStudi, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(menuTranskripNilai, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(menuKeuangan, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(menuJadwalAbsen, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(153, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout contohTampilanMenuLayout = new javax.swing.GroupLayout(contohTampilanMenu);
        contohTampilanMenu.setLayout(contohTampilanMenuLayout);
        contohTampilanMenuLayout.setHorizontalGroup(
            contohTampilanMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contohTampilanMenuLayout.createSequentialGroup()
                .addContainerGap(110, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );
        contohTampilanMenuLayout.setVerticalGroup(
            contohTampilanMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contohTampilanMenuLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140)
                .addComponent(contohTampilanMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 227, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(contohTampilanMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void menuProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuProfileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuProfileActionPerformed

    private void menuRencanaStudiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRencanaStudiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuRencanaStudiActionPerformed

    private void menuTranskripNilaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTranskripNilaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuTranskripNilaiActionPerformed

    private void menuKeuanganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuKeuanganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuKeuanganActionPerformed

    private void menuJadwalAbsenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuJadwalAbsenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuJadwalAbsenActionPerformed

    private void menuRencanaStudiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuRencanaStudiMouseClicked
        // TODO add your handling code here:
        menuProfile.setBorderPainted(false);
        menuRencanaStudi.setBorderPainted(true);
        menuRencanaStudi.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 12, 0, 0, new java.awt.Color(255, 255, 255)));
        menuRencanaStudi.setForeground(new java.awt.Color(255, 255, 255));
        menuProfile.setForeground(new java.awt.Color(153, 153, 153));
        contohTampilanMenu.setVisible(false);
    }//GEN-LAST:event_menuRencanaStudiMouseClicked

    private void menuProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuProfileMouseClicked
        // TODO add your handling code here:
        menuProfile.setBorderPainted(true);
        menuRencanaStudi.setBorderPainted(false);
        menuTranskripNilai.setBorderPainted(false);
        menuKeuangan.setBorderPainted(false);
        menuJadwalAbsen.setBorderPainted(false);
        
        menuProfile.setForeground(new java.awt.Color(255, 255, 255));
        menuRencanaStudi.setForeground(new java.awt.Color(153, 153, 153));
        menuTranskripNilai.setForeground(new java.awt.Color(153, 153, 153));
        menuKeuangan.setForeground(new java.awt.Color(153, 153, 153));
        menuJadwalAbsen.setBorderPainted(false);
        contohTampilanMenu.setVisible(true);
     
    }//GEN-LAST:event_menuProfileMouseClicked

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
            java.util.logging.Logger.getLogger(viewDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewDB().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contohTampilanMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton menuJadwalAbsen;
    private javax.swing.JButton menuKeuangan;
    private javax.swing.JButton menuProfile;
    private javax.swing.JButton menuRencanaStudi;
    private javax.swing.JButton menuTranskripNilai;
    // End of variables declaration//GEN-END:variables
}