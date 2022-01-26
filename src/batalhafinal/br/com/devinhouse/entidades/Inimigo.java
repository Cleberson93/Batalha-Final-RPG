package batalhafinal.br.com.devinhouse.entidades;

public class Inimigo {
	private int ataque;
	private int defesa;
	private int vida;
	
	
	public Inimigo(int ataque, int defesa, int vida) {
		this.ataque = ataque;
		this.defesa = defesa;
		this.vida = vida;
	}
	
	public int getAtaque() {
		return this.ataque;
	}
	
	public int getDesefa() {
		return this.defesa;
	}
	
	public int getVida() {
		return this.vida;
	}
	
	public void tomarDano (int dano) {
		this.vida -= dano;
	}
}


