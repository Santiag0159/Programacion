public class HistorialCambios{
    private Pila historial;

    public Pila setHistorialCambios(){return historial;}
    public void getHistorialCambios(Pila historial){this.historial = historial;}
    public HistorialCambios(){
        historial = new Pila();
    }
    public void agregarCambio(CambioNota cambio){
        try{
            historial.insertar(cambio);
        } catch (Exception e){
            System.out.println("Error al agregar cambio al historial: " + e.getMessage());
        }
    }
    public CambioNota verUltimoCambio(){
        try{
            return (CambioNota) historial.cimaPila();
        } catch (Exception e){
            System.out.println("Error al ver el ultimo cambio: " + e.getMessage());
            return null;
        }
    }
    public CambioNota deshacerUltimoCambio(){
        try{
            return (CambioNota) historial.quitar();
        } catch (Exception e){
            System.out.println("Error al eliminar el ultimo cambio: " + e.getMessage());
            return null;
        }
    }
}