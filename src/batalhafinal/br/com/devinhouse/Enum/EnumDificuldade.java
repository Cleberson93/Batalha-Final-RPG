package batalhafinal.br.com.devinhouse.Enum;

public enum EnumDificuldade {
	FACIL(0.8), NORMAL(1), DIFICIL(0.9);
	
	private double nivelDificuldade;
	
	private EnumDificuldade(double nivelDificuldade) {
		this.nivelDificuldade = nivelDificuldade;
	}
	
	public Double getNivelDificuldade() {
		return this.nivelDificuldade;
	}
}
