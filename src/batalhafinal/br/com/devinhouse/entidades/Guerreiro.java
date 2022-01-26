package batalhafinal.br.com.devinhouse.entidades;

public class Guerreiro extends ClasseCombate {
	
	private final static int ataque = 25;
	private final static int defesa = 40;
	private final static int vida = 100;
	private final static Arma[] arma = {new Arma ("Machado", 10), new Arma ("Martelo", 8), new Arma ("Clava", 8)};
	
	public Guerreiro() {
		super(ataque, defesa, vida, arma);
	}
}
