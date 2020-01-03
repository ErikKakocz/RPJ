package controllers;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.Window;

public class MainSceneController {

    @FXML
    private Button playButton;

    @FXML
    private Button quitButton;

    @FXML
    public void handlePlayButton() {
        try {
            Stage stage=new Stage();
            FXMLLoader loader=new FXMLLoader(this.getClass().getClassLoader().getResource("loadscreen.FXML"));
            Parent root=loader.load();
            Scene scene=new Scene(root,600,600);
            stage.setScene(scene);
            stage.setTitle("Play");
            LoadSceneController cont=(LoadSceneController)loader.getController();
            Window win=playButton.getScene().getWindow();
            cont.setMainStage(win);
            stage.show();
            win.hide();
        }catch(Exception e) {
            System.out.println("error: " + e.getMessage() + "\ncause:" + e.getCause());
        }
    }

    @FXML
    public void handleQuitButton() {
        Platform.exit();
    }

}
