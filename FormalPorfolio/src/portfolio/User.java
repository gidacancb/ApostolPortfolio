package portfolio;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Color;

public class User extends JFrame { //Start of the Application.

	private JPanel contentPane;
	private JLabel lblbg;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					User frame = new User();
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
	public User() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 815, 685);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Image of Self
		lblbg = new JLabel("");
		lblbg.setBounds(0, 0, 870, 650);
		lblbg.setIcon(new ImageIcon("imgs\\User.png"));
		contentPane.add(lblbg);
		
		//To make the border empty
		Border emptyBorder = BorderFactory.createEmptyBorder();
		
		//Button to switch to a new frame(About Me)
		JButton btnAbout = new JButton("");
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
		btnAbout.setBounds(109, 389, 171, 31);
		contentPane.add(btnAbout);
		
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
