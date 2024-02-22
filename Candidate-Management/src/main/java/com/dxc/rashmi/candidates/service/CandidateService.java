package com.dxc.rashmi.candidates.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.rashmi.candidates.entity.Candidate;
import com.dxc.rashmi.candidates.repo.CandidateRepo;

@Service
public class CandidateService {
	
	private static final Logger logger = LoggerFactory.getLogger(CandidateService.class);

	@Autowired
	private CandidateRepo candidateRepository;

	public List<Candidate> getAllCandidates() {
		logger.info("This is Service class getAllCandidate method Called.");
		return candidateRepository.findAll();
	}

}
