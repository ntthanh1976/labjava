/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package giaodien;

/**
 *
 * @author ADMIN
 */
public class MainFrame extends javax.swing.JFrame {

    CategoryManagementPanel p1= null;
    BookManagementPanel p2 = null;
    /** Creates new form MainFrame */
    public MainFrame() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btnTheloai = new javax.swing.JButton();
        btnSach = new javax.swing.JButton();
        mainTab = new javax.swing.JTabbedPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itemLogout = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        itemExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ứng dụng quản lý sách");

        jToolBar1.setRollover(true);

        btnTheloai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/2290855_check_document_done_list_paper_icon.png"))); // NOI18N
        btnTheloai.setText("Thể loại");
        btnTheloai.setFocusable(false);
        btnTheloai.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTheloai.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnTheloai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTheloaiActionPerformed(evt);
            }
        });
        jToolBar1.add(btnTheloai);

        btnSach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/3586373_book_learning_school_icon.png"))); // NOI18N
        btnSach.setText("Sách");
        btnSach.setFocusable(false);
        btnSach.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSach.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSachActionPerformed(evt);
            }
        });
        jToolBar1.add(btnSach);

        jMenu1.setText("Hệ thống");

        itemLogout.setText("Đăng xuất");
        jMenu1.add(itemLogout);
        jMenu1.add(jSeparator1);

        itemExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemExit.setText("Thoát");
        jMenu1.add(itemExit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Danh mục");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/2290855_check_document_done_list_paper_icon.png"))); // NOI18N
        jMenuItem1.setText("Thể loại");
        jMenu2.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/3586373_book_learning_school_icon.png"))); // NOI18N
        jMenuItem2.setText("Sách");
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 908, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainTab)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainTab, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTheloaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTheloaiActionPerformed
        // TODO add your handling code here:
         if(p1==null)
             p1 =new CategoryManagementPanel();
         mainTab.addTab("Quản lý thể loại", p1);
         mainTab.setSelectedComponent(p1);
    }//GEN-LAST:event_btnTheloaiActionPerformed

    private void btnSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSachActionPerformed
        // TODO add your handling code here:
           if(p2==null)
             p2 =new BookManagementPanel();
         mainTab.addTab("Quản lý sách", p2);
         mainTab.setSelectedComponent(p2);
    }//GEN-LAST:event_btnSachActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSach;
    private javax.swing.JButton btnTheloai;
    private javax.swing.JMenuItem itemExit;
    private javax.swing.JMenuItem itemLogout;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTabbedPane mainTab;
    // End of variables declaration//GEN-END:variables

}
