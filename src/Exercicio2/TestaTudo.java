package Exercicio2;

public class TestaTudo {


	public static void main(String[] args) {
			
		ProdutoPerecivel fruta = new Fruta ("Banana Prata", 123, 1.0);
		fruta.setVencimento("23/10/2011");
		
		ProdutoPerecivel carne = new Carne("Picanha", 312, 30.0);
		carne.setVencimento("15/11/2011");
		
		ProdutoNaoPerecivel panela = new Panela("Panela Inox", 234, 100.0);
		
		Pedido pedido = new Pedido();
		pedido.addProduto(fruta);
		pedido.addProduto(carne);
		pedido.addProduto(panela,2);
		
		System.out.println(pedido.getTotalPedido());
		
	}

}
