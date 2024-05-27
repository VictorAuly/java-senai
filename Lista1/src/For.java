import javax.swing.JOptionPane;
public class For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String textoFinal = "";
		
		JOptionPane.showMessageDialog(null,"Você dirá suas 3(três) bandas favoritas!",
				"Para (ou para faça)> for", JOptionPane.INFORMATION_MESSAGE);
		
		for (int i= 0; i<3; i++) {
			textoFinal += JOptionPane.showInputDialog("Informe o nome da sua 1° banda favorita");
			textoFinal += "\n";
		}
		JOptionPane.showMessageDialog(null,"Suas bandas preferidas são: \n"+ textoFinal,
				"Para(ou para faça)>For",JOptionPane.INFORMATION_MESSAGE);
	}

}
