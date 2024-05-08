public abstract class Producto {
    private String nombre;
    private Double precio;
    private Integer stock;

    public Producto(String nombre, Double precio, Integer stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // region Getters & Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    // endregion

    public static Double aumentarPrecio(Producto producto, Double aumentoProcentaje) {
        Double aumento = (producto.getPrecio() * aumentoProcentaje) / 100;
        Double nuevoPrecio = producto.getPrecio() + aumento;
        producto.setPrecio(nuevoPrecio);
        return producto.getPrecio();
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s, Precio: %.2f, Stock: %d", this.nombre, this.precio, this.stock);
    }
}
