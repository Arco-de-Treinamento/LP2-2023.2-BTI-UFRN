public class Vogais {

    /**
     * Método responsável por contar as vogais de um texto
     * @param text Texto de entrada
     * @return quantidade de caracteres vogais incluídos no texto
     */
    public int contarVogais(String text){
        int count = 0;
        char letra;
        String vogais = "aeiouáàâãéêèíìîóòôõúùû";

        text = text.toLowerCase();

        for (int i = 0; i < text.length(); i++) {
            letra = text.charAt(i);

            if (vogais.contains(String.valueOf(letra))) {
                count++;
            }
        }
        return count;
    }
}