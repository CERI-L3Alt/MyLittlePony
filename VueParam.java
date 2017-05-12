package classe;
import javax.swing.JButton;
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
import java.awt.Insets;
import java.awt.event.*;
import java.io.File;
import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;

import javax.swing.JTextField;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class VueParam extends JFrame implements ActionListener {
	
	public JTextField jtfNomTama;
	public Image img ;
	
	public VueParam()
	{
		// Création du contenue //
		Font f2 = new Font("Times", Font.PLAIN, 18);
		
		JPanel panel = new JPanel();
        panel.setBackground(new Color(255,228,196));
        
        // layout manager //
        panel.setLayout(new GridBagLayout());
        
        GridBagConstraints cel = new GridBagConstraints();
        
        // Nom TAMA //
        JLabel lbNomTama = new JLabel("Nom Tamagotchi : ");
        lbNomTama.setFont(f2);
        
        lbNomTama.setPreferredSize(new Dimension(100,100));
        cel.fill = GridBagConstraints.HORIZONTAL; 
        cel.weightx = 0;
        cel.gridx = 0;
        cel.gridy = 0;
        panel.add(lbNomTama, cel);
        
        jtfNomTama = new JTextField();
        jtfNomTama.setPreferredSize(new Dimension(100,100));
        cel.fill = GridBagConstraints.HORIZONTAL;
        cel.ipady = 20;
        cel.weightx = 1.5;
        cel.gridx = 1;
        cel.gridy = 0;
        cel.gridwidth = GridBagConstraints.REMAINDER; // fin de ligne
		panel.add(jtfNomTama, cel);
		
        // Insertion d'un saut de ligne //
        JLabel space = new JLabel("");
        space.setPreferredSize(new Dimension(200,600));
        cel.fill = GridBagConstraints.HORIZONTAL; 
        //cel.weightx = 0.5;
        cel.gridx = 1;
        cel.gridy = 1;
        cel.gridwidth = GridBagConstraints.REMAINDER; // fin de ligne
        panel.add(space, cel);
		
		// AVATAR //
        JLabel lbAvatar = new JLabel("Avatar : ");
        lbAvatar.setFont(f2);
        
        lbAvatar.setPreferredSize(new Dimension(100,100));
        cel.fill = GridBagConstraints.HORIZONTAL; 
        cel.weightx = 0;
        cel.gridx = 0;
        cel.gridy = 2;
        cel.gridwidth = GridBagConstraints.REMAINDER; // fin de ligne
        panel.add(lbAvatar, cel);
        
        // Les images //
        JLabel lbAvatar1 = new JLabel();
        
        lbAvatar1.setFont(f2);
        
        lbAvatar1.setPreferredSize(new Dimension(100,100));
        cel.fill = GridBagConstraints.HORIZONTAL; 
        cel.weightx = 0;
        cel.gridx = 0;
        cel.gridy = 3;
        panel.add(lbAvatar1, cel);
        
        ImageIcon avatar2 = new ImageIcon("./Ressources/avatar1.jpg");
        Image im = avatar2.getImage();
        im.getScaledInstance(10, 10, Image.SCALE_DEFAULT);
        
        JLabel lbAvatar2= new JLabel();
        lbAvatar2.setFont(f2);
        
        lbAvatar2.setPreferredSize(new Dimension(100,100));
        //lbAvatar2.setIcon(avatar2);
        cel.fill = GridBagConstraints.HORIZONTAL; 
        cel.weightx = 0;
        cel.gridx = 10;
        cel.gridy = 3;
        panel.add(lbAvatar2, cel);
        
        JLabel lbAvatar3 = new JLabel();
        lbAvatar1.setFont(f2);
        
        lbAvatar3.setPreferredSize(new Dimension(100,100));
        cel.fill = GridBagConstraints.HORIZONTAL; 
        cel.weightx = 0;
        cel.gridx = 2;
        cel.gridy = 3;
        cel.gridwidth = GridBagConstraints.REMAINDER; // fin de ligne
        panel.add(lbAvatar3, cel);
        
        // JRadioButton
        
        // Insertion d'un saut de ligne //
        JLabel space2 = new JLabel("");
        space.setPreferredSize(new Dimension(200,600));
        cel.gridy = 4;
        cel.gridwidth = GridBagConstraints.REMAINDER; // fin de ligne
        panel.add(space2, cel);
        
        // Valider //
        JButton Valider = new JButton("Valider");
        Valider.setFont(f2);
        Valider.setActionCommand("Valid");
        Valider.addActionListener(this);
        
        cel.fill = GridBagConstraints.HORIZONTAL;
        cel.weightx = 1.0;
        cel.gridx = 1;
        cel.gridy = 5;
        cel.gridwidth = 1;
        cel.anchor = GridBagConstraints.LAST_LINE_END;
        panel.add(Valider, cel);
        
        // Annuler //
        JButton Annuler = new JButton("Annuler");
        Annuler.setFont(f2);
        Annuler.setActionCommand("Annul");
        Annuler.addActionListener(this);
        
        cel.fill = GridBagConstraints.HORIZONTAL;
        cel.weightx = 1.0;
        cel.gridx = 0;
        cel.gridy = 5;
        cel.gridwidth = 1;
        cel.anchor = GridBagConstraints.LAST_LINE_START; //bottom of space
        panel.add(Annuler, cel);
        
        
		// Construction de la vue //
		constructVue(panel);
	}
	
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals("Valid"))
        {
        	if(this.jtfNomTama.getText().isEmpty())
        	{
        		JFrame frame = new JFrame();
        		JOptionPane.showMessageDialog(frame, "Veuillez renseigner un nom à votre Tamagotchi");
        	}
        	else
        	{
            	Vue initVue = new Vue();
            	this.dispose(); // fermeture de l'objet courant la fenetreM
        	}
        }
        if(e.getActionCommand().equals("Annul"))
        {
        	;
        }
    }
	
	public void constructVue(JPanel p)
	{
        setTitle("Information Tamagotchi");
        getContentPane().add(p);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // a modif si on veut arrette l'application d'ici
        setSize(400,220);
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
