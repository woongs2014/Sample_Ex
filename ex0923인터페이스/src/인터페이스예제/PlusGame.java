package 인터페이스예제;

import java.util.Random;

public class PlusGame implements IGame {
	
	
	
	private int num1;
	private int num2;
	private Random ran = new Random();
	private String oper = null;
	private int quizPa = 0;

	@Override
	public void makeRandom() {
		num1 = ran.nextInt(9) +1;
		num2 = ran.nextInt(9) +1;
		
	}

	@Override
	public String getQuizMsg() {
		quizPa = ran.nextInt(4)+1;
		oper = null;
		switch (quizPa){
		case 1: {
			oper = " + ";
			break;
		}
		case 2:{
			oper = " - ";
			break;
		}
		case 3: {
			oper = " * ";
			break;
		}
		case 4: {
			oper = " / ";
			break;
		}
		}
		String result = num1 + oper +num2 + " = "; 

		return result;
	}

	@Override
	public boolean checkAnswer(int answer) {
		boolean result = false;
		switch (quizPa){
		case 1: {
			result =(num1+num2 == answer);
			break;
		}
		case 2:{
			result =(num1-num2 == answer);
			break;
		}
		case 3: {
			result =(num1*num2 == answer);
			break;
		}
		case 4: {
			result =(num1/num2 == answer);
			break;
		}
		
		
		}
		return result;
		
	}

}
