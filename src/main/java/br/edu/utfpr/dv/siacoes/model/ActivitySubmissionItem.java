package br.edu.utfpr.dv.siacoes.model;

import java.io.Serializable;

import br.edu.utfpr.dv.siacoes.model.ActivitySubmission.ActivityFeedback;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ActivitySubmissionItem implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int idActivitySubmissionItem;
	private Activity activity;
	private ActivitySubmission submission;
	private ActivityFeedback feedback;
	
	public ActivitySubmissionItem(){
		this.setIdActivitySubmissionItem(0);
		this.setActivity(new Activity());
		this.setSubmission(new ActivitySubmission());
		this.setFeedback(ActivityFeedback.NONE);
	}
	
}
