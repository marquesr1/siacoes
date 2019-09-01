package br.edu.utfpr.dv.siacoes.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class ActivityScore implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int idActivity;
	private String activity;
	private double score;
	
	public ActivityScore() {
		this.setIdActivity(0);
		this.setActivity("");
		this.setScore(0);
	}

}
