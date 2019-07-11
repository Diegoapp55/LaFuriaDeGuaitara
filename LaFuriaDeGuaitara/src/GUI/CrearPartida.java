
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        rbtHombre = new javax.swing.JRadioButton();
        rbtMujer = new javax.swing.JRadioButton();
        rbtIndefinido = new javax.swing.JRadioButton();
        btnContinuar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 370));
        setName("Nueva Partida"); // NOI18N

        jPanel1.setMinimumSize(new java.awt.Dimension(500, 370));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 370));

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 25)); // NOI18N
        jLabel1.setText("Crear nueva partida");
        jLabel1.setMinimumSize(new java.awt.Dimension(300, 40));
        jLabel1.setName(""); // NOI18N

        txtNombre.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        txtNombre.setText("nombre");
        txtNombre.setMinimumSize(new java.awt.Dimension(350, 40));
        txtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNombreMouseClicked(evt);
            }
        });

        btnGroup.add(rbtHombre);
        rbtHombre.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        rbtHombre.setText("Hombre");
        rbtHombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtHombreActionPerformed(evt);
            }
        });

        btnGroup.add(rbtMujer);
        rbtMujer.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        rbtMujer.setText("Mujer");

        btnGroup.add(rbtIndefinido);
        rbtIndefinido.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        rbtIndefinido.setText("Indefinido");

        btnContinuar.setFont(new java.awt.Font("Consolas", 0, 25)); // NOI18N
        btnContinuar.setText("continuar");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(19, 19, 19)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(13, 13, 13)
                            .addComponent(rbtHombre)
                            .addGap(35, 35, 35)
                            .addComponent(rbtMujer)
                            .addGap(32, 32, 32)
                            .addComponent(rbtIndefinido)))
                    .addComponent(btnContinuar))
                .addGap(70, 70, 70))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtHombre)
                    .addComponent(rbtMujer)
                    .addComponent(rbtIndefinido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                .addComponent(btnContinuar)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        PantallaJuego nuevaPantalla = new PantallaJuego();
                estado = true;
                System.out.println(estado);
                dispose();
    }//GEN-LAST:event_btnContinuarActionPerformed

    private void txtNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMouseClicked
        txtNombre.setText("");
    }//GEN-LAST:event_txtNombreMouseClicked

    private void rbtHombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtHombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtHombreActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContinuar;
    private javax.swing.ButtonGroup btnGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rbtHombre;
    private javax.swing.JRadioButton rbtIndefinido;
    private javax.swing.JRadioButton rbtMujer;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

}
