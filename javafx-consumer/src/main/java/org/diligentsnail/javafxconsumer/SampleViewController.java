package org.diligentsnail.javafxconsumer;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import org.diligentsnail.hellolibrary.Hello;

public class SampleViewController {
	private static final String DEFAULT_NAME = "BSE-207";
	@FXML
	private Text helloText;
	@FXML
	private TextField nameTextField;

	@FXML
	private void initialize() {
		helloText.setText(new Hello(DEFAULT_NAME).sayHello());

		nameTextField.textProperty().addListener((observable, oldValue, newValue) -> {
			String name = !newValue.isBlank() ? newValue : DEFAULT_NAME;
			Hello hello = new Hello(name);
			String newText = hello.sayHello();
			helloText.setText(newText);
		});
	}
}
