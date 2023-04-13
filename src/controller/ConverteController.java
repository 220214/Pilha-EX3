package controller;
//import  br.com.mary.pilhaint.Pilha;
public class ConverteController {
	public String decToBin (int dec) {
	Pilha p= new Pilha();
	while(dec >0){
		int r = dec % 2;
		p.push(r);
		dec /= 2;
	}
	String bi =" ";
	while (!p.isEmptym()) {
		int valor = p.pop();
		bi += String.valueOf(valor);
	}
	return bi;
	}
	
	
}
