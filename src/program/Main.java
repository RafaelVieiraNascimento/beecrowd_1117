package program;

/*
beecrowd | 1117 - Validação de Nota

Faça um programa que leia as notas referentes às duas avaliações de um aluno.
Calcule e imprima a média semestral. Faça com que o algoritmo só aceite notas válidas
(uma nota válida deve pertencer ao intervalo [0,10]). Cada nota deve ser validada separadamente.

Entrada
A entrada contém vários valores reais, positivos ou negativos.
O programa deve ser encerrado quando forem lidas duas notas válidas.

Saída
Se uma nota inválida  for lida, deve ser impressa a mensagem "nota invalida".
Quando duas notas válidas forem lidas, deve ser impressaa mensagem
"media = " seguido do valor do cálculo. O valor deve ser apresentado com duas casas após o ponto decimal.
*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int contador = 0;
		double nota;
		double media = 0;
		
		while(contador != 2) {
			
			if((nota = sc.nextDouble()) >= 0 & nota < 11) {
				media += nota;
				contador++;
			}
			else {
				System.out.println("nota invalida");
			}
		}
		System.out.printf("media = %.2f\n", media / 2);
		sc.close();
	}
}
