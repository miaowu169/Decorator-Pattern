package com.practice.Device;

import com.practice.Decorator.Decorator;
import com.practice.Domain.Hero;
/*
 * BaZheZhongZhuang类
 * 增加英雄生命值
 */

public class BaZheZhongZhuang extends Decorator
{
	Hero hero;
	public BaZheZhongZhuang(Hero hero) {
		this.hero = hero;
	}
	
	public String getDescription() {
		return hero.getDescription() + "->购买霸者重装，生命值提升2000<-\n";
	}
	
	public double heroHurt() {
		return hero.heroHurt() + 0;
	}

	public double heroLife() {
		return hero.heroLife() + 2000;
	}
	
}
