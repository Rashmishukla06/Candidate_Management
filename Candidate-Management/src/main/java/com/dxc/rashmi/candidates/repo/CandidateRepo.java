package com.dxc.rashmi.candidates.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dxc.rashmi.candidates.entity.Candidate;

@Repository
public interface CandidateRepo extends JpaRepository<Candidate, Integer>{

}
