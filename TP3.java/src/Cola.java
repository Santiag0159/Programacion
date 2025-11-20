public class Cola{
    private Nodo inicio;
    private Nodo fin;
    private int tamaño;

    public Cola(){
        this.inicio = null;
        this.fin = null;
        this.tamaño = 0;
    }
    public void insertar(Object elemento){
        Nodo nuevoNodo = new Nodo(elemento);
        if (colaVacia()){
            inicio = nuevoNodo;
        } else {
            fin.setSiguiente(nuevoNodo);
        }
        fin = nuevoNodo;
        tamaño++;
    }
    public Object quitar(){
        if(colaVacia()){
            return null;
        }Object aux = inicio.getDato();
        inicio = inicio.getSiguiente();
        tamaño--;
        return aux;
    }
    public Object Inicio(){
        if(colaVacia()){
            return null;
        } return inicio.getDato();
    }
    public boolean colaVacia(){
        return tamaño == 0;
    }
    public int tamaño(){
        return tamaño;
    }
}