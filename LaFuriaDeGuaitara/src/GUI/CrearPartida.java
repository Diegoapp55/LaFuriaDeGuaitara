
package GUI;

import data.*;
import java.awt.*;
import static java.awt.Color.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;


public class CrearPartida extends VentanaSecundaria{
    private Boton continuar =  new Boton(250,270,160,40,"continuar",25);
    public static boolean estado = false;
    private ButtonGroup grupo = new ButtonGroup();
    
    public CrearPartida(){
        System.out.println(estado);
        this.setTitle("Nueva Partida");
        JPanel panel =  new JPanel();
        this.add(panel);
        panel.setLayout(null);
        
        JLabel titulo = new JLabel("Crear nueva partida");
        titulo.setBounds(50,40,300,40);
        titulo.setFont(new Font("consolas", Font.BOLD , 25));
        
        JTextField nombre = new JTextField("Tu nombre aquí");
        nombre.setBounds(40, 100, 350, 30);
        nombre.setFont(new Font("consolas", 0 , 20));
        nombre.setForeground(DARK_GRAY);
        nombre.addMouseListener(new MouseAdapter()
                {
                    public void clicMouse(MouseEvent e)
                    {
                        nombre.setText("");
                    }
                });
        clickText(nombre);
        
        JRadioButton hombre = new JRadioButton("Hombre");
        hombre.setFont(new Font("consolas", 0 ,20));
        hombre.setBounds(50, 150, 120 ,20);
        hombre.setActionCommand("Hombre");
        ImageIcon male = new ImageIcon(new ImageIcon(getClass().getResource("/images/male.png")).getImage().getScaledInstance(60,60, Image.SCALE_SMOOTH));
        JLabel iconMale = new JLabel(male);
        iconMale.setBounds(60,180,60,60);
        
        JRadioButton mujer = new JRadioButton("Mujer");
        mujer.setFont(new Font("consolas", 0 ,20));
        mujer.setBounds(180, 150, 100, 20);
        mujer.setActionCommand("Mujer");
        ImageIcon female = new ImageIcon(new ImageIcon(getClass().getResource("/images/female.png")).getImage().getScaledInstance(60,60, Image.SCALE_SMOOTH));
        JLabel iconFemale = new JLabel(female);
        iconFemale.setBounds(190,180,60,60);
        
        JRadioButton ind = new JRadioButton("Otro");
        ind.setFont(new Font("consolas", 0 ,20));
        ind.setBounds(290, 150, 150, 20);
        ind.setActionCommand("Otro");
        ImageIcon indef = new ImageIcon(new ImageIcon(getClass().getResource("/images/agender.png")).getImage().getScaledInstance(60,60, Image.SCALE_SMOOTH));
        JLabel iconInd = new JLabel(indef);
        iconInd.setBounds(300,180,60,60);
        

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
        nuevaPartida = crearPartida(continuar, nombre, grupo);
    }
    
    public String actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Check")) {
            return grupo.getSelection().getActionCommand();
        }
        return grupo.getSelection().getActionCommand();
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
        Mapa nuevoMapa = new Mapa(null,null,null);  
        long tiempoTotal = System.currentTimeMillis();
        ActionListener action = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /*Guarda los datos de la partida actual en la nueva partida*/
                
                nuevoJugador.setNombre(b.getText());
                nuevoJugador.setGenero(c.getSelection().getActionCommand());
                nuevaPartida.setTiempo((System.currentTimeMillis()-tiempoTotal)/1000);
                nuevaPartida.setJugadorActual(nuevoJugador);
                
                /*especifica una ruta única para cada partida creada
                es decir, cada nueva partida genera un archivo .obj*/
                String ruta = ".\\src\\savedFiles\\" + nuevoJugador.getNombre() + nuevoJugador.getGenero() + ".obj";
                Archivo guardaArchivo = new Archivo();
                guardaArchivo.escribeFichero(ruta, nuevaPartida);
                
                PantallaJuego nuevaPantalla = new PantallaJuego();
                estado = true;
                System.out.println(estado);
                dispose();
            }
        };
        a.addActionListener(action);
        return nuevaPartida;
    }
    
}
