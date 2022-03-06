package controller;

public class MatrizT extends Thread{
	//preciso de 2 variaveis, uma para identificar a linha e outra para pegar o vetor
	private int linha;
	private int vetor[];
	
	public MatrizT(int linha, int vetor[]) {
		this.linha = linha;
		this.vetor = vetor;
	}
	
	@Override
	public void run() {
		int soma_vet = 0; //variavel que vai juntar os valores do vetor
		
		for(int i=0; i < vetor.length; i++) {
			soma_vet = vetor[i];
		}
		
		System.out.println("A soma dos valores da linha "+ linha + " é de: " + soma_vet);
		
	}
}

