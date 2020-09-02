package herenciaejemplo;

/**
 * @author Steven Cruz
 * @author Daniel Zambrano
 * @version 1.0.0
 * @since 03/09/2020
 */
public class Rectangulo extends FiguraGeometrica{
    /**
     * Base del rectángulo
     */
    private double base;
    /**
     * Altura del rectángulo
     */
    private double altura;

    /**
     * Constructor
     * @param base Base del rectángulo
     * @param altura Altura del rectángulo
     */
    public Rectangulo(double base, double altura) {
        super("Rectángulo");
        this.base = base;
        this.altura = altura;
    }

    /**
     * Método sobrescrito
     * Se encarga de calcular y establecer el área del rectangulo
     */
    @Override
    public void calcularArea() {
        double areaRectangulo = base * altura;
        this.setArea(areaRectangulo);
    }

    /**
     * Método sobrescrito
     * Se encarga de calcular y establecer el perímetro del rectangulo
     */
    @Override
    public void calcularPerimetro() {
        double perimetroRectangulo = 2 * (base + altura);
        this.setPerimetro(perimetroRectangulo);
    }
    
    /**
     * Se encarga de retornar la base del rectángulo
     * @return base de la figura
     */
    public double getBase() {
        return base;
    }

    /**
     * Modifica la base del rectángulo
     * @param base Base del rectángulo
     */
    public void setBase(double base) {
        this.base = base;
    }

    /**
     * Se encarga de retornar la altura del rectángulo
     * @return altura del rectángulo
     */
    public double getAltura() {
        return altura;
    }
    
    /**
     * Modifica la altura del rectángulo
     * @param altura Altura del rectángulo
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }
}
