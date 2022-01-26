package batalhafinal.br.com.devinhouse.Main;

import java.util.Scanner;

import batalhafinal.br.com.devinhouse.Enum.EnumDificuldade;
import batalhafinal.br.com.devinhouse.Enum.EnumMotivacao;
import batalhafinal.br.com.devinhouse.Enum.EnumSexo;
import batalhafinal.br.com.devinhouse.entidades.Assassino;
import batalhafinal.br.com.devinhouse.entidades.Atirador;
import batalhafinal.br.com.devinhouse.entidades.ClasseCombate;
import batalhafinal.br.com.devinhouse.entidades.Dado;
import batalhafinal.br.com.devinhouse.entidades.DadoP;
import batalhafinal.br.com.devinhouse.entidades.Guerreiro;
import batalhafinal.br.com.devinhouse.entidades.Luta;
import batalhafinal.br.com.devinhouse.entidades.Mago;
import batalhafinal.br.com.devinhouse.entidades.OrqueAlquimista;
import batalhafinal.br.com.devinhouse.entidades.OrqueArmeiro;
import batalhafinal.br.com.devinhouse.entidades.OrqueChefe;
import batalhafinal.br.com.devinhouse.entidades.Personagem;

public class Main {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Seja bem vindo(a) � BATALHA FINAL!");
	System.out.println("Escolha o n�vel de Dificuldade");
		int opcao = 0;
		EnumDificuldade enumDificuldade = null;
		
		do {
			System.out.println("1 - F�CIL");
			System.out.println("2 - NORMAL");
			System.out.println("3 - DIF�CIL");
			opcao = scan.nextInt();
			switch (opcao) {
			case 1 : enumDificuldade = EnumDificuldade.FACIL;
			break;
			case 2: enumDificuldade = EnumDificuldade.NORMAL;
			break;
			case 3 : enumDificuldade = EnumDificuldade.DIFICIL;
			break;
			default : System.out.println("Op��o Inv�lida!");
			}
			
		}while(enumDificuldade == null);
	System.out.println("Qual o seu Nome?");
		String nome = scan.next();
		
		
	System.out.println("Qual seu Sexo?");
		EnumSexo enumSexo= null;
		do {
			System.out.println("1 - MASCULINO");
			System.out.println("2 - FEMININO");
			opcao = scan.nextInt();
			switch (opcao) {
			case 1 : enumSexo = EnumSexo.MASCULINO;
			break;
			case 2: enumSexo = EnumSexo.FEMININO;
			break;
			default : System.out.println("Op��o Inv�lida!");
			}
		}while(enumSexo == null);
		
	System.out.println("Escolha sua Classe de Combate!");
		ClasseCombate classeCombate = null;
		
		do {
			System.out.println("1 - Guerreiro");
			System.out.println("2 - Atirador");
			System.out.println("3 - Mago");
			System.out.println("4 - Assassino");
			opcao = scan.nextInt();
			switch (opcao) {
			case 1 : classeCombate = new Guerreiro();
			break;
			case 2: classeCombate= new Atirador();
			break;
			case 3 : classeCombate = new Mago();
			break;
			case 4 : classeCombate = new Assassino();
			break;
			default : System.out.println("Op��o Inv�lida!");
			}
			
		}while(classeCombate == null);
		
	System.out.println("Escolha sua Arma!");
		int armaEscolhida = -1;
		while (armaEscolhida == -1) {
			for (int i = 0; i < classeCombate.getArma().length; i++) {
				System.out.printf("%d - %s %n", i + 1,classeCombate.getArma()[i].getNome());
			}
			opcao = scan.nextInt(); 
			if (opcao > 0 && opcao <=classeCombate.getArma().length) {
				armaEscolhida = opcao - 1;
			}
			else {
				System.out.println("Op��o Inv�lida!");
			}
		}
		
	System.out.println("A noite se aproxima, a lua j� surge no c�u, estrelas v�o se acendendo, e sob a luz do crep�sculo voc� est� prestes a entrar na fase final da sua miss�o. Voc� olha para o portal � sua frente, e sabe que a partir desse ponto, sua vida mudar� para sempre.");
	System.out.println("Mem�rias do caminho percorrido para chegar at� aqui invadem sua mente. Voc� se lembra de todos os inimigos j� derrotados para alcan�ar o covil do l�der maligno. Olha para seu equipamento de combate, j� danificado e desgastado depois de tantas lutas. Voc� est� a um passo de encerrar para sempre esse mal.");
	System.out.println("Buscando uma inje��o de �nimo, voc� se for�a a lembrar o que te trouxe at� aqui.");
	System.out.println("Escolha sua motiva��o para invadir a caverna do inimigo e derrot�-lo: VINGAN�A, GL�RIA");
	EnumMotivacao enumMotivacao= null;
	do {
		System.out.println("1 - VINGAN�A");
		System.out.println("2 - GL�RIA");
		opcao = scan.nextInt();
		switch (opcao) {
		case 1 : enumMotivacao = EnumMotivacao.VINGAN�A;
				System.out.println("Imagens daquela noite tr�gica invadem sua mente. Voc� nem precisa se esfor�ar para lembrar, pois essas mem�rias est�o sempre presentes, mesmo que de pano de fundo, quando voc� tem outros pensamentos em foco, elas nunca o deixaram.\nElas s�o o combust�vel que te fizeram chegar at� aqui. E voc� sabe que n�o ir� desistir at� ter vingado a morte daqueles que foram - e pra sempre ser�o - sua fonte de amor e desejo de continuar vivo.\nO maldito l�der finalmente pagar� por tanto mal causado na vida de tantos (e principalmente na sua).");
		break;
		case 2: enumMotivacao = EnumMotivacao.GLORIA;
				System.out.println("Voc� j� consegue visualizar na sua mente o povo da cidade te recebendo de bra�os abertos, bardos criando can��es sobre seus feitos her�icos, nobres te presenteando com j�ias e diversas riquezas, taberneiros se recusando a cobrar por suas bebedeiras e comilan�as.\nDesde j�, voc� sente o amor do p�blico, te louvando a cada passo que d� pelas ruas, depois de destruir o vil�o que tanto assombrou a paz de todos.\nPor�m, voc� sabe que ainda falta o �ltimo ato dessa hist�ria. Voc� se concentra na miss�o. A gl�ria o aguarda, mas n�o antes da �ltima batalha.");
		break;
		default : System.out.println("Op��o Inv�lida!");
		}
	}while(enumMotivacao == null);
	
	Personagem personagem = new Personagem(enumMotivacao, enumSexo, nome, armaEscolhida, classeCombate);
	
	System.out.println("Inspirado pelo motivo que te trouxe at� aqui, voc� sente seu cora��o ardendo em chamas, suas m�os formigarem em volta da sua arma. Voc� a segura com firmeza. Seu foco est� renovado. Voc� avan�a pelo portal.");
	System.out.println("A escurid�o te envolve. Uma ilumina��o muito fraca entra pelo portal �s suas costas. � sua frente, s� � poss�vel perceber que voc� se encontra em um corredor extenso. Voc� s� pode ir � frente, ou desistir.");
	do {
		System.out.println("1 - SEGUIR");
		System.out.println("2 - DESISTIR");
		opcao = scan.nextInt();
		switch (opcao) {
		case 1 : System.out.println("Voc� caminha, atento a todos os seus sentidos, por v�rios metros, at� visualizar a frente uma fonte de luz, que voc� imagina ser a chama de uma tocha, vindo de dentro de uma porta aberta.");
		break;
		case 2: System.out.println("O medo invade o seu cora��o e voc� sente que ainda n�o est� � altura do desafio. Voc� se volta para a noite l� fora e corre em dire��o � seguran�a.");
		return;
		default : System.out.println("Op��o Inv�lida!");
		opcao = 0;
		}
	}while(opcao == 0);
	
	System.out.println("Voc� se pergunta se dentro dessa sala pode haver inimigos, ou alguma armadilha, e pondera sobre como passar pela porta.");
	do {
		System.out.println("1 - ANDANDO CUIDADOSAMENTE");
		System.out.println("2 - CORRENDO");
		System.out.println("3 - SALTANDO");
		opcao = scan.nextInt();
		switch (opcao) {
		case 1 : System.out.println("Voc� toma cuidado e vai caminhando vagarosamente em dire��o � luz. Quando voc� pisa exatamente embaixo da porta, voc� sente o ch�o ceder levemente, como se tivesse pisado em uma pedra solta.\nVoc� ouve um ru�do de mecanismos se movimentando, e uma escotilha se abre no teto atr�s de voc�, no corredor. Flechas voam da escotilha em sua dire��o, e voc� salta para dentro da sala, por�m uma delas te acerta na perna.");
		Dado dado = new DadoP();
		int danoArmadilha = dado.rolamento();
		personagem.tomarDano(danoArmadilha);
		System.out.printf("Voc� tomou %d dano da armadilha! %n", danoArmadilha);
		break;
		case 2 : System.out.println("Voc� respira fundo e desata a correr em dire��o � sala. Quando passa pela porta, sente que pisou em uma pedra solta, mas n�o d� muita import�ncia e segue para dentro da sala, olhando ao redor � procura de inimigos.\nN�o tem ningu�m, mas voc� ouve sons de flechas batendo na pedra atr�s de voc�, e quando se vira, v� v�rias flechas no ch�o. Espiando pela porta, voc� entende que pisou em uma armadilha que soltou flechas de uma escotilha aberta no teto, mas por sorte voc� entrou correndo e conseguiu escapar desse ataque surpresa.");
		break;
		case 3: System.out.println("Voc� se concentra e pula em dire��o � luz, saltando de antes da porta at� o interior da sala.");
		break;
		default : System.out.println("Op��o Inv�lida!");
		opcao = 0;
		}
	}while(opcao == 0);
	
	System.out.println("Voc� se encontra sozinho em uma sala quadrada, contendo uma porta em cada parede. Uma delas foi aquela pela qual voc� entrou, que estava aberta, e as outras tr�s est�o fechadas.\nA porta � sua frente � a maior das quatro, com inscri��es em seu entorno em uma l�ngua que voc� n�o sabe ler, mas reconhece como sendo a l�ngua antiga utilizada pelo inimigo.\nVoc� se aproxima da porta e percebe que ela est� trancada por duas fechaduras douradas, e voc� entende que precisar� primeiro derrotar o que estiver nas outras duas portas laterais, antes de conseguir enfrentar o l�der.");
	System.out.println("Voc� se dirige para a porta � direita.");
	System.out.println("Voc� se aproxima, tentando ouvir o que acontece porta adentro, mas n�o escuta nada. Segura com mais for�a sua arma com uma m�o, enquanto empurra a porta com a outra.\nAo entrar, voc� se depara com uma sala espa�osa, com v�rios equipamentos de batalha pendurados nas paredes e dispostos em arm�rios e mesas.\nVoc� imagina que este seja o arsenal do inimigo, onde est�o guardados os equipamentos que seus soldados utilizam quando saem para espalhar o terror nas cidades e vilas da regi�o.");
	System.out.println("Enquanto seu olhar percorre a sala, voc� ouve a porta se fechando e gira rapidamente para olhar para tr�s. Ali, de p� entre voc� e a porta fechada, bloqueando o caminho do seu destino, est� um dos capit�es do inimigo.\nUm orque horrendo, de armadura, capacete e espada em punho, em posi��o de combate. Ele avan�a em sua dire��o.");
	
	Luta lutaArmeiro = new Luta (personagem, new OrqueArmeiro(), enumDificuldade);
	boolean personagemVenceu = lutaArmeiro.lutar(true);
	if (!personagemVenceu) {
		return;
	}
	
	System.out.println("Ap�s derrotar o Armeiro, voc� percebe que seus equipamentos est�o muito danificados, e olha em volta, encarando todas aquelas pe�as de armaduras resistentes e em �timo estado.");
	do {
		System.out.println("1 - PEGAR ARMADURA");
		System.out.println("2 - N�O PEGAR ARMADURA");
		opcao = scan.nextInt();
		switch (opcao) {
		case 1 : System.out.println("Voc� resolve usar os equipamentos do inimigo contra ele, e trocar algumas pe�as suas, que estavam danificadas, pelas pe�as de armaduras existentes na sala. De armadura nova, voc� se sente mais protegido para os desafios � sua frente.");
		personagem.getClasseCombate().setDefesa(personagem.getClasseCombate().getDefesa()+5);
		break;
		case 2: System.out.println("Voc� decide que n�o precisa utilizar nada que venha das m�os do inimigo.");
		break;
		default : System.out.println("Op��o Inv�lida!");
		opcao = 0;
		}
	}while(opcao == 0);
	
	
	System.out.println("Em uma mesa, voc� encontra uma chave dourada, e sabe que aquela chave abre uma das fechaduras da porta do l�der inimigo. Voc� pega a chave e guarda numa pequena bolsa que leva presa ao cinto.");
	System.out.println("Voc� retorna � sala anterior e se dirige � porta da esquerda. Voc� se aproxima, tentando ouvir o que acontece porta adentro, mas n�o escuta nada. Segura com mais for�a sua arma com uma m�o, enquanto empurra a porta com a outra.\nAo entrar, voc� se depara com uma sala parecida com a do arsenal, mas em vez de armaduras, existem v�rios potes e garrafas de vidro com conte�dos misteriosos e de cores diversas,\ne voc� entende que o capit�o que vive ali, realiza experimentos com diversos ingredientes, criando po��es utilizadas pelos soldados para aterrorizar a regi�o.");
	System.out.println("No fundo da sala, olhando em sua dire��o, est� outro dos capit�es do inimigo. Um orque horrendo, de armadura, cajado em punho, em posi��o de combate. Ele avan�a em sua dire��o.");
	
	Luta lutaAlquimista = new Luta (personagem, new OrqueAlquimista(), enumDificuldade);
	personagemVenceu = lutaAlquimista.lutar(true);
	if (!personagemVenceu) {
		return;
	}
	
	System.out.println("Ap�s derrotar o Alquimista, voc� olha em volta, tentando reconhecer alguma po��o do estoque do inimigo.\nEm uma mesa, voc� reconhece uma pequena garrafa de vidro contendo um l�quido levemente rosado, pega a garrafa e pondera se deve beber um gole.");
	do {
		System.out.println("1 - BEBER");
		System.out.println("2 - N�O BEBER");
		opcao = scan.nextInt();
		switch (opcao) {
		case 1 : System.out.println("Voc� se sente revigorado para seguir adiante!");
		personagem.recuperarVida();
		break;
		case 2: System.out.println("Voc� fica receoso de beber algo produzido pelo inimigo");
		break;
		default : System.out.println("Op��o Inv�lida!");
		opcao = 0;
		}
	}while(opcao == 0);
	
	System.out.println("Ao lado da porta, voc� v� uma chave dourada em cima de uma mesa, e sabe que aquela chave abre a outra fechadura da porta do l�der inimigo. Voc� pega a chave e guarda na pequena bolsa que leva presa ao cinto.");
	System.out.println("De volta � sala das portas, voc� se dirige � porta final. Coloca as chaves nas fechaduras, e a porta se abre. Seu cora��o acelera, mem�rias de toda a sua vida passam pela sua mente, e voc� percebe que est� muito pr�ximo do seu objetivo final.\nSegura sua arma com mais firmeza, foca no combate que voc� sabe que ir� se seguir, e adentra a porta.");
	System.out.println("L� dentro, voc� v� o l�der sentado em uma poltrona dourada, com duas fogueiras de cada lado, e prisioneiros acorrentados �s paredes.");
	System.out.println("Ele percebe sua chegada e se levanta com um salto, apanhando seu machado de guerra de l�mina dupla.");
	
	Luta lutaChefe= new Luta (personagem, new OrqueChefe(), enumDificuldade);
	do {
		System.out.println("1 - ATACAR");
		System.out.println("2 - ESPERAR");
		opcao = scan.nextInt();
		switch (opcao) {
		case 1 : personagemVenceu = lutaChefe.lutar(true);
		break;
		case 2: personagemVenceu = lutaChefe.lutar(false);
		break;
		default : System.out.println("Op��o Inv�lida!");
		opcao = 0;
		}
	}while(opcao == 0);
	
	if (!personagemVenceu) {
		return;
	}
	System.out.println("Voc� conseguiu!");
	switch (personagem.getEnumMotivacao()) {
	case VINGAN�A: System.out.println("Voc� obteve sua vingan�a.\nVoc� se ajoelha e cai no choro, invadido por uma sensa��o de al�vio e felicidade. Voc� se vingou, tudo que sempre quis, est� feito. Agora voc� pode seguir sua vida.");
	break;
	case GLORIA: System.out.println("O �xtase em que voc� se encontra n�o cabe dentro de si. Voc� se ajoelha e grita de alegria. A gl�ria o aguarda, voc� a conquistou.");
	break;
	}
	
	System.out.println("Voc� se levanta, olha para os prisioneiros, vai de um em um e os liberta, e todos voc�s saem em dire��o � noite, retornando � cidade. Seu dever est� cumprido.");
	System.out.println("FIM DE JOGO!");
	}
	
	
}
