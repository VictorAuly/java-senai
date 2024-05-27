import javax.swing.JOptionPane;
public class Desafio_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double numero;
		
		JOptionPane.showMessageDialog(null,"Este é um programa para mostrar o numero arredondado.",
				"If Else",JOptionPane.INFORMATION_MESSAGE);
		
		numero = solicitaNumero();
		arredondarNumero(numero);
	}
	public static Double solicitaNumero() {
		
		Double numero;
		
		numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero real: "));
		
		return numero;
	}
	public static void arredondarNumero(Double numero) {
		numero = Math.ceil(numero);
		
		JOptionPane.showMessageDialog(null,"Assim fica o numero arredondado "+numero,
				"If Else",JOptionPane.INFORMATION_MESSAGE);
	}

}
