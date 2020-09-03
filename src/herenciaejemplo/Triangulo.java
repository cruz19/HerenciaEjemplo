package herenciaejemplo;

/**
 * @author Steven Cruz
 * @author Daniel Zambrano
 * @version 1.0.0
 * @since 03/09/2020
 */
public class Triangulo extends FiguraGeometrica {
    /**
     * Lado 1 del triángulo
     */
    private double lado1;
    /**
     * Lado 2 del triángulo
     */
    private double lado2;
    /**
     * Lado 3 del triángulo
     */
    private double lado3;
    /**
     * Tipo de triángulo
     */
    private TipoTriangulo tipoTriangulo;

    /**
     * Constructor 
     * @param lado1 Lado1 del triángulo
     * @param lado2 Lado1 del triángulo
     * @param lado3 Lado1 del triángulo
     */
    public Triangulo(double lado1, double lado2, double lado3) {
        super("Triángulo");
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    /**
     * Método sobrescrito
     * Se encarga de calcular y establecer el área del triángulo
     */
    @Override
    public void calcularArea() {
        double semiperimetro = (lado1 + lado2 + lado3) / 2;
        double areaTriangulo = Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));
        this.setArea(areaTriangulo);
    }

    /**
     * Método sobrescrito
     * Se encarga de calcular y establecer el perímetro del triángulo
     */
    @Override
    public void calcularPerimetro() {
        double perimetroTriangulo = lado1 + lado2 + lado3;
        this.setPerimetro(perimetroTriangulo);
    }

    /**
     * Se encarga de retornar el lado 1 del triángulo
     * @return Lado 1 del triángulo
     */
    public double getLado1() {
        return lado1;
    }

    /**
     * Modifica el lado 1 del triángulo
     * @param lado1 Lado 1 del triángulo
     */
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    /**
     * Se encarga de retornar el lado 2 del triángulo
     * @return Lado 2 del triángulo
    */
    public double getLado2() {
        return lado2;
    }
    
    /**
     * Modifica el lado 2 del triángulo
     * @param lado2 Lado 2 del triángulo
     */
    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    /**
     * Se encarga de retornar el lado 3 del triángulo
     * @return Lado 3 del triángulo
    */
    public double getLado3() {
        return lado3;
    }

    /**
     * Modifica el lado 3 del triángulo
     * @param lado3 Lado 3 del triángulo
     */
    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    /**
     * Se encarga de retornar el tipo de triángulo
     * @return tipo de triángulo
     */
    public TipoTriangulo getTipoTriangulo() {
        if (lado1 == lado2 && lado1 == lado3){
            return TipoTriangulo.EQUILATERO;
        } else if (lado1 != lado2 && lado2 != lado3 && lado3 != lado1){
            return TipoTriangulo.ESCALENO;
        } else if (lado1 == lado2 || lado3 == lado1 || lado3 == lado2){
            return TipoTriangulo.ISOSCELES;
        }
        return null;
    }

    /**
     * Modifica el tipo de triángulo
     * @param tipoTriangulo Tipo de triángulo
     */
    public void setTipoTriangulo(TipoTriangulo tipoTriangulo) {
        this.tipoTriangulo = tipoTriangulo;
    }
}
