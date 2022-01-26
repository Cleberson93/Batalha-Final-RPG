package batalhafinal.br.com.devinhouse.entidades;

public class Atirador extends ClasseCombate {
	
	private final static int ataque = 35;
	private final static int defesa = 20;
	private final static int vida = 100;
	private final static Arma[] arma = {new Arma ("ArcoFlecha", 10), new Arma ("BestaVitore", 8)};
	
	public Atirador() {
		super(ataque, defesa, vida, arma);
		
	}


}