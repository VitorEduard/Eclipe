package exemplo_08ButtonGroup;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Principal {

	public static void main(String[] args) {

		
		//JFRAME
		JFrame formulario = new JFrame ("Usando ButtonGroup");
		formulario.setSize(500, 300);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		
		
		// JRADIOBUTTON
		JRadioButton turnoMatutino = new JRadioButton("Matutino");
		turnoMatutino.setBounds(10, 10, 100, 20);
		turnoMatutino.setActionCommand("Matutino");
		
		JRadioButton turnoVespertino = new JRadioButton("Vespertino");
		turnoVespertino.setBounds(110, 10, 100, 20);
		turnoMatutino.setActionCommand("Vespertino");
		
		JRadioButton turnoNoturno = new JRadioButton("Noturno");
		turnoNoturno.setBounds(210, 10, 100, 20);
		turnoMatutino.setActionCommand("Noturno");
		
		
		// BUTTONGROUP
		ButtonGroup turnos = new ButtonGroup();
		turnos.add(turnoNoturno);
		turnos.add(turnoVespertino);
		turnos.add(turnoMatutino);
		
		
		// JBUTTON
		JButton botao = new JButton("Verificar Turno");
		botao.setBounds(50, 50, 200, 20);
		
		
		//AÇÂO
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try{
					JOptionPane.showMessageDialog(null, turnos.getSelection().getActionCommand());
					
				}catch (Exception erro) {
					JOptionPane.showMessageDialog(null, "Selecione um turno");
				}
				
			}
			
		});
		
		
		// ADICIONAR COMPONENTES
		formulario.add(turnoMatutino);
		formulario.add(turnoVespertino);
		formulario.add(turnoNoturno);
		formulario.add(botao);
		
		//EXIBIR O FORMULÁRIO E OS SEUS COMPONENTES
		formulario.setVisible(true);
		

	}

}
