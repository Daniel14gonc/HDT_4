public class Convertidor{
  //Codigo obtenido en GeeksforGeeks
  //Extraido de: https://www.geeksforgeeks.org/stack-set-2-infix-to-postfix/
  //Metodo que indentifica que retorna para cada operador detectado
  static int Prec(char ch) 
  { 
    switch (ch) 
    { 
    case '+': 
    case '-': 
      return 1; 
    
    case '*': 
    case '/': 
      return 2; 
    
    case '^': 
      return 3; 
    } 
    return -1; 
  } 

  static String infixToPostfix(String exp) 
  { 
    //Crea una nueva string con el postfix
    String result = new String(""); 
      
    //Crea un stack vacio con el se ordenara  
    Stack<Character> stack = new StackArrayList<Character>();
      
    for (int i = 0; i<exp.length(); ++i) 
    { 
      char c = exp.charAt(i); 
        
      // Si se escanea un operando se agrega a la String Postfix
      if (Character.isLetterOrDigit(c)){
        result += c; 
      }
          
      // Si se a escanea un  parentesis abierto se añade a la String postfix 
      else if (c == '('){
        stack.push(c); 
      }
        
        //  Si se encuentra un parentesis cerrado se combrueba que el ultimo elemento no sea un parentesis abierto.
        else if (c == ')') 
        { 
          while (!stack.empty() &&  stack.peek() != '('){
            result += stack.pop();
          }
          stack.pop(); 
        } 
        else // Se encuentra un operador
        { 
          while (!stack.empty() && Prec(c) <= Prec(stack.peek())){ 
            result += stack.pop(); 
          } 
          stack.push(c); 
        } 
    
    } 
    
    // Ingresa todos los operadores dentro del stack
    while (!stack.empty()){ 
        if(stack.peek() == '('){
          return "Expresion Invalida. Intente con otra por favor.";
        }
        result += stack.pop(); 
      } 
    return result; 
  } 

}