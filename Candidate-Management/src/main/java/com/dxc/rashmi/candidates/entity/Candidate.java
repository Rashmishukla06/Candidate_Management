package com.dxc.rashmi.candidates.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Candidate {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer recId;
    
    private Integer candidateNo;
    private String candidateName;
    private Integer candidateScore;
    private Integer candidateRank;
    private Date updateDate;
	
	public Integer getCandidateNo() {
		return candidateNo;
	}
	public void setCandidateNo(Integer candidateNo) {
		this.candidateNo = candidateNo;
	}
	public String getCandidateName() {
		return candidateName;
	}
	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}
	public Integer getCandidateScore() {
		return candidateScore;
	}
	public void setCandidateScore(Integer candidateScore) {
		this.candidateScore = candidateScore;
	}
	public Integer getCandidateRank() {
		return candidateRank;
	}
	public void setCandidateRank(Integer candidateRank) {
		this.candidateRank = candidateRank;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
    
    

}
