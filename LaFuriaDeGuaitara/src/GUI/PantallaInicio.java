/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PantallaInicio extends VentanaMadre{
    private Boton nuevaPartida = new Boton(295,220, 210,50, "NUEVA PARTIDA", 22);
    private Boton cargarPartida = new Boton(295,280, 210,50, "CARGAR PARTIDA", 22);
    private Boton opciones = new Boton(295,340, 210,50, "OPCIONES", 22);
    private Boton salir = new Boton(295,400, 210,50, "SALIR", 22);
    
    public PantallaInicio(){
      JPanel panelInicio = new JPanel();
      this.add(panelInicio);
      panelInicio.setLayout(null);
      
      JLabel mainTitle1 = new JLabel("LA FURIA DE");
      JLabel mainTitle2 = new JLabel("GUÁITARA");
      mainTitle1.setBounds(200,50,400,75);
      mainTitle2.setBounds(247,120,400,80);
      mainTitle1.setFont(new Font("consolas", Font.BOLD , 65));
      mainTitle2.setFont(new Font("consolas", Font.BOLD , 70));
      nuevaPartida(nuevaPartida);
      cargarPartida(cargarPartida);
      menuInicio(opciones);
      cerrarJuego(salir);
      
      panelInicio.add(nuevaPartida);
      panelInicio.add(cargarPartida);
      panelInicio.add(opciones);
      panelInicio.add(salir);
      panelInicio.add(mainTitle1);
      panelInicio.add(mainTitle2);
    }
    
    public void nuevaPartida(Boton a){
        ActionListener action = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CrearPartida crearPartida = new CrearPartida();
            }
        };
        a.addActionListener(action);
    }
    public void cargarPartida(Boton a){
        ActionListener action = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CargarPartida cargarPartida = new CargarPartida();
            }
        };
        a.addActionListener(action);
    }
    public void menuInicio(Boton a){
        ActionListener action = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MenuInicio menuInicio = new MenuInicio();
                
            }
        };
        a.addActionListener(action);
    }
    public void cerrarJuego(Boton a){
        ActionListener action = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                confirmarSalida();
            }
            public void confirmarSalida(){
                    int valor = JOptionPane.showConfirmDialog(a, "¿Desea Salir?", "SALIR", JOptionPane.YES_NO_OPTION , JOptionPane.WARNING_MESSAGE);
                    if(valor == JOptionPane.YES_OPTION){
                        System.exit(0);
                    }
            }
        };
        a.addActionListener(action);
    }
}
