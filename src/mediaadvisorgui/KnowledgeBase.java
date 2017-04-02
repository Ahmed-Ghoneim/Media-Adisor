package mediaadvisorgui;

public class KnowledgeBase {
    
    Database database = new Database();             //Creates an object from the Database class to access the stored Facts
    String situation="", response="";               //Elements to store stimulus_situation and stimulus_response
    
    /**
     * This method takes 3 parameters as input to return the final Advice
     * Contains rules to deduce stimulus_situation and stimulus_response
     * via invoking other methods and get the final advice
     * @param environment
     * @param job
     * @param feedback
     * @return The Final Advice as a String
     */
    String getMedium(String environment, String job, String feedback){
        setSituation(environment);              //The evironment fact is responasble for deciding the stimulus_situation
        setResponse(job);                       //The Job fact is responable for deciding the stimulus_response
        //Rules that determine the Advice
        if("physical object".equals(situation)&&"hands-on".equals(response)&&"required".equals(feedback))
            return "workshop";
        else if("symbolic".equals(situation)&&"analytical".equals(response)&&"required".equals(feedback))
            return "lecture – tutorial";
        else if("visual".equals(situation)&&"documented".equals(response)&&"not required".equals(feedback))
            return "videocassette";
        else if("visual".equals(situation)&&"oral".equals(response)&&"required".equals(feedback))
            return "lecture – tutorial";
        else if("verbal".equals(situation)&&"analytical".equals(response)&&"required".equals(feedback))
            return "lecture – tutorial";
        else if("verbal".equals(situation)&&"oral".equals(response)&&"required".equals(feedback))
            return "role-play exercises";
        return "Select Suitable Facts";         // Handling unstored rule
    }
    
    /**
     * Checks if the Facts database contains the user input Environment
     * and decide the stimulus_situation according to the Rule
     * @param environment 
     */
    void setSituation(String environment){
        if(database.environment1Contains(environment))
            situation = "verbal";
        else if (database.environment2Contains(environment))
            situation = "visual";
        else if (database.environment3Contains(environment))
            situation = "physical object";
        else if (database.environment4Contains(environment))
            situation = "symbolic";
    }
    
    /**
     * Checks if the Facts database contains the user input Job
     * and decide the stimulus_response according to the Rule
     * @param job 
     */
    void setResponse(String job){
        if(database.job5Contains(job))
            response = "oral";
        else if(database.job6Contains(job))
            response = "hands-on";
        else if(database.job7Contains(job))
            response = "documented";
        else if(database.job8Contains(job))
            response = "analytical";
    } 
}
