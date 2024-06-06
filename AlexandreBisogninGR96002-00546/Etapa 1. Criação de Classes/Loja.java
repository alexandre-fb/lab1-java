public class Loja {
  private String nome;
  private int quantidadeFuncionarios;
  private double salarioBaseFuncionario;

  // construtores
  public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario) {
    this.nome = nome;
    this.quantidadeFuncionarios = quantidadeFuncionarios;
    this.salarioBaseFuncionario = salarioBaseFuncionario;
  }

  public Loja(String nome, int quantidadeFuncionarios) {
    this.nome = nome;
    this.quantidadeFuncionarios = quantidadeFuncionarios;
    this.salarioBaseFuncionario = -1;
  }

  // toString
  @Override
  public String toString() {
    return "Loja: " + this.nome + ", quantidade de funcionários: " + this.quantidadeFuncionarios
        + ", salario base funcionario: " + this.salarioBaseFuncionario;
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

  public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
    this.quantidadeFuncionarios = quantidadeFuncionarios;
  }

  public double getSalarioBaseFuncionario() {
    return this.salarioBaseFuncionario;
  }

  public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
    this.salarioBaseFuncionario = salarioBaseFuncionario;
  }

}
