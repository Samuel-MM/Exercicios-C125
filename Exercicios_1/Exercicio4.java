//Exercício 4
import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {

        //Inicializa o objeto scanner
        Scanner valueEntered = new Scanner(System.in);

        //Declara a variável e recebe a entrada do usuário
        int numberOfStudents = valueEntered.nextInt();

        //Menu de opções
        switch (numberOfStudents){

            //Se o valor entrado for 10
            case 10:
                System.out.println("A sala utilizada será a I - 15");
                break;

            //Se o valor entrado for 20
            case 20:
                System.out.println("A sala utilizada será a I - 15");
                break;

            //Se o valor entrado for 30
            case 30:
                System.out.println("A sala utilizada será a I - 22");
                break;

            //Caso padrão que ocorro quando o valor entrado não satisfaz nenhum dos casos anteriores
            default:
                System.out.println("Número inválido de alunos. Favor tentar novamente!");
                break;
        }
        //Fecha o scanner para nenhum valor ser lido
        valueEntered.close();
    }
}
