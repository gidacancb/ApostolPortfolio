package portfolio;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

public class AboutMe extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AboutMe frame = new AboutMe();
					frame.setLocationRelativeTo(null);
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
	public AboutMe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 815, 685);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Calling out the child class of my multi-level inheritance class.
		About s = new About();
		
		//Label for my texts
		
		JLabel lblAddress = new JLabel(s.Add	);
		lblAddress.setForeground(Color.WHITE);
		lblAddress.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
		lblAddress.setBounds(500, 296, 289, 16);
		contentPane.add(lblAddress);
		
		JLabel lblNum = new JLabel(s.Num);
		lblNum.setForeground(Color.WHITE);
		lblNum.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
		lblNum.setBounds(500, 269, 289, 16);
		contentPane.add(lblNum);
		
		JLabel lblEmail = new JLabel(s.Email);
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
		lblEmail.setBounds(500, 243, 289, 16);
		contentPane.add(lblEmail);
		
		JLabel lblCourse = new JLabel(s.Course);
		lblCourse.setForeground(Color.WHITE);
		lblCourse.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
		lblCourse.setBounds(500, 216, 289, 16);
		contentPane.add(lblCourse);
		
		JLabel lblBirth = new JLabel(s.Birth);
		lblBirth.setForeground(Color.WHITE);
		lblBirth.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
		lblBirth.setBounds(500, 189, 289, 16);
		contentPane.add(lblBirth);
		
		JLabel lblName = new JLabel(s.Name);
		lblName.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
		lblName.setForeground(new Color(255, 255, 255));
		lblName.setBounds(500, 162, 289, 16);
		contentPane.add(lblName);
		
		//Label for my background
		
		JLabel lblbg = new JLabel("");
		lblbg.setFont(new Font("Segoe UI Historic", Font.PLAIN, 11));
		lblbg.setForeground(new Color(255, 255, 255));
		lblbg.setIcon(new ImageIcon("imgs\\AboutMe.png"));
		lblbg.setBounds(0, 0, 870, 650);
		contentPane.add(lblbg);
		
		//To make the border empty
		Border emptyBorder = BorderFactory.createEmptyBorder();
		
		//Button to switch to a new frame(Education)
		JButton btnEducation = new JButton("");
		btnEducation.setBorder(emptyBorder);
		btnEducation.setOpaque(false);
		btnEducation.setBorderPainted(false);
		btnEducation.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			Education s = new Education();
			s.setLocationRelativeTo(null);
			s.setVisible(true);
			dispose();
		}
		});
		btnEducation.setBounds(109, 455, 171, 38);
		contentPane.add(btnEducation);
		
		//Button to switch to a new frame(Works)
		JButton btnWorks = new JButton("");
		btnWorks.setBorder(emptyBorder);
		btnWorks.setOpaque(false);
		btnWorks.setBorderPainted(false);
		btnWorks.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			Works s = new Works();
			s.setLocationRelativeTo(null);
			s.setVisible(true);
			dispose();
		}
		});
		btnWorks.setBounds(109, 523, 160, 38);
		contentPane.add(btnWorks);
}
}
