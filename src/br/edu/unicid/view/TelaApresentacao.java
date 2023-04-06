package br.edu.unicid.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class TelaApresentacao extends JFrame {

	private JPanel contentPane;
	private JTextField txtQnt1;
	private JTextField txtPreco1;
	private JTextField txtQnt2;
	private JTextField txtQnt3;
	private JTextField txtQnt4;
	private JTextField txtPreco2;
	private JTextField txtPreco3;
	private JTextField txtPreco4;
	private JTextField txtTotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaApresentacao frame = new TelaApresentacao();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaApresentacao() {
		setTitle("Sorveteria");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\nicol\\OneDrive\\Imagens\\sorvete2.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 102, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tipo de Sorvete");
		lblNewLabel.setFont(new Font("Segoe Print", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 10, 116, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblTipoDeSorvete = new JLabel("Sorvete de Frutas");
		lblTipoDeSorvete.setFont(new Font("Segoe Print", Font.BOLD, 14));
		lblTipoDeSorvete.setBounds(10, 44, 130, 24);
		contentPane.add(lblTipoDeSorvete);
		
		JLabel lblNewLabel_1_1 = new JLabel("Chocolate/Frutas");
		lblNewLabel_1_1.setFont(new Font("Segoe Print", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(10, 78, 130, 24);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Bola");
		lblNewLabel_1_1_1.setFont(new Font("Segoe Print", Font.BOLD, 14));
		lblNewLabel_1_1_1.setBounds(10, 112, 35, 24);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Pote de 2 Litros");
		lblNewLabel_1_1_1_1.setFont(new Font("Segoe Print", Font.BOLD, 14));
		lblNewLabel_1_1_1_1.setBounds(10, 146, 120, 24);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Total:");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Segoe Print", Font.BOLD, 14));
		lblNewLabel_1_1_1_1_1.setBounds(285, 175, 44, 24);
		contentPane.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblQtde = new JLabel("Quantidade");
		lblQtde.setFont(new Font("Segoe Print", Font.BOLD, 14));
		lblQtde.setBounds(163, 10, 94, 24);
		contentPane.add(lblQtde);
		
		JLabel lblPreoUnitrio = new JLabel("Preço unitário");
		lblPreoUnitrio.setFont(new Font("Segoe Print", Font.BOLD, 14));
		lblPreoUnitrio.setBounds(360, 16, 112, 24);
		contentPane.add(lblPreoUnitrio);
		
		txtQnt1 = new JTextField();
		txtQnt1.setBounds(163, 47, 166, 19);
		contentPane.add(txtQnt1);
		txtQnt1.setColumns(10);
		
		txtPreco1 = new JTextField();
		txtPreco1.setColumns(10);
		txtPreco1.setBounds(360, 47, 166, 19);
		contentPane.add(txtPreco1);
		
		txtQnt2 = new JTextField();
		txtQnt2.setColumns(10);
		txtQnt2.setBounds(163, 81, 166, 19);
		contentPane.add(txtQnt2);
		
		txtQnt3 = new JTextField();
		txtQnt3.setColumns(10);
		txtQnt3.setBounds(163, 115, 166, 19);
		contentPane.add(txtQnt3);
		
		txtQnt4 = new JTextField();
		txtQnt4.setColumns(10);
		txtQnt4.setBounds(161, 149, 166, 19);
		contentPane.add(txtQnt4);
		
		txtPreco2 = new JTextField();
		txtPreco2.setColumns(10);
		txtPreco2.setBounds(360, 81, 166, 19);
		contentPane.add(txtPreco2);
		
		txtPreco3 = new JTextField();
		txtPreco3.setColumns(10);
		txtPreco3.setBounds(360, 115, 166, 19);
		contentPane.add(txtPreco3);
		
		txtPreco4 = new JTextField();
		txtPreco4.setColumns(10);
		txtPreco4.setBounds(360, 149, 166, 19);
		contentPane.add(txtPreco4);
		
		txtTotal = new JTextField();
		txtTotal.setColumns(10);
		txtTotal.setBounds(360, 178, 166, 19);
		contentPane.add(txtTotal);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int qnt1 =Integer.parseInt(txtQnt1.getText());
				int qnt2 =Integer.parseInt(txtQnt2.getText());
				int qnt3 =Integer.parseInt(txtQnt3.getText());
				int qnt4 =Integer.parseInt(txtQnt4.getText());

				double preco1 = Double.parseDouble(txtPreco1.getText());
				double preco2 = Double.parseDouble(txtPreco2.getText());
				double preco3 = Double.parseDouble(txtPreco3.getText());
				double preco4 = Double.parseDouble(txtPreco4.getText());
					
				double total = 	((qnt1 * preco1) + (qnt2 * preco2) + (qnt3 * preco3) + (qnt4 * preco4));
				
				txtTotal.setText(String.valueOf(total));
			}
		});
		btnCalcular.setBounds(163, 213, 166, 40);
		contentPane.add(btnCalcular);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtQnt1.setText(null);
				txtQnt2.setText(null);
				txtQnt3.setText(null);
				txtQnt4.setText(null);
				
				txtPreco1.setText(null);
				txtPreco2.setText(null);
				txtPreco3.setText(null);
				txtPreco4.setText(null);
				
				txtTotal.setText(null);
			}
		});
		btnLimpar.setBounds(360, 213, 166, 40);
		contentPane.add(btnLimpar);
	}
}
