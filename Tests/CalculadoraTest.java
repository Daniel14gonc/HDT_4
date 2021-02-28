import org.junit.Test;

import static org.junit.Assert.*;

public class CalculadoraTest {

    @Test
    public void calculo() {
        Stack<Integer> stack = new StackFactory<Integer>().getStack(4);
        CalculadoraGeneral calculadora = Calculadora.singletonCalculadora();
        calculadora.setStack(stack);
        String exp = "(1+2) * 3";
        String expresionEvaluar = Convertidor.infixToPostfix(exp);
        String res = "";
        try {
            res = calculadora.Calculo(expresionEvaluar);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        assertEquals("Fallo en calculo", res, "9");
    }
}