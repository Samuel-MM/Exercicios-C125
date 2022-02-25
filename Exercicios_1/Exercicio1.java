//Exercício 1
public class Exercicio1 {
    public static void main(String[] args) {
        //Declarando variáveis e recebendo o número de zumbis mortos e o somatório das kills
        int firstMatch = 130, secondMatch = 240, thirdMatch = 320;
        int resultKills = firstMatch + secondMatch + thirdMatch;

        //Saída de dados com o somatório das kills e a média
        System.out.println("Total de mortes: " + resultKills);
        System.out.println("Media de mortes: " + resultKills/3);
    }
}
