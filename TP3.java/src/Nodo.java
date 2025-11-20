// Classe Nodo para una lista enlazada simple
public class Nodo{
    private Object dato;
    private Nodo siguiente;
    // Constructor
    public Nodo(Object dato){
        this.dato = dato;
        this.siguiente = null;
    }
    // Getters 
    public Object getDato(){return dato;}
    public Nodo getSiguiente(){return siguiente;}
    // Setters
    public void setDato(Object dato){this.dato = dato;}
    public void setSiguiente(Nodo siguiente){this.siguiente = siguiente;}
}