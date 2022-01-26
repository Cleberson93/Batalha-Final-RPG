package batalhafinal.br.com.devinhouse.entidades;

public class Mago extends ClasseCombate {
	
	private final static int ataque = 35;
	private final static int defesa = 20;
	private final static int vida = 100;
	private final static Arma[] arma = {new Arma ("Livro", 10), new Arma ("Cajado", 8)};
	
	public Mago() {
		super(ataque, defesa, vida, arma);}
	
}
