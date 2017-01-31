package application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

public class Main_Controller {
	@FXML // tagging it into our screen builder
	private Label result;
	private long number1=0;
	String operator="";// null
	boolean start=true; 
	private Model model= new Model();
	public void numbers(ActionEvent event){
		// checking if the start is true or not, i.e. the screen is blank
		if(start){
			result.setText("");
			start=false;
		}
		String value=((Button)event.getSource()).getText();
		result.setText(result.getText()+value);
	}
	public void operators(ActionEvent event){
		// checking if the value is already there
		String value=((Button)event.getSource()).getText();
		if(!value.equals("=")){
			if(!operator.isEmpty())
				return;
			operator=value;
			number1=Long.parseLong(result.getText());
			result.setText("");
		}
		else{
			if(operator.isEmpty())
				return;
				long number2=Long.parseLong(result.getText());
				float output=model.calculate(number1, number2, operator);
				result.setText(String.valueOf(output));
				// cleaning we need to set operator to null and start to true.
				operator="";
				start=true;
			}
		}
	}



			


