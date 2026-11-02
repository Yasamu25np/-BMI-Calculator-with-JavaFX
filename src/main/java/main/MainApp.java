package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
 FXMLLoader fxmlLoader = new FXMLLoader(MainApp.class.getResource("/fxml/FXML.fxml"));

        
        Scene scene = new Scene(fxmlLoader.load());
        
        stage.setTitle("Kalkulator BMI Desktop");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
