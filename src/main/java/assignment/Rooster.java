package assignment;

import java.util.HashMap;

public class Rooster extends Chicken {
	
	private String language;
	private String sound;
	
	
	 
	 
	 
	 
	public String sing(String language) {
		 HashMap<String,String> roosterSound = new HashMap<String,String>();
		 String sound = null;
		 roosterSound.put("Danish", "kykyliky");
			roosterSound.put("Dutch", "kukeleku");
			roosterSound.put("Finnish", "kukko kiekuu");
			roosterSound.put("French", "cocorico");
			roosterSound.put("German", "kikeriki");
			roosterSound.put("Greek", "kikiriki");
			roosterSound.put("Hebrew", "coo-koo-ri-koo");
			roosterSound.put("Hungarian", "kukuriku");
			roosterSound.put("Italian", "chicchirichi");
			roosterSound.put("Japanese", "ko-ke-kok-ko-o");
			roosterSound.put("Portuguese", "cucurucu");
			roosterSound.put("Russian", "kukareku");
			roosterSound.put("Swedish", "kuckeliku");
			roosterSound.put("Turkish", "kuk-kurri-kuuu");
			roosterSound.put("Urdu", "kuklooku");
			sound = roosterSound.get(language);
			if(sound == null) {
				return  "Cock-a-doodle-doo";
			}
			
			return sound;
			
			
			
		
	}

}
