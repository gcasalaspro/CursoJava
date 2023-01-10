package curso;

import java.util.Scanner;

/*
 Ejercicio 1 
 *Un maestro desea saber el procentaje de hombre y que porcentaje de mujeres hay en un grupo de estudiantes
 */
public class ejercicio1 {
			
	public static void main(String[] args) {
						///Variables
		float numHombres = 0 ,  numMujeres =0 , alumTotal =0  ;
		float porcHombre = 0 , porcMujeres = 0 ; 
		
						///scanner
	 Scanner teclado = new Scanner(System.in);
	
						///que entra
	System.out.println("Ingrese cantidad de mujeres");
	numMujeres = teclado.nextFloat();
	System.out.println("Ingrese cantidad de hombres");
	numHombres= teclado.nextFloat();
	
						// processos
		alumTotal= numMujeres + numHombres;
		porcMujeres = numMujeres * 100 / alumTotal ;
		porcHombre = numHombres * 100 / alumTotal ; 
		
						// que sale
		System.out.println("El porcentaje de alumnas mujeres  es de :  " + porcMujeres);
		System.out.println("El porcentaje de alumnos hombres es de : "+ porcHombre );
		
		
	}

}
