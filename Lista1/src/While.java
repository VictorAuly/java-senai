import javax.swing.JOptionPane;
public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 boolean resposta;
		 int auxiliar;
		 
		 JOptionPane.showMessageDialog(null,"Conta uma coisa para a gente...",
				 "Enquanto > While", JOptionPane.INFORMATION_MESSAGE);
		 
		 auxiliar = JOptionPane.showConfirmDialog(null,"Você entendeu a diferença de While e do while?",
				 "Fala a verdade!",JOptionPane.YES_NO_OPTION);
		 
		 if (auxiliar == 0) {
			 resposta = true;
		 }else {
			 resposta = false;
		 }
		 
		 while (!resposta) {
			 auxiliar = JOptionPane.showConfirmDialog(null,"Po! Para de brincar com a gente?",
					 "Fala a verdade!",JOptionPane.YES_NO_OPTION);
			 
			 if (auxiliar == 0) {
				 resposta = true;
			 }else {
				 resposta = false;
			 }
		 }
		 JOptionPane.showMessageDialog(null, "Isso AE!!",
				 "Enquanto> While", JOptionPane.INFORMATION_MESSAGE);
	}

}
