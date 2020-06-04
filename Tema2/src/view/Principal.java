package view;


import Controll.juego;
import Controll.Ventana;
import Controll.Empleado;
import Controll.BancoGUIPOO;
import javax.swing.JFrame;


public class Principal extends javax.swing.JFrame {

   
    public Principal() 
    {
        initComponents();
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        MenuCrearCuenta = new javax.swing.JMenuItem();
        MenuSaludo = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        menuJuego = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal");
        setLocation(new java.awt.Point(400, 10));
        setMinimumSize(new java.awt.Dimension(400, 550));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Programa Principal ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(98, 11, 178, 22);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TallerTema2/Logo-de-Java-portada.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setMaximumSize(new java.awt.Dimension(400, 400));
        jLabel2.setMinimumSize(new java.awt.Dimension(400, 400));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 140, 270, 280);

        jLabel3.setText("CREADOR: DIEGO ALEJANDRO ZAPATA BETANCUR");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 440, 330, 20);

        jLabel4.setText("Presiona clic en programas y elige el que quieras ver");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 90, 310, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("BIENVENIDO");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(130, 60, 130, 22);

        jMenu1.setText("Archivo");

        jMenu3.setText("Nuevo");

        jMenuItem10.setText("Archivo");
        jMenu3.add(jMenuItem10);

        jMenuItem11.setText("Proyecto");
        jMenu3.add(jMenuItem11);

        jMenu1.add(jMenu3);
        jMenu1.add(jSeparator1);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setText("Abrir...");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Guardar como...");
        jMenu1.add(jMenuItem2);
        jMenu1.add(jSeparator2);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem4.setText("Salir");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Editar");

        jMenuItem3.setText("Deshacer");
        jMenu2.add(jMenuItem3);

        jMenuItem6.setText("Rehacer");
        jMenu2.add(jMenuItem6);
        jMenu2.add(jSeparator3);

        jMenuItem8.setText("Copiar");
        jMenu2.add(jMenuItem8);

        jMenuItem7.setText("Cortar");
        jMenu2.add(jMenuItem7);

        jMenuItem9.setText("Pegar");
        jMenu2.add(jMenuItem9);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Programas");

        jMenu5.setText("COMPAÑIA");

        MenuCrearCuenta.setText("BANCO");
        MenuCrearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCrearCuentaActionPerformed(evt);
            }
        });
        jMenu5.add(MenuCrearCuenta);

        jMenu4.add(jMenu5);

        MenuSaludo.setText("BASICO");
        MenuSaludo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSaludoActionPerformed(evt);
            }
        });
        jMenu4.add(MenuSaludo);

        jMenuItem5.setText("NOMINA");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem5);

        menuJuego.setText("JUEGO");
        menuJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuJuegoActionPerformed(evt);
            }
        });
        jMenu4.add(menuJuego);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuSaludoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSaludoActionPerformed

        Ventana objV = new Ventana();   //para activar la ventana de Saludo
        objV.setVisible(true);
     
    }//GEN-LAST:event_MenuSaludoActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        System.exit(0);   //Para cerrar toda la apliacion
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
       Empleado objSalario=new Empleado();   //para activar la ventana de Salario
       objSalario.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void menuJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuJuegoActionPerformed
        // TODO add your handling code here:
        juego objJ = new juego();  //para activar la ventana de Juego
        objJ.setVisible(true);
        
    }//GEN-LAST:event_menuJuegoActionPerformed

    private void MenuCrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCrearCuentaActionPerformed
        // TODO add your handling code here:
        BancoGUIPOO objBP = new BancoGUIPOO ();
        objBP.setVisible(true);

    }//GEN-LAST:event_MenuCrearCuentaActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new Principal().setVisible(true);
                
            }
            
           
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuCrearCuenta;
    private javax.swing.JMenuItem MenuSaludo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JMenuItem menuJuego;
    // End of variables declaration//GEN-END:variables
}
