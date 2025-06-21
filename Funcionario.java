// Algoritmo utilizando um método com retorno:

public class Funcionario {

    double salario;

    double calcularDescontoSalario(){
        double salarioDescontado = salario - 1800;
        return salarioDescontado; 
    }

}

class Empresa {
    public static void main(String[] args){

        Funcionario fulano = new Funcionario();
        fulano.salario = 14000;
        fulano.calcularDescontoSalario();
        double salarioexibido = fulano.calcularDescontoSalario();
        System.out.println("O salário já desontado é: " + salarioexibido);
        
    }
}
