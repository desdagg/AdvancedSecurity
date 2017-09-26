package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainCal extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //load the FXML file
        Parent root = FXMLLoader.load(getClass().getResource("sampleCal.fxml"));
        primaryStage.setTitle("Calculator");
        //Declare the size
        primaryStage.setScene(new Scene(root, 300, 500));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
