import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Button;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class Home extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	
	int xx,xy;

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					frame.setUndecorated(true);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	// going to borrow code from a gist to move frame.
	

	/**
	 * Create the frame.
	 */
	public Home() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 729, 476);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(191, 75, 29));
		panel.setBounds(0, 0, 346, 490);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Codegym Messenger");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setForeground(new Color(250, 247, 247));
		lblNewLabel.setBounds(75, 305, 200, 27);
		panel.add(lblNewLabel);
		
		JLabel label = new JLabel("");
		
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
				 xx = e.getX();
			     xy = e.getY();
			}
		});
		label.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent arg0) {
				
				int x = arg0.getXOnScreen();
	            int y = arg0.getYOnScreen();
	            Home.this.setLocation(x - xx, y - xy);  
			}
		});
		label.setBounds(-20, 0, 420, 275);
		label.setVerticalAlignment(SwingConstants.TOP);
		label.setIcon(new ImageIcon(Home.class.getResource("/images/bg.jpg")));
		panel.add(label);
		
		JLabel lblWeGotYou = new JLabel("Hãy nói theo cách của bạn");
		lblWeGotYou.setHorizontalAlignment(SwingConstants.CENTER);
		lblWeGotYou.setForeground(new Color(219, 238, 233));
		lblWeGotYou.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblWeGotYou.setBounds(80, 343, 191, 27);
		panel.add(lblWeGotYou);

		JLabel lblWeGotYou1 = new JLabel("Và trả tiền theo cách của chúng tôi");
		lblWeGotYou1.setHorizontalAlignment(SwingConstants.CENTER);
		lblWeGotYou1.setForeground(new Color(229, 239, 237));
		lblWeGotYou1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblWeGotYou1.setBounds(60, 363, 230, 27);
		panel.add(lblWeGotYou1);
		
		Button button = new Button("SignUp");
		button.setForeground(Color.WHITE);
		button.setBackground(new Color(241, 57, 83));
		button.setBounds(395, 363, 283, 36);
		contentPane.add(button);

		Button button1 = new Button("Login");
		button1.setForeground(Color.WHITE);
		button1.setBackground(new Color(71, 112, 186));
		button1.setBounds(395, 303, 283, 36);
		contentPane.add(button1);


		
		JLabel lblUsername = new JLabel("USERNAME");
		lblUsername.setBounds(395, 58, 114, 14);
		contentPane.add(lblUsername);

//		BOX USERNAME:
        textField = new JTextField();
        textField.setBounds(395, 83, 283, 36);
        contentPane.add(textField);
        textField.setColumns(10);

		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setBounds(395, 150, 96, 14);
		contentPane.add(lblPassword);

//      BOX PASSWORD:
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(395, 175, 283, 36);
		contentPane.add(passwordField_1);
		
		JLabel lbl_close = new JLabel("X");
		lbl_close.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				System.exit(0);
			}
		});

		lbl_close.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_close.setForeground(new Color(49, 67, 212));
		lbl_close.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbl_close.setBounds(691, 0, 37, 27);
		contentPane.add(lbl_close);
	}
}
