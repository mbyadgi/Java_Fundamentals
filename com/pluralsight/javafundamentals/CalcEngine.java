package com.pluralsight.javafundamentals;

public class CalcEngine {

	public static void main(String[] args) {
		CalcEngine calcEngine = new CalcEngine();
		//calcEngine.usingIf();
		calcEngine.usingIfAndArray();
		calcEngine.usingSwitchAndArray();
	}
	
	public void usingIf(){

		double val1 = 100.0d;
		double val2 = 50.0d;
		double result;
		char opCode = 'd';
		
		if(opCode == 'a')
			result = val1 + val2;
		else if(opCode == 's')
			result = val1 - val2;
		else if(opCode == 'd')
			/*if(val2 != 0.0d)
				result = val1 / val2;
			else
				result = 0.0d;*/
			// above if else can be replaced by conditional assignment as below
			result = val2 != 0.0d ? val1 / val2 : 0.0d;
		else if(opCode == 'm')
			result = val1 * val2;
		else{
			System.out.println("Invalid opCode");
			result = 0.0d;
		}
		
		System.out.println("result = "+result);
	}
	
	public void usingIfAndArray(){
		double[] leftVals = {100.0, 25.0, 225.0, 11.0};
		double[] rightVals = {50.0, 92.0, 17.0, 3.0};
		char[] opCodes = {'d','a','s','m'};
		double[] results = new double[opCodes.length]; 
		
		for(int i=0;i<opCodes.length;i++){
			if(opCodes[i] == 'a')
				results[i] = leftVals[i] + rightVals[i];
			else if(opCodes[i] == 's')
				results[i] = leftVals[i] - rightVals[i];
			else if(opCodes[i] == 'd')
				results[i] = rightVals[i] != 0? leftVals[i] / rightVals[i] : 0.0;
			else if(opCodes[i] == 'm')
				results[i] = leftVals[i] * rightVals[i];
			else{
				System.out.println("Invalid opCode");
				results[i] = 0.0;
			}
		}
		
		for(double theResult : results){
			System.out.print("result = ");
			System.out.println(theResult);
		}
	}
	
	public void usingSwitchAndArray(){

		double[] leftVals = {100.0, 25.0, 225.0, 11.0};
		double[] rightVals = {50.0, 92.0, 17.0, 3.0};
		char[] opCodes = {'d','a','s','m'};
		double[] results = new double[opCodes.length]; 
		
		for(int i=0;i<opCodes.length;i++){
			switch(opCodes[i]){
				case 'a':
					results[i] = leftVals[i] + rightVals[i];
					break;
				case 's':
					results[i] = leftVals[i] - rightVals[i];
					break;
				case 'd':
					results[i] = rightVals[i] != 0? leftVals[i] / rightVals[i] : 0.0;
					break;
				case 'm':
					results[i] = leftVals[i] * rightVals[i];
					break;
				default:
					System.out.println("Invalid opCode");
					results[i] = 0.0;
					break;
			}
		}
		
		for(double theResult : results){
			System.out.print("result = ");
			System.out.println(theResult);
		}
	}
}
