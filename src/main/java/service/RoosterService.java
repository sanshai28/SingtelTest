package service;

import org.springframework.stereotype.Service;

import assignment.Rooster;

@Service
public class RoosterService {
	
	public String getSound(String language) {
		Rooster rooster = new Rooster();
		return 		rooster.sing(language);
	}

}
