import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int voto = 1;
        int candidato1 = 0, candidato2 = 0, candidato3 = 0;
        int votoInvalido = 0;
        double total;

        while (voto != 0){
            System.out.println("(1) = Candidato 1\n" +
                            "(2) = Candidato 2\n" +
                            "(3) = Candidato 3\n" +
                    "(0) Finalizar");
            voto = sc.nextInt();

            if (voto == 1){
                candidato1++;
            }
            else if (voto == 2){
                candidato2++;
            }
            else if (voto == 3){
                candidato3++;
            }
            else if (voto != 0){
               votoInvalido++;
            }
        }

        total = candidato1 + candidato2 + candidato3;

        System.out.println("Candidato 1 = " + candidato1 + "\n Candidato 2 = " + candidato2 + "\n Candidato 3 = " + candidato3 + "\n Votos invalidos = " + votoInvalido);
        System.out.printf("\nPorcentagem de votos candidato 1 = %.1f\n" , candidato1 / total * 100);
        System.out.printf("Porcentagem de votos candidato 2 = %.1f\n" , candidato2 / total * 100);
        System.out.printf("Porcentagem de votos candidato 3 = %.1f\n" , candidato3 / total * 100);
        if (candidato1 > candidato2 && candidato1 > candidato3){
            System.out.println("Candidato 1 é o vencedor");
        } else if (candidato2 > candidato1 && candidato2 > candidato3){
            System.out.println("Candidato 2 é o vencedor");
        } else {
            System.out.println("Candidato 3 é o vencedor");
        }



    }
}
