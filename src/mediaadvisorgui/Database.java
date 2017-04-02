package mediaadvisorgui;

import java.util.ArrayList;

/**
 *
 * @author Ahmed
 */
public class Database {
    
    ArrayList environments1;        //Environments in Rule 1
    ArrayList environments2;        //Environments in Rule 2
    ArrayList environments3;        //Environments in Rule 3
    ArrayList environments4;        //Environments in Rule 4
    ArrayList jobs5;                //Jobs in Rule 5 
    ArrayList jobs6;                //Jobs in Rule 6
    ArrayList jobs7;                //Jobs in Rule 7
    ArrayList jobs8;                //Jobs in Rule 8
    ArrayList feedback;             //Feedback storage
    
    /**
     * Constructor is used to create objects
     * and initialize the Lists
     */
    Database(){
        this.environments1 = new ArrayList<String>();
        this.environments2 = new ArrayList<String>();
        this.environments3 = new ArrayList<String>();
        this.environments4 = new ArrayList<String>();
        setEnvironments();
        this.jobs5 = new ArrayList<String>();
        this.jobs6 = new ArrayList<String>();
        this.jobs7 = new ArrayList<String>();
        this.jobs8 = new ArrayList<String>();
        setJobs();
        this.feedback = new ArrayList<String>();
        setFeedback();
    }
    
    /**
     * This method is used to store facts
     * for Environment types
     */
    void setEnvironments(){
        environments1.add("papers");
        environments1.add("manuals");
        environments1.add("documents");
        environments1.add("textbooks");
        environments2.add("pictures");
        environments2.add("illustrations");
        environments2.add("photographs");
        environments2.add("diagrams");
        environments3.add("machines");
        environments3.add("buildings");
        environments3.add("tools");
        environments4.add("numbers");
        environments4.add("formulas");
        environments4.add("computer program");
    }
    
    /**
     * This method is used to store facts
     * for Job types
     */
    void setJobs(){
        jobs5.add("lecturing");
        jobs5.add("advising");
        jobs5.add("counselling");
        jobs6.add("building");
        jobs6.add("repairing");
        jobs6.add("troubleshooting");
        jobs7.add("writing");
        jobs7.add("typing");
        jobs7.add("drawing");
        jobs8.add("evaluating");
        jobs8.add("reasoning");
        jobs8.add("investigating");
    }
    /**
     * This method is used to store facts
     * for Feedback options
     */
    void setFeedback(){
        feedback.add("required");
        feedback.add("not required");
    }
    
    /*
     * These methods take one parameter to search if this
     * parameter is exist within the the Environment list
     * with its respective rule
     * and return true if the item exist false if not exist
     * @param environment
     * @return 
     */
    boolean environment1Contains(String environment){
        return environments1.contains(environment);
    }
    
    boolean environment2Contains(String environment){
        return environments2.contains(environment);
    }
    
    boolean environment3Contains(String environment){
        return environments3.contains(environment);
    }
    
    boolean environment4Contains(String environment){
        return environments4.contains(environment);
    }
    
    /*
     * These methods take one parameter to search if this
     * parameter is exist within the the Job list
     * with its respective rule
     * and return true if the item exist false if not exist
     * @param job
     * @return 
     */
    boolean job5Contains(String job){
        return jobs5.contains(job);
    }
    
    boolean job6Contains(String job){
        return jobs6.contains(job);
    }
    
    boolean job7Contains(String job){
        return jobs7.contains(job);
    }
    
    boolean job8Contains(String job){
        return jobs8.contains(job);
    }
    
    /*
     * This method take one parameter to search if this
     * parameter is exist within the the Feedback list
     * and return true if the item exist false if not exist
     * @param feedback
     * @return 
     */
    boolean feedbackContains(String feedback){
        return feedback.contains(feedback);
    }
}
