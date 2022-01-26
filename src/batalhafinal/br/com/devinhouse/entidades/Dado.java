package batalhafinal.br.com.devinhouse.entidades;

import java.util.Random;

public class Dado {
	private Random random;
	private int valor;
	
	public Dado(int valor) {
		this.random = new Random ();
		this.valor = valor;
	}
	
	public int getValor() {
		return this.valor;
	}
	
	public int rolamento( ) {
		return random.nextInt(valor)+1;
	}
}
