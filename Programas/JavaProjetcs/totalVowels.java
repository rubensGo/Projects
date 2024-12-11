package JavaProjetcs;

import javax.swing.JOptionPane;
import java.text.Normalizer;

public class totalVowels {
    //Método
    public String Palavra() {
        String palavra = JOptionPane.showInputDialog("digite uma palavra");
        JOptionPane.showMessageDialog(null, "A palavra digitada foi: " + palavra);
        String vogais = "O total de Volgais é: " + Contador_de_Vogais(palavra);
        JOptionPane.showMessageDialog(null, vogais);
        return vogais;

    }
    public int Contador_de_Vogais(String palavra) {
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
        String palavra1 = palavra.Palavra();
        palavra.Contador_de_Vogais(palavra1);
    }
}
