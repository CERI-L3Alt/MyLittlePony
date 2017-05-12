
public class Toiletter extends Action{
	int dureeLavage;

	public Toiletter(int dureeLavage) {
		super();
		this.dureeLavage = dureeLavage;
	}
	
	private void Nettoyer(){
		int valeurJoie = 0;
		int valeurHygiene = 0;
  
		valeurJoie = 3;
		valeurHygiene = 8;
	         
		this.moinsJoie(valeurJoie);
		this.plusHygiene(valeurHygiene);
	}
}
