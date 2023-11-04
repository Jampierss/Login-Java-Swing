package ui;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import bean.Empleado;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class frmLogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JTextField txtDni;
	JPasswordField txtPasswordd;
	dao.EmpleadoDAO empleadoDAO = new dao.EmpleadoDAO();
	bean.Empleado empleado = new Empleado();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmLogin frame = new frmLogin();
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
	public frmLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 400, 300);
		getContentPane().setLayout(null);
		setUndecorated(true);
		setLocationRelativeTo(null);
		
		
		JPanel pnlLogin = new JPanel();
		pnlLogin.setBackground(new Color(94,17,90));
		pnlLogin.setBounds(0,0,400,30);
		getContentPane().add(pnlLogin);
		
		JLabel imgLogo = new JLabel();
		imgLogo.setBounds(96,5,208,43);
		pnlLogin.add(imgLogo);
		
		JLabel imgCerrar = new JLabel();
		imgCerrar.setBounds(370,10,16,16);
		pnlLogin.add(imgCerrar);
		
		JLabel lblDni = new JLabel("DNI:");
		lblDni.setBounds(100,80,60,30);
		getContentPane().add(lblDni);

		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(100, 120, 80, 30);
		getContentPane().add(lblPassword);
		
		JTextField txtDni = new JTextField();
		txtDni.setBounds(180,80,80,30);
		txtDni.setMargin(new Insets(5, 8, 5, 8));
		getContentPane().add(txtDni);
		
		JPasswordField txtPasswordd = new JPasswordField();
		txtPasswordd.setBounds(180,120,80,30);
		txtPasswordd.setMargin(new Insets(5, 8, 5, 8));
		getContentPane().add(txtPasswordd);
		
		JButton btnIniciar = new JButton("Iniciar");
		btnIniciar.setBounds(75,180,100,30);
		btnIniciar.setFocusPainted(false);
		btnIniciar.setBorderPainted(false);
		btnIniciar.setBackground(new Color(0,204,0));
		btnIniciar.setForeground(Color.WHITE);
		getContentPane().add(btnIniciar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(215,180,100,30);
		btnCancelar.setFocusPainted(false);
		btnCancelar.setBorderPainted(false);
		btnCancelar.setBackground(new Color(255,0,0));
		btnCancelar.setForeground(Color.WHITE);
		getContentPane().add(btnCancelar);
		
		btnIniciar.addFocusListener(new FocusAdapter() {
			@Override public void focusGained(FocusEvent e) {btn_focusGained(btnIniciar);}
			@Override public void focusLost(FocusEvent e) {btn_focusLost(btnIniciar);}
		});
		
		btnIniciar.addMouseListener(new MouseAdapter() {
			@Override public void mouseEntered(MouseEvent e) {btn_focusGained(btnIniciar);}
			@Override public void mouseExited(MouseEvent e) {btn_focusLost(btnIniciar);}
		});
		
		btnIniciar.addActionListener(new ActionListener() {
			@Override public void actionPerformed(ActionEvent e) {btn_iniciarAtionPerformed();}
		});
		
		// BUTTON CANCEL
		btnCancelar.addFocusListener(new FocusAdapter() {
			@Override public void focusGained(FocusEvent e) {btn_focusGained(btnCancelar);}
			@Override public void focusLost(FocusEvent e) {btnCancel_focusLost(btnCancelar);}
		});
		
		btnCancelar.addMouseListener(new MouseAdapter() {
			@Override public void mouseEntered(MouseEvent e) {btn_focusGained(btnCancelar);}
			@Override public void mouseExited(MouseEvent e) {btnCancel_focusLost(btnCancelar);}
		});
		
		btnCancelar.addActionListener(new ActionListener() {
			@Override public void actionPerformed(ActionEvent e) {btn_cancelarAtionPerformed();}
		});
		
		imgCerrar.addMouseListener(new MouseAdapter() {
			@Override public void mouseClicked(MouseEvent e) {btn_cancelarAtionPerformed();}
		});
		
		
	}


	protected void btn_focusGained(JButton btn) {
		btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btn.setBackground(Color.BLACK);
	}	
	
	protected void btn_focusLost(JButton btn) {
		btn.setBackground(new Color(0,204,0));	
	}
	
	protected void btnCancel_focusLost(JButton btn) {
		btn.setBackground(new Color(255,0,0));	
	}
	
	protected void btn_iniciarAtionPerformed() {
		
	}
	
	protected void btn_cancelarAtionPerformed() {
		if (JOptionPane.showConfirmDialog(this, "¿Desea Salir?") == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
		
	}
	
}
