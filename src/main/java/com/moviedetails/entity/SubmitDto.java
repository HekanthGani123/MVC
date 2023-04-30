package com.moviedetails.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="movie_details")
public class SubmitDto implements Serializable{
	
	@Id
	@GenericGenerator(name="auto",strategy="increment")
	@GeneratedValue(generator = "auto")
	
	@Column(name="id")
	private Long id;
	
	@Column(name="moviename")
	private String moviename;
	
	@Column(name="actorname")
	private String actorname;
	
	@Column(name="actressname")
	private String actressname;
	
	@Column(name="releasedate")
	private String releasedate;
	
	@Column(name="budget")
	private double budget;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMoviename() {
		return moviename;
	}
	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}
	public String getActorname() {
		return actorname;
	}
	public void setActorname(String actorname) {
		this.actorname = actorname;
	}
	public String getActressname() {
		return actressname;
	}
	public void setActressname(String actressname) {
		this.actressname = actressname;
	}
	public String getReleasedate() {
		return releasedate;
	}
	public void setReleasedate(String releasedate) {
		this.releasedate = releasedate;
	}
	public double getBudget() {
		return budget;
	}
	public void setBudget(double budget) {
		this.budget = budget;
	}
	@Override
	public String toString() {
		return "SubmitDto [id=" + id + ", moviename=" + moviename + ", actorname=" + actorname + ", actressname="
				+ actressname + ", releasedate=" + releasedate + ", budget=" + budget + "]";
	}
	

}
