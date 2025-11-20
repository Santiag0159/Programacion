public class Pila {
    private static final int tampila = 80;
    private int cima;
    private Object[] listaPila;
    public Pila() {
        this.cima = -1;
        this.listaPila = new Object[tampila];
    }
    public void insertar(Object elemento) throws Exception {
        if (pilaLlena()) {
            throw new Exception("Pila llena");
        } cima++;
        listaPila[cima] = elemento;
    }
    public Object quitar() throws Exception {
        Object aux;
        if(pilaVacia()){
            throw new Exception("Pila vacia, no se puede quitar nada...");
        } aux = listaPila[cima];
        cima--;
        return aux;
    }
    public Object cimaPila() throws Exception {
        if(pilaVacia()){
            throw new Exception("Pila vacia, no se puede ver la cima...");
        } return listaPila[cima];
    }
    public boolean pilaVacia(){
        return cima == -1;
    }
    public boolean pilaLlena(){
        return cima == tampila -1;
    }
    public void limpiarPila(){
        cima = -1;
    }
}