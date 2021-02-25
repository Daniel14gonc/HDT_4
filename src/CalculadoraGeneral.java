/**
 * @author Daniel Gonzalez 20293, Manuel Archila 161250
 * Modificacion: 01/31/2021
 * Interfaz: CalculadoraGeneral
 *
 * Descripcion:
 *  Interfaz que permite determinar las operaciones de una calulcadora.
 */

public interface CalculadoraGeneral {

    /**Metodo que permite evaluar expresiones en postfix.*/
    public String Calculo(String expresion) throws Exception;

    /**Metodo que permite modificar el stack que usa la calculadora.*/
    public void setStack(Stack<Integer> stack);
}
