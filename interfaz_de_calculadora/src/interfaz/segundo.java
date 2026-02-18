package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.Color;

public class segundo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField A;
	private JTextField B;
	private JTextField C;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					segundo frame = new segundo();
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
	public segundo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Ecuaciones de segundo grado");
		this.setResizable(false);
		setSize(510, 410);
		this.setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 239, 213));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Atrás");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ecuaciones ec = new Ecuaciones();
				ec.setVisible(true);
				segundo.this.dispose();
			}
		});
		btnNewButton.setBounds(389, 250, 89, 23);
		contentPane.add(btnNewButton);
		
		A = new JTextField();
		A.setHorizontalAlignment(SwingConstants.RIGHT);
		A.setText("0");
		A.setBounds(20, 94, 57, 20);
		contentPane.add(A);
		A.setColumns(10);
		
		B = new JTextField();
		B.setHorizontalAlignment(SwingConstants.RIGHT);
		B.setText("0");
		B.setColumns(10);
		B.setBounds(102, 94, 57, 20);
		contentPane.add(B);
		
		C = new JTextField();
		C.setHorizontalAlignment(SwingConstants.RIGHT);
		C.setText("0");
		C.setColumns(10);
		C.setBounds(181, 94, 57, 20);
		contentPane.add(C);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_3.setText("0");
		textField_3.setColumns(10);
		textField_3.setBounds(258, 94, 57, 20);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel = new JLabel("Ax²");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(20, 69, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblBx = new JLabel("Bx");
		lblBx.setHorizontalAlignment(SwingConstants.CENTER);
		lblBx.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblBx.setBounds(113, 69, 46, 14);
		contentPane.add(lblBx);
		
		JLabel lblC = new JLabel("C");
		lblC.setHorizontalAlignment(SwingConstants.CENTER);
		lblC.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblC.setBounds(181, 69, 46, 14);
		contentPane.add(lblC);
		
		JLabel lblNewLabel_1 = new JLabel("Ecuaciones de Segundo Grado");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(148, 21, 203, 37);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("=");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(224, 97, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("+");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(66, 97, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("+");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setBounds(148, 97, 46, 14);
		contentPane.add(lblNewLabel_3_1);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 171, 320, 180);
		contentPane.add(scrollPane);
		
		JTextArea resultado = new JTextArea();
		resultado.setEditable(false);
		resultado.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		scrollPane.setViewportView(resultado);
		
		JButton btnNewButton_1 = new JButton("Calcular");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				double a = Double.parseDouble(A.getText());
				double b = Double.parseDouble(B.getText());
				double c = Double.parseDouble(C.getText());
				if(a==0) {
					resultado.setText("Ax² no puede ser 0");
				}else {
					double d = (b*b)-(4*a*c);
				if(d<0) {
					resultado.setText("No existe resultado real");
				}else {
					double dr = Math.sqrt(d);
				double bf = (-1)*b;
				double rp = (bf+dr)/(2*a);
				double rn = (bf-dr)/(2*a);
				String solucion = "Pasos \n"+a+"x²+"+b+"x+"+c+"=0"+
				"\nSe aplica la formula general: x=(-b±¹√b²-4(c)(a))/2a \n"+
				"Aplicando a la ecuacion: x=("+bf+"±"+"√("+b+")²"+"-4"+"("+c+"*"+a+"))"+"/2("+a
				+")\nResultados \nx1="+rp+"\nx2="+rn;
				resultado.setText(solucion);
				}
				}
				
				}catch(NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, "Acción inválida");
				}
			}
		});
		btnNewButton_1.setBounds(118, 136, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Limpiar");
		btnNewButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				A.setText("0");
				B.setText("0");
				C.setText("0");
				resultado.setText("");
			}
		});
		btnNewButton_2.setBounds(389, 108, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Calculadora");
		btnNewButton_3.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculadora cl = new calculadora();
				cl.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(389, 154, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Info.");
		btnNewButton_4.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				info i = new info();
				i.setVisible(true);
			}
		});
		btnNewButton_4.setBounds(389, 201, 89, 23);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Menú");
		btnNewButton_5.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu m = new menu();
				m.setVisible(true);
				segundo.this.dispose();
			}
		});
		btnNewButton_5.setBounds(389, 299, 89, 23);
		contentPane.add(btnNewButton_5);
		
		

	}
}
