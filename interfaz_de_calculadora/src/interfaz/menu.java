package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.SwingConstants;

public class menu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menu frame = new menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Coloca titulo
		this.setTitle("Menú");
		//mantiene a la ventana del mismo tamaño
		this.setResizable(false);
		//los 2 primeros parametros son posicion en pantalla
		this.setSize(477, 289);
		//coloca la pantalla en el centro
		this.setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//Objeto boton que se crea en design
		JButton btnNewButton = new JButton("Ir");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//atributos y metodos que tendra el boton
				//instancia una clase
				matrices v2 = new matrices();
				//metodo que abre una ventana en especifico 
				v2.setVisible(true);
				//el metodo hace que esta ventana se cierre al abrir la anterior
				menu.this.dispose();
				}
		});
		btnNewButton.setBounds(42, 116, 93, 19);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Calculadora Algebraica ");
		lblNewLabel.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		lblNewLabel.setBounds(127, 11, 204, 35);
		contentPane.add(lblNewLabel);
		
		JButton btnFigurasGeometricas = new JButton("Ir");
		btnFigurasGeometricas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				figuras fi = new figuras ();
				fi.setVisible(true);
				menu.this.dispose();
			}
		});
		btnFigurasGeometricas.setBounds(42, 71, 93, 19);
		contentPane.add(btnFigurasGeometricas);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(menu.class.getResource("/imagen/istockphoto-470493341-612x612 (1).jpg")));
		lblNewLabel_1.setBounds(220, 61, 231, 154);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("Ir");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ecuaciones ec = new Ecuaciones();
				ec.setVisible(true);
				menu.this.dispose();
			}
		});
		btnNewButton_1.setBounds(42, 162, 93, 19);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("Ecuaciones 1er y 2do grado");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(22, 146, 160, 19);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Sistemas de ecuaciones");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(42, 101, 133, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Figuras geometricas");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(27, 57, 133, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_2_1 = new JLabel("Información");
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setBounds(10, 187, 154, 19);
		contentPane.add(lblNewLabel_2_1);
		
		JButton btnNewButton_1_1 = new JButton("Ir");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				info i = new info();
				i.setVisible(true);
			}
		});
		btnNewButton_1_1.setBounds(42, 204, 93, 19);
		contentPane.add(btnNewButton_1_1);

	}
}
