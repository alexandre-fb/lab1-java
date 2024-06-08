public class Alimentacao extends Loja {
  private Data dataAlvara;

  // Construtor
  public Alimentacao(
      String nome,
      int quantidadeFuncionarios,
      double salarioBaseFuncionario,
      Endereco endereco,
      Data dataFundacao,
      Data dataAlvara) {
    super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
    this.dataAlvara = dataAlvara;
  }

  @Override
  public String toString() {
    return super.toString() + "\n" +
        "Data do Alvará: " + this.dataAlvara;
  }

  // Métodos de acesso
  public Data getDataAlvara() {
    return this.dataAlvara;
  }

  public void setDataAlvara(Data dataAlvara) {
    this.dataAlvara = dataAlvara;
  }
}