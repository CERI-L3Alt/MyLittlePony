package classe;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;

public class Menu extends JFrame implements ActionListener{
	private String nomJeux = "Fhloston Paradise";
	
	// Getter //
	public String get_nomJeux()
	{
		return nomJeux;
	}
	
	public Menu(String _nomJeux)
	{
		nomJeux = _nomJeux;
		
		Font f = new Font("Times", Font.PLAIN, 20); // Pour changer la police
		
		JPanel panel = new JPanel();
        panel.setBackground(new Color(153,50,204));
        
        // layout manager //
        panel.setLayout(new GridBagLayout());
        
        GridBagConstraints cel = new GridBagConstraints();
        
        // Ceci sert uniquement a centre le titre //
        // Insertion d'un saut de ligne //
        JLabel space = new JLabel("");
        space.setPreferredSize(new Dimension(300,600));
        cel.fill = GridBagConstraints.HORIZONTAL; 
        cel.weightx = 0.5;
        cel.gridx = 1;
        cel.gridy = 0;
        panel.add(space, cel);
        
        // TITRE //
        JLabel Title = new JLabel(nomJeux);
        Title.setFont(f);
        
        Title.setPreferredSize(new Dimension(300,600));
        cel.fill = GridBagConstraints.HORIZONTAL; 
        cel.weightx = 0.5;
        cel.gridx = 2;
        cel.gridy = 0;
        cel.gridwidth = GridBagConstraints.REMAINDER; // fin de ligne
        panel.add(Title, cel);
        
        // Pour les boutons //
        // Lancer jeux //
        JButton Lj = new JButton("Lancer le jeux");
        Lj.setFont(f);
        Lj.setActionCommand("one");
        Lj.addActionListener(this);
        
        Lj.setPreferredSize(new Dimension(100,150));
        cel.insets = new Insets(50,0,0,0); // padding top
        cel.ipady = 40; // hauteur du bouton
        cel.gridx = 0;
        cel.gridy = 1;
        panel.add(Lj, cel);
        
        // Quitter //
        JButton Quitter = new JButton("Quitter");
        Quitter.setFont(f);
        Quitter.setActionCommand("Quit");
        Quitter.addActionListener(this);
        
        Quitter.setPreferredSize(new Dimension(100,600));
        cel.insets = new Insets(50,0,0,0); // padding top
        cel.ipady = 40; // hauteur du bouton
        cel.gridx = 0;
        cel.gridy = 3;
        panel.add(Quitter, cel);
        
        // NOMS du groupe en minuscule, iut arles etc //
        JLabel Groupe = new JLabel("@2017 - Tous droits réservés - NORSIC Loris - KANAYAN Vincent - TERRIER Mathieu");
        Groupe.setFont(f);
        
        Groupe.setPreferredSize(new Dimension(200,600));
        cel.gridx = 0;
        cel.gridy = 4;
        
        panel.add(Groupe, cel);
        
        /*********************************************/       
        // Creation de la fenetre //
        
        JFrame fenetreM = new JFrame(nomJeux);
        // ajout des contenues //
        getContentPane().add(panel);
        // Titre de la fenetre //
        setTitle(nomJeux);
        // cliquer sur la croix rouge pour quit //
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // fenetre pas toujours au premier plan //
        setAlwaysOnTop(false);
        //taille fenetre //
        setSize(800,600);
        // fenetre centré //
        setLocationRelativeTo(null);
        //fenetre non redimensionable //
        setResizable(false);
        // fenetre visible //
        setVisible(true);
	}
	
    /*********************************************/
    	// action effectuer par le menu //
     public void actionPerformed(ActionEvent e)
     {
         if(e.getActionCommand().equals("one"))
         {
         	//Damier lost = new Damier();
         	this.dispose(); // fermeture de l'objet courant la fenetreM
         }
         if(e.getActionCommand().equals("Quit"))
             System.exit(0);
     }
     /*********************************************/
	
    public static void main(String[] args)
    {
        Menu Jeux = new Menu("Fhloston Paradise");
    }

}
