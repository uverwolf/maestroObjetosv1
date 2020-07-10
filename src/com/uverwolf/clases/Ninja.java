package com.uverwolf.clases;
import com.uverwolf.base.Humano;
public class Ninja extends Humano {
	
	Ninja(String nombreNinja){
		nombre = nombreNinja;
		sigilo=10;
	}
	
	public void steal(Humano objectivo,int amount) {
		objectivo.setVida(objectivo.getVida() - amount);
		this.vida+=amount;
		System.out.println(this.getNombre()+" uso steal!");
	}
	public void runAway() {
		System.out.println("jose a huido pierde 10 de vida.");
		this.vida-=10;
	}
}
