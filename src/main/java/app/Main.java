package app;

import java.net.URL;

import controllers.MainSceneController;
import javafx.application.Application;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        try {
            URL fileUrl = this.getClass().getClassLoader().getResource("mainscreen.FXML");
            System.out.println(fileUrl);
            Parent root = FXMLLoader.load(fileUrl);
            Scene mainScene = new Scene(root, 300, 300);
            primaryStage.setTitle("Role Playing Java");
            primaryStage.setScene(mainScene);
            primaryStage.show();
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage() + "\ncause:" + e.getCause());
        }
    }

    public static void main(String[] args) {
        try {
            launch(args);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
