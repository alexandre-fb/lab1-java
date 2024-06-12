public class Loja {
  private String nome;
  private int quantidadeFuncionarios;
  private double salarioBaseFuncionario;
  private Endereco endereco;
  private Data dataFundacao;
  private Produto estoqueProdutos[];

  // construtores
  public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco,
      Data dataFundacao, int quantidadeEstoque) {
    this.nome = nome;
    this.quantidadeFuncionarios = quantidadeFuncionarios;
    this.salarioBaseFuncionario = salarioBaseFuncionario;
    this.endereco = endereco;
    this.dataFundacao = dataFundacao;
    this.estoqueProdutos = new Produto[quantidadeEstoque];
  }

  public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int quantidadeEstoque) {
    this.nome = nome;
    this.quantidadeFuncionarios = quantidadeFuncionarios;
    this.salarioBaseFuncionario = -1;
    this.endereco = endereco;
    this.dataFundacao = dataFundacao;
    this.estoqueProdutos = new Produto[quantidadeEstoque];
  }

  // toString
  @Override
  public String toString() {
    return "Loja: " + this.nome + "\n" +
        "Quantidade de funcionários: " + this.quantidadeFuncionarios + "\n" +
        "Salario base funcionario: " + this.salarioBaseFuncionario + "\n" +
        this.endereco + "\n" +
        "Fundado na " + this.dataFundacao + "\n" +
        "Estoque de produtos : " + this.estoqueProdutos;
  }

  // metodos da regra de negocio
  public double gastosComSalario() {
    if (this.salarioBaseFuncionario == -1) {
      return -1;
    }

    return this.salarioBaseFuncionario * this.quantidadeFuncionarios;
  }

  public void imprimeProdutos() {
    for (int i = 0; i < this.estoqueProdutos.length; i++) {
      System.err.println("Produto: " + i + " = " + this.estoqueProdutos[i]);
    }
  }

  public boolean insereProduto(Produto produto) {
    for (int i = 0; i < this.estoqueProdutos.length; i++) {
      if (this.estoqueProdutos[i] == null) {
        this.estoqueProdutos[i] = produto;
        return true;
      }
    }

    return false;
  }

  public boolean removeProduto(String nomeProduto) {
    for (int i = 0; i < this.estoqueProdutos.length; i++) {
      if (this.estoqueProdutos[i] != null && this.estoqueProdutos[i].getNome().equalsIgnoreCase(nomeProduto)) {
        this.estoqueProdutos[i] = null;
        return true;
      }
    }

    return false;
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

  public Produto[] getEstoqueProdutos() {
    return this.estoqueProdutos;
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

  public void setEstoqueProdutos(Produto[] estoqueProdutos) {
    this.estoqueProdutos = estoqueProdutos;
  }
}
