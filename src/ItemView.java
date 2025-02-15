import java.sql.SQLOutput;
import java.util.Scanner;


public class ItemView {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Item item = null;
        int op;

        do {
            System.out.println("Escolha uma opção: \n1-Cadastrar Item \n2-Exibir item \n0-Sair");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Digite o nome do item: ");
                    String nome = sc.next() + sc.nextLine();
                    System.out.println("Digite a descrição do item: ");
                    String descricao = sc.next() + sc.nextLine();
                    System.out.println("O item é raro? (true/false): ");
                    boolean raro = sc.nextBoolean();
                    System.out.println("Digite o nível de poder: ");
                    int nivelPoder = sc.nextInt();
                    item = new Item(nome, descricao, raro, nivelPoder);
                    break;
                case 2:
                    if (item != null) {
                        System.out.println("Nome: " + item.nome + " Descrição: " + item.descricao + " Raro: " + item.raro + " Nível de poder: " + item.nivelPoder);
                    } else {
                        System.out.println("Nenhum item cadastrado ainda.");
                    }
                    break;
                case 0:
                    System.out.println("Finalizando o programa...");
                    break;
                default:
                    System.out.println("Opção Inválida");
            }
        }while (op != 0);

        sc.close();
    }
}
