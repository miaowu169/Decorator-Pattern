package com.practice.Device;

import com.practice.Decorator.Decorator;
import com.practice.Domain.Hero;

/*
 * FengBao类(铭文：风暴——具体类的装饰类)
 * 
 */

public class FengBao extends Decorator{
	Hero hero;	
	
	public FengBao(Hero hero) {
		this.hero = hero;
	}
	
	public String getDescription() {
		return  "->装备风暴铭文，增加0.5%暴击效果<-\n";
	}

	public double heroHurt() {
		return (1+0.05)*hero.heroHurt();
	}

	public double heroLife() {
		return hero.heroLife()+0;
	}
}
