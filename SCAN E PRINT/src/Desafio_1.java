import javax.swing.JOptionPane;
public class Desafio_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero =0;
	
		JOptionPane.showMessageDialog(null,"Este é um programa para mostrar se o numero digitato é impar ou par.",
				"If Else",JOptionPane.INFORMATION_MESSAGE);
		
		numero = solicitaNumero();
		verificaImparPar(numero);
	}
	public static int solicitaNumero() {
		
		int numero;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
		
		return numero;
	}
	
	public static void verificaImparPar(int numero) {
	
		if (numero%2==0) {
			
			JOptionPane.showMessageDialog(null,"O numeor "+numero+" é par",
					"If Else",JOptionPane.INFORMATION_MESSAGE);
		}
		else {
			JOptionPane.showMessageDialog(null,"O numeor "+numero+" é impar",
					"If Else",JOptionPane.INFORMATION_MESSAGE);
		
	}
	}
}
