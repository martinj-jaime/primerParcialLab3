public class Silla extends Producto implements EnOferta {
    private Boolean traeRuedas;

    public Silla(String nombre, Double precio, Integer stock, Boolean traeRuedas) {
        super(nombre, precio, stock);
        this.traeRuedas = traeRuedas;
    }

    // region Getters & Setters
    public Boolean getTraeRuedas() {
        return traeRuedas;
    }

    public void setTraeRuedas(Boolean traeRuedas) {
        this.traeRuedas = traeRuedas;
    }
    // endregion

    @Override
    public String toString() {
        String traeRuedasText = this.traeRuedas ? "Si" : "No";
        return String.format("(%s) %s, Trae ruedas: %s", super.getClass().getSimpleName(), super.toString(), traeRuedasText);
    }

    // region EnOferta Implementation
    @Override
    public Double obtenerPrecioConDescuento(Double descuentoPorcentaje) {
        Double descuento =  (super.getPrecio() * descuentoPorcentaje) / 100;
        Double precioFinal = super.getPrecio() - descuento;
        return precioFinal;
    }
    // endregion
}
