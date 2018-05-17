package exemplo_07JRadioButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

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
		JRadioButton rbtMasculino = new JRadioButton("Masculino");
		rbtMasculino.setBounds(20, 20, 100, 20);

		JRadioButton rbtFeminino = new JRadioButton("Feminino");
		rbtFeminino.setBounds(120, 20, 100, 20);
		
		
		// JBUTTON
		JButton botao = new JButton("Clique aqui");
		botao.setBounds(40, 50, 150, 20);
		
		// AÇÃO
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				if((rbtMasculino.isSelected()) && (rbtFeminino.isSelected())){
					JOptionPane.showMessageDialog(null, "Ambos estão Selecionados");
					
				}else if(rbtMasculino.isSelected()){
					JOptionPane.showMessageDialog(null, "Masculino Selecionado");
					
				}else if(rbtFeminino.isSelected()){
					JOptionPane.showMessageDialog(null, "Feminino Selecionado");
					
				}else{
					JOptionPane.showMessageDialog(null, "Nenhum Selecionado");
					
				}
				
				
			}
			
		});
		
		
		// ADICIONAR COMPONENTES AO JFRAME
		formulario.add(rbtMasculino);
		formulario.add(rbtFeminino);
		formulario.add(botao);
		
		
		//EXIBIR TODA A ESTRUTURA
		formulario.setVisible(true);
		
		
		

	}

}
