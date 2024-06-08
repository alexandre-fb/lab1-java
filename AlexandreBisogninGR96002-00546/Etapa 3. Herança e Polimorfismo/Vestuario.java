public class Vestuario extends Loja {
  private boolean produtosImportados;

  public Vestuario(String nome,
      int quantidadeFuncionarios,
      double salarioBaseFuncionario,
      Endereco endereco,
      Data dataFundacao,
      boolean produtosImportados) {
    super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
    this.produtosImportados = produtosImportados;
  }

  @Override
  public String toString() {
    return super.toString() + "\n" +
        "Produtos importados: " + (this.produtosImportados ? "Sim" : "Não");
  }

  public boolean getProdutosImportados() {
    return this.produtosImportados;
  }

  public void setProdutosImportados(boolean produtosImportados) {
    this.produtosImportados = produtosImportados;
  }
}
