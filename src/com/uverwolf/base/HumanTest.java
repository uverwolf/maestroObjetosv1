package com.uverwolf.base;

public class HumanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Humano leo = new Humano ("leo");
		Humano jose = new Humano("jose");
		jose.atacar(leo,jose.getFuerza());
		System.out.println(leo.getVida());
	}	

}
