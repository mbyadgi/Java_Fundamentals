package com.pluralsight.javafundamentals;

public class MathEquation {

	public double leftVal;
	public double rightVal;
	public double result;
	public char opCode;
	
	public static void main(String[] args) {
		MathEquation[] equations = new MathEquation[4];
		/*equations[0] = create(100.0, 50.0, 'd');
		equations[1] = create(25.0, 92.0, 'a');
		equations[2] = create(225.0, 17.0, 's');
		equations[3] = create(11.0, 3.0, 'm');*/
		equations[0] = new MathEquation(100.0, 50.0, 'd');
		equations[1] = new MathEquation(25.0, 92.0, 'a');
		equations[2] = new MathEquation(225.0, 17.0, 's');
		equations[3] = new MathEquation(11.0, 3.0, 'm');
		
		for(MathEquation equation : equations){
			equation.execute();
			System.out.print("result = ");
			System.out.println(equation.result);
		}
	}
	
	public MathEquation(){}
	
	public MathEquation(char opCode){
		this.opCode = opCode;
	}
	
	public MathEquation(double leftVal, double rightVal, char opCode){
		this(opCode);
		this.leftVal = leftVal;
		this.rightVal = rightVal;
	}
	
	public void execute(){
		switch(opCode){
			case 'a':
				result = leftVal + rightVal;
				break;
			case 's':
				result = leftVal - rightVal;
				break;
			case 'd':
				result = rightVal != 0? leftVal / rightVal : 0.0;
				break;
			case 'm':
				result = leftVal * rightVal;
				break;
			default:
				System.out.println("Invalid opCode");
				result = 0.0;
				break;
		}
	}
	
	public static MathEquation create(double leftVal, double rightVal, char opCode){
		MathEquation equation = new MathEquation();
		equation.leftVal = leftVal;
		equation.rightVal = rightVal;
		equation.opCode = opCode;
		return equation;
	}
}
