package portfolio;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class Works extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Works frame = new Works();
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
	public Works() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 815, 685);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Calling out the child class of my multi-level inheritance class.
		About s = new About();
		
		//Creating Text Area for my description
		
		JTextArea txtCalc = new JTextArea();
		txtCalc.setText(s.Calc);
		txtCalc.setForeground(Color.WHITE);
		txtCalc.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 11));
		txtCalc.setBackground(new Color(0, 50, 116));
		txtCalc.setBounds(400, 386, 326, 82);
		contentPane.add(txtCalc);
		
		JTextArea txtBMI = new JTextArea();
		txtBMI.setForeground(Color.WHITE);
		txtBMI.setText(s.BMI);
		txtBMI.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 11));
		txtBMI.setBackground(new Color(0, 50, 116));
		txtBMI.setBounds(400, 124, 315, 82);
		contentPane.add(txtBMI);
		
		//Label for my background
		JLabel lblbg = new JLabel("");
		lblbg.setIcon(new ImageIcon("imgs\\Work.png"));
		lblbg.setBounds(0, 0, 800, 650);
		contentPane.add(lblbg);
		
		//To make the border empty
		Border emptyBorder = BorderFactory.createEmptyBorder();
		
		//Button to switch to a new frame(About Me)
		JButton btnAbout = new JButton("");
		btnAbout.setBounds(102, 386, 164, 33);
		btnAbout.setBorder(emptyBorder);
		btnAbout.setOpaque(false);
		btnAbout.setBorderPainted(false);
		btnAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				AboutMe s = new AboutMe();
				s.setLocationRelativeTo(null);
				s.setVisible(true);
				dispose();
			}
		});
		contentPane.add(btnAbout);
		
		JButton btnEducation = new JButton("");
		btnEducation.setBorder(emptyBorder);
		btnEducation.setOpaque(false);
		btnEducation.setBorderPainted(false);
		btnEducation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//To connect to another Education
				Education s = new Education();
				s.setLocationRelativeTo(null);
				s.setVisible(true);
				dispose();
			}
		});
		
		//Button to switch to my work(BMI)
		btnEducation.setBounds(113, 456, 153, 33);
		contentPane.add(btnEducation);
		
		JButton btnBMI = new JButton("");
		btnBMI.setBorder(emptyBorder);
		btnBMI.setOpaque(false);
		btnBMI.setBorderPainted(false);
		btnBMI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Body s = new Body();
				s.setLocationRelativeTo(null);
				s.setVisible(true);
			}
		});
		btnBMI.setBounds(648, 294, 113, 23);
		contentPane.add(btnBMI);
		
		//Button to switch to my work(Calculator)
		JButton btnCalculator = new JButton("");
		btnCalculator.setBorder(emptyBorder);
		btnCalculator.setOpaque(false);
		btnCalculator.setBorderPainted(false);
		btnCalculator.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculator1 s = new Calculator1();
			
				s.setLocationRelativeTo(null);
				s.setVisible(true);
			}
		});
		btnCalculator.setBounds(658, 589, 103, 23);
		contentPane.add(btnCalculator);
		
		
	}
}
