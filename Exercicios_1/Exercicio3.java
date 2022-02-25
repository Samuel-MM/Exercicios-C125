//Exercício 3
import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args) {
        //Inicializa o objeto scanner
        Scanner valueEntered = new Scanner(System.in);

        //Declara as variáveis e recebe a entrada do usuário
        int npa = valueEntered.nextInt();
        int np3;
        double npf;

        //Caso a npa for maior igual a 30 e menor que 60 (np3)
        if(npa >= 30  && npa < 60){

            //Informa que ele pode realizar a np3 e recebe esse valor
            System.out.printf("A sua nota da NPA foi de %d, mas não desanime, você ainda pode fazer a NP3! \n", npa);
            np3 = valueEntered.nextInt();

            //Faz o cálculo da npf
            npf = (npa + np3)/2.0;

            //Compara se a npf é maior que 50 (caso aprovado)
            if(npf >= 50){
                System.out.printf("Parabéns! Você foi aprovado com uma nota final de %.2f!", npf);
            }

            //Caso contrário o aluno foi reprovado
            else{
                System.out.printf("Infelizmente a sua nota foi %.2f e você não foi aprovado :(", npf);
            }
        }

        //Caso a npa for maior igual a 60 o usuário foi aprovado
        else if (npa >= 60){
            System.out.printf("Parabéns! Você foi aprovado com uma nota final de %d!", npa);
        }

        //Caso contrário ele foi reprovado
        else{
            System.out.printf("Infelizmente a sua nota foi %d e você não foi aprovado :(", npa);
        }

        //Fecha o scanner para nenhum valor ser lido
        valueEntered.close();
    }
}
