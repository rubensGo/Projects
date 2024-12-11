package JavaProjetcs;

import javax.swing.JOptionPane;
import java.text.Normalizer;

public class totalVowels {
    //Método
    public String Words() {
        String palavra = JOptionPane.showInputDialog("Enter a word");
        JOptionPane.showMessageDialog(null, "The word entered was: " + palavra);
        String vogais = "he total number of vowels is: " + Vowel_Counter(palavra);
        JOptionPane.showMessageDialog(null, vogais);
        return vogais;

    }
    public int Vowel_Counter(String palavra) {
        palavra = Normalizer.normalize(palavra, Normalizer.Form.NFD).replaceAll("[\\p{M}]", "");
        int contador = 0;

        for (int i = 0; i < palavra.length(); i++) {
            if (palavra.toLowerCase().charAt(i) == 'a' || palavra.toLowerCase().charAt(i) == 'e' || palavra.toLowerCase().charAt(i) == 'i' || palavra.toLowerCase().charAt(i) == 'o' || palavra.toLowerCase().charAt(i) == 'u') {
                contador++;
            }
        }
        return contador;
    }
    public static void main(String[] args) {
        totalVowels palavra = new totalVowels();
        String palavra1 = palavra.Words();
        palavra.Vowel_Counter(palavra1);
    }
}
