public class Data {
  private int dia;
  private int mes;
  private int ano;

  public Data(int dia, int mes, int ano) {
    this.dia = dia;
    this.mes = mes;
    this.ano = ano;

    if (!verificaDataValida(dia, mes)) {
      System.out.println("Data inválida!");
      this.dia = 1;
      this.mes = 1;
      this.ano = 2000;
    }

  }

  @Override
  public String toString() {
    return "Data: " + dia + "/" + mes + "/" + ano;
  }

  public boolean verificaAnoBissexto() {
    if ((this.ano % 4 == 0 && this.ano % 100 != 0) || this.ano % 400 == 0) {
      return true;
    };
    return false;
  }

  public boolean verificaDataValida(int dia, int mes) {
    if (mes < 1 || mes > 12 || dia < 1 || dia > 31) {
      return false;
    } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
      if (dia > 30) {
        return false;
      }
    } else if (mes == 2) {
      int maxDias = verificaAnoBissexto() ? 29 : 28;
      if (dia > maxDias) {
        return false;
      }
    }

    return true;
  }

  // metodos de acesso
  public int getDia() {
    return this.dia;
  }

  public void setDia(int dia) {
    this.dia = dia;
  }

  public void setMes(int mes) {
    this.mes = mes;
  }

  public void setAno(int ano) {
    this.ano = ano;
  }

  public int getMes() {
    return this.mes;
  }

  public int getAno() {
    return this.ano;
  }
}