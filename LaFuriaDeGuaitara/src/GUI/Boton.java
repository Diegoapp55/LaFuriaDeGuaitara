
package GUI;
import java.awt.Font;
import javax.swing.JButton;

public class Boton extends JButton{
    public Boton(int a, int b, int c, int d, String e, int f){
        setBounds(a,b,c,d);
        setText(e);
        setFont(new Font("consolas", Font.BOLD , f));
    }
}
