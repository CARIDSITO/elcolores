import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.border.EtchedBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class colorr {

	private JFrame frmCheckColores;
	private JCheckBox chkrojo;
	private JCheckBox chkverde;
	private JCheckBox chkazul;
	private JLabel lblcolor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					colorr window = new colorr();
					window.frmCheckColores.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public colorr() {
		initialize();
	}

	public void asignarColor() {
		
		int r=(chkrojo.isSelected())?255:0;
		int g=(chkverde.isSelected())?255:0;
		int b=(chkazul.isSelected())?255:0;
		lblcolor.setBackground(new Color(r,g,b));
	}
	
	private void initialize() {
		frmCheckColores = new JFrame();
		frmCheckColores.setTitle("CHECK COLORES");
		frmCheckColores.setBounds(100, 100, 450, 300);
		frmCheckColores.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCheckColores.setLocationRelativeTo(null);
		frmCheckColores.getContentPane().setLayout(null);
		
		chkrojo = new JCheckBox("rojo");
		chkrojo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asignarColor();
			}
		});
		chkrojo.setFont(new Font("Viner Hand ITC", Font.BOLD, 14));
		chkrojo.setBounds(19, 32, 97, 23);
		frmCheckColores.getContentPane().add(chkrojo);
		
		chkverde = new JCheckBox("verde");
		chkverde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asignarColor();
			}
		});
		chkverde.setFont(new Font("Viner Hand ITC", Font.BOLD, 14));
		chkverde.setBounds(19, 90, 97, 23);
		frmCheckColores.getContentPane().add(chkverde);
		
		chkazul = new JCheckBox("azul");
		chkazul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asignarColor();
			}
		});
		chkazul.setFont(new Font("Viner Hand ITC", Font.BOLD, 14));
		chkazul.setBounds(19, 164, 97, 23);
		frmCheckColores.getContentPane().add(chkazul);
		
		lblcolor = new JLabel("");
		lblcolor.setOpaque(true);
		lblcolor.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblcolor.setBounds(201, 35, 212, 191);
		frmCheckColores.getContentPane().add(lblcolor);
	}
}
