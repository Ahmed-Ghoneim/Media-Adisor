package mediaadvisorgui;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MediaAdvisorGUI extends Application {
    
    KnowledgeBase knowledgeBase = new KnowledgeBase();
    String s;
    Button adv = new Button("Get Advice");
    Button thanks = new Button("Thanks");
    Label environment = new Label("Environment:");
    Label job = new Label("Job:");
    Label feedback = new Label("Feedback:");
    ComboBox environments = new ComboBox();
    ComboBox jobs = new ComboBox();
    ComboBox feedbacks = new ComboBox();
    GridPane pane = new GridPane();
    Stage result = new Stage();                     //Stage for showing the result
    Scene sc;                                       //Scene for the result Stage
    
    @Override
    public void start(Stage primaryStage) {
        
        adv.setOnAction(e-> {
            
                s = "Advice is: " + knowledgeBase.getMedium(environments.getValue().toString(), jobs.getValue().toString(), feedbacks.getValue().toString());
                showResult();
        });
        thanks.setOnAction(e->{
            result.close();
        });
        //Set the combo box elements
        environments.getItems().addAll("papers", "manuals", "documents", "textbooks", 
                "pictures", "illustrations", "photographs", "diagrams", "machines",
                "buildings", "tools", "numbers", "formulas", "computer program");
        environments.setValue("papers");
        
        jobs.getItems().addAll("lecturing", "advising", "building", "repairing",
                "troubleshooting", "writing", "typing", "drawing", "evaluating",
                "reasoning", "investigating");
        jobs.setValue("lecturing");
        
        feedbacks.getItems().addAll("required", "not required");
        feedbacks.setValue("required");
        
        
        pane.setHgap(10);
        pane.setVgap(10);
        pane.addColumn(0,environment, job, feedback);
        pane.addColumn(1, environments, jobs, feedbacks);
        
        VBox root = new VBox(pane, adv);
        root.setPadding(new Insets(10, 10, 10,10));
        root.setSpacing(10);
        root.setAlignment(Pos.CENTER_RIGHT);
        
        Scene scene = new Scene(root, 500, 250);
        
        primaryStage.setTitle("Media Advisor (Rule-Based expert system)");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    /**
     * This method Show creates and show the result Stage
     */
    void showResult(){
        if(result.isShowing())
            result.close();
        VBox r = new VBox(15,new Label(s),thanks);
        r.setAlignment(Pos.CENTER);
        sc = new Scene(r,200,100);
        result.setScene(sc);
        result.setTitle("Final Advice");
        result.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
