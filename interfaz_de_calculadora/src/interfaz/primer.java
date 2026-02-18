package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.MouseWheelListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JScrollPane;

public class primer extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField A;
	private JTextField B;
	private JTextField C;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					primer frame = new primer();
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
	public primer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(555, 374);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ecuaciones de Primer Grado");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(150, 11, 193, 44);
		contentPane.add(lblNewLabel);
		
		A = new JTextField();
		A.setHorizontalAlignment(SwingConstants.CENTER);
		A.setText("0");
		A.setBounds(29, 91, 79, 20);
		contentPane.add(A);
		A.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Ax");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(48, 66, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("B");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(178, 66, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		B = new JTextField();
		B.setHorizontalAlignment(SwingConstants.CENTER);
		B.setText("0");
		B.setBounds(174, 91, 86, 20);
		contentPane.add(B);
		B.setColumns(10);
		
		C = new JTextField();
		C.setHorizontalAlignment(SwingConstants.CENTER);
		C.setText("0");
		C.setBounds(298, 91, 86, 20);
		contentPane.add(C);
		C.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("C");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(318, 66, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("=");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(256, 94, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setEditable(true);
		comboBox.setBounds(118, 90, 46, 22);
		contentPane.add(comboBox);
		comboBox.addItem(" +");
		comboBox.addItem(" -");
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(29, 166, 355, 158);
		contentPane.add(scrollPane);
		JTextArea Respuesta = new JTextArea();
		Respuesta.setFont(new Font("Tahoma", Font.PLAIN, 15));
		scrollPane.setViewportView(Respuesta);
		Respuesta.setEditable(false);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					float a = Float.parseFloat(A.getText());
				float b = Float.parseFloat(B.getText());
				float c = Float.parseFloat(C.getText());
				String signo = (String) comboBox.getSelectedItem();
					if (a==0) {
					String res ="No es posible que Ax este en 0";
					Respuesta.setText(res);
				}else {
					switch(signo) {
					case (" +"):
						float d = (c-b)/a;
					    String r = "Pasos \n"+a+"x"+"+"+b+"="+c+"\n"+a+"x="+c+"-"+b+
					    		"\n"+"x="+(c-b)+"/"+a+"\nx="+d;
					    Respuesta.setText(r);
						break;
					case (" -"):
						float dn = (c+b)/a;
					String rn = "Pasos \n"+a+"x"+"-"+b+"="+c+"\n"+a+"x="+c+"+"+b+
				    		"\n"+"x="+(c+b)+"/"+a+"\nx="+dn;
				    Respuesta.setText(rn);
						break;
					}
				}
					
				}catch(NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, "Acción inválida");
				}
				
				
			}
		});
		btnNewButton.setBounds(161, 132, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Limpiar");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				A.setText("0");
				B.setText("0");
				C.setText("0");
				Respuesta.setText("");
			}
		});
		
		
		btnNewButton_1.setBounds(429, 85, 100, 23);
		contentPane.add(btnNewButton_1);
		JButton calcu = new JButton("Calculadora");
		calcu.setFont(new Font("Tahoma", Font.PLAIN, 10));
		calcu.setHorizontalAlignment(SwingConstants.LEFT);
		calcu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculadora cl = new calculadora();
				cl.setVisible(true);
			}
		});
		calcu.setBounds(429, 132, 100, 23);
		contentPane.add(calcu);
		
		JButton btnNewButton_3 = new JButton("Info.");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				info i = new info();
				i.setVisible(true);
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton_3.setBounds(429, 181, 100, 23);
		contentPane.add(btnNewButton_3);
		
		
		

	}
}
