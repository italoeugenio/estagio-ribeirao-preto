package exercicios.ex02;

public class VerificarString {
    public static void main(String[] args) {
        String palavra = "AmoMinhaNamorada"; //A aparece 5 vezes
        String converterTudoParaMinuculos = palavra.toLowerCase();

        char[] charVetor = converterTudoParaMinuculos.toCharArray();
        int quantiadadeDeVezesQueAparece = 0;

        for (int x = 0; x < charVetor.length; x++) {
            if(charVetor[x] == 'a'){
                quantiadadeDeVezesQueAparece++;
            }
        }

        System.out.println(palavra);
        if(quantiadadeDeVezesQueAparece > 0){
            System.out.print("EXISTE A LETRA 'A, E ELA APARECE " + quantiadadeDeVezesQueAparece + " VEZES" );
        } else {
            System.out.print("NÃO TEM LETRA 'A' NA PALAVRA");
        }
    }
}
