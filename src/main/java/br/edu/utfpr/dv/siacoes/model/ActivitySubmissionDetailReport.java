package br.edu.utfpr.dv.siacoes.model;

import java.io.Serializable;

import br.edu.utfpr.dv.siacoes.util.DateUtils;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ActivitySubmissionDetailReport implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String activity;
	private int group;
	private String unit;
	private double score;
	private double amount;
	private double total;
	private int semester;
	private int year;
	
	public ActivitySubmissionDetailReport(){
		this.setActivity("");
		this.setGroup(0);
		this.setUnit("");
		this.setScore(0);
		this.setAmount(0);
		this.setTotal(0);
		this.setSemester(DateUtils.getSemester());
		this.setYear(DateUtils.getYear());
	}

}
