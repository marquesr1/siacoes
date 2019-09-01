package br.edu.utfpr.dv.siacoes.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;

@Getter
@Setter
public class ActivityValidationReport implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int idActivity;
	private String description;
	private int group;
	private int submitted;
	private int validated;
	
	public ActivityValidationReport(){
		this.setIdActivity(0);
		this.setDescription("");
		this.setGroup(0);
		this.setSubmitted(0);
		this.setValidated(0);
	}

	public float getPercentageValidate() {
		BigDecimal bd = new BigDecimal(((float)this.getValidated() / this.getSubmitted()) * 100);
	    bd = bd.setScale(2, RoundingMode.HALF_UP);
	    return bd.floatValue();
	}

}
