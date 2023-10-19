public class TestePessoa {
    public static void main(String[] args) {
        var p1 = new Pessoa();
    }
}

class Pessoa{ 
    private String nome;
    private int idade;

    Pessoa(String nome, int idade){ //Construtor PADRÃO "Pessoa()"   Construtor tem o mesmo nome da classe é não tem retorno
        this.nome = nome;
        this.idade = idade;
    }

    Pessoa(int idade, String nome){
        this(nome, idade);          //Parametros invertidos, para não duplicar o construtor, chamamos o construtor anterior, para isso usamos this(parametros)
    }

    Pessoa(int idade){
        this(null, idade);  //Essa é a chamada do construtor (Pessoa(String nome , int Idade)) por causa da ordem dos parametros
    }

    Pessoa(String nome){
        this(nome, 0);  //DETALHE IMPORTANTE, UM CONSTRUTOR PODE CHAMAR OUTRO DESDE QUE ESSA SEJA A PRIMEIRA LINHA DE CÓDIGO (logo não é possível chamar 2 construtores)
    }

    Pessoa(){} //Sobrecarga de costuradores, pois uma mesma "Pessoa" pode receber 2 tipos de paramêtros

}


class Personagem{
    final static int VALOR_ENERGIA_PADRAO = 10; //Definição de um valor que não é em instância, por isso STATIC, é um valor definitivo e que não será alterado, A ENERGIA PADRÃO É 10
    final static int VALOR_FOME_PADRAO = 0;
    final static int VALOR_SONO_PADRAO = 0;
    String nome;
    int energia, fome, sono;

    Personagem(){
        this(null, VALOR_ENERGIA_PADRAO, VALOR_FOME_PADRAO, VALOR_SONO_PADRAO);
    }
    Personagem(String nome){
        this(nome, VALOR_ENERGIA_PADRAO, VALOR_FOME_PADRAO, VALOR_SONO_PADRAO)
    }
    Personagem(String nome, int energia, int fome, int sono){
        super();
        this.nome = nome;
        this.energia = energia;
        this.fome = fome;
        this.sono = sono;
    }
}