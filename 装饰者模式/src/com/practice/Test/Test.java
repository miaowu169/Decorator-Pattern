package com.practice.Test;

import com.practice.Device.BaZheZhongZhuang;
import com.practice.Device.FengBao;
import com.practice.Device.PoJun;
import com.practice.Domain.Hero;
import com.practice.Domain.HouYi;
/*
 * ������
 */

public class Test {
	public static void main(String[] args) {
		Hero Houyi = new HouYi();
		System.out.println(Houyi.getDescription() + "�����˺�:" + Houyi.heroHurt());
		System.out.println(Houyi.getDescription() + "��������ֵ:" + Houyi.heroLife());
		Houyi = new FengBao(Houyi);
		Houyi = new PoJun(Houyi);
		Houyi = new BaZheZhongZhuang(Houyi);
		
		System.out.println(Houyi.getDescription() + "�˺�ֵ" + Houyi.heroHurt());
		System.out.println("����ֵ" + Houyi.heroLife());
	}
}