package exemplo_04JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Principal {

	public static void main(String[] args) {

		// JFRAME
		JFrame formulario = new JFrame();
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(1280, 720);
		formulario.setLocationRelativeTo(null);
		formulario.setTitle("Utilizando JTextField");
		formulario.setLayout(null);

		// JLABEL
		JLabel rotulo = new JLabel();
		rotulo.setText("Informe seu Nome");
		rotulo.setBounds(590, 300, 300, 25);


		// JTEXTFIELD
		JTextField campo = new JTextField();
		campo.setBounds(480, 350, 340, 25);

		
		// JBUTTON 
		JButton botao = new JButton();
		botao.setText("ANTIVÍRUS GRÁTIS");
		botao.setBounds(500, 400, 300, 40);
		
		//ADICIONAR
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				//EXIBIR O NOME
				JOptionPane.showMessageDialog(null, "Olá "+campo.getText());
				
				//LIMPAR O CAMPO CONTENDO O NOME
				campo.setText("");
				
				//SELECIONAR O CAMPO NOME
				campo.requestFocus();
				
			}
			
			
		});
		

		//ADICIONAR COMPONENTE AO JFRAME
		formulario.add(botao);
		formulario.add(campo);
		formulario.add(rotulo);

		//EXIBIR O FORMULARIO
		formulario.setVisible(true);


	}

}
