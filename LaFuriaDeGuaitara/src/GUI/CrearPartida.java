
package GUI;

import data.*;
import java.awt.Color;
import static java.awt.Color.*;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;


public class CrearPartida extends VentanaSecundaria{
    private Boton continuar =  new Boton(250,270,160,40,"continuar",25);

    public CrearPartida(){
        this.setTitle("Nueva Partida");
        JPanel panel =  new JPanel();
        this.add(panel);
        panel.setLayout(null);
        
        JLabel titulo = new JLabel("Crear nueva partida");
        titulo.setBounds(50,40,300,40);
        titulo.setFont(new Font("consolas", Font.BOLD , 25));
        
        JTextField nombre = new JTextField("nombre");
        nombre.setBounds(40, 100, 350, 30);
        nombre.setFont(new Font("consolas", 0 , 20));
        nombre.setForeground(DARK_GRAY);
        clickText(nombre);
        
        JRadioButton hombre = new JRadioButton("Hombre");
        hombre.setFont(new Font("consolas", 0 ,20));
        hombre.setBounds(50, 150, 120 ,20);
        ImageIcon male = new ImageIcon(new ImageIcon(getClass().getResource("/images/male.png")).getImage().getScaledInstance(60,60, Image.SCALE_SMOOTH));
        JLabel iconMale = new JLabel(male);
        iconMale.setBounds(60,180,60,60);
        
        JRadioButton mujer = new JRadioButton("Mujer");
        mujer.setFont(new Font("consolas", 0 ,20));
        mujer.setBounds(180, 150, 100, 20);
        ImageIcon female = new ImageIcon(new ImageIcon(getClass().getResource("/images/female.png")).getImage().getScaledInstance(60,60, Image.SCALE_SMOOTH));
        JLabel iconFemale = new JLabel(female);
        iconFemale.setBounds(190,180,60,60);
        
        JRadioButton ind = new JRadioButton("Indefinido");
        ind.setFont(new Font("consolas", 0 ,20));
        ind.setBounds(290, 150, 150, 20);
        ImageIcon indef = new ImageIcon(new ImageIcon(getClass().getResource("/images/agender.png")).getImage().getScaledInstance(60,60, Image.SCALE_SMOOTH));
        JLabel iconInd = new JLabel(indef);
        iconInd.setBounds(300,180,60,60);
        
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(hombre);
        grupo.add(mujer);
        grupo.add(ind);
        
        panel.add(titulo);
        panel.add(nombre);
        panel.add(hombre);
        panel.add(mujer);
        panel.add(ind);
        panel.add(iconMale);
        panel.add(iconFemale);
        panel.add(iconInd);
        panel.add(continuar);
        Partida nuevaPartida = new Partida();
        nuevaPartida = crearPartida(continuar,nombre, grupo);
    }
    
    public void clickText(JTextField a){
        MouseListener click = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                a.setText("");
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        };
        a.addMouseListener(click);
    }
    
    public Tutorial mostrarTutorial(){
        return null;
    }
    
    public Partida crearPartida(Boton a, JTextField b, ButtonGroup c){
        Partida nuevaPartida = new Partida();
        Jugador nuevoJugador = new Jugador(null, null, null, null);
        long tiempoTotal = System.currentTimeMillis();
        ActionListener action = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nuevoJugador.setNombre(b.getText());
                nuevoJugador.setGenero(c.getSelection().toString());
                nuevaPartida.setTiempo((System.currentTimeMillis()-tiempoTotal)/1000);
                nuevaPartida.setJugadorActual(nuevoJugador);
            }
        };
        a.addActionListener(action);
        return nuevaPartida;
    }
}
