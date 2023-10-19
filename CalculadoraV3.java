public class CalculadoraV3 {
    public int somar (int [] elementos){
        var res = 0;
        for(int elemento : elementos)
            res += elemento;
        //Esse aqui de cima é o ENHACED FOR, é uma reescrita do for habitual
        //for (i = 0; i < elementos.length; i++)
        // res += elementos[i];
        return res;
    }
}