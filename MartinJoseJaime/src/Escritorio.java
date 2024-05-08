public class Escritorio extends ProductosMuebles {
    private Double alto;
    private Double ancho;

    public Escritorio(String nombre, Double precio, Integer stock, Double alto, Double ancho) {
        super(nombre, precio, stock);
        this.alto = alto;
        this.ancho = ancho;
    }

    // region Getters & Setters

    public Double getAlto() {
        return alto;
    }

    public void setAlto(Double alto) {
        this.alto = alto;
    }

    public Double getAncho() {
        return ancho;
    }

    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }

    // endregion

    @Override
    public String toString() {
        return String.format("(%s) %s, Alto: %.2f, Ancho: %.2f", super.getClass().getSimpleName(), super.toString(), this.alto, this.ancho);
    }
}
