// classe ListaEnlazada.java para manejar listas enlazadas simples
public class ListaEnlazada{
    private Nodo inicio;
    private int tamaño;

    public Nodo getInicio(){return inicio;}
    
    // Constructor de la lista enlazada simple iniciando la lista vacía 
    public ListaEnlazada(){
        this.inicio = null;
        this.tamaño = 0;
    }
    // Método para agregar un nuevo nodo al final de la lista
    public void agregar(Object dato){
        Nodo nuevoNodo = new Nodo(dato);
        if(inicio == null){
            inicio = nuevoNodo;
        } else {
            Nodo actual = inicio;
            while(actual.getSiguiente() != null){
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevoNodo);
        }
        tamaño++;
    }
    public boolean eliminar(Object dato) {
    if (inicio == null) {
        return false;
    }
    if (inicio.getDato().equals(dato)) {
        inicio = inicio.getSiguiente();
        cantidad--;
        return true;
    }
    Nodo actual = inicio;
    while (actual.getSiguiente() != null) {
        if (actual.getSiguiente().getDato().equals(dato)) {
            actual.setSiguiente(actual.getSiguiente().getSiguiente());
            cantidad--;
            return true;
        }   
        actual = actual.getSiguiente();
    }
    return false;
    }
    public boolean buscar(Object dato){
        Nodo actual = inicio;
        while(actual != null){
            if(actual.getDato().equals(dato)){
                return true;
            }
            actual = actual.getSiguiente();
        }
        return false;
    }
    public int getTamaño(){
        return tamaño;
    }
}