package jogolandiaCorp;

public class Tabuleiro3x3 { // classe do tabuleiro

	 void mostrarTabuleiro() {// Método que percorre a matriz bidimensional 3 por 3, ou seja, 3 linhas com 3 colunas e mostra na tela a matriz.
		for(int i=0; i<3; i++) {// O primeiro laço de repetição "for" que irá percorrer  cada índice da linha
			for(int j=0; j<3; j++){ // Segundo laço de repetição "for" que irá percorrer cada índice da coluna.
			int tabuleiro [][] = new int [3][3];
				System.out.printf("|%d| ",tabuleiro[i][j]);	
			
			
			}
						System.out.printf("%n");
		}
	}
 
}
	
	