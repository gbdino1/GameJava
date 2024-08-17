import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PersonagemMagico personagem = new PersonagemMagico();

        int op;
        do {
            System.out.println("Escolha uma opção: \n1-Cadastrar Personagem \n2-Exibir Personagem " +
                    "\n3-Atacar \n4-Aumentar energia \n5-Ativar Habilidade especial \n6-Habilitar a atividae especial \n0=Sair");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Digite o nome do personagem: ");
                    String nome = sc.next() + sc.nextLine();
                    System.out.println("Digite o poder do personagem: ");
                    String poder = sc.next() + sc.nextLine();
                    System.out.println("Digite o nível de energia: ");
                    int energia = sc.nextInt();
                    personagem.nome = nome;
                    personagem.nivelEnergia = energia;
                    personagem.poderMagico = poder;

                    System.out.println("Digite o nome da habilidade especial:");
                    String nomeHabilidade = sc.next() + sc.nextLine();
                    System.out.println("Digite o custo de energia para usar a hablidade especial:");
                    int nivelEnergia = sc.nextInt();
                    System.out.println("A habilidade especial está ativada? (true/false):");
                    boolean ativada = sc.nextBoolean();

                    // Objeto que representa a habilidade especial com os valores atribuidos pelo usuário
                    HabilidadeEspecial habilidadeEspecial = new HabilidadeEspecial(nomeHabilidade, nivelEnergia, ativada);
                    // Atribuindo o objeto habilidade especial ao personagem
                    personagem.habilidadeEspecial = habilidadeEspecial;
                    break;
                case 2:
                    System.out.println("Nome " + personagem.nome + " Poder: " + personagem.poderMagico + " Nível de energia: " + personagem.nivelEnergia );
                    System.out.println("Habilidade: " + personagem.habilidadeEspecial.nome + " Custo energia: " + personagem.habilidadeEspecial.custoEnergia + " Habilidade está ativa: " + personagem.habilidadeEspecial.habilitada);
                    break;
                case 3:
                    System.out.println("Digite o nome do ataque:");
                    String ataque = sc.next() + sc.nextLine();
                    personagem.atacar(ataque);
                    break;
                case 4:
                    System.out.println("Digite a quantidade de energia: ");
                    int qtd = sc.nextInt();
                    int nivelAtual = personagem.aumentarEnergia(qtd);
                    System.out.println("Nivel atual de energia é de: " + nivelAtual);
                    break;
                case 5:
                    personagem.ativarHabilidadeEspecial();
                case 6:
                    personagem.habilidadeEspecial.ativarHabilidade();
                    break;
                case 0:
                    System.out.println("Finalizando o programa");
                    break;
                default:
                    System.out.println("Opção Inválida");
            }
        }while (op != 0);
        sc.close();
    }
}
