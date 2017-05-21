package classe;
import java.util.Hashtable;

public class Aliment {
	Hashtable<String,Boolean> Alim= new Hashtable<String,Boolean>();
	public Aliment(){
		Alim.put("Carotte",true);
		Alim.put("Pomme",true);
		Alim.put("Foin",true);
	}
	
	public boolean getValue(String key){
		return Alim.get(key);
	}
	
	public void putValues(String key, boolean value){
		Alim.put(key,value);
	}
	
	public boolean[] getAllValues(){
		boolean[] valueOfHash = new boolean[3];
		valueOfHash[0] = Alim.get("Carotte");
		valueOfHash[1] = Alim.get("Pomme");
		valueOfHash[2] = Alim.get("Foin");
		return valueOfHash;
	}
	
}
