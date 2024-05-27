import javax.swing.JOptionPane;
public class Desafio_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double ganhoHora;
		Double fezHoraExtra;
		
		JOptionPane.showMessageDialog(null,"Este é um programa calcula seu salario final.",
				"If Else",JOptionPane.INFORMATION_MESSAGE);
		
		ganhoHora = solicitarGanhoHora();
		fezHoraExtra = solicitarHoraExtra();
		calcularSalario(ganhoHora,fezHoraExtra);
	}
	public static Double solicitarGanhoHora() {
		
		Double ganhoHora;
		
		ganhoHora = Double.parseDouble(JOptionPane.showInputDialog("Digite quanto você ganha por hora trabalhada: "));
		
	return ganhoHora;
	}
	public static Double solicitarHoraExtra() {
		
		Double fezHoraExtra;
		
		fezHoraExtra = Double.parseDouble(JOptionPane.showInputDialog("Quantas horas você trabalhou esse mês? "));
		
		while(fezHoraExtra>730) {
			fezHoraExtra =Double.parseDouble(JOptionPane.showInputDialog("Não tem como trabalhar mais de 1 mes e 1 mes tente novamente: "));
		}
		
	return fezHoraExtra;
	}
	public static void calcularSalario(Double ganhoHora, Double fezHoraExtra){
		Double salario;
		if (fezHoraExtra>160) {
			Double horasAMais;
			Double pagamentoAMais;
			horasAMais = fezHoraExtra - 160;
			pagamentoAMais = (horasAMais* 1.5)*ganhoHora;
			salario = pagamentoAMais + (160*ganhoHora);
			
			JOptionPane.showMessageDialog(null,"Você fez um total de "+horasAMais+" horas extras com isso seu salario final ficou de"+salario);
		}
		else if (fezHoraExtra<160) {
			salario = fezHoraExtra * ganhoHora;
			JOptionPane.showMessageDialog(null,"Você fez um total de "+fezHoraExtra+" horas trabalhadas com isso seu salario final ficou de"+salario,
					"If Else",JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
