public class Produto {
  private String nome;
  private double preco;

  public Produto(String nome, double preco) {
    this.nome = nome;
    this.preco = preco;
  }

  @Override
  public String toString() {
    return 
      "Produto\n"
      + "Nome: " + this.nome + "\n"
      + "Preço: " + this.preco;
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
}
