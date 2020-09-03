package herenciaejemplo;

import java.util.Scanner;

/**
 *
 * @author Steven Cruz
 * @author Daniel Zambrano
 */
public class HerenciaEjemplo {
    
    /**
     * Scanner para la entrada de datos por consola
     */
    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        byte opcion = 0;
        do{
            mostrarMenu();
            try{
                opcion = sc.nextByte();
                switch(opcion){
                    case 1:
                        System.out.println("\n\tCUADRADO");
                        double lado = inputDouble("Ingrese el valor de cualquier lado del cuadrado: ");
                        Cuadrado cuadrado = new Cuadrado(lado);
                        System.out.println("\tResultado");
                        System.out.println(cuadrado);
                    break;
                    case 2: 
                        System.out.println("\n\tRECTÁNGULO");
                        double base = inputDouble("Ingrese el valor de la base: ");
                        double altura = inputDouble("Ingrese el valor de la altura: ");
                        Rectangulo rectangulo = new Rectangulo(base, altura);
                        System.out.println("\tResultado");
                        System.out.println(rectangulo);
                    break;
                    case 3:
                        double lado1, lado2, lado3;
                        boolean ladosValidos = true;
                        do{
                            // Pedir valores de los tres lados del triángulo
                            System.out.println("\n\tTRIÁNGULO");
                            lado1 = inputDouble("Ingrese el valor del lado 1: ");
                            lado2 = inputDouble("Ingrese el valor del lado 2: ");
                            lado3 = inputDouble("Ingrese el valor del lado 3: ");

                            // Validación de los tres lados del triángulo
                            if (lado1 >= (lado2 + lado3) || lado3 >= (lado2 + lado1) || lado2 >= (lado1 + lado3)) {
                                System.out.println("\n***Los valores de los lados no corresponden a un trángulo***");
                                ladosValidos = false;
                            }
                        }while(!ladosValidos);
                        
                        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
                        System.out.println("\tResultado");
                        System.out.println("Tipo triángulo: " + triangulo.getTipoTriangulo().getNombre());
                        System.out.println(triangulo);
                    break;
                    case 4: 
                        System.out.println("\n\tCÍRCULO");
                        double radio = inputDouble("Ingrese el valor del radio: ");
                        Circulo circulo = new Circulo(radio);
                        System.out.println("\tResultado");
                        System.out.println(circulo);
                    break;
                    default:
                        System.out.println("\n***No es un opción válida***");
                }
            }catch(java.util.InputMismatchException ex){
                System.out.println("\n***No es un opción válida***");
                sc.nextLine();
            }
            System.out.println("\n---------------------------------------------------------------------------\n");
        }while(opcion != 5);
    }
    
    /**
     * Se encarga de mostrar el menú de opciones
     */
    private static void mostrarMenu(){
        System.out.println("\tFIGURAS GEOMÉTRICAS: Perímetro y Área\n");
        System.out.println("1. Cuadrado");
        System.out.println("2. Rectángulo");
        System.out.println("3. Triángulo");
        System.out.println("4. Círculo");
        System.out.println("5. Salir");
        System.out.print("Ingrese una opción: ");
    }
    
    /**
     * Se encarga de capturar el posible error de entrada del scanner y retornar el valor double
     * @param mensaje Mensaje que acompañara la entrada del valor double
     * @return double
     */
    private static double inputDouble(String mensaje)
    {
        while (true)
        {
            System.out.print(mensaje);
            try
            {
                double value = sc.nextDouble();
                if (value <= 0){
                    System.out.println("***No se aceptan números negativos ni el cero***");
                } else {
                    return value;
                }
            } 
            catch (java.util.InputMismatchException e)
            {
                sc.nextLine();
            }
        }
    }
}
