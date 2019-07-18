/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI2;

import GUIsoundManagement.Efectos;
import data.Fuente;
import java.io.Serializable;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author HP
 */
public class PanelScore extends javax.swing.JPanel implements Serializable{
    Icon img = new ImageIcon(getClass().getResource("/Images/" + 
        PanelCrearPartida.jugador.getGenero() + "Head.png"));
    Fuente tipo = new Fuente();
   
    long tiempo = PanelCrearPartida.jugador.getTiempo();
    String tiempoTotal = tiempo + "s";
    
    /**
     * Creates new form PanelScore
     */
    public PanelScore() {
        initComponents();
        /*ImageIcon crono = new ImageIcon(this.getClass().getResource("/Images/clock.png"));
        crono = new ImageIcon(crono.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH));
        JLabel cronometro = new JLabel(crono);
        cronometro.setLocation(150,430);
        add(cronometro);*/
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnContinuar = new javax.swing.JButton();
        lbPlayerFace = new javax.swing.JLabel();
        lbPartidaActual = new javax.swing.JLabel();
        lblCronometer = new javax.swing.JLabel();
        lblTiempo = new javax.swing.JLabel();
        lblEncabezadoBonus = new javax.swing.JLabel();
        lblRubi = new javax.swing.JLabel();
        lblEsmeralda = new javax.swing.JLabel();
        lblTopaz = new javax.swing.JLabel();
        lblSafiro = new javax.swing.JLabel();
        desmotivacionesCom = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(800, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnContinuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btcontinuarr.png"))); // NOI18N
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });
        add(btnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 480, 150, 40));

        lbPlayerFace.setIcon(img);
        add(lbPlayerFace, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, -1, -1));

        lbPartidaActual.setFont(tipo.fuente(tipo.PressStart, 0, 25));
        lbPartidaActual.setForeground(new java.awt.Color(255, 204, 0));
        lbPartidaActual.setText(PanelCrearPartida.partida.getJugadorActual().getNombre());
        lbPartidaActual.setToolTipText("");
        add(lbPartidaActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, 290, 50));

        lblCronometer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/clock.png"))); // NOI18N
        lblCronometer.setToolTipText("");
        add(lblCronometer, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 100, 100));

        lblTiempo.setFont(tipo.fuente(tipo.PressStart, 0, 35));
        lblTiempo.setForeground(new java.awt.Color(255, 204, 0));
        lblTiempo.setText(tiempoTotal);
        add(lblTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 250, 180, 80));

        lblEncabezadoBonus.setFont(tipo.fuente(tipo.PressStart, 0, 35));
        lblEncabezadoBonus.setForeground(new java.awt.Color(255, 204, 0));
        lblEncabezadoBonus.setText("Bonus:");
        add(lblEncabezadoBonus, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, -1, 60));

        lblRubi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/objetos/ruby.png"))); // NOI18N
        lblRubi.setEnabled(false);
        add(lblRubi, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 410, -1, -1));

        lblEsmeralda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/objetos/emerald.png"))); // NOI18N
        lblEsmeralda.setEnabled(false);
        add(lblEsmeralda, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 410, -1, -1));

        lblTopaz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/objetos/topaz.png"))); // NOI18N
        lblTopaz.setEnabled(false);
        add(lblTopaz, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 410, -1, -1));

        lblSafiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/objetos/sap.png"))); // NOI18N
        lblSafiro.setEnabled(false);
        add(lblSafiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 410, -1, -1));

        desmotivacionesCom.setFont(tipo.fuente(tipo.PressStart, 1, 11)
        );
        desmotivacionesCom.setForeground(new java.awt.Color(255, 204, 0));
        desmotivacionesCom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        desmotivacionesCom.setText(getItemsRecogidos());
        desmotivacionesCom.setToolTipText("");
        add(desmotivacionesCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 490, 300, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Puntaje.png"))); // NOI18N
        add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));
    }// </editor-fold>//GEN-END:initComponents

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        // TODO add your handling code here:
        Window.TEMA_JUEGO.stop();
        Efectos fx = new Efectos();
        fx.playClickPositivo();
        cargarInicio();
    }//GEN-LAST:event_btnContinuarActionPerformed

    public void cargarInicio(){
        PanelInicio pj = new PanelInicio();
        pj.setSize(Window.getJpanel().getWidth(), Window.getJpanel().getHeight());
        pj.setLocation(0,0);
        
        Window.getJpanel().removeAll();
        Window.getJpanel().add(pj);
        Window.getJpanel().revalidate();
        Window.getJpanel().repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContinuar;
    private javax.swing.JLabel desmotivacionesCom;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel lbPartidaActual;
    private javax.swing.JLabel lbPlayerFace;
    private javax.swing.JLabel lblCronometer;
    private javax.swing.JLabel lblEncabezadoBonus;
    private javax.swing.JLabel lblEsmeralda;
    private javax.swing.JLabel lblRubi;
    private javax.swing.JLabel lblSafiro;
    private javax.swing.JLabel lblTiempo;
    private javax.swing.JLabel lblTopaz;
    // End of variables declaration//GEN-END:variables

    private String getItemsRecogidos() {
        String frase = "";
        int cont = 0;
        
        if(PanelIglesia.rubi.isRecogido()){
            lblRubi.setEnabled(true);
            cont += 1;
        }
        if(PanelPasillo.safiro.isRecogido()){
            lblSafiro.setEnabled(true);
            cont += 1;
        }
        if(PanelWin.topaz.isRecogido()){
        lblTopaz.setEnabled(true);
            cont += 1;
        }
        if(PanelWin.esmeralda.isRecogido()){
        lblEsmeralda.setEnabled(true);
            cont += 1;
        }
        
        switch(cont){
            case 1:
                frase = "¿Viniste a Clase?";
                break;
            case 2:
                frase = "No Está Mal";
                break;
            case 3:
                frase = "Olvidaste Algo...";
                break;
            case 4:
                frase = "¡Maestro en POO!";
                break;
            case 0:
                frase = "";
                break;
        }
        System.out.println(cont);
        return frase;
    }
}
