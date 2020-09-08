package herenciaejemplo;

/**
 * @author Steven Cruz
 * @version 1.0.0
 * @since 03/09/2020
 */
public class Cuadrado extends FiguraGeometrica{
    /**
     * Representa cualquier lado del cuadrado
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
     * Se encarga de calcular y establecer el área del cuadrado con el lado establecido
     */
    @Override
    public void calcularArea() {
        double areaCuadrado = Math.pow(lado, 2);
        this.setArea(areaCuadrado);
    }

    /**
     * Método sobrescrito
     * Se encarga de calcular y establecer el perímetro del cuadrado con el lado establecido
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

    /**
     * Método sobrescrito de la clase Object que retorna los atributos de la clase en un String
     * Al final se agrega el método toString de la clase padre FiguraGeometrica
     * @return String
     */
    @Override
    public String toString() {
        return "Cuadrado{" + "lado=" + lado + '}' + "\n" + super.toString();
    }
}
