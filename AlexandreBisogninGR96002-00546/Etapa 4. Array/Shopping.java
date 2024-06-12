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

  public int quantidadeLojasPorTipo(String tipoLoja) {
    int totalLojas = 0;
    String tipoLojaNormalized = Normalizer.normalize(tipoLoja, Normalizer.Form.NFC);

      switch (tipoLojaNormalized) {
        case "Cosmético":
          for (int i = 0; i < this.lojas.length; i++) {
            if(this.lojas[i] instanceof Cosmetico) {
              totalLojas++;
            }
          }
          break;
        case "Vestuário":
          for (int i = 0; i < this.lojas.length; i++) {
            if(this.lojas[i] instanceof Vestuario) {
              totalLojas++;
            }
          }
          break;
        case "Bijuteria":
          for (int i = 0; i < this.lojas.length; i++) {
            if(this.lojas[i] instanceof Bijuteria) {
              totalLojas++;
            }
          }
          break;
        case "Alimentação":
          for (int i = 0; i < this.lojas.length; i++) {
            if(this.lojas[i] instanceof Alimentacao ) {
              totalLojas++;
            }
          }
          break;
        case "Informática":
          for (int i = 0; i < this.lojas.length; i++) {
            if(this.lojas[i] instanceof Informatica ) {
              totalLojas++;
            }
          }
          break;
        default:
          break;
      }

      // if(tipoLojaNormalized.equalsIgnoreCase("Bijuteria")) {
      //   if(this.lojas[i] instanceof Bijuteria) {
      //     totalLojas++;
      //   }
      // }
      // if(tipoLojaNormalized.equalsIgnoreCase("Informática")) {
      //   if(this.lojas[i] instanceof Informatica) {
      //     totalLojas++;
      //   }
      // }

      // if(tipoLoja.equalsIgnoreCase("Bijuteria")) {
      //   if(this.lojas[i] instanceof Bijuteria) {
      //     totalLojas++;
      //   }
      // }
    

    if(totalLojas > 0) {
      return totalLojas;
    }

    return -1;
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
