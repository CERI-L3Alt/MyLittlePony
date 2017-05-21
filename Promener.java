package classe;
public class Promener extends ActionLongue{


	public Promener() {
		super();
	}


	private void sePromener(int duree, String lieu, Tamagotchi tama) throws InterruptedException{
		int valeurJoie = 0;
		int valeurHygiene = 0;
		int valeurFatigue = 0;
		
		Thread.sleep(duree*60000);
		
		switch (lieu) {
		
			case "Prairie" :
				valeurJoie = 3*duree;
				valeurHygiene = 2*duree;
				valeurFatigue = 2*duree;
				break;
			case "Montagne" :
				valeurJoie = 2*duree;
				valeurHygiene = 1*duree;
				valeurFatigue = 3*duree;
				break;
				
			case "Arc en ciel" :
				valeurJoie = 5*duree;
				valeurHygiene = 2*duree;
				valeurFatigue = 3*duree;
				break;
			
			default :
				System.out.print("Le lieu que vous avez choisie n'existe pas");
				break;
		
		}
	         
		this.plusJoie(valeurJoie,tama);
		this.moinsHygiene(valeurHygiene,tama);
		this.plusFatigue(valeurFatigue,tama);
	}
	
}
