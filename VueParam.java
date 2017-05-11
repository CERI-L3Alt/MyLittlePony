package classe;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSeparator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.event.*;
import javax.swing.JTextField;

public class VueParam extends JFrame implements ActionListener {
	
	public VueParam()
	{
		// Création du contenue //
		Font f2 = new Font("Times", Font.PLAIN, 18);
		
		JPanel panel = new JPanel();
        panel.setBackground(new Color(255,228,196));
        
        // layout manager //
        panel.setLayout(new GridBagLayout());
        
        GridBagConstraints cel = new GridBagConstraints();
        
        // Insertion d'un saut de ligne //
        JLabel space = new JLabel("");
        space.setPreferredSize(new Dimension(200,600));
        cel.fill = GridBagConstraints.HORIZONTAL; 
        //cel.weightx = 0.5;
        cel.gridx = 1;
        cel.gridy = 0;
        panel.add(space, cel);
        
        // TITRE //
        JLabel lbNomTama = new JLabel("Nom Tamagotchi : ");
        lbNomTama.setFont(f2);
        
        lbNomTama.setPreferredSize(new Dimension(100,100));
        cel.fill = GridBagConstraints.HORIZONTAL; 
        //cel.weightx = 0.5;
        cel.gridx = 2;
        cel.gridy = 0;
        cel.gridwidth = GridBagConstraints.REMAINDER; // fin de ligne
        panel.add(lbNomTama, cel);
        
        JTextField jtfNomTama = new JTextField();
        jtfNomTama.setPreferredSize(new Dimension(50,100));
        cel.fill = GridBagConstraints.HORIZONTAL; 
        //cel.weightx = 0.5;
        cel.gridx = 2;
        cel.gridy = 1;
        cel.gridwidth = GridBagConstraints.REMAINDER; // fin de ligne
		panel.add(jtfNomTama, cel);
		
		
		// Construction de la vue //
		constructVue(panel);
	}
	
	public void constructVue(JPanel p)
	{
        setTitle("Information Tamagotchi");
        getContentPane().add(p);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // a modif si on veut arrette l'application d'ici
        setSize(400,600);
        setLocationRelativeTo(null);
        setAlwaysOnTop(false);
        setResizable(false);
        //add(new Tamagotchi(String _nomTama, Image _avatar, int _sante, int _faim, int _hygienne, int _joie, int _tempVie));
        setVisible(true);
	}
	
    public static void main(String[] args)
    {
        Vue vueJeux = new Vue();
    }
}
