package com.practice.Domain;

public class HouYi extends Hero {
	/*
	 * ConcreteComponent具体构件:ConcreteComponent是最核心，最原始，最基本的接口或抽象类的实现
	 */
	public HouYi() {
		description = "后羿";
	}
	
	public double heroHurt() {
		return 300;
	}
	
	public double heroLife() {
		return 3000;
	}
}
