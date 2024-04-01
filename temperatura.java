import java.util.Scanner;

public class temperatura{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double temperatura, media, numeroTemperatura, temperaturaTotal;

        temperaturaTotal = 0;
        temperatura = 0;

        System.out.print("Insira a quantidade de temperaturas medidas: ");
        numeroTemperatura = input.nextDouble();

        for(int i = 1; i <= numeroTemperatura; i++){
            System.out.print("Digite a temperatura " + i + "(entre 4 e 10 graus): ");
            temperatura = input.nextDouble();
            while (true) {
                if (temperatura < 3 || temperatura > 10) {
                    System.out.println("Temperatura inválida! Tente novamente com a temperatura entre 4 e 10.");
                    i = i -1;
                    break;
                } else {
                    temperaturaTotal += temperatura;
                    break;
                }
            }
        }

        media = temperaturaTotal / numeroTemperatura;

        System.out.print("A média de hoje das temperaturas é: " + media + "º C");

        input.close();
    }
}