//Exercício 6
import java.util.Random;
import java.util.Scanner;
public class Exercicio6 {
    public static void main(String[] args) {
        //Declara as variáveis
        int userValue;
        int randomValue;
        String result;

        //Inicializa o objeto scanner
        Scanner valueEntered = new Scanner(System.in);

        //Inicializa o objeto random para gerar um número aleatório
        Random randNumber = new Random();

        //Gera um valor aleatório
        randomValue = randNumber.nextInt(10) + 1;

        //Recebe a entrada do usuário
        userValue = valueEntered.nextInt();

        //Enquanto o valor do usuário for diferente do gerado aleatoriamente ele repete esse bloco
        while(userValue != randomValue){

            //Compara se o valor do usuário é maior que o gerado, se for exibe uma mensagem, caso contrário exibe outra
            result = (userValue > randomValue) ? "O valor do usuário é maior que gerado" : "O valor do usuário é " +
                    "menor que o gerado";

            //Exibe a mensagem armazenada em result
            System.out.println(result);

            //Recebe a entrada do usuário
            userValue = valueEntered.nextInt();
        }

        //Após o usuário acertar o número exibe a mensagem de sucesso
        System.out.printf("Parabéns! O valor era %d e você acertou!", randomValue);

        //Fecha o scanner para nenhum valor ser lido
        valueEntered.close();
    }
}
