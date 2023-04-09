


// programa de soluções computacionais.
// Lista 2 ( atividade 9, segunda lista)
//Aluno: João Victor Maia Leite
//RA: 323124931


import java.util.Scanner;

public class atividade9 {
    public static void main(String[] args) throws Exception {



         double LIMITE_PESO = 50.0; // Limite de peso de peixes
         double MULTA_POR_QUILO_EXCEDENTE = 4.0; // Valor da multa por quilo excedente
        double peso, excesso, multa;

        Scanner input = new Scanner(System.in);
        System.out.print("Digite o peso de peixes em kg: ");
        peso = input.nextDouble();

        if (peso > LIMITE_PESO) {
            excesso = peso - LIMITE_PESO;
            multa = excesso * MULTA_POR_QUILO_EXCEDENTE;
            System.out.printf("João excedeu o limite de peso em %.2f kg e terá que pagar R$ %.2f de multa.%n", excesso, multa);
        } else {
            System.out.println("João não excedeu o limite de peso de peixes.");
        }
        input.close();
    }

    }

