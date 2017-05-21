
public class Toiletter extends Action{
	int dureeLavage;

	public Toiletter(int dureeLavage) {
		super();
		this.dureeLavage = dureeLavage;
	}
	
	private void Nettoyer(Tamagotchi tama){
		int valeurJoie = 0;
		int valeurHygiene = 0;
  
		valeurJoie = 3;
		valeurHygiene = 8;
	         
		this.moinsJoie(valeurJoie,tama);
		this.plusHygiene(valeurHygiene,tama);
	}
}
