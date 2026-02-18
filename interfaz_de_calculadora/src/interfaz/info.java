package interfaz;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.StyledDocument;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFPictureData;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class info extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					info frame = new info();
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
	public info() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setTitle("Información");
		setSize(569, 300);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 296, 239);
		contentPane.add(scrollPane);
		
		JTextPane txtpnSeleccionarUnaOpcion = new JTextPane();
		txtpnSeleccionarUnaOpcion.setText("Seleccionar una opcion para ofrecer información");
		txtpnSeleccionarUnaOpcion.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtpnSeleccionarUnaOpcion.setEditable(false);
		scrollPane.setViewportView(txtpnSeleccionarUnaOpcion);
		
		JButton btnNewButton = new JButton("Leer");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtpnSeleccionarUnaOpcion.setText("");
				try (FileInputStream fis = new FileInputStream("src/archivos/Info.docx");
						
			             XWPFDocument documento = new XWPFDocument(fis)) {
			            
			            StyledDocument doc = txtpnSeleccionarUnaOpcion.getStyledDocument();
			            txtpnSeleccionarUnaOpcion.setText(""); // Limpiar previo

			            // 1. Leer y colocar el texto por párrafos
			            for (XWPFParagraph para : documento.getParagraphs()) {
			                doc.insertString(doc.getLength(), para.getText() + "\n", null);
			            }

			            // 2. Extraer e insertar todas las imágenes del documento
			            for (XWPFPictureData cuadro : documento.getAllPictures()) {
			                byte[] datosImagen = cuadro.getData();
			                ImageIcon icono = new ImageIcon(datosImagen);
			                
			                // Opcional: Redimensionar si es muy grande
			                Image img = icono.getImage().getScaledInstance(200, 150, Image.SCALE_SMOOTH);
			                
			                txtpnSeleccionarUnaOpcion.insertIcon(new ImageIcon(img));
			                doc.insertString(doc.getLength(), "\n", null);
			            }

			        } catch (Exception ex) {
			            JOptionPane.showMessageDialog(null, "Error al leer el .docx: " + ex.getMessage());
			        }
			}
		});
		btnNewButton.setBounds(438, 31, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Leer");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtpnSeleccionarUnaOpcion.setText("");
				try (FileInputStream fis = new FileInputStream("src/archivos/info2.docx");
			             XWPFDocument documento = new XWPFDocument(fis)) {
			            StyledDocument doc = txtpnSeleccionarUnaOpcion.getStyledDocument();
			            txtpnSeleccionarUnaOpcion.setText("");
			            for (XWPFParagraph para : documento.getParagraphs()) {
			                doc.insertString(doc.getLength(), para.getText() + "\n", null);
			            }

			            for (XWPFPictureData cuadro : documento.getAllPictures()) {
			                byte[] datosImagen = cuadro.getData();
			                ImageIcon icono = new ImageIcon(datosImagen);
			                Image img = icono.getImage().getScaledInstance(200, 150, Image.SCALE_SMOOTH);
			                txtpnSeleccionarUnaOpcion.insertIcon(new ImageIcon(img));
			                doc.insertString(doc.getLength(), "\n", null);
			            }

			        } catch (Exception ex) {
			            JOptionPane.showMessageDialog(null, "Error al leer el .docx: " + ex.getMessage());
		}
			}
		});
		btnNewButton_1.setBounds(438, 65, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Leer");
		btnNewButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnNewButton_2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				txtpnSeleccionarUnaOpcion.setText("");
				try (FileInputStream fis = new FileInputStream("src/archivos/No disponible.docx");
			             XWPFDocument documento = new XWPFDocument(fis)) {
			            StyledDocument doc = txtpnSeleccionarUnaOpcion.getStyledDocument();
			            txtpnSeleccionarUnaOpcion.setText("");
			            for (XWPFParagraph para : documento.getParagraphs()) {
			                doc.insertString(doc.getLength(), para.getText() + "\n", null);
			            }

			            for (XWPFPictureData cuadro : documento.getAllPictures()) {
			                byte[] datosImagen = cuadro.getData();
			                ImageIcon icono = new ImageIcon(datosImagen);
			                Image img = icono.getImage().getScaledInstance(200, 150, Image.SCALE_SMOOTH);
			                txtpnSeleccionarUnaOpcion.insertIcon(new ImageIcon(img));
			                doc.insertString(doc.getLength(), "\n", null);
			            }

			        } catch (Exception ex) {
			            JOptionPane.showMessageDialog(null, "Error al leer el .docx: " + ex.getMessage());
		}
			
			}
		});
		btnNewButton_2.setBounds(438, 99, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Leer");
		btnNewButton_3.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtpnSeleccionarUnaOpcion.setText("");
				try (FileInputStream fis = new FileInputStream("src/archivos/No disponible.docx");
			             XWPFDocument documento = new XWPFDocument(fis)) {
			            StyledDocument doc = txtpnSeleccionarUnaOpcion.getStyledDocument();
			            txtpnSeleccionarUnaOpcion.setText("");
			            for (XWPFParagraph para : documento.getParagraphs()) {
			                doc.insertString(doc.getLength(), para.getText() + "\n", null);
			            }

			            for (XWPFPictureData cuadro : documento.getAllPictures()) {
			                byte[] datosImagen = cuadro.getData();
			                ImageIcon icono = new ImageIcon(datosImagen);
			                Image img = icono.getImage().getScaledInstance(200, 150, Image.SCALE_SMOOTH);
			                txtpnSeleccionarUnaOpcion.insertIcon(new ImageIcon(img));
			                doc.insertString(doc.getLength(), "\n", null);
			            }

			        } catch (Exception ex) {
			            JOptionPane.showMessageDialog(null, "Error al leer el .docx: " + ex.getMessage());
		}
			}
		});
		btnNewButton_3.setBounds(438, 133, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel = new JLabel("Sobre:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel.setBounds(316, 6, 83, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Calculadora");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(316, 35, 74, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Calculadora básica");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.setBounds(316, 65, 112, 23);
		contentPane.add(lblNewLabel_1_1);
		

	}
}
