package com.moviedetails.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moviedetails.entity.SubmitDto;
import com.moviedetails.repository.SubmitDao;

@Service
public class SubmitService {
	
	@Autowired
	private SubmitDao submitDao;
	
	public void saveSubmitDetails(SubmitDto submitDto) {
		submitDao.submitMovieDetails(submitDto);
	}

}
