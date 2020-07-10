package com.uverwolf.clases;

public class ClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wizard leo = new Wizard("leo");
		Ninja jose = new Ninja("jose");
		Samurai gintoki = new Samurai("Gintoki");
		leo.heal(jose, leo.getInteligencia());
		leo.fireBall(jose, leo.getInteligencia());
		jose.steal(leo, jose.getSigilo());
		jose.runAway();
		gintoki.deathBlow(jose);
		gintoki.meditate();
		gintoki.meditate();
		gintoki.howMany();
		
	}

}
