import java.util.Scanner;

/**
 * @author Jonathan Felipe Moreno Buitrago
 * 
 * El problema de Jose
 *
 */
public class Main {

	public static void main(String[] args) {
		
		Lista lista = new Lista();
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		int n = 0;
		String nombre = "";	
		int cont = 0;
		String ganador = "";
		
		System.out.println("/////////////////////////");
		System.out.println("// El problema de jose //");
		System.out.println("/////////////////////////");
		System.out.println(" ");
		System.out.println("El programa dara por finalizado el registro de los participantes cuando se escriba fin \n");
			
		do{
		System.out.print("Digite el nombre de la persona: ");
		nombre = sc1.nextLine();
        lista.insertar(nombre);
        cont++;
		}while(!nombre.equals("fin"));				       			
		
		lista.eliminar(lista.recorrer(cont));
		
		if(!lista.esVacia()) {	
		System.out.print("----------------------------------------");
		System.out.print("\nDigite el valor para n: ");
		n = sc.nextInt();	
		System.out.print("----------------------------------------\n");
				
		ganador = lista.eliminar2(cont, n);
		
		System.out.println("El soldado que se va es: " + ganador);
		System.out.print("----------------------------------------\n");
		}else {
			System.out.print("La lista aun no tiene elementos ");
		}							
	}
}
