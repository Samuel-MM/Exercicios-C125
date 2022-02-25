//Exercício 2
import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
    //Inicializa o objeto scanner
    Scanner valueEntered = new Scanner(System.in);

    //Declara as variáveis das partidas e recebe a entrada do usuário com o número de kills
    int firstMatch = valueEntered.nextInt();
    int secondMatch = valueEntered.nextInt();
    int thirdMatch = valueEntered.nextInt();

    //Declara a variável que recebe o valor somado das kills de cada partida
    int resultKills = firstMatch + secondMatch + thirdMatch;

    //Saída de dados com a string formatada
    System.out.printf("O número de zumbis mortos foi: %d e a média foi de %.2f", resultKills, resultKills/3.0);

    //Fecha o scanner para nenhum valor ser lido
    valueEntered.close();
    }
}
