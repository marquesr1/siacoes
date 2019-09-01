package br.edu.utfpr.dv.siacoes.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import br.edu.utfpr.dv.siacoes.util.DateUtils;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ActivitySubmissionReport implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String student;
	private String studentCode;
	private int registerSemester;
	private int registerYear;
	private double totalScore;
	private String situation;
	private List<ActivitySubmissionDetailReport> details;
	private List<ActivitySubmissionFooterReport> footer;
	
	public ActivitySubmissionReport(){
		this.setStudent("");
		this.setStudentCode("");
		this.setRegisterSemester(DateUtils.getSemester());
		this.setRegisterYear(DateUtils.getYear());
		this.setTotalScore(0);
		this.setSituation("");
		this.setDetails(new ArrayList<ActivitySubmissionDetailReport>());
		this.setFooter(new ArrayList<ActivitySubmissionFooterReport>());
	}

}
