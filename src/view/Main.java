package view;

import controller.MatrizT;

public class Main {

	public static void main(String[] args) {
		int matriz[][] = new int [3][5];
		
		for(int i = 0; i < 3; i++) { //valores da matriz com numeros aleatorios de 1 a 25
			for(int j = 0; j < 5; j++) {
				matriz[i][j] = (int)(Math.random() * 25) + 1;
			}
		}
		
		for(int i = 0; i < 3; i++) { //pega as linhas
			new MatrizT(i+1, matriz[i]).start();
		}
 
	}

}
