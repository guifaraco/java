package ex2;

public class Ex_2 {

    public static void main(String[] args) {
        double percentual = 1.5;
        double novoSalario, salarioAnterior = 1000.00;
        
        for(int i = 1996; i < 2023; i++){
            novoSalario = (percentual / 100) * salarioAnterior + salarioAnterior;
            salarioAnterior = novoSalario;
            percentual = percentual * 2;
        }
        System.out.println("O salario no em 2022 é igual a: " + salarioAnterior);
    }
    
}
