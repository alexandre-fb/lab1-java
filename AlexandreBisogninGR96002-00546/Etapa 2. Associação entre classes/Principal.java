public class Principal {
  public static void main(String[] args) {
    Data dataAtual = new Data(20, 10, 2023);

    int valorDigitado = 0;
    while (valorDigitado != 3) {
      System.out.println("--------------");
      System.out.println("MENU");
      System.out.println("--------------");
      System.out.println("(1) Criar uma loja");
      System.out.println("(2) Criar um produto");
      System.out.println("(3) Sair");
      valorDigitado = Teclado.leInt("Digite a resposta: ");

      if (valorDigitado != 1 && valorDigitado != 2 && valorDigitado != 3) {
        System.out.println("--------------");
        System.out.println("Opção inválida");
        System.out.println("--------------");
      }

      if (valorDigitado == 1) {
        System.out.println("---(1) Criar uma loja---");
        String nomeLoja = Teclado.leString("Digite o nome: ");

        System.out.println("---(1) Criar uma loja---");
        int quantidadeFuncionarios = Teclado.leInt("Quantidade de funcionários: ");

        System.out.println("---(1) Criar uma loja---");
        double salarioBaseFuncionario = Teclado.leDouble("Salario base do funcionário: ");

        System.out.println("---(1) Criar uma loja---");
        String rua = Teclado.leString("Nome da rua: ");

        System.out.println("---(1) Criar uma loja---");
        String cidade = Teclado.leString("Cidade: ");
        
        System.out.println("---(1) Criar uma loja---");
        String estado = Teclado.leString("Estado: ");

        System.out.println("---(1) Criar uma loja---");
        String pais = Teclado.leString("Pais: ");

        System.out.println("---(1) Criar uma loja---");
        String cep = Teclado.leString("CEP: ");

        System.out.println("---(1) Criar uma loja---");
        String numero = Teclado.leString("Número: ");

        System.out.println("---(1) Criar uma loja---");
        String complemento = Teclado.leString("Complemento: ");

        System.out.println("---(1) Criar uma loja---");
        int diaFundacao = Teclado.leInt("Dia da fundação: ");

        System.out.println("---(1) Criar uma loja---");
        int mesFundacao = Teclado.leInt("Mês da fundação: ");

        System.out.println("---(1) Criar uma loja---");
        int anoFundacao = Teclado.leInt("Ano da fundação: ");

        Endereco enderecoLoja = new Endereco(rua, cidade, estado, pais, cep, numero, complemento);

        Data dataFundacao = new Data(diaFundacao, mesFundacao, anoFundacao);
        
        Loja loja = new Loja(nomeLoja, quantidadeFuncionarios, salarioBaseFuncionario, enderecoLoja, dataFundacao);

        System.out.println("--------------");
        System.out.println(loja.toString());
      }

      if (valorDigitado == 2) {
        System.out.println("---(2) Criar um produto---");
        String nomeProduto = Teclado.leString("Digite o nome: ");
        // String nomeProduto = scanner.next();
        System.out.println("---(2) Criar um produto---");
        Double precoProduto = Teclado.leDouble("Digite o preço: ");

        System.out.println("---(2) Criar um produto---");
        int diaValidade = Teclado.leInt("Dia da validade: ");
        int mesValidade = Teclado.leInt("Mês da validade: ");
        int anoValidade = Teclado.leInt("Ano da validade: ");

        Data validadeProduto = new Data(diaValidade, mesValidade, anoValidade);
        Produto produto = new Produto(nomeProduto, precoProduto, validadeProduto);
        boolean estaVencido = produto.estaVencido(dataAtual);

        System.out.println("--------------");
        System.out.println(produto.toString());

        if (estaVencido) {
          System.out.println("PRODUTO VENCIDO");
          System.out.println("--------------");
        } else {
          System.out.println("PRODUTO NÃO VENCIDO");
          System.out.println("--------------");
        }
      }
    }
    System.out.println("valor digitado" + valorDigitado);
  }
}