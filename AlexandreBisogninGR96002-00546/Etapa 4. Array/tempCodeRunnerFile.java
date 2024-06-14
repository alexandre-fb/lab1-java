ojaInformatica.setSeguroEletronicos(800);
		shopping.insereLoja(lojaInformatica);
		total = shopping.quantidadeLojasPorTipo("Informática");
		System.out.println(total == 2 ? "[OK] Método Shopping.quantidadeLojasPorTipo() - localizou duas lojas" : "[NOK] Método Shopping.qua