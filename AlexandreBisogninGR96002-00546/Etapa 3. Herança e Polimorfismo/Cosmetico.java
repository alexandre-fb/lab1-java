public class Cosmetico extends Loja {
  private double taxaComercializacao;

  // Construtor
  public Cosmetico(
      String nome,
      int quantidadeFuncionarios,
      double salarioBaseFuncionario,
      Endereco endereco,
      Data dataFundacao,
      double taxaComercializacao) {
    super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
    this.taxaComercializacao = taxaComercializacao;
  }

  @Override
  public String toString() {
    return super.toString() + "\n" +
           "Taxa de comercialização: " + this.taxaComercializacao;
  }

  // metodos de acesso
  public double getTaxaComercializacao() {
    return this.taxaComercializacao;
  }

  public void setTaxaComercializacao(double taxaComercializacao) {
    this.taxaComercializacao = taxaComercializacao;
  }
}