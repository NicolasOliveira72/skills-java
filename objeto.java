// Algoritmo que instancia a classe: 

class Jogador {

    // Atributos do jogador:

    String carro;
    String motor;
    String pneu;

    // Método do jogador:

    void acelerar() {
        System.out.println("Carro acelerando: " + carro + "," + motor + "," + pneu);
    }
}


public class objeto {
    public static void main (String [] args){

        // Criar a instância de um ogjeto:

        Jogador fulano  = new Jogador();
        fulano.carro = "Celta";
        fulano.motor = "V8";
        fulano.pneu = "cross";

        // Executando o método da classe:
        
        fulano.acelerar();


    }
}
