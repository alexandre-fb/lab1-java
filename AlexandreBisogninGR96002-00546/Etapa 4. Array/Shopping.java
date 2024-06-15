import java.text.Normalizer;

public class Shopping {
  private String nome;
  private Endereco endereco;
  private Loja lojas[];

  // construtos
  public Shopping(String nome, Endereco endereco, int quantidadeLojas) {
    this.nome = nome;
    this.endereco = endereco;
    this.lojas = new Loja[quantidadeLojas];
  }

  @Override
  public String toString() {
    return "Nome: " + this.nome + "\n" +
           "endereço: " + this.endereco + "\n" +
           "lojas: " + this.lojas;
  }

  // regras de negocio
  public boolean insereLoja(Loja loja) {
    for (int i = 0; i < this.lojas.length; i++) {
      if (this.lojas[i] == null) {
        this.lojas[i] = loja;
        return true;
      }
    }

    return false;
  }

  public boolean removeLoja(String nomeLoja) {
    System.out.println("nomeLoja" + nomeLoja);
    for (int i = 0; i < this.lojas.length; i++) {

      if (this.lojas[i] != null && this.lojas[i].getNome().equalsIgnoreCase(nomeLoja)) {
        this.lojas[i] = null;
        return true;
      }
    }

    return false;
  }

  public void imprimeLojas() {
    for (Loja loja : lojas) {
      System.out.println("loja" + loja.getNome());
    }
  }

  public String normalize(String texto) {
    return Normalizer.normalize(texto, Normalizer.Form.NFD)
        .replaceAll("\\p{M}", "")
        .toLowerCase();
  }

  public int quantidadeLojasPorTipo(String tipoLoja) {
    int totalLojas = 0;

    switch (normalize(tipoLoja)) {
      case "cosmetico":
        for (int i = 0; i < this.lojas.length; i++) {
          if (this.lojas[i] instanceof Cosmetico) {
            totalLojas++;
          }
        }
        break;
      case "vestuario":
        for (int i = 0; i < this.lojas.length; i++) {
          if (this.lojas[i] instanceof Vestuario) {
            totalLojas++;
          }
        }
        break;
      case "bijuteria":
        for (int i = 0; i < this.lojas.length; i++) {
          if (this.lojas[i] instanceof Bijuteria) {
            totalLojas++;
          }
        }
        break;
      case "alimentacao":
        for (int i = 0; i < this.lojas.length; i++) {
          if (this.lojas[i] instanceof Alimentacao) {
            totalLojas++;
          }
        }
        break;
      case "informatica":
        for (int i = 0; i < this.lojas.length; i++) {
          if (this.lojas[i] instanceof Informatica) {
            totalLojas++;
          }
        }
        break;
      default:
        break;
    }

    if (totalLojas > 0) {
      return totalLojas;
    }

    return -1;
  }

  public Informatica lojaSeguroMaisCaro() {
    Informatica lojaSeguroMaisCaro = null;
    double maiorValor = 0;

    for (int i = 0; i < this.lojas.length; i++) {
      if (this.lojas[i] instanceof Informatica) {

        Informatica lojaAtual = (Informatica) this.lojas[i];

        if (lojaAtual.getSeguroEletronicos() > maiorValor) {
          maiorValor = lojaAtual.getSeguroEletronicos();
          lojaSeguroMaisCaro = lojaAtual;
        }
      }
    }

    return lojaSeguroMaisCaro;
  }

  // metodos de acesso
  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Endereco getEndereco() {
    return this.endereco;
  }

  public void setEndereco(Endereco endereco) {
    this.endereco = endereco;
  }

  public Loja[] getLojas() {
    return this.lojas;
  }

  public void setLojas(Loja[] lojas) {
    this.lojas = lojas;
  }
}
