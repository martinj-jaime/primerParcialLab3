public abstract  class ProductosMuebles extends Producto {
    /* La clase abstracta la dejo ya que por diseño, es muy probable
    * que en un futuro se le quieran agregar atributos compartidos
    * a las clases que lo heredan
    * */
    public ProductosMuebles(String nombre, Double precio, Integer stock) {
        super(nombre, precio, stock);
    }
}
