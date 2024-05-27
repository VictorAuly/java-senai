import javax.swing.JOptionPane;
public class Desafio_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null,"Este é um programa que identifica sua faixa etaria com base na sua idade.",
				"If Else",JOptionPane.INFORMATION_MESSAGE);
		int idade;
		
		idade = solicitarIdade();
		verificarIdade(idade);
	}
	public static int solicitarIdade() {
		
		int idade;
		
		idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade: "));
		
		return idade;
	}
	public static void verificarIdade(int idade) {

		if (idade < 18) {
			JOptionPane.showMessageDialog(null,"Você é uma criança!!");
		}
		else if (idade>= 18 && idade <30) {
			JOptionPane.showMessageDialog(null,"Você é um jovem!!",
					"Se, senão se e senão> if, else if e else",
					JOptionPane.INFORMATION_MESSAGE);
		
		}
		else if (idade>= 30 && idade <=59) {
			JOptionPane.showMessageDialog(null,"Você é um(a) adulto(a)!!",
					"Se, senão se e senão> if, else if e else",
					JOptionPane.INFORMATION_MESSAGE);
		
		}
		else{
			JOptionPane.showMessageDialog(null,"Você é um(a) idoso(a)!!",
					"Se, senão se e senão> if, else if e else",
					JOptionPane.INFORMATION_MESSAGE);
		}
	}

}
