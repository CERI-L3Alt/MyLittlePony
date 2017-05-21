
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
		tama.set_joie(joie+valeur);
	}
	public void plusSante(int valeur, Tamagotchi tama){
		int sante = tama.get_sante();
		tama.set_sante(sante+valeur);
	}
	public void plusFaim(int valeur, Tamagotchi tama){
		int faim = tama.get_faim();
		tama.set_faim(faim+valeur);
	}
	public void plusFatigue(int valeur, Tamagotchi tama){
		int fatigue = tama.get_fatigue();
		tama.set_fatigue(fatigue+valeur);
	}
	public void plusHygiene(int valeur, Tamagotchi tama){
		int hygiene = tama.get_hygiene();
		tama.set_hygiene(hygiene+valeur);
	}
	
	// Méthodes permettant de décrémenter les différentes données
	public void moinsJoie(int valeur, Tamagotchi tama){
		int joie = tama.get_joie();
		tama.set_joie(joie-valeur);
	}
	public void moinsFaim(int valeur, Tamagotchi tama){
		int faim = tama.get_faim();
		tama.set_faim(faim-valeur);
	}
	public void moinsFatigue(int valeur, Tamagotchi tama){
		int fatigue = tama.get_fatigue();
		tama.set_fatigue(fatigue-valeur);
	}
	public void moinsSante(int valeur, Tamagotchi tama){
		int sante = tama.get_sante();
		tama.set_sante(sante-valeur);
	}
	public void moinsHygiene(int valeur, Tamagotchi tama){
		int hygiene = tama.get_hygiene();
		tama.set_hygiene(hygiene-valeur);
	}
}
