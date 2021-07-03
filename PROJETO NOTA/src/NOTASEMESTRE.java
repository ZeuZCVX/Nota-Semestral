import java.util.Scanner;
public class NOTASEMESTRE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner (System.in);
		System.out.print("Digite a nota da prova: ");
		double prova = sn.nextDouble() * 3;
		System.out.print("Digite a nota do projeto: ");
		double projeto = sn.nextDouble() * 3;
		System.out.print("Digite a nota do exercicios: ");
		double exercicios = sn.nextDouble() * 2;
		System.out.print("Digite a nota do exercicio logico: ");
		double exerciciologico = sn.nextDouble() * 3;
		
		double Nota = (prova + projeto + exercicios + exerciciologico)/11;
		boolean APROVADO = Nota >=8;
		if ( APROVADO == true ); { 
			System.out.println("Aprovado: " + Nota + " Continue Assim ");
		
			  
			
			 
	
			
		
			
			
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
