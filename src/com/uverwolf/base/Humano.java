package com.uverwolf.base;

public class Humano {
	protected String nombre;
	protected int fuerza=3,sigilo=3,inteligencia = 3;
	protected int vida =100;
	public Humano() {
		
	}
	public Humano (String nombre){
		this.nombre = nombre;
	}
	public void atacar(Humano target,int fuerza) {
		System.out.println(this.nombre+" a atacado a "+target.getNombre()+".\n"+target.getNombre()+" pierde "+fuerza+" de vida!!");
		target.vida-=fuerza;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getFuerza() {
		return fuerza;
	}


	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}


	public int getSigilo() {
		return sigilo;
	}


	public void setSigilo(int sigilo) {
		this.sigilo = sigilo;
	}


	public int getInteligencia() {
		return inteligencia;
	}


	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}


	public int getVida() {
		return vida;
	}


	public void setVida(int vida) {
		this.vida = vida;
	}


}
