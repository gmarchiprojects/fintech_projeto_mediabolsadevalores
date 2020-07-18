import java.util.Scanner;
import java.text.DecimalFormat;


public class media_mensal_bolsadevalores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat fmt = new DecimalFormat("0.00");
		
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
			
			//Soma dos Valores
			for(l = 0; l <= 3 ; l++) {
				for(c = 0; c <= 6; c++) {
					for(x = 0; x <= l; x++) {
					x = x + l;
					vrSem[x] = vrSem[x] + mediaValores[l][c];
				}
					
			}
		
		}
			

			System.out.printf("Segue os valores da semana 1 %f, semana 2 %f,semana 3 %f,semana 4 %f", vrSem[0], vrSem[1], vrSem[2],vrSem[3]);
	
			sc.close();	
			
	}

}

		
	


