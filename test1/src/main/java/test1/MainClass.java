package test1;

public class MainClass {

	public static void main(String[] args) {
		Calculation calc = new Calculation();
		
		calc.setFirstNum(10);
		calc.setSecondNum(5);
		
		calc.add();
		calc.sub();
		calc.mul();
		calc.div();
	}

}
