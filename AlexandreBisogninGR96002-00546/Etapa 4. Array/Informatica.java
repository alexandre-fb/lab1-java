public class Informatica extends Loja {
  private double seguroEletronicos;

  // Construtore
  public Informatica(
      String nome,
      int quantidadeFuncionarios,
      double salarioBaseFuncionario,
      Endereco endereco,
      Data dataFundacao,
      double seguroEletronicos,
      int quantidadeEstoque) {
    super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeEstoque);
    this.seguroEletronicos = seguroEletronicos;
  }

  @Override
  public String toString() {
    return super.toString() + "\n" +
        "Seguro de Eletrônicos: " + this.seguroEletronicos;
  }

  // Métodos de acesso
  public double getSeguroEletronicos() {
    return this.seguroEletronicos;
  }

  public void setSeguroEletronicos(double seguroEletronicos) {
    this.seguroEletronicos = seguroEletronicos;
  }
}
