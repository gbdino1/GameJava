//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PersonagemView {
    public static void main(String[] args) {

        //criando um objeto do tipo Personagem Mágico
        PersonagemMagico mago = new PersonagemMagico("Gandalf", "Magia", 100);

        // atribuindo valores aos atributos do objeto
        // mago.nome = "Gandalf";
        // mago.nivelEnergia = 100;
        // mago.poderMagico = "Magia";

        // exibindos os valores dos atributos do objeto
        System.out.println(mago.nome + " Energia: " + mago.nivelEnergia + " Poder: " + mago.poderMagico);

        //criando um objeto do tipo Personagem Mágico
        PersonagemMagico elfo = new PersonagemMagico("Lagolas", "Arqueira", 50);

        // atribuindo valores aos atributos do objeto
        // elfo.nome = "Lagolas";
        // elfo.nivelEnergia = 50;
        // elfo.poderMagico = "Arqueira";

        // exibindos os valores dos atributos do objeto
        System.out.println(elfo.nome + " Energia: " + elfo.nivelEnergia + " Poder: " + elfo.poderMagico);

        // novo personagem
        PersonagemMagico cavaleiro = new PersonagemMagico("Branco");
        System.out.println(cavaleiro.nome + " Energia: " + cavaleiro.nivelEnergia + " Poder: " + cavaleiro.poderMagico);

    }
}