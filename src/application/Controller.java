package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class Controller {
	@FXML
	Text resultLabel;
	boolean isTypingNum = false;
	double numOne = 0;
	double numTwo = 0;
	String operation = "";
	
	Model model = new Model();
	
	public void numberTyping(ActionEvent event) {
		String value = ((Button)event.getSource()).getText();
		
		if (isTypingNum) {
			resultLabel.setText(resultLabel.getText() + value);
		} else {
			resultLabel.setText(value);
			isTypingNum = true;
		}
	};
	
	public void operationTyping(ActionEvent event) {
		isTypingNum = false;
		numOne = Double.parseDouble(resultLabel.getText());
		operation = ((Button)event.getSource()).getText();
	};
	
	public void equalsTyping() {
		isTypingNum = false;
		numTwo = Double.parseDouble(resultLabel.getText());
		double result = model.calculate(numOne, numTwo, operation);
		resultLabel.setText(String.valueOf(result));
	};
	
	public void restartTyping() {
		resultLabel.setText("0");
		numOne = 0;
		numTwo = 0;
	};
}
