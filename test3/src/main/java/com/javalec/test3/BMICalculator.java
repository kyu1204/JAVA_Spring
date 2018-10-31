package com.javalec.test3;

public class BMICalculator {
	private int lowWeight;
	private int normal;
	private int highWeight;
	private int obesity;
	
	public void bmiCalculator(double h,double w) {
		h *= 0.01;
		double result = w / (h * h);
		
		if(result > obesity) {
			System.out.println("비만 입니다.");
		}
		else if(result > highWeight) {
			System.out.println("과체중 입니다.");
		}
		else if(result > normal) {
			System.out.println("정상 입니다.");
		}
		else {
			System.out.println("저체중 입니다.");
		}
	}

	public void setLowWeight(int lowWeight) {
		this.lowWeight = lowWeight;
	}

	public void setNormal(int normal) {
		this.normal = normal;
	}

	public void setHighWeight(int highWeight) {
		this.highWeight = highWeight;
	}

	public void setObesity(int obesity) {
		this.obesity = obesity;
	}
	

}
