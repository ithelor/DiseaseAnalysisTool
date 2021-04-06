package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        Pane root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        Scene scene = new Scene(root, 820, 600); //               <-- \
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