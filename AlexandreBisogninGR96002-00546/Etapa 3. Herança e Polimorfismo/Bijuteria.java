public class Bijuteria extends Loja {
  private double metaVendas;

  //construtor
  public Bijuteria(
      String nome,
      int quantidadeFuncionarios,
      double salarioBaseFuncionario,
      Endereco endereco,
      Data dataFundacao,
      double metaVendas) {
    super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
    this.metaVendas = metaVendas;
  }

  @Override
  public String toString() {
    return super.toString() + "\n" +
           "Meta de vendas: " + this.metaVendas;
  }

  //metodos de acesso
  public double getMetaVendas() {
    return this.metaVendas;
  }

  public void setMetaVendas(double metaVendas) {
    this.metaVendas = metaVendas;
  }
}
