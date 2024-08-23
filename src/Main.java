public class Main {
    public static void main(String[] args) {

        int[] numeros = {44, 15, 12, 28, 53, 60, 75, 100, 125};
        int i = 0;
        int maior = 0;

        while (i < numeros.length) {

            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            i++;
            }

            System.out.println("O número maior é " + maior);
        System.out.println("----------------");
           int menor = maior;
           i = 0;
           while (i < numeros.length){

          if (numeros[i] < menor){
          menor = numeros[i];
       }
          i++;
       }
        System.out.println("O menor é " + menor);

        System.out.println("----------------------");

            System.out.println("Separando Pares e Impares");

            int[] pares = new int[numeros.length];
            int[] impares = new int[numeros.length];
            int indicepares = 0;
            int indiceImpares = 0;

            i = 0;

            while (i <= numeros.length - 1) {
                if (numeros[i] % 2 == 0) {
                    pares[indicepares] = numeros[i];
                    indicepares++;
                    System.out.println(numeros[i] + " é par");

                } else {
                    impares[indiceImpares] = numeros[i];
                    indiceImpares++;
                    System.out.println(numeros[i] + " é impar");

                }
                i++;
            }
        }
    }

