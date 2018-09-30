package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import service.RoosterService;



@Controller
public class RoosterController {
	
	@Autowired
	RoosterService roosterService;
	
	@RequestMapping(value = "/v1/rooster/sound", method = RequestMethod.GET)
	public @ResponseBody String getAttractionTypes(
			HttpServletRequest req,
			HttpServletResponse resp,
			@RequestParam(value = "language", required = false) String language) {
		
		if (language !=null) {
			
		}
	}

}
