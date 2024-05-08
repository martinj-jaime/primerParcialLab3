public class Notebook extends ProductosInformaticos {

    private Double capacidadDeMemoriaGb;

    public Notebook(String nombre, Double precio, Integer stock, String nombreDelFabricante, Double capacidadDeMemoriaGb) {
        super(nombre, precio, stock, nombreDelFabricante);
        this.capacidadDeMemoriaGb = capacidadDeMemoriaGb;
    }


    public Double getCapacidadDeMemoriaGb() {
        return capacidadDeMemoriaGb;
    }

    public void setCapacidadDeMemoriaGb(Double capacidadDeMemoriaGb) {
        this.capacidadDeMemoriaGb = capacidadDeMemoriaGb;
    }

    @Override
    public String toString() {
        return String.format("(%s) %s, Capacidad en GB: %.2f", super.getClass().getSimpleName(), super.toString(), this.capacidadDeMemoriaGb);
    }
}
