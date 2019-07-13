/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI2;

import GUIsoundManagement.Efectos;
import GUIsoundManagement.Pistas;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author jdoli
 */
public class Window extends javax.swing.JFrame {
    public static final Pistas TEMA_PRINCIPAL = new Pistas();
    public static final Pistas TEMA_MENU = new Pistas(); //Provisional
    /**
     * Creates new form Window
     */
    public Window() {
        /*temaPrincipal.playMainTheme(); /*Tocaria hacer un panel nuevo 
                                         corriendo el llamado de PanelInicio
                                         a ese nuevo panel para que se ponga
                                         la cancion de inicio aca y al pulsar
                                         ENTER se detenga y llame a PanelInicio*/
        initComponents();
        TEMA_MENU.playMenuTheme(); //Provisional
        setTitle("La Furia de Guáitara");
        setLocationRelativeTo(null);
        setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("/Images/LFDGlogo.png")).getImage());
        cargaInicio();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMain = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jMain.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMain.setMaximumSize(new java.awt.Dimension(6543521, 321321));
        jMain.setMinimumSize(new java.awt.Dimension(800, 600));
        jMain.setPreferredSize(new java.awt.Dimension(800, 600));

        javax.swing.GroupLayout jMainLayout = new javax.swing.GroupLayout(jMain);
        jMain.setLayout(jMainLayout);
        jMainLayout.setHorizontalGroup(
            jMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jMainLayout.setVerticalGroup(
            jMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jMain.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Efectos e1 = new Efectos();
        e1.playSalir();
        
        int value = JOptionPane.showConfirmDialog(this,"¿Desea Salir?", "salir", 
                JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if(value == JOptionPane.YES_OPTION){
            System.exit(0);
        }else if(value == JOptionPane.NO_OPTION){
            setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Window().setVisible(true);
            }
        });
    }

    public void cargaInicio()
    {
        PanelInicio pi = new PanelInicio();
        pi.setSize(jMain.getWidth(), jMain.getHeight());
        pi.setLocation(0,0);
        
        jMain.removeAll();
        jMain.add(pi);
        jMain.revalidate();
        jMain.repaint();
    }
    
    public static JPanel getJpanel()
    {
        return jMain;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel jMain;
    // End of variables declaration//GEN-END:variables

}
