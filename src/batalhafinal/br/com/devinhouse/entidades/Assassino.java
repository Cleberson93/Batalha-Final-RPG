package batalhafinal.br.com.devinhouse.entidades;

public class Assassino extends ClasseCombate {
	
	private final static int ataque = 35;
	private final static int defesa = 20;
	private final static int vida = 100;
	private final static Arma[] arma = {new Arma ("Adaga", 8), new Arma ("Espada", 10)};
	
	public Assassino() {
		super(ataque, defesa, vida, arma);
		
	}
}
