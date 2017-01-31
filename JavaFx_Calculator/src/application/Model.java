package application;

public class Model {
	// We will take all the mathematics here into consideration, regarding operators.
	public float calculate(float number1,float number2, String operator){
		switch(operator){
		case"+":
			return number1+number2;
		case"-":
			return number1-number2;
		case"*":
			return number1*number2;
		case"/":
			// what if the number 2 is 0, we will get infinity, thats why we will need to tackle it 
			if(number2==0){
				return 0;
			}
			return number1/number2;
			default:
				return 0;
		}
		
		
	}
}
