import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import java.awt.ComponentOrientation;
import javax.swing.JScrollPane;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Práctica1 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JComboBox comboBox;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Práctica1 window = new Práctica1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Práctica1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 885, 571);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
			}
		});
		textField.setBounds(179, 130, 168, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(179, 161, 168, 20);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(459, 130, 168, 20);
		frame.getContentPane().add(textField_2);
		
		JLabel lblNewJgoodiesTitle = DefaultComponentFactory.getInstance().createTitle(" N\u00BA Tarjeta Sanitaria: ");
		lblNewJgoodiesTitle.setBounds(58, 133, 111, 14);
		frame.getContentPane().add(lblNewJgoodiesTitle);
		
		JLabel lblFechaNacimiento = DefaultComponentFactory.getInstance().createTitle("Fecha Nacimiento:");
		lblFechaNacimiento.setBounds(60, 164, 88, 14);
		frame.getContentPane().add(lblFechaNacimiento);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("CitaM\u00E9dico.");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(60, 245, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("CitaEnfermera.");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(60, 286, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("CitaEspecialista.");
		buttonGroup.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setBounds(60, 326, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_2);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"D.N.I", "N.I.F"}));
		comboBox.setBounds(367, 130, 72, 20);
		frame.getContentPane().add(comboBox);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Horario de tarde.");
		chckbxNewCheckBox.setBounds(221, 198, 136, 20);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(221, 254, 142, 83);
		frame.getContentPane().add(scrollPane);
		
		JTextArea txtrMdicoJosFeliciano = new JTextArea();
		scrollPane.setViewportView(txtrMdicoJosFeliciano);
		txtrMdicoJosFeliciano.setText("M\u00E9dico: Jos\u00E9 Feliciano\r\nEnfermero: Pedro Jimenez\r\nEspecialista: Alfredo Contreras");
		
		JCheckBox chckbxHorarioDeMaana = new JCheckBox("Horario de ma\u00F1ana.");
		chckbxHorarioDeMaana.setBounds(60, 197, 136, 23);
		frame.getContentPane().add(chckbxHorarioDeMaana);
		
		JButton btnPedircita = new JButton("PedirCita");
		btnPedircita.setBounds(59, 370, 89, 23);
		frame.getContentPane().add(btnPedircita);
		
		JButton btnModificarcita = new JButton("ModificarCita");
		btnModificarcita.setBounds(186, 370, 110, 23);
		frame.getContentPane().add(btnModificarcita);
		
		JButton btnSalir = new JButton("CancelarCita");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnSalir.setBounds(338, 370, 116, 23);
		frame.getContentPane().add(btnSalir);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setAlignmentY(Component.TOP_ALIGNMENT);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\guill\\eclipse-workspace\\Ejemplo\\img\\4266_Sermas.png"));
		lblNewLabel.setBounds(26, 0, 720, 120);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\guill\\eclipse-workspace\\Ejemplo\\img\\primaria.jpg"));
		lblNewLabel_1.setBounds(26, 388, 755, 133);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\guill\\eclipse-workspace\\Ejemplo\\img\\images.png"));
		lblNewLabel_2.setBounds(521, 198, 225, 180);
		frame.getContentPane().add(lblNewLabel_2);
	}
}
