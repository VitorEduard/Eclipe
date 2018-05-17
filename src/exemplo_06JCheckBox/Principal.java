package exemplo_06JCheckBox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {


		// JFRAME
		JFrame formulario = new JFrame();
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(250, 150);
		formulario.setLocationRelativeTo(null);
		formulario.setTitle("Utilizando JTextField");
		formulario.setLayout(null);


		// JCHECKBOX
		JCheckBox cbxMasculino = new JCheckBox("Masculino");
		cbxMasculino.setBounds(20, 20, 100, 20);

		JCheckBox cbxFeminino = new JCheckBox("Feminino");
		cbxFeminino.setBounds(120, 20, 100, 20);


		// JBUTTON
		JButton botao = new JButton("Clique aqui");
		botao.setBounds(40, 50, 150, 20);

		// AÇÃO
		botao.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if((cbxMasculino.isSelected()) && (cbxFeminino.isSelected())){
					JOptionPane.showMessageDialog(null, "Ambos estão Selecionados");

				}else if(cbxMasculino.isSelected()){
					JOptionPane.showMessageDialog(null, "Masculino Selecionado");

				}else if(cbxFeminino.isSelected()){
					JOptionPane.showMessageDialog(null, "Feminino Selecionado");

				}else{
					JOptionPane.showMessageDialog(null, "Nenhum Selecionado");

				}


			}

		});


		// ADICIONAR COMPONENTES AO JFRAME
		formulario.add(cbxMasculino);
		formulario.add(cbxFeminino);
		formulario.add(botao);


		//EXIBIR TODA A ESTRUTURA
		formulario.setVisible(true);




	}

}
