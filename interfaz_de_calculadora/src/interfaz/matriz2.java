package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;

public class matriz2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField x1;
	private JTextField x2;
	private JTextField y1;
	private JTextField y2;
	private JTextField t1;
	private JTextField t2;
	private JTextField Res;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					matriz2 frame = new matriz2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public matriz2() {
		setBackground(new Color(0, 255, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setSize(342, 290);
		this.setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 224, 208));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Atrás");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana2 v2 = new ventana2();
				v2.setVisible(true);
				matriz2.this.dispose();
			}
		});
		btnNewButton.setBounds(207, 212, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Menú");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana1 v1 = new ventana1();
				v1.setVisible(true);
				matriz2.this.dispose();
			}
		});
		btnNewButton_1.setBounds(23, 212, 89, 23);
		contentPane.add(btnNewButton_1);
		
		x1 = new JTextField();
		x1.setHorizontalAlignment(SwingConstants.CENTER);
		x1.setBounds(23, 60, 76, 23);
		contentPane.add(x1);
		x1.setColumns(10);
		
		x2 = new JTextField();
		x2.setHorizontalAlignment(SwingConstants.CENTER);
		x2.setColumns(10);
		x2.setBounds(23, 94, 76, 23);
		contentPane.add(x2);
		
		JLabel lblNewLabel = new JLabel("X");
		lblNewLabel.setBounds(64, 45, 35, 14);
		contentPane.add(lblNewLabel);
		
		y1 = new JTextField();
		y1.setHorizontalAlignment(SwingConstants.CENTER);
		y1.setColumns(10);
		y1.setBounds(109, 60, 76, 23);
		contentPane.add(y1);
		
		y2 = new JTextField();
		y2.setHorizontalAlignment(SwingConstants.CENTER);
		y2.setColumns(10);
		y2.setBounds(109, 94, 76, 23);
		contentPane.add(y2);
		
		t1 = new JTextField();
		t1.setHorizontalAlignment(SwingConstants.CENTER);
		t1.setColumns(10);
		t1.setBounds(220, 60, 76, 23);
		contentPane.add(t1);
		
		t2 = new JTextField();
		t2.setHorizontalAlignment(SwingConstants.CENTER);
		t2.setColumns(10);
		t2.setBounds(220, 94, 76, 23);
		contentPane.add(t2);
		
		JLabel lblY = new JLabel("Y");
		lblY.setBounds(150, 45, 35, 14);
		contentPane.add(lblY);
		
		JLabel lblTi = new JLabel("TI");
		lblTi.setBounds(261, 45, 35, 14);
		contentPane.add(lblTi);
		
		JLabel lblNewLabel_1 = new JLabel("Sistema de ecuaciones 2x2");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(84, 11, 185, 14);
		contentPane.add(lblNewLabel_1);
		
		Res = new JTextField();
		Res.setBackground(new Color(245, 245, 220));
		Res.setEditable(false);
		Res.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Res.setHorizontalAlignment(SwingConstants.CENTER);
		Res.setBounds(23, 155, 273, 35);
		contentPane.add(Res);
		Res.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("Borrar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				x1.setText("");
				x2.setText("");
				y1.setText("");
				y2.setText("");
				t1.setText("");
				t2.setText("");
				Res.setText("");
			}
		});
		btnNewButton_2.setBounds(23, 128, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Calcular");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//x
				float X1= Float.parseFloat(x1.getText());
				float X2= Float.parseFloat(x2.getText());
				//y
				float Y1= Float.parseFloat(y1.getText());
				float Y2= Float.parseFloat(y2.getText());
				//terminos independientes
				float T1= Float.parseFloat(t1.getText());
				float T2= Float.parseFloat(t2.getText());
				//Determinante de la matriz, x e y
				float d = (X1*Y2)-(X2*Y1);
				float dx = (T1*Y2)-(T2*Y1);
				float dy = (X1*T2)-(X2*T1);
				//Resultados
				float x = dx/d;
				float y = dy/d;
				//Transforma los resultados a String para que puedan
				//imprimirse en el campo de texto "Res"
				String res = "x= "+x+"\n"+" y= "+y;
				Res.setText(res);
			}
		});
		btnNewButton_3.setBounds(207, 128, 89, 23);
		contentPane.add(btnNewButton_3);

	}
}
