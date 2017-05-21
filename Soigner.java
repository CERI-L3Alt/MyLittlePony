
public class Soigner extends Action{
	String medicament;
	
	public Soigner(String medic){
		super();
		this.medicament = medic;
	}
	
	private void Soin(String medic, Tamagotchi tama){
		int valeurJoie = 0;
		int valeurSoin = 0;
  
		valeurJoie = 3;
		valeurSoin = 6;
	         
		this.moinsJoie(valeurJoie,tama);
		this.plusSante(valeurSoin,tama);
	}
}
