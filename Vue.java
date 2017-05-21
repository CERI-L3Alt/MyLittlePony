package classe;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.event.*;

public class Vue extends JFrame implements ActionListener{
	public Tamagotchi tama;
	
	public Vue(String nomTamaGo, ImageIcon avatar)
	{
		tama = new Tamagotchi(nomTamaGo, avatar, 100, 100, 100, 100, 0);
		int Sante = tama.get_sante();
		int Faim = tama.get_faim();
		int Hygienne = tama.get_hygienne();
		int Joie = tama.get_joie();
		
		int valeurInit = 100;
		// Création du contenue //
		Font f2 = new Font("Times", Font.PLAIN, 16);
		
		JPanel panel = new JPanel();
        panel.setBackground(new Color(255,228,196));
        
        // layout manager //
        panel.setLayout(new GridBagLayout());
        
        GridBagConstraints cel = new GridBagConstraints();
        
        // Label et progresse bar Top //
        
        JLabel lbInfoSante = new JLabel("Sante : ");
        lbInfoSante.setFont(f2);
        lbInfoSante.setPreferredSize(new Dimension(100,100));
        cel.fill = GridBagConstraints.HORIZONTAL; 
        cel.weightx = 0;
        cel.gridx = 0;
        cel.gridy = 0;
        panel.add(lbInfoSante, cel);
        
        JLabel lbInfoFaim = new JLabel("Faim : ");
        lbInfoFaim.setFont(f2);
        lbInfoFaim.setPreferredSize(new Dimension(100,100));
        cel.fill = GridBagConstraints.HORIZONTAL; 
        cel.weightx = 0;
        cel.gridx = 1;
        cel.gridy = 0;
        panel.add(lbInfoFaim, cel);
        
        JLabel lbInHygienne = new JLabel("hygienne : ");
        lbInHygienne.setFont(f2);
        lbInHygienne.setPreferredSize(new Dimension(100,100));
        cel.fill = GridBagConstraints.HORIZONTAL; 
        cel.weightx = 0;
        cel.gridx = 2;
        cel.gridy = 0;
        panel.add(lbInHygienne, cel);
        
        JLabel lbInfoJoie = new JLabel("Joie : ");
        lbInfoJoie.setFont(f2);
        lbInfoJoie.setPreferredSize(new Dimension(100,100));
        cel.fill = GridBagConstraints.HORIZONTAL; 
        cel.weightx = 0;
        cel.gridx = 3;
        cel.gridy = 0;
        cel.gridwidth = GridBagConstraints.REMAINDER;
        panel.add(lbInfoJoie, cel);
        
        // Les progress bar //
        
        JProgressBar pbInfoSante = new JProgressBar();
        pbInfoSante.setValue(Sante);
        pbInfoSante.setPreferredSize(new Dimension(20,20));
        cel.fill = GridBagConstraints.HORIZONTAL; 
        cel.weightx = 1;
        cel.gridx = 0;
        cel.gridy = 1;
        cel.gridwidth = 1;
        panel.add(pbInfoSante, cel);
        
        JProgressBar pbInfoFaim = new JProgressBar();
        pbInfoFaim.setValue(Faim);
        pbInfoFaim.setPreferredSize(new Dimension(20,20));
        cel.fill = GridBagConstraints.HORIZONTAL; 
        cel.weightx = 1;
        cel.gridx = 1;
        cel.gridy = 1;
        cel.gridwidth = 1;
        panel.add(pbInfoFaim, cel);
        
        JProgressBar pbInfoHygienne = new JProgressBar();
        pbInfoHygienne.setValue(Hygienne);
        pbInfoHygienne.setPreferredSize(new Dimension(20,20));
        cel.fill = GridBagConstraints.HORIZONTAL; 
        cel.weightx = 1;
        cel.gridx = 2;
        cel.gridy = 1;
        cel.gridwidth = 1;
        panel.add(pbInfoHygienne, cel);
        
        JProgressBar pbInfoJoie = new JProgressBar();
        pbInfoJoie.setValue(Joie);
        pbInfoJoie.setPreferredSize(new Dimension(20,20));
        cel.fill = GridBagConstraints.HORIZONTAL; 
        cel.weightx = 1;
        cel.gridx = 3;
        cel.gridy = 1;
        cel.gridwidth = 1;
        cel.gridwidth = GridBagConstraints.REMAINDER;
        panel.add(pbInfoJoie, cel);
        
        // Nom Tama //

        JLabel lbNomTama = new JLabel(nomTamaGo);
        lbNomTama.setPreferredSize(new Dimension(20,20));
        lbNomTama.setHorizontalAlignment(SwingConstants.CENTER);
        cel.fill = GridBagConstraints.HORIZONTAL; 
        cel.weightx = 1;
        cel.gridx = 0;
        cel.gridy = 2;
        cel.gridwidth = 1;
        cel.gridwidth = GridBagConstraints.REMAINDER;
        panel.add(lbNomTama, cel);
        
        // Avatar //
        JLabel lbAvatar = new JLabel(new ImageIcon(avatar.toString()));
        lbAvatar.setSize(new Dimension(20,20));
        cel.fill = GridBagConstraints.HORIZONTAL;
        cel.weightx = 0.5;
        cel.gridx = 0;
        cel.gridy = 3;
        cel.gridheight = 1;
        cel.gridwidth = 1;
        cel.gridwidth = GridBagConstraints.REMAINDER; // fin de ligne
        panel.add(lbAvatar, cel);
        
        // Les boutons d'actions //
        
        JButton btSante = new JButton("Soigner");
        btSante.setPreferredSize(new Dimension(50,50));
        cel.weightx = 1;
        cel.gridx = 0;
        cel.gridy = 4;
        cel.gridwidth = 1;
        cel.gridheight = 1;
        panel.add(btSante, cel);
        
        JButton btFaim = new JButton("Nourrir");
        btFaim.setPreferredSize(new Dimension(50,50));
        cel.weightx = 1;
        cel.gridx = 1;
        cel.gridy = 4;
        cel.gridwidth = 1;
        cel.gridheight = 1;
        panel.add(btFaim, cel);
        
        JButton btHygienne = new JButton("Nettoyer");
        btHygienne.setPreferredSize(new Dimension(50,50));
        cel.weightx = 1;
        cel.gridx = 2;
        cel.gridy = 4;
        cel.gridwidth = 1;
        cel.gridheight = 1;
        panel.add(btHygienne, cel);
        
        JButton btJouer = new JButton("Jouer");
        btJouer.setPreferredSize(new Dimension(50,50));
        cel.weightx = 1;
        cel.gridx = 3;
        cel.gridy = 4;
        cel.gridwidth = 1;
        cel.gridheight = 1;
        cel.gridwidth = GridBagConstraints.REMAINDER; // fin de ligne
        panel.add(btJouer, cel);
        
        JButton btReprod = new JButton("Reproduction");
        btReprod.setPreferredSize(new Dimension(50,50));
        cel.weightx = 1.5;
        cel.gridx = 0;
        cel.gridy = 5;
        cel.gridwidth = 1;
        cel.gridheight = 1;
        panel.add(btReprod, cel);
        
        JButton btPromener = new JButton("Promener");
        btPromener.setPreferredSize(new Dimension(50,50));
        cel.weightx = 1.5;
        cel.gridx = 1;
        cel.gridy = 5;
        cel.gridwidth = 1;
        cel.gridheight = 1;
        panel.add(btPromener, cel);
        
        JButton btPunir = new JButton("Punir");
        btPunir.setPreferredSize(new Dimension(50,50));
        cel.weightx = 1.5;
        cel.gridx = 2;
        cel.gridy = 5;
        cel.gridwidth = 1;
        cel.gridheight = 1;
        panel.add(btPunir, cel);
        
        JLabel space = new JLabel("");
        cel.weightx = 1.5;
        cel.gridx = 3;
        cel.gridy = 5;
        cel.gridwidth = 1;
        cel.gridheight = 1;
        cel.gridwidth = GridBagConstraints.REMAINDER;
        panel.add(space, cel);
        
		constructVue(panel);
	}
	
	public void constructVue(JPanel p)
	{
        setTitle("Tamago");
        getContentPane().add(p);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // a modif si on veut arrette l'application d'ici
        setSize(800,370);
        setLocationRelativeTo(null);
        setAlwaysOnTop(false);
        setResizable(false);
        setVisible(true);
	}
	
    public void actionPerformed(ActionEvent e)
    {
    }
	
}
