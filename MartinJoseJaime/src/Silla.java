public class Silla extends Producto implements EnOferta {
    private Boolean traeRuedas;

    public Silla(String nombre, Double precio, Integer stock, Boolean traeRuedas) {
        super(nombre, precio, stock);
        this.traeRuedas = traeRuedas;
    }

    public Boolean getTraeRuedas() {
        return traeRuedas;
    }

    public void setTraeRuedas(Boolean traeRuedas) {
        this.traeRuedas = traeRuedas;
    }

    @Override
    public String toString() {
        String traeRuedasText = this.traeRuedas ? "Si" : "No";
        return String.format("(%s) %s, Trae ruedas: %s", super.getClass().getSimpleName(), super.toString(), traeRuedasText);
    }

    // region EnOferta Implementation
    @Override
    public Double obtenerPrecioConDescuento(Double descuento) {
        Double precioConDescuento = super.getPrecio() + super.getPrecio() * descuento;
        return precioConDescuento;
    }
    // endregion
}
