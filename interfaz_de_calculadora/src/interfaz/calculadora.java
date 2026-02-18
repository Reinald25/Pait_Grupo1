package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class calculadora extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField a;
	private JTextField b;
	private JTextField c;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculadora frame = new calculadora();
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
	public calculadora() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(1000, 100, 316, 244);
		this.setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Calculadora");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(99, 23, 95, 14);
		contentPane.add(lblNewLabel);
		
		a = new JTextField();
		a.setText("0");
		a.setHorizontalAlignment(SwingConstants.RIGHT);
		a.setBounds(34, 59, 44, 34);
		contentPane.add(a);
		a.setColumns(10);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					double A = Double.parseDouble(a.getText());
				double B = Double.parseDouble(b.getText());
				double s = A+B;
				String r = ""+s;
				c.setText(r);
				}catch(NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, "Acción inválida");
				}
				
			}
		});
		btnNewButton.setBounds(34, 104, 44, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("-");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
				double A = Double.parseDouble(a.getText());
				double B = Double.parseDouble(b.getText());
				double r = A-B;
				String res = ""+r;
				c.setText(res);
				}catch(NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, "Acción inválida");
				}
			}
		});
		btnNewButton_1.setBounds(113, 104, 44, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("/");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
				double A = Double.parseDouble(a.getText());
				double B = Double.parseDouble(b.getText());
				double d = A/B;
				if (B==0) {
					JOptionPane.showMessageDialog(null, "No se puede dividir a 0");
				}else {
					String r = ""+d;
				c.setText(r);
				}
				
				}catch(NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, "Acción inválida");
				}
			}
		});
		btnNewButton_2.setBounds(34, 138, 44, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnX = new JButton("x");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
				double A = Double.parseDouble(a.getText());
				double B = Double.parseDouble(b.getText());
				double m = A*B;
				String r = ""+m;
				c.setText(r);
				}catch(NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, "Acción inválida");
				}
			}
		});
		btnX.setBounds(113, 138, 44, 23);
		contentPane.add(btnX);
		
		JButton btnNewButton_3 = new JButton("C");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a.setText("0");
				b.setText("0");
				c.setText("");
			}
		});
		btnNewButton_3.setBounds(217, 125, 44, 23);
		contentPane.add(btnNewButton_3);
		
		b = new JTextField();
		b.setText("0");
		b.setHorizontalAlignment(SwingConstants.RIGHT);
		b.setColumns(10);
		b.setBounds(113, 59, 44, 34);
		contentPane.add(b);
		
		c = new JTextField();
		c.setHorizontalAlignment(SwingConstants.RIGHT);
		c.setEditable(false);
		c.setBounds(207, 79, 64, 34);
		contentPane.add(c);
		c.setColumns(10);
		
		
		
	}

}
