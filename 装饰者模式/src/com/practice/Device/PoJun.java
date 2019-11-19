package com.practice.Device;

import com.practice.Decorator.Decorator;
import com.practice.Domain.Hero;

/*
 * PoJun类（装饰角色)
 * 增加英雄伤害值
 */

public class PoJun extends Decorator{
	Hero hero;
	
	public PoJun(Hero hero) {
		this.hero = hero;
	}
	
	public String getDescription() {
		return hero.getDescription() + "->购买装备破军,增加150物理攻击<-\n";
	}
	
	public double heroHurt() {
		return hero.heroHurt() + 150;
	}

	public double heroLife() {
		return hero.heroLife() + 0;
	}
}
