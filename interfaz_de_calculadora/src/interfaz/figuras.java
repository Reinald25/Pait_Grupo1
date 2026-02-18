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
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JToolBar;

public class figuras extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField base;
	private JTextField altura;
	private JTextField rest;
	private JTextField lado;
	private JTextField rad;
	private JTextField resc;
	private JTextField lado2;
	private JTextField resp;
	private JTextField base2;
	private JTextField altura2;
	private JTextField resr;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					figuras frame = new figuras();
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
	public figuras() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setSize(800, 550);
		this.setLocationRelativeTo(null);
		this.setTitle("Figuras");
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Menu");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    menu m  = new menu();
			    m.setVisible(true);
			    figuras.this.dispose();
			}
		});
		btnNewButton.setBounds(346, 469, 121, 34);
		contentPane.add(btnNewButton);
		
		JLabel Cuadrado = new JLabel("New label");
		Cuadrado.setIcon(new ImageIcon(figuras.class.getResource("/imagen/Captura de pantalla 2026-01-07 113817.png")));

		Cuadrado.setBounds(104, 33, 106, 106);

		Cuadrado.setBounds(75, 33, 106, 106);

		contentPane.add(Cuadrado);
		
		JLabel rectangulo = new JLabel("New label");
		rectangulo.setIcon(new ImageIcon(figuras.class.getResource("/imagen/Captura de pantalla 2026-01-07 113926.png")));

		rectangulo.setBounds(610, 18, 106, 92);

		rectangulo.setBounds(610, 12, 106, 98);

		contentPane.add(rectangulo);
		
		JLabel Circulo = new JLabel("New label");
		Circulo.setIcon(new ImageIcon(figuras.class.getResource("/imagen/Captura de pantalla 2026-01-07 113836.png")));
		Circulo.setBounds(110, 270, 100,84 );
		contentPane.add(Circulo);
		
		JLabel Triangulo = new JLabel("New label");
		Triangulo.setIcon(new ImageIcon(figuras.class.getResource("/imagen/Captura de pantalla 2026-01-07 113739.png")));
		Triangulo.setBounds(608, 240, 108, 92);
		contentPane.add(Triangulo);
		
		base = new JTextField();
		base.setText("0");
		base.setHorizontalAlignment(SwingConstants.CENTER);
		base.setBounds(535, 361, 50, 18);
		contentPane.add(base);
		base.setColumns(10);
		
		altura = new JTextField();
		altura.setText("0");
		altura.setHorizontalAlignment(SwingConstants.CENTER);
		altura.setColumns(10);
		altura.setBounds(724, 361, 50, 18);
		contentPane.add(altura);
		
		JLabel lblNewLabel = new JLabel("Base");

		lblNewLabel.setForeground(new Color(0, 0, 0));

		lblNewLabel.setForeground(new Color(255, 255, 255));

		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(541, 342, 44, 12);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Altura");

		lblNewLabel_1.setForeground(new Color(0, 0, 0));

		lblNewLabel_1.setForeground(new Color(255, 255, 255));

		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(730, 342, 44, 12);
		contentPane.add(lblNewLabel_1);
		
		rest = new JTextField();
		rest.setHorizontalAlignment(SwingConstants.CENTER);
		rest.setBounds(576, 426, 161, 26);
		contentPane.add(rest);
		rest.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Calcular");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					float h= Float.parseFloat(altura.getText());
				float b= Float.parseFloat(base.getText());
				float l= Float.parseFloat(lado.getText());
				float a=b*h;
				float p=3*l;
				String triangulo = "A = "+a+" P = "+p;
				rest.setText(triangulo);
				if(h>=0) {
				}else {
					rest.setText("solo valores positivos ");
				}
				} catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, "Solo numeros"+e1);
					
				}
				
				
			}
		});
		btnNewButton_1.setBounds(610, 391, 95, 20);
		contentPane.add(btnNewButton_1);
		
		lado = new JTextField();
		lado.setText("0");
		lado.setHorizontalAlignment(SwingConstants.CENTER);
		lado.setBounds(631, 360, 55, 20);
		contentPane.add(lado);
		lado.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Lado");

		lblNewLabel_2.setForeground(new Color(0, 0, 0));

		lblNewLabel_2.setForeground(new Color(255, 255, 255));

		lblNewLabel_2.setBounds(643, 342, 44, 12);
		contentPane.add(lblNewLabel_2);
		
		rad = new JTextField();
		rad.setText("0");
		rad.setHorizontalAlignment(SwingConstants.CENTER);
		rad.setColumns(10);
		rad.setBounds(131, 379, 50, 18);
		contentPane.add(rad);
		
		resc = new JTextField();
		resc.setHorizontalAlignment(SwingConstants.CENTER);
		resc.setColumns(10);

		resc.setBounds(66, 430, 186, 26);

		resc.setBounds(46, 422, 182, 34);

		contentPane.add(resc);
		
		JButton btnNewButton_2 = new JButton("Calcular");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float R= Float.parseFloat(rad.getText());
				float a= (float) (R *R* Math.PI);
				float P= (float) (R * 2 * Math.PI);
				
				if(R>=0) {
					String re = " A= "+ a +" E= " + P;
				resc.setText(re);
				}
				if(R<0){
					resc.setText("solo valores positivos ");
				}
			}
		});

		btnNewButton_2.setBounds(109, 407, 90, 18);

		btnNewButton_2.setBounds(88, 391, 87, 20);

		contentPane.add(btnNewButton_2);
		
		lado2 = new JTextField();
		lado2.setText("0");
		lado2.setHorizontalAlignment(SwingConstants.CENTER);

		lado2.setBounds(137, 149, 44, 18);

		lado2.setBounds(107, 150, 44, 18);

		contentPane.add(lado2);
		lado2.setColumns(10);
		
		JButton btnNewButton_3 = new JButton("calcular");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float L= Float.parseFloat(lado2.getText());
				float H = L*L;
				float O = 4 * L;
				if(L>=0) {
					String cuadrado = "A= "+ H + " P= " + O;
				resp.setText(cuadrado);
				}else{ 
					resp.setText("solo valores positivos");
				}
				
			}
		});

		btnNewButton_3.setBounds(115, 174, 95, 12);

		btnNewButton_3.setBounds(81, 179, 100, 20);

		contentPane.add(btnNewButton_3);
		
		resp = new JTextField();
		resp.setHorizontalAlignment(SwingConstants.CENTER);

		resp.setBounds(93, 196, 135, 26);

		resp.setBounds(63, 210, 135, 26);

		contentPane.add(resp);
		resp.setColumns(10);
		
		base2 = new JTextField();
		base2.setText("0");
		base2.setHorizontalAlignment(SwingConstants.CENTER);
		base2.setBounds(591, 121, 55, 18);
		contentPane.add(base2);
		base2.setColumns(10);
		
		JButton btnNewButton_4 = new JButton("calcular");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float U= Float.parseFloat(altura2.getText());
				float Q= Float.parseFloat(base2.getText());
				float Z= U*Q;
				float T= 2*(U+Q);
				
				if( U>=0 && Q>=0) {
					String rectangulo ="A= "+ Z +" P= "+T;
				resr.setText(rectangulo);
				}
				if (U<0 && Q<0){
					resr.setText("solo valores positivos");
				}
				
			}
		});
		btnNewButton_4.setBounds(620, 149, 85, 20);
		contentPane.add(btnNewButton_4);
		
		altura2 = new JTextField();
		altura2.setText("0");
		altura2.setHorizontalAlignment(SwingConstants.CENTER);
		altura2.setBounds(682, 121, 55, 18);
		contentPane.add(altura2);
		altura2.setColumns(10);
		
		resr = new JTextField();
		resr.setHorizontalAlignment(SwingConstants.CENTER);
		resr.setBounds(595, 176, 142, 23);
		contentPane.add(resr);
		resr.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("FIGURAS");
		lblNewLabel_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.ITALIC, 30));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(312, 210, 155, 59);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Lados Cuadrados");
		lblNewLabel_4.setBounds(120, 136, 132, 12);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("CUADRADO");
		lblNewLabel_5.setBounds(126, 22, 84, 12);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("CIRCULO");
		lblNewLabel_6.setBounds(137, 257, 115, 12);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("R=");
		lblNewLabel_7.setBounds(66, 202, 29, 12);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_7_1 = new JLabel("R=");
		lblNewLabel_7_1.setBounds(45, 432, 29, 12);
		contentPane.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_8 = new JLabel("Area y Perimetro");
		lblNewLabel_8.setBounds(120, 364, 108, 12);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_7_1_1 = new JLabel("R=");
		lblNewLabel_7_1_1.setBounds(569, 181, 29, 12);
		contentPane.add(lblNewLabel_7_1_1);
		
		JLabel lblNewLabel_7_1_2 = new JLabel("R=");
		lblNewLabel_7_1_2.setBounds(556, 432, 29, 12);
		contentPane.add(lblNewLabel_7_1_2);
		
		JLabel lblNewLabel_9 = new JLabel("Area y Perimetro");
		lblNewLabel_9.setBounds(620, 106, 117, 12);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("RECTANGULO");
		lblNewLabel_10.setBounds(630, 10, 117, 12);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("TRIANGULO");
		lblNewLabel_11.setBounds(631, 223, 85, 12);
		contentPane.add(lblNewLabel_11);

	}
}
