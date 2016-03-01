import java.util.Scanner;

public class principal {

	public static void main(String[] args) {

		int numero=24532;
		int auxiliar=numero;
		int reves=0;
		
		while(auxiliar>0){
			
			reves=auxiliar%10+reves*10;
			auxiliar=auxiliar/10;
			
		}
		System.out.println(reves);
		
	}


}
