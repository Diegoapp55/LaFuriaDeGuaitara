/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI2;

import static GUI2.Window.jMain;
import GUIsoundManagement.Efectos;
import data.Archivo;
import data.Fuente;
import data.Partida;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class PanelCargarPartida extends javax.swing.JPanel implements Serializable{

    public static ArrayList<Partida> partidasCargaList1;
    private DefaultTableModel modelo; 
    Fuente tipo = new Fuente();
    
    public PanelCargarPartida() {
        
        initComponents();
        mostrar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCarga = new javax.swing.JTable();
        btnCargar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblCarga.setFont(tipo.fuente(tipo.PressStart, 0, 11)
        );
        tblCarga.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblCarga);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 400, 190));

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

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        try {
            int posicion = 0;
        
            Partida partIn = new Partida();
            posicion = tblCarga.getSelectedRow();
            partIn = partidasCargaList1.get(posicion);
        
            cargaJuego(partIn);
        } catch (Exception e) {
            System.out.println("Fallo al cargar");
        }
        
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
    private javax.swing.JTable tblCarga;
    // End of variables declaration//GEN-END:variables

    public void cargaJuego(Partida in)
    {
        JPanel pi = in.getPanelActual();
        pi.setSize(jMain.getWidth(), jMain.getHeight());
        pi.setLocation(0,0);
        
        Window.getJpanel().removeAll();
        Window.getJpanel().add(pi);
        Window.getJpanel().revalidate();
        Window.getJpanel().repaint();
        
        pi.setVisible(true);
    }
    
    private void mostrar()
    {
        //partidasCargaList1 = Archivo.getInputPartidas();
        //partidasCargaList2 = Archivo.getInputPartidas();
        //partidasCargaList3 = Archivo.getInputPartidas();
        
        String[] titulos = {"Nombre de Partida"};
        String[] registro = new String[1];
        
        modelo = new DefaultTableModel(null, titulos);
        
        System.out.println(Window.partidaList);
        System.out.println(partidasCargaList1);
        System.out.println(Archivo.inputPartidas);
        System.out.println(Archivo.getInputPartidas());
        System.out.println(Archivo.leer());
        
            for(Partida f: Window.partidaList){
                registro[0] = f.getJugadorActual().getNombre();
                //Se añade al modelo
                modelo.addRow(registro);
                }
            tblCarga.setModel(modelo);
        }
    
    /*private void cargarDatos()
    {
        String[] titulos = {"Nombre","Género"};
        String[] registro = new String[2];
        
        modelo = new DefaultTableModel(null, titulos);
        
       System.out.println("size " + Window.partidaList.size());
            for(Partida p: Window.partidaList){
                //System.out.println("size " + Window.partidaList.size());
                registro[0] = p.getJugadorActual().getNombre();
                registro[1] = p.getJugadorActual().getGenero();
                /*Se añade al modelo
                modelo.addRow(registro);
                } 
            tblCarga.setModel(modelo);
        }*/
    }
