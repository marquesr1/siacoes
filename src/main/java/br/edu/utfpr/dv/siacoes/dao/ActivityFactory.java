package br.edu.utfpr.dv.siacoes.dao;

public class ActivityFactory {

    public IActivity criar (String activity) {
        if(activity.equalsIgnoreCase("Activity")){
            return new ActivityDAO();
        }
        if(activity.equalsIgnoreCase("ActivityGroup")){
            return new ActivityGroupDAO();
        }
        if(activity.equalsIgnoreCase("ActivitySubmission")){
            return new ActivitySubmissionDAO();
        }
        if(activity.equalsIgnoreCase("ActivityUnit")){
            return new ActivityUnitDAO();
        }
        return null;
    }

}
