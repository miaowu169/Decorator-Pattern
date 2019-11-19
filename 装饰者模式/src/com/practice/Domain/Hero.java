package com.practice.Domain;

/*
 *Component抽象构件类
 *@param heroHurt 英雄伤害值
 *@parem HeroLife 英雄生命值 
 */

public abstract class Hero {
	String description = "Unknown Hero";
	
	public String getDescription() {
		return description;
	}
	
	public abstract double heroHurt();
	public abstract double heroLife();
}
