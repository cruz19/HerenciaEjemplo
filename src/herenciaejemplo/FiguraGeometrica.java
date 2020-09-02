package herenciaejemplo;

/**
 * @author Steven Cruz
 * @author Daniel Zambrano
 * @version 1.0.0
 * @since 03/09/2020
 */
public abstract class FiguraGeometrica {
    
    /**
     * Nombre de la figura
    */
    private String nombre;
    /**
     * Área de la figura
     */
    private double area;
    /**
     * Perímetro de la figura
     */
    private double perimetro;
    
    /**
     * Constructor
     * @param nombre Nombre de la figura
     */
    public FiguraGeometrica(String nombre){
        this.nombre = nombre;
    }

    /**
     * Se encarga de retornar el nombre de la figura
     * @return nombre de la figura
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre de la figura
     * @param nombre Nombre de la figura
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Se encarga de retornar el área de la figura
     * @return área de la figura
     */
    public double getArea() {
        return area;
    }

    /**
     * Modifica el área de la figura
     * @param area Área de la figura
     */
    public void setArea(double area) {
        this.area = area;
    }

    /**
     * Se encarga de retornar el perímetro de la figura
     * @return perímetro de la figura
     */
    public double getPerimetro() {
        return perimetro;
    }

    /**
     * Modifica el perímetro de la figura
     * @param perimetro Perímetro de la figura
     */
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    
    /**
     * Método abstracto que se encarga de calcular y modificar el área de la figura
     * con los atributos de los que disponga
     */
    public abstract void calcularArea();
    
    /**
     * Método abstracto que se encarga de calcular y modificar el perímetro de la figura
     * con los atributos de los que disponga
     */
    public abstract void calcularPerimetro();

    @Override
    public String toString() {
        calcularArea();
        calcularPerimetro();
        return "FiguraGeometrica{" + "nombre=" + nombre + ", area=" + area + ", perimetro=" + perimetro + '}';
    }
}
