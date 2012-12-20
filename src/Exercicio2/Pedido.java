package Exercicio2;

import java.util.*;

public class Pedido {

	List<Produto> pedidos = new ArrayList<Produto>();
	float total;
	
	public void addProduto (Produto prod){
		pedidos.add(prod);
	
	}
	
	public void addProduto (Produto prod, int qtde){
		pedidos.add(qtde , prod);
	}
	
	public float getTotalPedido(){
		
		
		
		for(Produto p: pedidos){
			
			total += p.getPreco();
			
			
		}
		
		return total;
		
	}
}
