package classe;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
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
	public Soigner Soigne;
	public Nourrir Nourir;
	public Aliment Alim;
	public Toiletter toil;
	public Jouer Joue;
	public Reproduire Repro;
	public Promener prom;
	public Punir pun;
	
	public JProgressBar pbInfoSante;
	public JProgressBar pbInfoFaim;
	public JProgressBar pbInfoHygienne;
	public JProgressBar pbInfoJoie;
	public JProgressBar pbInfoFatigue;
	
	public Vue(String nomTamaGo, ImageIcon avatar)
	{
		tama = new Tamagotchi("", new ImageIcon("./Ressources/avatar1.jpg"), 100, 0, 100, 100, 0, 0);
		tama.set_nomTama(nomTamaGo); 
		tama.set_avatar(avatar);
		
		int Sante = tama.get_sante();
		int Faim = tama.get_faim();
		int Hygienne = tama.get_hygiene();
		int Joie = tama.get_joie();
		int Fatigue = tama.get_fatigue();
		
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
        panel.add(lbInfoJoie, cel);
        
        JLabel lbInfoFatigue = new JLabel("Fatigue : ");
        lbInfoFatigue.setFont(f2);
        lbInfoFatigue.setPreferredSize(new Dimension(100,100));
        cel.fill = GridBagConstraints.HORIZONTAL; 
        cel.weightx = 0;
        cel.gridx = 4;
        cel.gridy = 0;
        cel.gridwidth = GridBagConstraints.REMAINDER;
        panel.add(lbInfoFatigue, cel);
        
        // Les progress bar //
        
        pbInfoSante = new JProgressBar();
        pbInfoSante.setValue(Sante);
        pbInfoSante.setPreferredSize(new Dimension(20,20));
        cel.fill = GridBagConstraints.HORIZONTAL; 
        cel.weightx = 1;
        cel.gridx = 0;
        cel.gridy = 1;
        cel.gridwidth = 1;
        panel.add(pbInfoSante, cel);
        
        pbInfoFaim = new JProgressBar();
        pbInfoFaim.setValue(Faim);
        pbInfoFaim.setPreferredSize(new Dimension(20,20));
        cel.fill = GridBagConstraints.HORIZONTAL; 
        cel.weightx = 1;
        cel.gridx = 1;
        cel.gridy = 1;
        cel.gridwidth = 1;
        panel.add(pbInfoFaim, cel);
        
        pbInfoHygienne = new JProgressBar();
        pbInfoHygienne.setValue(Hygienne);
        pbInfoHygienne.setPreferredSize(new Dimension(20,20));
        cel.fill = GridBagConstraints.HORIZONTAL; 
        cel.weightx = 1;
        cel.gridx = 2;
        cel.gridy = 1;
        cel.gridwidth = 1;
        panel.add(pbInfoHygienne, cel);
        
        pbInfoJoie = new JProgressBar();
        pbInfoJoie.setValue(Joie);
        pbInfoJoie.setPreferredSize(new Dimension(20,20));
        cel.fill = GridBagConstraints.HORIZONTAL; 
        cel.weightx = 1;
        cel.gridx = 3;
        cel.gridy = 1;
        cel.gridwidth = 1;
        panel.add(pbInfoJoie, cel);
        
        pbInfoFatigue = new JProgressBar();
        pbInfoFatigue.setValue(Fatigue);
        pbInfoFatigue.setPreferredSize(new Dimension(20,20));
        cel.fill = GridBagConstraints.HORIZONTAL; 
        cel.weightx = 1;
        cel.gridx = 4;
        cel.gridy = 1;
        cel.gridwidth = 1;
        cel.gridwidth = GridBagConstraints.REMAINDER;
        panel.add(pbInfoFatigue, cel);
        
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
        btSante.setActionCommand("Soigner");
        btSante.addActionListener(this);
        cel.weightx = 1;
        cel.gridx = 0;
        cel.gridy = 4;
        cel.gridwidth = 1;
        cel.gridheight = 1;
        panel.add(btSante, cel);
        
        JButton btFaim = new JButton("Nourrir");
        btFaim.setActionCommand("Nourrir");
        btFaim.addActionListener(this);
        btFaim.setPreferredSize(new Dimension(50,50));
        cel.weightx = 1;
        cel.gridx = 1;
        cel.gridy = 4;
        cel.gridwidth = 1;
        cel.gridheight = 1;
        panel.add(btFaim, cel);
        
        JLabel space = new JLabel("");
        cel.weightx = 1.5;
        cel.gridx = 2;
        cel.gridy = 4;
        cel.gridwidth = 1;
        cel.gridheight = 1;
        cel.gridwidth = GridBagConstraints.REMAINDER;
        panel.add(space, cel);
        
        JButton btHygienne = new JButton("Nettoyer");
        btHygienne.setPreferredSize(new Dimension(50,50));
        btHygienne.setActionCommand("Nettoyer");
        btHygienne.addActionListener(this);
        cel.weightx = 1;
        cel.gridx = 3;
        cel.gridy = 4;
        cel.gridwidth = 1;
        cel.gridheight = 1;
        panel.add(btHygienne, cel);
        
        JButton btJouer = new JButton("Jouer");
        btJouer.setPreferredSize(new Dimension(50,50));
        btJouer.setActionCommand("Jouer");
        btJouer.addActionListener(this);
        cel.weightx = 1;
        cel.gridx = 4;
        cel.gridy = 4;
        cel.gridwidth = 1;
        cel.gridheight = 1;
        panel.add(btJouer, cel);
        
        
        JButton btReprod = new JButton("Reproduction");
        btReprod.setPreferredSize(new Dimension(50,50));
        btReprod.setActionCommand("Reprod");
        btReprod.addActionListener(this);
        cel.weightx = 1.5;
        cel.gridx = 0;
        cel.gridy = 5;
        cel.gridwidth = 1;
        cel.gridheight = 1;
        panel.add(btReprod, cel);
        
        JButton btPromener = new JButton("Promener");
        btPromener.setPreferredSize(new Dimension(50,50));
        btPromener.setActionCommand("Promener");
        btPromener.addActionListener(this);
        cel.weightx = 1.5;
        cel.gridx = 2;
        cel.gridy = 5;
        cel.gridwidth = 1;
        cel.gridheight = 1;
        panel.add(btPromener, cel);
        
        JButton btPunir = new JButton("Punir");
        btPunir.setPreferredSize(new Dimension(50,50));
        btPunir.setActionCommand("Punir");
        btPunir.addActionListener(this);
        cel.weightx = 1.5;
        cel.gridx = 4;
        cel.gridy = 5;
        cel.gridwidth = 1;
        cel.gridheight = 1;
        panel.add(btPunir, cel);
        
		constructVue(panel);
	}
	
	public void constructVue(JPanel p)
	{
        setTitle("Tamago");
        getContentPane().add(p);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // a modif si on veut arrette l'application d'ici
        setSize(1000,370);
        setLocationRelativeTo(null);
        setAlwaysOnTop(false);
        setResizable(false);
        setVisible(true);
	}
	
    public void actionPerformed(ActionEvent e)
    {
    	if(e.getActionCommand().equals("Soigner"))
    	{
    		Soigne = new Soigner();
    		Soigne.Soin(tama);
    		this.pbInfoSante.setValue(tama.get_sante());
    		this.pbInfoJoie.setValue(tama.get_joie());
    	}
    	if(e.getActionCommand().equals("Nourrir"))
    	{
    		Alim = new Aliment();
    		Nourir = new Nourrir(Alim);
    		Nourir.Manger("Carotte", tama);
    		this.pbInfoFaim.setValue(tama.get_faim());
    		this.pbInfoJoie.setValue(tama.get_joie());
    		this.pbInfoHygienne.setValue(tama.get_hygiene());
    		this.pbInfoSante.setValue(tama.get_sante());
    	}
    	if(e.getActionCommand().equals("Nettoyer"))
    	{
    		toil = new Toiletter(10);
    		toil.Nettoyer(tama);
    		this.pbInfoHygienne.setValue(tama.get_hygiene());
    		this.pbInfoJoie.setValue(tama.get_joie());
    	}
    	if(e.getActionCommand().equals("Jouer"))
    	{
    		int dif = 1;
    		int duree = 1;
    		Joue = new Jouer(dif);
    		Joue.choixJeu("Saut de haies", dif, duree, tama);
    		this.pbInfoJoie.setValue(tama.get_joie());
    		this.pbInfoFaim.setValue(tama.get_faim());
    		this.pbInfoFatigue.setValue(tama.get_fatigue());
    	}
    	if(e.getActionCommand().equals("Reprod"))
    	{
    		Repro = new Reproduire();
    		if(Repro.Reproduction() == true)
    		{
    			VueParam param = new VueParam();
    			this.dispose();
    		}
    		
    	}
    	if(e.getActionCommand().equals("Promener"))
    	{
    		String lieux = "Prairie";
    		int duree = 1;
    		prom = new Promener();
    		prom.sePromener(duree, lieux, tama);
    		this.pbInfoJoie.setValue(tama.get_joie());
    		this.pbInfoHygienne.setValue(tama.get_hygiene());
    		this.pbInfoFatigue.setValue(tama.get_fatigue());
    	}
    	if(e.getActionCommand().equals("Punir"))
    	{
    		String puni = "Frapper";
    		pun = new Punir(puni);
    		pun.Punition(puni,tama);
    		this.pbInfoSante.setValue(tama.get_sante());
    		this.pbInfoJoie.setValue(tama.get_joie());
    	}
    }
	
}
