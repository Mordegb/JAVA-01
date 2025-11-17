public class atendente extends funcionario {

    public atendente(){
          this.nome = "linus";
          this.idade = 18;
          this.salario = 1.518;
          this.nivelDeAcesso = 1;
          this.ativo = true;
    }

    public atendente(String nome, Integer idade, Double salario, Integer nivelDeAcesso) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.nivelDeAcesso = nivelDeAcesso;
        this.ativo = true;
    }

    @Override
    public void tirarFerias() {
        super.tirarFerias();
    }

    @Override
    public void apresentar() {
        System.out.println("olá meu nome é "+this.nome+",e sou "+ this.getClasse()+" dessa empresa");
    }



   /* @Override
    public String getClasse() {
        return super.getClasse();
    }*/
}
