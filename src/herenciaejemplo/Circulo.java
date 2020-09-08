package herenciaejemplo;

/**
 * @author Steven Cruz
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
     * Se encarga de calcular y establecer el área del círculo utilizando su radio
    */
    @Override
    public void calcularArea() {
        double areaCirculo = Math.PI * Math.pow(radio, 2);
        this.setArea(areaCirculo);
    }

    /**
     * Método sobrescrito
     * Se encarga de calcular y establecer el perímetro del círculo utilizando su radio
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

    /**
     * Método sobrescrito de la clase Object que retorna los atributos de la clase en un String
     * Al final se agrega el método toString de la clase padre FiguraGeometrica
     * @return String
    */
    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}' + "\n" + super.toString();
    }
}
