package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class primer extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField a;
	private JTextField b;
	private JTextField c;
	private JTextField r;

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
		this.setResizable(false);
		setSize(462, 307);
		this.setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		a = new JTextField();
		a.setBounds(21, 80, 96, 18);
		contentPane.add(a);
		a.setColumns(10);
		
		b = new JTextField();
		b.setBounds(166, 80, 96, 18);
		contentPane.add(b);
		b.setColumns(10);
		
		c = new JTextField();
		c.setBounds(308, 80, 96, 18);
		contentPane.add(c);
		c.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("X");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(104, 83, 44, 12);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("+");
		lblNewLabel_1.setBounds(145, 83, 44, 12);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("=");
		lblNewLabel_2.setBounds(272, 83, 44, 12);
		contentPane.add(lblNewLabel_2);
		
		r = new JTextField();
		r.setBounds(166, 163, 148, 31);
		contentPane.add(r);
		r.setColumns(10);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float i =-1;
				float A= Float.parseFloat(a.getText());
				float B= Float.parseFloat(b.getText());
				float C= Float.parseFloat(c.getText());
				float g =(B*i);
				float h=C+g;
				float d=h/A;
				String respuesta = "X= "+d;
				r.setText(respuesta);
				
			}
		});
		btnNewButton.setBounds(189, 122, 84, 20);
		contentPane.add(btnNewButton);

	}
}
