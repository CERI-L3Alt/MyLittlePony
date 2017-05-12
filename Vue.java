package classe;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;

import java.awt.Image;
import java.awt.event.*;

public class Vue extends JFrame implements ActionListener{
	
	public Vue()
	{
		constructVue();
	}
	
	public void constructVue()
	{
        setTitle("Tamago");
    	
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // a modif si on veut arrette l'application d'ici
        setSize(800,600);
        setLocationRelativeTo(null);
        setAlwaysOnTop(false);
        setResizable(false);
        //add(new Tamagotchi(String _nomTama, Image _avatar, int _sante, int _faim, int _hygienne, int _joie, int _tempVie));
        setVisible(true);
	}
	
    public void actionPerformed(ActionEvent e)
    {
    }
	
    public static void main(String[] args)
    {
        Vue vueJeux = new Vue();
    }
}
