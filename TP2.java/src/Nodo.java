// Classe Nodo para una lista enlazada simple
public class Nodo{
    private Object dato;
    private Nodo siguiente;
    // Constructor
    public Nodo(Object dato){
        this.dato = dato;
        this.siguiente = null;
    }
    // Getters y Setters
    public Object getDato(){return dato;}
    public void setDato(Object dato){this.dato = dato;}

    public Nodo getSiguiente(){return siguiente;}
    public void setSiguiente(Nodo siguiente){this.siguiente = siguiente;}
}