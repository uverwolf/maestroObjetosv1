package com.uverwolf.clases;
import com.uverwolf.base.Humano;
public class Samurai extends Humano{

	Samurai (String nombreSamurai){
		nombre =nombreSamurai;
		vida= 200;
	}
	public void deathBlow(Humano objetivo) {
		objetivo.setVida(0);
		setVida(getVida()/2);
		System.out.println(nombre+" a asesinado a "+objetivo.getNombre());
	}
	public void meditate() {
		System.out.println(nombre+" esta meditando");
		this.setVida((getVida()/2)+getVida());
	}
	public void howMany() {
		System.out.println("la vida de "+nombre+" es "+getVida());
	}
}
