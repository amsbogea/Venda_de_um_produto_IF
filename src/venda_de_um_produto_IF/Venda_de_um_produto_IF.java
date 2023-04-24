package venda_de_um_produto_IF;

import java.util.Scanner;

public class Venda_de_um_produto_IF {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double valCompra, valVenda;
		
		System.out.println("Informe o valor da compra.");
		valCompra = input.nextDouble();
		
		if (valCompra < 20) {
			valVenda = valCompra + valCompra * 0.45;
			System.out.println("Valor da venda com lucro de 45% deve ser " + valVenda);
		}else {
			valVenda = valCompra + valCompra * 0.30;
			System.out.println("Valor da venda com lucro de 30% deve ser " + valVenda);
		}
	}

}
