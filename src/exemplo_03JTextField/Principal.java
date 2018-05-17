package exemplo_03JTextField;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Principal {

	public static void main(String[] args) {

		//INSTANCIAR JFRAME
				JFrame formulario = new JFrame();
				formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				formulario.setSize(1280, 720);
				formulario.setLocationRelativeTo(null);
				formulario.setTitle("Utilizando JTextField");
				formulario.setLayout(null);
				
				
		//INSTANCIAR JLABEL
		JLabel rotulo = new JLabel();
		rotulo.setText("Informe seu Nome");
		rotulo.setBounds(590, 300, 300, 20);
		
		
		//JTEXTFIELD
		JTextField campo = new JTextField();
		campo.setBounds(480, 350, 340, 20);
		
		
		//ADICIONAR COMPONENTE AO JFRAME
		formulario.add(campo);
		formulario.add(rotulo);
		
		//EXIBIR O FORMULARIO
		formulario.setVisible(true);
		
		
	}

}
