package br.edu.utfpr.dv.siacoes.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString(onlyExplicitlyIncluded = true)
public class ActivityUnit implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@EqualsAndHashCode.Include private int idActivityUnit;
	@ToString.Include private String description;
	private boolean fillAmount;
	private String amountDescription;
	
	public ActivityUnit(){
		this.setIdActivityUnit(0);
		this.setDescription("");
		this.setFillAmount(false);
		this.setAmountDescription("");
	}

}
