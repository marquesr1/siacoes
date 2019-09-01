package br.edu.utfpr.dv.siacoes.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString(onlyExplicitlyIncluded = true)
public class ActivityGroup implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@EqualsAndHashCode.Include private int idActivityGroup;
	@ToString.Include private String description;
	private int sequence;
	private int minimumScore;
	private int maximumScore;
	
	public ActivityGroup(){
		this.setIdActivityGroup(0);
		this.setDescription("");
		this.setSequence(0);
		this.setMinimumScore(0);
		this.setMaximumScore(0);
	}

}
