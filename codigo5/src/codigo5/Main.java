
//El programa solicita al usuario que ingrese un número, el cual se lee 
//como un String y se convierte a un número entero usando Integer.parseInt(). 
//Luego, utiliza un bucle while para calcular los dígitos del número. 
//En cada iteración, se obtiene el último dígito con el operador módulo (% 10) y se elimina el dígito procesado dividiendo el número entre 10 (c /= 10). El programa cuenta cuántos dígitos son considerados "afortunados" (3, 7, 8 o 9) y cuántos no lo son. 
//Finalmente, compara ambos contadores para determinar si el número es afortunado o no, imprimiendo el resultado al final.







package codigo5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//cambio variable s por scanner para que sea mas claro
		
		 Scanner scanner = new Scanner(System.in);
		
		 System.out.println("Introduzca un número: ");
		 
	     String ni = scanner.nextLine();
		 //entre como un string el numero hay que pasarlo a int
	     int c = Integer.parseInt(ni);
	     
	     //Inicializamos contadores
	     int afo = 0;
		 int noAfo = 0;
		    
		 //Usamos esta variable para imprimir al final del ciclo, ya que la variable c
		 //cambia cuando se inicia el ciclo
		 int numeroOriginal = c;
		 
	     while (c > 0) {
	    	 
	    int digito = c % 10; 
	    if (digito == 3 || digito == 7 || digito == 8 || digito == 9) {
	    	
	    	afo++;
	    	
	    } else {
	    
	    	noAfo++;
	    	
	     }
	     
	    c/= 10;

	     }
	   if (afo>noAfo) {
		   //Le faltaba la t a print
		   System.out.println("El " + numeroOriginal + " es un número afortunado.");
	   }else {
		   System.out.println("El " + numeroOriginal + " no es un número afortunado.");

	   }
	   
	   //cerrar el scanner
	   scanner.close();
	}
}
