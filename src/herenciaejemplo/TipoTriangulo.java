package herenciaejemplo;

/**
 * Enumeración de tipos de triángulos
 * @author Steven Cruz
 * @author Daniel Zambrano
 * @version 1.0.0
 * @since 03/09/2020
 */
public enum TipoTriangulo {
    /**
     * Enumeración
     */
    EQUILATERO("Equilátero"),
    ISOSCELES("Isósceles"),
    ESCALENO("Escaleno");
    
    /**
     * Nombre del tipo de triángulo
     */
    private final String nombre;
    
    /**
     * @param nombre Nombre del tipo de triángulo
     */
    TipoTriangulo(String nombre){
        this.nombre = nombre;
    }
    
    /**
     * Se encarga de retornar el tipo de triángulo
     * @return nombre del tipo de triángulo
     */
    public String getNombre(){
        return nombre;
    }
}
