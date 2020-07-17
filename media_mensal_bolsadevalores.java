import java.util.Scanner;
import java.text.DecimalFormat;


public class media_mensal_bolsadevalores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat fmt = new DecimalFormat("0.0");
		
		int diasMes = 28, diasSemana = 7, semana = 1 , l , c;
		double mediaMensal, somaSemanal;
		double[][] mediaValores = new double [4] [7];
		double[] vrSem = new double [4];
		
		// Introdução
			System.out.print("Qual o seu nome? ");
			String user = sc.nextLine();
			System.out.println("Seja bem vindo ao sistema de controle de ações da MarchiFintech");
			System.out.println("Sr(a). "+user+",nosso sistema funciona, da seguinte maneira.");
			System.out.println("Você ira preencher os dados de cada dia, seguidos, iniciando no dia 1 até o dia 28,");
			System.out.println("Após isso, o sistema irá calcular as médias semanais e mensais, sendo calculada tanto a maior quanto a menor");
		
		//1º [l] = Linhas(Semanas) 2º [c] = Colunas (Dias)

		//Captura dos Valores na matriz
			for(l = 0; l <= 3; l++) {
					for(c = 0; c <= 6; c++) {
						System.out.print("Digite o valor do dia "+(c+1)+" da semana "+(l+1)+" :");
						mediaValores[l][c] = sc.nextDouble();
					}
			
			}
			

			//Soma dos valores nas matrizes 
			
			for(l = 0; l <= mediaValores.length; l++ ) {
				for (c = 0; c <= mediaValores[l].length; c++) {
					int x = l;
					}
				}

			
			//Apresentação dos valores da matriz
			System.out.println("Valores das ações \n \n");
			for (l = 0; l < 4; l++) {
				for(c = 0; c < 7; c++) {
					System.out.print(mediaValores[l][c]+" ");
				}
			}
		}

		
	}


