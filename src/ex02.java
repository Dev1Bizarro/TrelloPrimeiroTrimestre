public class ex02 {
    public static void main(String[] args) {
        // Implemente um código copiando o array abaixo, e depois imprima no console o valor dos seguintes elementos:
        // a) Imprima o valor da nota do primeiro elemento do terceiro array de notas.
        // b) Imprima o valor da nota do segundo elemento do quarto array de notas.
        // c) Imprima o valor da soma das quatro primeiras notas de cada array.



        double[][] notas = {
                {10, 8.5, 5.5, 9.5},
                {8.5, 7, 7.5, 6},
                {8, 9, 10, 7.5},
                {9, 9.5, 10, 8}
        };
        System.out.println( notas[2][0] );
        System.out.println( notas[3][1] );
        System.out.println( notas[0][0] + notas[1][0] + notas[2][0] + notas[3][0] );

    }
}
