public class Teste {
  public static void main(String[] args) {
    Loja loja1 = new Loja("Loja 1", 3, 155.01);
    Loja loja2 = new Loja("Loja 2", 10);
    Loja loja3 = new Loja("Loja 3", 31, 65.85);

    Loja[] lojas = { loja1, loja2, loja3 };

    for (int i = 0; i < lojas.length; i++) {
      Loja lojaAtual = lojas[i];
      System.out.println(lojas[i]);
      System.out.println("Gastos com salário da " + lojaAtual.getNome() + ": " + lojaAtual.gastosComSalario());
      System.out.println("Tamanho da " + lojaAtual.getNome()+ ": " + lojaAtual.tamanhoDaLoja());
      System.out.println("");
    }

    // System.out.println(loja1);
    // System.out.println(loja2);
    // System.out.println(loja3);
    // System.out.println("gastosComSalario loja 1: " +loja1.gastosComSalario());
    // System.out.println("gastosComSalario loja 2: " +loja2.gastosComSalario());
    // System.out.println("gastosComSalario loja 3: " +loja3.gastosComSalario());
    // System.out.println("tamanho loja 1: " +loja1.tamanhoDaLoja());
    // System.out.println("tamanho loja 2: " +loja2.tamanhoDaLoja());
    // System.out.println("tamanho loja 3: " +loja3.tamanhoDaLoja());
  }
}
