package application;


import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;

import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/MainView.fxml"));
			ScrollPane scrollpane = loader.load();
			
			scrollpane.setFitToHeight(true); //alturaa justada
			scrollpane.setFitToWidth(true); //largura ajustada
			
			Scene mainScene = new Scene(scrollpane);
			primaryStage.setScene(mainScene);
			primaryStage.setTitle("JavaFX Aplicação");
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
