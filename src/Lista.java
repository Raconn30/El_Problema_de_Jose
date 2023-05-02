
public class Lista {
	public Nodo ultimo;
	public Nodo primero;
	
	public Lista() {
		ultimo=null;
		primero=null;	
	}		
	
	//metodo si es vacio
	public boolean esVacia() {
		return ultimo==null;
	}
	
	//meodo para insertar elementos a la lista
	public void insertar(String elemento) {				
		Nodo nuevo = new Nodo();	
		nuevo.dato=elemento;
		if(primero==null) {
			primero=nuevo;
			ultimo=primero;
			primero.siguiente=ultimo;
		}else {
			ultimo.siguiente=nuevo;
			nuevo.siguiente=primero;
			ultimo=nuevo;
		}
	
	}
	
	//Recorre la lista
	public String recorrer(int n) {
		Nodo recorrer = ultimo.siguiente;
 		String aux = "";
		
		for(int i = 0; i<n; i++) {			
			aux = recorrer.dato;
			recorrer = recorrer.siguiente;
		}		
		
		return aux;
	}		
	
    public String eliminar2(int cont, int n) {	
		
		Nodo eliminado = new Nodo();	
		Nodo recorrer = new Nodo();
		Nodo aux = new Nodo();
		String ganador = "";
		recorrer = ultimo;
		cont = cont-1;
							
		for(int j = 0; j<cont-1; j++){
			
			if(primero!=null) {
			for(int i = 0; i<n; i++) {
				recorrer = recorrer.siguiente;	
			}								
			aux = recorrer;
			eliminado=aux;			
			eliminar(aux.dato);
			aux.siguiente = recorrer.siguiente;	
			ganador = recorrer.siguiente.dato;
			System.out.print("Soldado eliminado: " + eliminado.dato + "\n");
			}else {
				ultimo=primero;
				primero.siguiente=ultimo;;		
			}
		}
		return ganador;
	}
	
	
	//eliminar un nodo
	public void eliminar(String elemento) {	
		
		Nodo recorrer = ultimo;
		boolean encontrado = false;
		
		while(recorrer.siguiente!=ultimo && !encontrado) {
			encontrado = (recorrer.siguiente.dato==elemento);
			if(!encontrado) {
				recorrer = recorrer.siguiente;
			}		
		}
		encontrado = (recorrer.siguiente.dato==elemento);
		if(encontrado) {
			Nodo aux = recorrer.siguiente;
			if(ultimo==ultimo.siguiente) {
				ultimo=null;			
			}else {
				if(aux==ultimo) {
					ultimo=recorrer;
				}
				recorrer.siguiente=aux.siguiente;
			}
			aux=null;
		}
		
	}			
	
	//imprime como va quedando la lista
	public void mostrar(String elemento) {
		Nodo recorrer = primero;	
		do {
			System.out.print(recorrer.dato + " ");
			recorrer=recorrer.siguiente;
		}while(recorrer!=primero);
	}	

}
