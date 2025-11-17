 abstract class funcionario {
    //atributos
    public String nome;
    public Integer idade;
    public Double salario;
    public Integer nivelDeAcesso;
    public Boolean ativo;

    public funcionario(String nome, Integer idade, Double salario, Integer nivelDeAcesso) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.nivelDeAcesso = nivelDeAcesso;
        this.ativo = true;
    }

    public funcionario(){
        this.nome = "linus";
        this.idade = 18;
        this.salario = 1.518;
        this.nivelDeAcesso = 1;
        this.ativo = true;
    }

    public void tirarFerias(){
        this.ativo = false;
    }

    public abstract void apresentar();

    public void promocao(){
        this.nivelDeAcesso++;
    }

     public String getClasse() { //função que retorna o nome da classe
         return this.getClass().getSimpleName();
     }

     public Double calcularDecimoTerceiro(int MesesTrabalhados) {
        return ((this.salario/12)*MesesTrabalhados);
     }


 }
