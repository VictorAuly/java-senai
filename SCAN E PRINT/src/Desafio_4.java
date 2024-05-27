import javax.swing.JOptionPane;
public class Desafio_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null,"Este é um programa que faz a contagem de caracteres de uma palavra que você digitar.",
				"If Else",JOptionPane.INFORMATION_MESSAGE);
		String palavra;
		
		palavra = solicitarPalavra();
		mostrarCaracteres(palavra);
	}
	public static String solicitarPalavra() {
		
		String palavra;
		
		palavra = JOptionPane.showInputDialog("Digite a palavra que você deseja saber o numero de caracteres: ");
		
		return palavra;
	}
	public static void mostrarCaracteres(String palavra) {

		JOptionPane.showMessageDialog(null,"A palavra digitada tem "+palavra.length()+" letras",
				"If Else",JOptionPane.INFORMATION_MESSAGE);
	}
}
