package exemplo_02JLabel;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Principal {

	public static void main(String[] args) {

		//INSTANCIAR JFRAME
				JFrame formulario = new JFrame();
				formulario.setVisible(true);
				formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				formulario.setSize(1280, 720);
				formulario.setLocationRelativeTo(null);
				formulario.setTitle("CSzinho de leve :b");
				formulario.setLayout(null);
				
				
		//INSTANCIAR JLABEL
		JLabel rotulo = new JLabel();
		rotulo.setText("Olá Mundo");
		rotulo.setBounds(620, 300, 300, 20);
		
		
		//ADICIONAR COMPONENTE AO JFRAME
		formulario.add(rotulo);
		
		
		
		
		
	}

}
