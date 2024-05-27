import javax.swing.JOptionPane;
public class Desafio_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int figura;
		
		figura = solicitarFigura();
	}
public static int solicitarFigura() {
		
	int figura;
			
		figura = Integer.parseInt(JOptionPane.showInputDialog("Qual das figuras geometricas abaixo você quer calcular a áre? "+"\n 1)Círculo"+"\n 2)Quadrado"
				+"\n 3)Retângulo"+"\n 4)Triângulo"));
		
		while(figura!=1 && figura!=2 && figura!=3 &&figura!=4) {
			
			JOptionPane.showInternalMessageDialog(null,"Tente novamente, o numero que você digitou não corresponde a nenhuma opção!!");
			
			figura = Integer.parseInt(JOptionPane.showInputDialog("Qual das figuras geometricas abaixo você quer calcular a áre? "+"\n 1)Círculo"+"\n 2)Quadrado"
					+"\n 3)Retângulo"+"\n 4)Triângulo"));
		}
			
	return figura;
	}
}
