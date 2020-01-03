package controllers;


import java.util.ArrayList;
import java.util.List;

import Modell.LoadableStory;
import javafx.collections.ObservableList;
import javafx.collections.transformation.SortedList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.Window;

public class LoadSceneController {

    @FXML
    private Button startButton;
    
    @FXML
    private Button backButton;
    
    @FXML
    private TextField storyDescription;
    
    private Window mainStage;

    @FXML
    private ListView<LoadableStory> storyList;
    
    private ObservableList<LoadableStory> stories;
    
    @FXML
    public void initialize() {
        stories=storyList.getItems();
        stories.add(new LoadableStory("Example Story","asd.xml", "asd"));
        stories.add(new LoadableStory("Example Story 2","asd2.xml", "asdasd"));
        stories.add(new LoadableStory("Example Story 3","asd3.xml", "asdasdasd"));
    }
    
    public List<LoadableStory> loadStories() {
        List<LoadableStory> list=new ArrayList<LoadableStory>();
        return list;
    }
    
    @FXML
    public void handleStartButton() {
        
    }
    
    @FXML
    public void handleBackButton() {
        Stage stage = (Stage) backButton.getScene().getWindow();
        ((Stage)mainStage).show();
        stage.close();
    }
    
    public void updateDescription() {
        System.out.println("mouseclick");
        LoadableStory ls=storyList.getSelectionModel().getSelectedItem();
        System.out.println(ls.getDescription());
        storyDescription.setText(ls.getDescription());
        
    }
    
    /**
     * @return the mainStage
     */
    public Window getMainStage() {
        return mainStage;
    }

    /**
     * @param window the mainStage to set
     */
    public void setMainStage(Window window) {
        this.mainStage = window;
    }
}
