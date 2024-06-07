public class Produto {
  private String nome;
  private double preco;
  private Data dataValidade;

  public Produto(String nome, double preco, Data dataValidade) {
    this.nome = nome;
    this.preco = preco;
    this.dataValidade = dataValidade;
  }

  @Override
  public String toString() {
    return "Produto\n"
        + "Nome: " + this.nome + "\n"
        + "Preço: " + this.preco;
  }

  public Boolean estaVencido(Data dataAtual) {
   if (dataAtual.getAno() > dataValidade.getAno()) {
    return true;
   } else if (dataAtual.getAno() == dataValidade.getAno()) {
    if(dataAtual.getMes() > dataValidade.getMes()) {
      return true;
    } else if (dataAtual.getMes() == dataValidade.getMes()) {
      if(dataAtual.getDia() > dataValidade.getDia()) {
        return true;
      }
    }
   } 

   return false;
  }

  // metodos de acesso
  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getPreco() {
    return this.preco;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }

  public Data getDataValidade() {
    return this.dataValidade;
  }

  public void setDataValidade(Data dataValidade) {
    this.dataValidade = dataValidade;
  }
}
