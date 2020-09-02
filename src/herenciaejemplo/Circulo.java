package herenciaejemplo;

/**
 * @author Steven Cruz
 * @author Daniel Zambrano
 * @version 1.0.0
 * @since 03/09/2020
 */
public class Circulo extends FiguraGeometrica {
    /**
     * Radio del círculo
     */
    private double radio;

    /**
     * Constructor
     * @param radio Radio del círculo
     */
    public Circulo(double radio) {
        super("Círculo");
        this.radio = radio;
    }
    
    /**
     * Método sobrescrito
     * Se encarga de calcular y establecer el área del círculo
    */
    @Override
    public void calcularArea() {
        double areaCirculo = Math.PI * Math.pow(radio, 2);
        this.setArea(areaCirculo);
    }

    /**
     * Método sobrescrito
     * Se encarga de calcular y establecer el perímetro del círculo
    */
    @Override
    public void calcularPerimetro() {
        double perimetroCirculo = 2 * Math.PI * radio;
        this.setPerimetro(perimetroCirculo);
    }

    /**
     * Se encarga de retornar el radio del círculo
     * @return radio del círculo
     */
    public double getRadio() {
        return radio;
    }

    /**
     * Modifica el radio del círculo
     * @param radio Radio del círculo
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }
}
