package com.matheusvoltane.view;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CadastroView extends JFrame {
	private	static final long serialVersionUID = 1L;
	
	private JLabel cadastroLabel;
	private JButton cadastroButton;
	private JTextField cadastroTextField;
	
	
	public CadastroView () {
		initComponents();
		initView();
		init();
		this.setVisible(true);
	}
	
	private void init( ) {
		this.setTitle("Cadastro");
		this.setSize(380, 200);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void initView() {
		JPanel painel = new JPanel();
		painel.setLayout(new GridLayout(0, 2));
		
		painel.add(cadastroLabel);
		painel.add(cadastroTextField);
		
		this.add(painel);
	}
	
	private void initComponents() {
		cadastroLabel = new JLabel("Valor Investido");
		cadastroTextField = new JTextField(" ");
	}
}
