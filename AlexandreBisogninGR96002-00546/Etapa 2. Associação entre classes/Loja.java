public class Loja {
  private String nome;
  private int quantidadeFuncionarios;
  private double salarioBaseFuncionario;
  private Endereco endereco;
  private Data dataFundacao;

  // construtores
  public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao) {
    this.nome = nome;
    this.quantidadeFuncionarios = quantidadeFuncionarios;
    this.salarioBaseFuncionario = salarioBaseFuncionario;
    this.endereco = endereco;
    this.dataFundacao = dataFundacao;
    
  }

  public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao) {
    this.nome = nome;
    this.quantidadeFuncionarios = quantidadeFuncionarios;
    this.salarioBaseFuncionario = -1;
    this.endereco = endereco;
    this.dataFundacao = dataFundacao;
  }

  // toString
  @Override
  public String toString() {
    return "Loja: " + this.nome + "\n" + 
           "Quantidade de funcionários: " + this.quantidadeFuncionarios + "\n" + 
           "Salario base funcionario: " + this.salarioBaseFuncionario + "\n" + 
           this.endereco + "\n" + 
           "Fundado na " + this.dataFundacao;
  }

  // metodos da regra de negocio
  public double gastosComSalario() {
    if (this.salarioBaseFuncionario == -1) {
      return -1;
    }

    return this.salarioBaseFuncionario * this.quantidadeFuncionarios;
  }

  public char tamanhoDaLoja() {
    if (this.quantidadeFuncionarios < 10) {
      return 'P';
    } else if (this.quantidadeFuncionarios >= 10 && this.quantidadeFuncionarios <= 30) {
      return 'M';
    } else {
      return 'G';
    }
  }

  // métodos de acesso
  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getQuantidadeFuncionarios() {
    return this.quantidadeFuncionarios;
  }

  public Endereco getEndereco() {
    return this.endereco;
  }

  public Data getDataFundacao() {
    return this.dataFundacao;
  }

  public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
    this.quantidadeFuncionarios = quantidadeFuncionarios;
  }

  public double getSalarioBaseFuncionario() {
    return this.salarioBaseFuncionario;
  }

  public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
    this.salarioBaseFuncionario = salarioBaseFuncionario;
  }

  public void setEndereco(Endereco endereco) {
    this.endereco = endereco;
  }

  public void setDataFundacao(Data dataFundacao) {
    this.dataFundacao = dataFundacao;
  }
}
