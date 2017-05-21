package classe;
public abstract class Action {
	boolean actionAutoriserRefuser;
	
	public void valider(){
		
	}
	
	public void annuler(){
			 
	}
	public void refuser(boolean AutoriserRefuser){
		
	}
	
	// Méthodes permettant d'incrémenter les différentes données
	public void plusJoie(int valeur, Tamagotchi tama){
		int joie = tama.get_joie();
		int total = joie + valeur;
		if(total > 100){
			total = 100;
		}else{
			System.out.println("Votre tamagotchi gagne "+ valeur +" en joie");
		}
		tama.set_joie(total);
		
	}
	public void plusSante(int valeur, Tamagotchi tama){
		int sante = tama.get_sante();
		int total = sante + valeur;
		if(total > 100){
			total = 100;
		}else{
			System.out.println("Votre tamagotchi gagne "+ valeur +" en santé");
		}
		tama.set_sante(total);
		
	}
	public void plusFaim(int valeur, Tamagotchi tama){
		int faim = tama.get_faim();
		int total = faim + valeur;
		if(total > 100){
			total = 100;
		}else{
			System.out.println("Votre tamagotchi gagne "+ valeur +" en faim");
		}
		tama.set_faim(total);
		
	}
	public void plusFatigue(int valeur, Tamagotchi tama){
		int fatigue = tama.get_fatigue();
		int total = fatigue + valeur;
		if(total > 100){
			total = 100;
		}else{
			System.out.println("Votre tamagotchi gagne "+ valeur +" en fatigue");
		}
		tama.set_fatigue(total);
		
	}
	public void plusHygiene(int valeur, Tamagotchi tama){
		int hygiene = tama.get_hygiene();
		int total = hygiene + valeur;
		if(total > 100){
			total = 100;
		}else{
			System.out.println("Votre tamagotchi gagne "+ valeur +" en hygiene");
		}
		tama.set_hygiene(total);
	}
	
	// Méthodes permettant de décrémenter les différentes données
	public void moinsJoie(int valeur, Tamagotchi tama){
		int joie = tama.get_joie();
		int total = joie - valeur;
		if(total < 0){
			total = 0;
		}else{
			System.out.println("Votre tamagotchi perd "+ valeur +" en joie");
		}
		tama.set_joie(total);
		
	}
	public void moinsFaim(int valeur, Tamagotchi tama){
		int faim = tama.get_faim();
		int total = faim - valeur;
		if(total < 0){
			total = 0;
		}else{
			System.out.println("Votre tamagotchi perd "+ valeur +" en faim");
		}
		tama.set_faim(total);
		
	}
	public void moinsFatigue(int valeur, Tamagotchi tama){
		int fatigue = tama.get_fatigue();
		int total = fatigue - valeur;
		if(total < 0){
			total = 0;
		}else{
			System.out.println("Votre tamagotchi perd "+ valeur +" en fatigue");
		}
		tama.set_fatigue(total);
		
	}
	public void moinsSante(int valeur, Tamagotchi tama){
		int sante = tama.get_sante();
		int total = sante - valeur;
		if(total < 0){
			total = 0;
		}else{
			System.out.println("Votre tamagotchi perd "+ valeur +" en sante");
		}
		tama.set_sante(total);
		
	}
	public void moinsHygiene(int valeur, Tamagotchi tama){
		int hygiene = tama.get_hygiene();
		int total = hygiene - valeur;
		if(total < 0){
			total = 0;
		}else{
			System.out.println("Votre tamagotchi perd "+ valeur +" en hygiene");
		}
		tama.set_hygiene(total);
	}
}
