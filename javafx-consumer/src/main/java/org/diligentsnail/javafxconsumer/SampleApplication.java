package org.diligentsnail.javafxconsumer;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class SampleApplication extends Application {
	public static final String FXML_FILE_PATH = "/sample-view.fxml";

	@Override
	public void start(Stage primaryStage) throws Exception {
		VBox vBox = loadLayout();
		Scene scene = new Scene(vBox);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	private static VBox loadLayout() throws IOException {
		URL url = SampleApplication.class.getResource(FXML_FILE_PATH);
		if (url == null) {
			throw new IllegalStateException("Cannot find '" + FXML_FILE_PATH + "'");
		}

		return FXMLLoader.load(url);
	}

	public static void main(String[] args) {
		Application.launch(SampleApplication.class, args);
	}
}
