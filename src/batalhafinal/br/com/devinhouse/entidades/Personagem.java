package batalhafinal.br.com.devinhouse.entidades;

import batalhafinal.br.com.devinhouse.Enum.EnumMotivacao;
import batalhafinal.br.com.devinhouse.Enum.EnumSexo;

public class Personagem {
		private EnumMotivacao enumMotivacao;
		private EnumSexo enumSexo;
		private String nome;
		private int vidaAtual;
		private Arma arma;
		private ClasseCombate classeCombate;
		
		public Personagem(EnumMotivacao enumMotivacao, EnumSexo enumSexo, String nome, int arma, ClasseCombate classeCombate) {
		
			this.enumMotivacao = enumMotivacao;
			this.enumSexo = enumSexo;
			this.nome = nome;
			this.vidaAtual = classeCombate.getVida();
			this.arma = classeCombate.getArma()[arma];
			this.classeCombate = classeCombate;
		}
		
		public EnumMotivacao getEnumMotivacao() {
			return this.enumMotivacao;
		}
		
		public EnumSexo getEnumSexo() {
			return this.enumSexo;
		}
		
		public String getNome() {
			return this.nome;
		}
		
		public int getVidaAtual() {
			return this.vidaAtual;
		}
		
		public int getAtaqueTotal( ) {
			return this.classeCombate.getAtaque()+this.getArma().getDano();
		}
		
		public int getDefesaTotal() {
			return this.classeCombate.getDefesa();
		}
		
		public int getVidaTotal( ) {
			return this.classeCombate.getVida();
		}
		public Arma getArma() {
			return this.arma;
		}
		
		public ClasseCombate getClasseCombate() {
			return this.classeCombate;
		}
		
		public void tomarDano (int dano) {
			this.vidaAtual -= dano;
		}
		
		public void recuperarVida () {
			this.vidaAtual = this.classeCombate.getVida();
		}
}
