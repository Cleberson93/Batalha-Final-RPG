package batalhafinal.br.com.devinhouse.entidades;

public class ClasseCombate {
	private int ataque;
	private int defesa;
	private int vida;
	private Arma[] arma;


	public ClasseCombate(int ataque, int defesa, int vida, Arma[] arma) {
		this.ataque = ataque;
		this.defesa = defesa;
		this.vida = vida;
		this.arma = arma;
	}
		
	public int getAtaque() {
		return this.ataque;
	}

	public int getDefesa() {
		return this.defesa;
	}
	
	public void setDefesa(int defesa) {
		this.defesa = defesa;
	}

	public int getVida() {
		return this.vida;
	}
	
	public Arma[] getArma() {
		return this.arma;
	}

	
}
