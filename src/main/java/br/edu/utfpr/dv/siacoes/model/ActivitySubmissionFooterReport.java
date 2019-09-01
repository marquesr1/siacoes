package br.edu.utfpr.dv.siacoes.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class ActivitySubmissionFooterReport implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int idActivityGroup;
	private String group;
	private double total;
	private int minimum;
	private int maximum;
	private String situation;
	private int sequence;
	
	public ActivitySubmissionFooterReport(){
		this.setIdActivityGroup(0);
		this.setGroup("");
		this.setTotal(0);
		this.setMinimum(0);
		this.setMaximum(0);
		this.setSituation("");
		this.setSequence(0);
	}

}
