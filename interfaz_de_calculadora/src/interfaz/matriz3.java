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
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;

public class matriz3 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField x1;
	private JTextField x2;
	private JTextField x3;
	private JTextField y1;
	private JTextField y2;
	private JTextField y3;
	private JTextField z1;
	private JTextField z2;
	private JTextField z3;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JTextField Res;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					matriz3 frame = new matriz3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public matriz3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		setBounds(500, 100, 339, 337);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(60, 179, 113));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Menú");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana1 v1 = new ventana1();
				v1.setVisible(true);
				matriz3.this.dispose();
			}
		});
		btnNewButton.setBounds(10, 256, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Atrás");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana2 v2 = new ventana2();
				v2.setVisible(true);
				matriz3.this.dispose();
			}
		});
		btnNewButton_1.setBounds(217, 256, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Sistema de ecuaciones 3x3");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel.setBounds(77, 11, 170, 23);
		contentPane.add(lblNewLabel);
		
		x1 = new JTextField();
		x1.setHorizontalAlignment(SwingConstants.CENTER);
		x1.setBounds(10, 63, 57, 20);
		contentPane.add(x1);
		x1.setColumns(10);
		
		x2 = new JTextField();
		x2.setHorizontalAlignment(SwingConstants.CENTER);
		x2.setColumns(10);
		x2.setBounds(10, 94, 57, 20);
		contentPane.add(x2);
		
		x3 = new JTextField();
		x3.setHorizontalAlignment(SwingConstants.CENTER);
		x3.setColumns(10);
		x3.setBounds(10, 125, 57, 20);
		contentPane.add(x3);
		
		y1 = new JTextField();
		y1.setHorizontalAlignment(SwingConstants.CENTER);
		y1.setColumns(10);
		y1.setBounds(87, 63, 57, 20);
		contentPane.add(y1);
		
		y2 = new JTextField();
		y2.setHorizontalAlignment(SwingConstants.CENTER);
		y2.setColumns(10);
		y2.setBounds(87, 94, 57, 20);
		contentPane.add(y2);
		
		y3 = new JTextField();
		y3.setHorizontalAlignment(SwingConstants.CENTER);
		y3.setColumns(10);
		y3.setBounds(87, 125, 57, 20);
		contentPane.add(y3);
		
		z1 = new JTextField();
		z1.setHorizontalAlignment(SwingConstants.CENTER);
		z1.setColumns(10);
		z1.setBounds(165, 63, 57, 20);
		contentPane.add(z1);
		
		z2 = new JTextField();
		z2.setHorizontalAlignment(SwingConstants.CENTER);
		z2.setColumns(10);
		z2.setBounds(165, 94, 57, 20);
		contentPane.add(z2);
		
		z3 = new JTextField();
		z3.setHorizontalAlignment(SwingConstants.CENTER);
		z3.setColumns(10);
		z3.setBounds(165, 125, 57, 20);
		contentPane.add(z3);
		
		t1 = new JTextField();
		t1.setHorizontalAlignment(SwingConstants.CENTER);
		t1.setColumns(10);
		t1.setBounds(249, 63, 57, 20);
		contentPane.add(t1);
		
		t2 = new JTextField();
		t2.setHorizontalAlignment(SwingConstants.CENTER);
		t2.setColumns(10);
		t2.setBounds(249, 94, 57, 20);
		contentPane.add(t2);
		
		t3 = new JTextField();
		t3.setHorizontalAlignment(SwingConstants.CENTER);
		t3.setColumns(10);
		t3.setBounds(249, 125, 57, 20);
		contentPane.add(t3);
		
		Res = new JTextField();
		Res.setHorizontalAlignment(SwingConstants.CENTER);
		Res.setEditable(false);
		Res.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Res.setBounds(10, 200, 303, 36);
		contentPane.add(Res);
		Res.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("Borrar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				x1.setText("");
				x2.setText("");
				x3.setText("");
				y1.setText("");
				y2.setText("");
				y3.setText("");
				z1.setText("");
				z2.setText("");
				z3.setText("");
				t1.setText("");
				t2.setText("");
				t3.setText("");
				Res.setText("");
			}
		});
		btnNewButton_2.setBounds(45, 166, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Calcular");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//x
				float X1= Float.parseFloat(x1.getText());
				float X2= Float.parseFloat(x2.getText());
				float X3= Float.parseFloat(x3.getText());
				//y
				float Y1= Float.parseFloat(y1.getText());
				float Y2= Float.parseFloat(y2.getText());
				float Y3= Float.parseFloat(y3.getText());
				//Z
				float Z1= Float.parseFloat(z1.getText());
				float Z2= Float.parseFloat(z2.getText());
				float Z3= Float.parseFloat(z3.getText());
				//terminos independientes
				float T1= Float.parseFloat(t1.getText());
				float T2= Float.parseFloat(t2.getText());
				float T3= Float.parseFloat(t3.getText());
				//Determinante de la matriz, x, y y z
				float d = (X1*Y2*Z3)+(X2*Y3*Z1)+(X3*Y1*Z2)-(Z1*Y2*X3)-(Z2*Y3*X1)-(Z3*Y1*X2);
				float dx = (T1*Y2*Z3)+(T2*Y3*Z1)+(T3*Y1*Z2)-(Z1*Y2*T3)-(Z2*Y3*T1)-(Z3*Y1*T2);
				float dy = (X1*T2*Z3)+(X2*T3*Z1)+(X3*T1*Z2)-(Z1*T2*X3)-(Z2*T3*X1)-(Z3*T1*X2);
				float dz = (X1*Y2*T3)+(X2*Y3*T1)+(X3*Y1*T2)-(T1*Y2*X3)-(T2*Y3*X1)-(T3*Y1*X2);
				//Resultados
				float x = dx/d;
				float y = dy/d;
				float z = dz/d;
				//Transforma los resultados a String para que puedan
				//imprimirse en el campo de texto "Res"
				String res = "x= "+x+"  y= "+y+"  z= "+z;
				Res.setText(res);
			}
		});
		btnNewButton_3.setBounds(175, 166, 89, 23);
		contentPane.add(btnNewButton_3);
		
		lblNewLabel_1 = new JLabel("X");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 49, 57, 14);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Y");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(87, 49, 57, 14);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Z");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(165, 49, 57, 14);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("TI");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(249, 49, 57, 14);
		contentPane.add(lblNewLabel_4);

	}

}
