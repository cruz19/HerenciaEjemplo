package herenciaejemplo;

/**
 * @author Steven Cruz
 * @author Daniel Zambrano
 * @version 1.0.0
 * @since 03/09/2020
 */
public class Cuadrado extends FiguraGeometrica{
    /**
     * Lado del cuadrado
     */
    private double lado;
    
    /**
     * Constructor
     * @param lado Lado del cuadrado
     */
    public Cuadrado(double lado){
        super("Cuadrado");
        this.lado = lado;
    }
    
    /**
     * Método sobrescrito
     * Se encarga de calcular y establecer el área del cuadrado
     */
    @Override
    public void calcularArea() {
        double areaCuadrado = Math.pow(lado, 2);
        this.setArea(areaCuadrado);
    }

    /**
     * Método sobrescrito
     * Se encarga de calcular y establecer el perímetro del cuadrado
     */
    @Override
    public void calcularPerimetro() {
        double perimetroCuadrado = lado * 4;
        this.setPerimetro(perimetroCuadrado);
    }

    /**
     * Se encarga de retornar el lado del cuadrado
     * @return lado del cuadrado
     */
    public double getLado() {
        return lado;
    }

    /**
     * Modifica el lado del cuadrado
     * @param lado Lado del cuadrado
     */
    public void setLado(double lado) {
        this.lado = lado;
    }
}
