package exemplo_05JComboBox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		
		// JFRAME
		JFrame formulario = new JFrame();
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(300, 130);
		formulario.setLocationRelativeTo(null);
		formulario.setTitle("Utilizando JTextField");
		formulario.setLayout(null);
		
		
		// JCOMBOBOX
		JComboBox<String> combo = new JComboBox<>();
		combo.setBounds(10, 20 , 270, 30);
		combo.addItem("Clique Aqui");
		combo.addItem("Clique Quit");
		combo.addItem("Clique Quiut");
		
		// AÇAO NO COMBO
		combo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(null, combo.getSelectedItem());
				
			}
			
		});
		
		
		// ADICIONAR AO JFRAME
		formulario.add(combo);
		
		
		// EXIBIR OS COMPONENTES
		formulario.setVisible(true);
		

	}

}
