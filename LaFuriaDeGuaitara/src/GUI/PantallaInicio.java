/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import GUIsoundManagement.*;
import javax.swing.*;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PantallaInicio extends JPanel{
    private Boton nuevaPartida = new Boton(295,220, 210,50, "NUEVA PARTIDA", 22);
    private Boton cargarPartida = new Boton(295,280, 210,50, "CARGAR PARTIDA", 22);
    private Boton opciones = new Boton(295,340, 210,50, "OPCIONES", 22);
    private Boton salir = new Boton(295,400, 210,50, "SALIR", 22);
    private Efectos botonSound = new Efectos();
    private Pistas mainTheme = new Pistas();
    
    public PantallaInicio(){
       setLayout(null);
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
       
       add(nuevaPartida);
       add(cargarPartida);
       add(opciones);
       add(salir);
       add(mainTitle1);
       add(mainTitle2);
       
       
    }
    
    public void nuevaPartida(Boton a){
        ActionListener action = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                botonSound.playClickPositivo();
                CrearPartida crearPartida = new CrearPartida();
            }
        };
        a.addActionListener(action);
    }
    public void cargarPartida(Boton a){
        ActionListener action = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                botonSound.playClickPositivo();
                CargarPartida cargarPartida = new CargarPartida();
            }
        };
        a.addActionListener(action);
    }
    public void menuInicio(Boton a){
        ActionListener action = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                botonSound.playAbrirMenu();
                MenuInicio menuInicio = new MenuInicio();
                
            }
        };
        a.addActionListener(action);
    }
    public void cerrarJuego(Boton a){
        ActionListener action = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                botonSound.playSalir();
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

    public Boton getNuevaPartida() {
        return nuevaPartida;
    }

    public void setNuevaPartida(Boton nuevaPartida) {
        this.nuevaPartida = nuevaPartida;
    }

    public Boton getCargarPartida() {
        return cargarPartida;
    }

    public void setCargarPartida(Boton cargarPartida) {
        this.cargarPartida = cargarPartida;
    }

    public Boton getOpciones() {
        return opciones;
    }

    public void setOpciones(Boton opciones) {
        this.opciones = opciones;
    }

    public Boton getSalir() {
        return salir;
    }

    public void setSalir(Boton salir) {
        this.salir = salir;
    }

    public Efectos getBotonSound() {
        return botonSound;
    }

    public void setBotonSound(Efectos botonSound) {
        this.botonSound = botonSound;
    }

    public Pistas getMainTheme() {
        return mainTheme;
    }

    public void setMainTheme(Pistas mainTheme) {
        this.mainTheme = mainTheme;
    }
    
    
}
