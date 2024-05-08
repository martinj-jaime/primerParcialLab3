public abstract class ProductosInformaticos extends Producto {
    private String nombreDelFabricante;

    public ProductosInformaticos(String nombre, Double precio, Integer stock, String nombreDelFabricante) {
        super(nombre, precio, stock);
        this.nombreDelFabricante = nombreDelFabricante;
    }

    // region Getters & Setters
    public String getNombreDelFabricante() {
        return nombreDelFabricante;
    }

    public void setNombreDelFabricante(String nombreDelFabricante) {
        this.nombreDelFabricante = nombreDelFabricante;
    }
    // endregion

    @Override
    public String toString() {
        return String.format("%s Fabricante: %s", super.toString(), this.nombreDelFabricante);
    }
}
