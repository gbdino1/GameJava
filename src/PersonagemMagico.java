public class PersonagemMagico {

    //Atributos
    String nome;
    String poderMagico;
    int nivelEnergia;

    HabilidadeEspecial habilidadeEspecial;

    public PersonagemMagico() {
    }

    public PersonagemMagico(String nome, String poderMagico, int nivelEnergia) {
        this.nome = nome;
        this.poderMagico = poderMagico;
        this.nivelEnergia = nivelEnergia;
    }

    public PersonagemMagico(String nome){
        this.nome = nome;
    }

    public void atacar(String ataque){
        if (nivelEnergia >= 10) {
            System.out.println(nome + " realiuzou um ataque: " + ataque + "!");
            nivelEnergia -= 10;
        } else {
            System.out.println(nome + " está sem energia para atacar.");
        }
    }

    public int aumentarEnergia(int energia){
        nivelEnergia = nivelEnergia + energia;
        return nivelEnergia;
    }

    public void ativarHabilidadeEspecial(){
        if (!habilidadeEspecial.habilitada){
            System.out.println("Habilidade especial não está ativada");
        } else if (nivelEnergia >= habilidadeEspecial.custoEnergia){
            System.out.println("Ativando a habilidade: " + habilidadeEspecial.nome);
            nivelEnergia -= habilidadeEspecial.custoEnergia;
        } else {
            System.out.println(nome + " está sem energia para a habilidade especial");
        }
    }
}