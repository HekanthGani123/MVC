package com.moviedetails.movieController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.moviedetails.constants.AppConstants;
import com.moviedetails.entity.SubmitDto;
import com.moviedetails.service.SubmitService;


@Controller
@RequestMapping(value="/")
public class MovieController {
	
	@Autowired
	private SubmitService submitService;
	
	
	@PostMapping(value=AppConstants.SUBMIT)
	public ModelAndView submit(SubmitDto submitDto){
		System.out.println(submitDto);
		submitService.saveSubmitDetails(submitDto);
		return new ModelAndView("home.jsp");
		
	}

}
