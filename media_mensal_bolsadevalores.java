import java.util.Scanner;

public class media_mensal_bolsadevalores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int  l , c, x;
		float[][] mediaValores = new float [4] [7];
		float[] vrSem = new float [4];

		
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
							mediaValores[l][c] = sc.nextFloat();
						}
				}
			
					//Soma dos Valores - Por Semana
					for(l = 0; l <= 3 ; l++) {
						for(c = 0; c <= 6; c++) {
							for(x = 0; x <= l; x++) {
							x = x + l;
							vrSem[x] = vrSem[x] + mediaValores[l][c];
						}		
					}
				}
				
					//Media dos Valores Semanais
					float[] mediaSem = new float [4];
					for (int i = 0; i <= 3; i++) {
						mediaSem[i] = vrSem[i]/7;
						
					}
					
			//	Apresentar valores médios - Semanal < e > e Mensal
				float mediaMaior = 0 , mediaMenor = 9999 , mediaMensal = 0;
				
				for (int r = 0; r <= 3; r++) {
					if( mediaSem[r]> mediaMaior) {
						mediaMaior = mediaSem[r];
					}
				}
				for (int p = 0; p <= 3; p++) {
					if( mediaSem[p]<= mediaMenor) {
						mediaMenor = mediaSem[p];
					}
				}
				for (int w = 0; w <= 3;w++) {
					mediaMensal = mediaSem[w] + mediaMensal;

				}
				mediaMensal = mediaMensal/4;
				
				System.out.printf("O valor médio das ações no mês foi: R$ %.2f \n", mediaMensal);
				System.out.printf("A maior média semanal paga foi no valor R$ %.2f \n", mediaMaior);
				System.out.printf("A menor média semanal paga foi no valor R$ %.2f \\n", mediaMenor);
					
			
			sc.close();	
			
	}

}

		
	


