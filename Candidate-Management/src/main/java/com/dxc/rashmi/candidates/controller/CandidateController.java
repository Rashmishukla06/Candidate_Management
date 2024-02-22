package com.dxc.rashmi.candidates.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.rashmi.candidates.entity.Candidate;
import com.dxc.rashmi.candidates.repo.CandidateRepo;


@RestController
@RequestMapping("/candidates")
@CrossOrigin(origins = "http://localhost:4200")
public class CandidateController {
	
	private static final Logger logger = LoggerFactory.getLogger(CandidateController.class);

	@Autowired
	private CandidateRepo candidateRepository;

	@PostMapping("/add")
	public String addCandidates(@RequestBody Candidate candidate) {

		candidateRepository.save(candidate);
		return "Candidate Added Succesfully.";
	}

	@GetMapping("/getAll")
	public List<Candidate> getAllCandidates() {
		logger.info("check the log file --> getAllCandidates() method called to get candidate record from database");
		return candidateRepository.findAll();
	}

}
