package portfolio;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class Education extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Education frame = new Education();
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
	public Education() {
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
		
		JLabel lblElem = new JLabel(s.elem);
		lblElem.setForeground(Color.WHITE);
		lblElem.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
		lblElem.setBounds(542, 217, 289, 16);
		contentPane.add(lblElem);
		
		JLabel lblHigh = new JLabel(s.high);
		lblHigh.setForeground(Color.WHITE);
		lblHigh.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
		lblHigh.setBounds(542, 244, 289, 16);
		contentPane.add(lblHigh);
		
		JLabel lblSenior = new JLabel(s.Shigh);
		lblSenior.setForeground(Color.WHITE);
		lblSenior.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
		lblSenior.setBounds(542, 271, 289, 16);
		contentPane.add(lblSenior);
		
		JLabel lblCollege = new JLabel(s.College);
		lblCollege.setBounds(542, 298, 289, 16);
		contentPane.add(lblCollege);
		lblCollege.setForeground(Color.WHITE);
		lblCollege.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
		
		//Label for my background
		
		JLabel lblbg = new JLabel("");
		lblbg.setBounds(0, 0, 870, 650);
		lblbg.setIcon(new ImageIcon("imgs\\Edu.png"));
		contentPane.add(lblbg);
		
		//To make the border empty
		Border emptyBorder = BorderFactory.createEmptyBorder();
		
		//Button to switch to a new frame(About Me)
		JButton btnAbout = new JButton("");
		btnAbout.setBounds(109, 389, 171, 31);
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
		


