public class Impresora extends ProductosInformaticos implements EnOferta {
    private Integer fabricadasPorMinuto;

    public Impresora(String nombre, Double precio, Integer stock, String nombreDelFabricante, Integer fabricadasPorMinuto) {
        super(nombre, precio, stock, nombreDelFabricante);
        this.fabricadasPorMinuto = fabricadasPorMinuto;
    }

    // region Getters & Setters
    public Integer getFabricadasPorMinuto() {
        return fabricadasPorMinuto;
    }

    public void setFabricadasPorMinuto(Integer fabricadasPorMinuto) {
        this.fabricadasPorMinuto = fabricadasPorMinuto;
    }
    // endregion

    @Override
    public String toString() {
        return String.format("(%s) %s, Fabricadas x Min: %s", super.getClass().getSimpleName(), super.toString(), this.fabricadasPorMinuto);
    }

    // region EnOferta Implemenentation
    @Override
    public Double obtenerPrecioConDescuento(Double descuentoPorcentaje) {
        Double descuento = (super.getPrecio() * descuentoPorcentaje) / 100;
        Double precioFinal = super.getPrecio() - descuento;
        return precioFinal;
    }
    // endregion
}
