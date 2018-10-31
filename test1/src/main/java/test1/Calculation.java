package test1;

public class Calculation {
	private int firstNum;
	private int secontNum;
	
	public void add() {
		System.out.println("add()");
		int result = this.firstNum + this.secontNum;
		System.out.println(this.firstNum+" + "+this.secontNum+" = "+result);
	}
	public void sub() {
		System.out.println("sub()");
		int result = this.firstNum - this.secontNum;
		System.out.println(this.firstNum+" - "+this.secontNum+" = "+result);
	}
	public void mul() {
		System.out.println("mul()");
		int result = this.firstNum * this.secontNum;
		System.out.println(this.firstNum+" * "+this.secontNum+" = "+result);
	}
	public void div() {
		System.out.println("div()");
		int result = this.firstNum / this.secontNum;
		System.out.println(this.firstNum+" / "+this.secontNum+" = "+result);
	}
	
	public void setFirstNum(int n) {
		this.firstNum = n;
	}
	public void setSecondNum(int n) {
		this.secontNum = n;
	}
}
