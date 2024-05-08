public class Impresora extends ProductosInformaticos implements EnOferta {
    private Integer fabricadasPorMinuto;

    public Impresora(String nombre, Double precio, Integer stock, String nombreDelFabricante, Integer fabricadasPorMinuto) {
        super(nombre, precio, stock, nombreDelFabricante);
        this.fabricadasPorMinuto = fabricadasPorMinuto;
    }

    public Integer getFabricadasPorMinuto() {
        return fabricadasPorMinuto;
    }

    public void setFabricadasPorMinuto(Integer fabricadasPorMinuto) {
        this.fabricadasPorMinuto = fabricadasPorMinuto;
    }


    @Override
    public String toString() {
        return String.format("(%s) %s, Fabricadas x Min: %s", super.getClass().getSimpleName(), super.toString(), this.fabricadasPorMinuto);
    }

    // region EnOferta Implemenentation
    @Override
    public Double obtenerPrecioConDescuento(Double descuento) {
        Double precioConDescuento = super.getPrecio() + super.getPrecio() * descuento;
        return precioConDescuento;
    }
    // endregion
}
