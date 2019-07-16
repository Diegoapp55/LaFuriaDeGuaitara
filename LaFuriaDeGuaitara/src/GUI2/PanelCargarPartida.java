/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI2;

import GUI.PantallaJuego;
import GUIsoundManagement.Efectos;
import data.Jugador;
import data.Mapa;
import data.Partida;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class PanelCargarPartida extends javax.swing.JPanel {
    private String fichero = ".\\src\\savedFiles\\Saved.obj";

    public PanelCargarPartida() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listaPartidas = new Lista();
        btnCargar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        listaPartidas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 4));
        listaPartidas.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        listaPartidas.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaPartidasValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listaPartidas);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 360, 205));

        btnCargar.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        btnCargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btCargar.png"))); // NOI18N
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });
        add(btnCargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 410, 150, 40));

        btnVolver.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btMenuVolver.png"))); // NOI18N
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 150, 40));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BackCargarPartida.png"))); // NOI18N
        add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));
    }// </editor-fold>//GEN-END:initComponents

    private void listaPartidasValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaPartidasValueChanged

    }//GEN-LAST:event_listaPartidasValueChanged

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        int s = listaPartidas.getSelectedIndex();
        ArrayList<Partida> partidasRecargadas = new ArrayList<>();
        this.cargarPartida(btnCargar, partidasRecargadas.get(s));
    }//GEN-LAST:event_btnCargarActionPerformed

    private Partida listaPartidaActionPerformed(java.awt.event.ActionEvent evt) {
        Partida seleccionada = new Partida();
        Efectos e1 = new Efectos();
        e1.playClickPositivo();
        return seleccionada;
    }
    
    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        Efectos e1 = new Efectos();
        e1.playClickCerrar();
        Window.TEMA_MENU.stop();
        cargaPantallaInicio();
    }//GEN-LAST:event_btnVolverActionPerformed

    public Partida cargarPartida(JButton a, Partida carga){
        Partida cargaPartida = new Partida();
        //Jugador cargaJugador = new Jugador(null, null, null, null);
        Mapa carganuevoMapa = new Mapa(null,null,null);  
        long tiempoTotal = System.currentTimeMillis();

        ActionListener action = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /*cargaJugador.setNombre(b.getText());
                cargaJugador.setGenero(c.getSelection().toString());
                cargaPartida.setTiempo((System.currentTimeMillis()-tiempoTotal)/1000);
                cargaPartida.setJugadorActual(nuevoJugador);
                PantallaJuego cargaPantalla = new PantallaJuego();
                estado = true;
                System.out.println(estado);
                //CAMBIO DE PANEL
                */
            }
        };
        a.addActionListener(action);
        return cargaPartida;
    }
    
    public void cargaPantallaInicio()
    {
        PanelInicio pcp = new PanelInicio();
        pcp.setSize(Window.getJpanel().getWidth(), Window.getJpanel().getHeight());
        pcp.setLocation(0,0);
        
        Window.getJpanel().removeAll();
        Window.getJpanel().add(pcp);
        Window.getJpanel().revalidate();
        Window.getJpanel().repaint();

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listaPartidas;
    // End of variables declaration//GEN-END:variables

    private static class Lista extends JList<String> {

        public Lista() {
        }
    }
}
