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

public class ventana1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana1 frame = new ventana1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ventana1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//mantiene a la ventana del mismo tamaño
		this.setResizable(false);
		//los 2 primeros parametros son posicion en pantalla
		this.setSize(450, 283);
		//coloca la pantalla en el centro
		this.setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//Objeto boton que se crea en design
		JButton btnNewButton = new JButton("Sistema de \necuaciones ");
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//atributos y metodos que tendra el boton
				//instancia una clase
				ventana2 v2 = new ventana2();
				//metodo que abre una ventana en especifico 
				v2.setVisible(true);
				//el metodo hace que esta ventana se cierre al abrir la anterior
				ventana1.this.dispose();
				}
		});
		btnNewButton.setBounds(10, 100, 173, 50);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Calculadora");
		lblNewLabel.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		lblNewLabel.setBounds(151, 11, 116, 35);
		contentPane.add(lblNewLabel);
		
		JButton btnFigurasGeometricas = new JButton("Figuras geometricas");
		btnFigurasGeometricas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnFigurasGeometricas.setBounds(10, 45, 143, 37);
		contentPane.add(btnFigurasGeometricas);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(ventana1.class.getResource("/imagen/istockphoto-470493341-612x612 (1).jpg")));
		lblNewLabel_1.setBounds(193, 46, 231, 154);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("Ecuaciones");
		btnNewButton_1.setBounds(10, 165, 143, 35);
		contentPane.add(btnNewButton_1);

	}
}
