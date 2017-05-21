
public class Jouer extends ActionLongue{
	int difficulte;
	
	public Jouer(int dif){
		super();
		this.difficulte = dif;
	}
	
	protected void choixJeu(String nomJ, int dif, int duree, Tamagotchi tama) throws InterruptedException{
		int valeurJoie = 0;
		int valeurFatigue = 0;
		int valeurFaim = 0;
		Thread.sleep(duree*60000);
		switch (nomJ) {
         case "Chevauché": 
	        	 if(dif == 1){
	        		 valeurJoie = 1*duree;
	        		 valeurFatigue = duree;
	        		 valeurFaim = duree;
	        	 }else if(dif == 2){
	        		 valeurJoie = 2*duree;
	        		 valeurFatigue = duree;
	        		 valeurFaim = duree;
	        	 }else if(dif == 3){
	        		 valeurJoie = 3*duree;
	        		 valeurFatigue = duree;
	        		 valeurFaim = duree;
	        	 }
	              break;
         case "Saut de haies":
	        	 if(dif == 1){
	        		 valeurJoie = 2*duree;
	        		 valeurFatigue = duree;
	        		 valeurFaim = duree;
	        	 }else if(dif == 2){
	        		 valeurJoie = 3*duree;
	        		 valeurFatigue = duree;
	        		 valeurFaim = duree;
	        	 }else if(dif == 3){
	        		 valeurJoie = 4*duree;
	        		 valeurFatigue = duree;
	        		 valeurFaim = duree;
	        	 }
                  break;
         case "Marche au pas":  
	        	 if(dif == 1){
	        		 valeurJoie = 3*duree;
	        		 valeurFatigue = duree;
	        		 valeurFaim = duree;
	        	 }else if(dif == 2){
	        		 valeurJoie = 4*duree;
	        		 valeurFatigue = duree;
	        		 valeurFaim = duree;
	        	 }else if(dif == 3){
	        		 valeurJoie = 5*duree;
	        		 valeurFatigue = duree;
	        		 valeurFaim = duree;
	        	 }
                  break;
         default: 
                  break;

		}
		this.plusJoie(valeurJoie,tama);
		this.plusFatigue(valeurFatigue,tama);
		this.plusFaim(valeurFaim,tama);
	}
	
}
