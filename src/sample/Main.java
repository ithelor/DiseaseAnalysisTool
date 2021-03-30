package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        ScrollPane root = FXMLLoader.<ScrollPane>load(getClass().getResource("sample.fxml"));

        Scene scene = new Scene(root, 720, 580); //               <-- \
//        stage.setMinWidth(640); stage.setMinHeight(560);     // doesn't match --> /

        stage.getIcons().add(new Image("/sample/icon.png"));
        stage.setTitle("Disease Analysis Tool");

        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}