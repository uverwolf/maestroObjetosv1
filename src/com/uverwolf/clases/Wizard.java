package com.uverwolf.clases;
import com.uverwolf.base.Humano;
public class Wizard extends Humano{
	
	Wizard(String nombreMago){
		nombre= nombreMago;
		vida=50;
		inteligencia=8;		
	}
	
	public void heal(Humano objectivo, int amount) {
		System.out.println("El mago a curado a "+objectivo.getNombre());
		objectivo.setVida(objectivo.getVida() + amount);
		
	}
	public void fireBall(Humano objectivo,int amount) {
		System.out.println("El mago lanzo una bola de fuego a "+objectivo.getNombre());
		objectivo.setVida(objectivo.getVida() - amount);
	}
}
