package br.edu.utfpr.dv.siacoes.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString(onlyExplicitlyIncluded = true)
public class Activity implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@EqualsAndHashCode.Include private int idActivity;
	private ActivityGroup group;
	private ActivityUnit unit;
	private Department department;
	@ToString.Include private String description;
	private double score;
	private double maximumInSemester;
	private boolean active;
	private int sequence;
	
	public Activity(){
		this.setIdActivity(0);
		this.setGroup(new ActivityGroup());
		this.setUnit(new ActivityUnit());
		this.setDepartment(new Department());
		this.setDescription("");
		this.setScore(0);
		this.setMaximumInSemester(0);
		this.setActive(true);
	}

}
