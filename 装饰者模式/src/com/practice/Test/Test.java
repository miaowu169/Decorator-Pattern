package com.practice.Test;

import com.practice.Device.BaZheZhongZhuang;
import com.practice.Device.FengBao;
import com.practice.Device.PoJun;
import com.practice.Domain.Hero;
import com.practice.Domain.HouYi;
/*
 * 测试类
 */

public class Test {
	public static void main(String[] args) {
		Hero Houyi = new HouYi();
		System.out.println(Houyi.getDescription() + "基础伤害:" + Houyi.heroHurt());
		System.out.println(Houyi.getDescription() + "基础生命值:" + Houyi.heroLife());
		Houyi = new FengBao(Houyi);
		Houyi = new PoJun(Houyi);
		Houyi = new BaZheZhongZhuang(Houyi);
		
		System.out.println(Houyi.getDescription() + "伤害值" + Houyi.heroHurt());
		System.out.println("生命值" + Houyi.heroLife());
	}
}