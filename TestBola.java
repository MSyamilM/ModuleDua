import java.util.Scanner;

public class TestBola {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan Nilai Jari-Jari: ");
            double JariJari = input.nextDouble();

            Bola ball = new Bola();

            ball.setJariJari(JariJari);
            ball.showDiameter();
            ball.showLuasPermukaan();
            ball.showVolume();
        }
    }
}
