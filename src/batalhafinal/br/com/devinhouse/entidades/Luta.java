package batalhafinal.br.com.devinhouse.entidades;

import java.util.Scanner;

import batalhafinal.br.com.devinhouse.Enum.EnumDificuldade;

public class Luta {
	private Personagem personagem;
	private Inimigo inimigo;
	private EnumDificuldade enumDificuldade;
	private Dado dado;
	
	public Luta(Personagem personagem, Inimigo inimigo, EnumDificuldade enumDificuldade) {
		super();
		this.personagem = personagem;
		this.inimigo = inimigo;
		this.enumDificuldade = enumDificuldade;
		this.dado = new DadoG ();
	}
	
	public Personagem getPersonagem() {
		return this.personagem;
	}

	public Inimigo getInimigo() {
		return inimigo;
	}

	public void setInimigo(Inimigo inimigo) {
		this.inimigo = inimigo;
	}
	
	public EnumDificuldade getEnumDificuldade() {
		return this.enumDificuldade;
	}
	
	public boolean lutar (boolean personagemComeca){
		Scanner scanner = new Scanner (System.in);
		boolean ehTurnoPersonagem = personagemComeca;
		
		while (personagem.getVidaAtual() > 0 && inimigo.getVida() > 0) {
			if (ehTurnoPersonagem) {
				int opcao = 0;
				while (opcao == 0){
					System.out.println("Atacar ou Fugir");
					System.out.println("1 - Atacar");
					System.out.println("2 - Fugir");
					opcao = scanner.nextInt();
					switch (opcao) {
					case 1 : {
						this.personagemAtaca();
						ehTurnoPersonagem = false;
						break;
					}
					case 2 : {
						System.out.println("Voc� n�o estava preparado para a for�a do inimigo, e decide fugir para que possa tentar novamente em uma pr�xima vez.");
						return false;
					}
					default : {
						System.out.println("Op��o inv�lida!");
						opcao = 0;
					}
					}
				}
						
			}
			else {
				this.inimigoAtaca();
				ehTurnoPersonagem = true;
			}
		}
		if (inimigo.getVida() < 0) {
			System.out.println("O inimigo n�o � p�reo para o seu hero�smo, e jaz im�vel aos seus p�s.");
			return true;
		}
		else {
			System.out.println("Voc� n�o estava preparado para a for�a do inimigo.");
			switch (personagem.getEnumMotivacao()) {
			case VINGAN�A : 
				System.out.println("N�o foi poss�vel concluir sua vingan�a, e agora resta saber se algu�m se vingar� por voc�.");
				break;
			case GLORIA : 
				switch (personagem.getEnumSexo()) {
				case MASCULINO : 
					System.out.println ("A gl�ria que buscavas n�o ser� sua, e a cidade aguarda por seu pr�ximo her�i.");
					break;
				case FEMININO: 
					System.out.println ("A gl�ria que buscavas n�o ser� sua, e a cidade aguarda por sua pr�xima her�ina.");
					break;
				}
			}
			return false; 	
		}
		
	}
	
	public void personagemAtaca () {
		int rolamentoDado = dado.rolamento();
		if (rolamentoDado == 1) {
			System.out.println("Voc� errou seu ataque! O inimigo n�o sofreu dano algum.");
		}
		else if (rolamentoDado == 20) {
			int dano = personagem.getAtaqueTotal()+rolamentoDado;
			if (this.getEnumDificuldade() == EnumDificuldade.DIFICIL) {
				dano = (int) (dano * this.getEnumDificuldade().getNivelDificuldade());
			}
			inimigo.tomarDano(dano);
			System.out.printf("Voc� acertou um ataque cr�tico! Voc� atacou com seu/sua %s e causou %d de dano no inimigo! %n", personagem.getArma().getNome(), dano);
		}
		else {
			int dano = personagem.getAtaqueTotal()+rolamentoDado-inimigo.getDesefa();
			if (this.getEnumDificuldade() == EnumDificuldade.DIFICIL) {
				dano = (int) (dano * this.getEnumDificuldade().getNivelDificuldade());
			}
			inimigo.tomarDano(dano);
			System.out.printf("Voc� atacou com seu/sua %s e causou %d de dano no inimigo! %n", personagem.getArma().getNome(), dano);
		}
	}
	
	public void inimigoAtaca () {
		int rolamentoDado = dado.rolamento();
		if (rolamentoDado == 1) {
			System.out.println("O inimigo errou seu ataque! Voce n�o sofreu dano algum.");
		}
		else if (rolamentoDado == 20) {
			int dano = inimigo.getAtaque()+rolamentoDado;
			if (this.getEnumDificuldade() == EnumDificuldade.FACIL) {
				dano = (int) (dano * this.getEnumDificuldade().getNivelDificuldade());
			}
			personagem.tomarDano(dano);
			System.out.printf("O inimigo acertou um ataque cr�tico! Voc� sofreu %d de dano e agora possui %d pontos de vida.%n", dano, personagem.getVidaAtual());
		}
		else {
			int dano = inimigo.getAtaque()+rolamentoDado-personagem.getClasseCombate().getDefesa();
			if (this.getEnumDificuldade() == EnumDificuldade.FACIL) {
				dano = (int) (dano * this.getEnumDificuldade().getNivelDificuldade());
			}
			personagem.tomarDano(dano);
			System.out.printf("O inimigo atacou! Voc� sofreu %d de dano e agora possui %d pontos de vida.%n", dano, personagem.getVidaAtual());
		}
	}
	
	
}
