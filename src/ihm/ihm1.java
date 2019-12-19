package ihm;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.JRadioButton;

public class ihm1 {
	private JFrame frame;
	int i = 0, j = 0;
	float duration = 0;
	long EndA, StartA, StartC, EndC;
	private JTextField textField;
	JButton btnNewButton_1;
	Border emptyBorder;
	long seconds = 0, seconds2 = 0, total;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ihm1 window = new ihm1();
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
	public ihm1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setBounds(100, 100, 634, 531);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		emptyBorder = BorderFactory.createEmptyBorder();

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 653, 501);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		JButton btnNewButton_5 = new JButton("");

		btnNewButton_5.setBorder(emptyBorder);

		btnNewButton_5.setOpaque(false);
		btnNewButton_5.setContentAreaFilled(false);
		btnNewButton_5.setBorderPainted(false);
		btnNewButton_5.setVisible(false);

		JButton btnNewButton = new JButton("Start");
		
		btnNewButton.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 17));
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Ali Ben Halima\\Desktop\\icons8-happy-48.png"));

		JButton btnNewButton_6 = new JButton("Reset");

		btnNewButton_6.setForeground(Color.YELLOW);
		btnNewButton_6.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 30));
		btnNewButton_6.setBounds(276, 454, 109, 23);
		panel.add(btnNewButton_6);
		btnNewButton_6.setBorder(emptyBorder);

		btnNewButton_6.setOpaque(false);
		btnNewButton_6.setContentAreaFilled(false);
		btnNewButton_6.setBorderPainted(false);

		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Hard");
		rdbtnNewRadioButton_1.setBackground(Color.RED);
		rdbtnNewRadioButton_1.setBounds(276, 425, 109, 23);
		


		panel.add(rdbtnNewRadioButton_1);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("Easy");
		rdbtnNewRadioButton.setBackground(Color.GREEN);
		rdbtnNewRadioButton.setForeground(Color.BLACK);
		rdbtnNewRadioButton.setBounds(275, 399, 109, 23);
	
	
		panel.add(rdbtnNewRadioButton);
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdbtnNewRadioButton_1);
		bg.add(rdbtnNewRadioButton);

		btnNewButton_5.setIcon(new ImageIcon("C:\\Users\\Ali Ben Halima\\Desktop\\icons8-frog-48.png"));
		btnNewButton_5.setBounds(164, 11, 89, 49);
		panel.add(btnNewButton_5);
		btnNewButton.setBounds(145, 399, 124, 49);
		btnNewButton.setBackground(Color.WHITE);
		panel.add(btnNewButton);

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnNewRadioButton.isSelected()) {
					btnNewButton_1.setVisible(true);
					btnNewButton_5.setVisible(false);
				} else if (rdbtnNewRadioButton_1.isSelected()) {
					btnNewButton_1.setVisible(true);
					btnNewButton_5.setVisible(true);
				} else {
				}

			}
		});

		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bg.clearSelection();
				i = 0;
				j = 0;
				btnNewButton.setEnabled(true);
				btnNewButton_1.setVisible(false);
				btnNewButton_5.setVisible(false);

			}
		});

		JButton btnNewButton_2 = new JButton("Exit");
		btnNewButton_2.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 15));
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\Ali Ben Halima\\Desktop\\icons8-sad-48.png"));
		btnNewButton_2.setBounds(391, 401, 124, 49);
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		panel.add(btnNewButton_2);
		btnNewButton_1 = new JButton("");
		btnNewButton_1.setVisible(false);
		btnNewButton_1.setBounds(34, 0, 97, 49);
		panel.add(btnNewButton_1);

		btnNewButton_1.setBorder(emptyBorder);

		btnNewButton_1.setOpaque(false);
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBorderPainted(false);

		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Ali Ben Halima\\Desktop\\icons8-frog-48.png"));

		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBackground(new Color(0, 255, 127));

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 626, 501);
		panel.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Ali Ben Halima\\Desktop\\grass.jpg"));
		
				JPanel panel_1 = new JPanel();
				
						panel_1.setVisible(false);
						panel_1.setBounds(0, 0, 678, 541);
						frame.getContentPane().add(panel_1);
						panel_1.setLayout(null);
						
								JLabel lblNewLabel_4 = new JLabel("Exit");
								lblNewLabel_4.setFont(new Font("Tempus Sans ITC", Font.ITALIC, 31));
								lblNewLabel_4.setForeground(new Color(0, 0, 255));
								lblNewLabel_4.setBounds(344, 202, 91, 42);
								panel_1.add(lblNewLabel_4);
								
										JLabel lblNewLabel_3 = new JLabel("Restart");
										lblNewLabel_3.setForeground(new Color(0, 0, 255));
										lblNewLabel_3.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 31));
										lblNewLabel_3.setBounds(87, 190, 138, 42);
										panel_1.add(lblNewLabel_3);
										
												textField = new JTextField();
												textField.setBorder(emptyBorder);
												
														textField.setOpaque(false);
														
																textField.setBounds(199, 45, 195, 33);
																panel_1.add(textField);
																textField.setColumns(10);
																
																		JLabel lblYourTimeIs = new JLabel("Your Time is :");
																		lblYourTimeIs.setFont(new Font("Tahoma", Font.PLAIN, 15));
																		lblYourTimeIs.setBounds(94, 43, 96, 33);
																		panel_1.add(lblYourTimeIs);
																		
																				JButton btnNewButton_4 = new JButton("");
																				btnNewButton_4.setForeground(new Color(0, 0, 255));
																				btnNewButton_4.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 17));
																				btnNewButton_4.setIcon(new ImageIcon("C:\\Users\\Ali Ben Halima\\Desktop\\icons8-exit-sign-64.png"));
																				btnNewButton_4.setBorder(emptyBorder);
																				
																						btnNewButton_4.setOpaque(false);
																						btnNewButton_4.setContentAreaFilled(false);
																						btnNewButton_4.setBorderPainted(false);
																						btnNewButton_4.addActionListener(new ActionListener() {
																							public void actionPerformed(ActionEvent e) {
																								int result = JOptionPane.showConfirmDialog(null, "Do you Really want to Exit ? ",
																										"InfoBox: " + "Leaving ?", JOptionPane.YES_OPTION);
																								if (result == JOptionPane.OK_OPTION) {
																									frame.dispose();
																								}

																							}
																						});
																						btnNewButton_4.setBounds(334, 128, 107, 65);
																						panel_1.add(btnNewButton_4);
																						
																								JButton btnNewButton_3 = new JButton("");
																								btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\Ali Ben Halima\\Desktop\\icons8-restart-48.png"));
																								btnNewButton_3.setBorder(emptyBorder);
																								
																										btnNewButton_3.setOpaque(false);
																										btnNewButton_3.setContentAreaFilled(false);
																										btnNewButton_3.setBorderPainted(false);
																										
																												btnNewButton_3.setBounds(94, 134, 107, 42);
																												panel_1.add(btnNewButton_3);
																												
																														JLabel lblNewLabel_1 = new JLabel("Restart ");
																														lblNewLabel_1.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 18));
																														lblNewLabel_1.setForeground(SystemColor.textHighlight);
																														lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Ali Ben Halima\\Desktop\\congrat.jpg"));
																														lblNewLabel_1.setBounds(0, 0, 650, 501);
																														panel_1.add(lblNewLabel_1);
																														
																																JLabel lblNewLabel_2 = new JLabel("New label");
																																lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Ali Ben Halima\\Desktop\\icons8-time-machine-64.png"));
																																lblNewLabel_2.setBounds(217, 243, 46, 65);
																																panel_1.add(lblNewLabel_2);
																																btnNewButton_3.addActionListener(new ActionListener() {
																																	public void actionPerformed(ActionEvent e) {

																																		frame.setContentPane(panel);
																																		i = 0;
																																		j = 0;
																																		seconds = 0;
																																		seconds2 = 0;
																																		total = 0;
																																		btnNewButton.setEnabled(true);
																																		btnNewButton_1.setVisible(false);
																																		btnNewButton_5.setVisible(false);

																																	}
																																});

		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (i == 0) {
					StartA = System.currentTimeMillis();
				}

				if (i < 4) {

					btnNewButton_1.setBounds((int) (Math.random() * (300 - 1)), (int) (Math.random() * (300 - 1)), 48,
							36);

					btnNewButton_1.setBorder(emptyBorder);
					btnNewButton.setEnabled(false);

				} else if (j < 4) {
					btnNewButton_1.setVisible(false);
					if(rdbtnNewRadioButton.isSelected()) {
						frame.setContentPane(panel_1);
						panel_1.setVisible(true);
					}
					EndA = System.currentTimeMillis();
					long result = EndA - StartA;
					seconds = TimeUnit.MILLISECONDS.toSeconds(result);
					// int Seconds = (result % 1000);
					total = seconds + seconds2;
					if (total <= 5) {
						textField.setText(String.valueOf(total) + " s !" + " Too fast !! Good Job!");
					} else if (total >= 5 && total <= 10) {
						textField.setText(String.valueOf(total) + " s !" + " Not Bad, You can do Better");
					} else {
						textField.setText(String.valueOf(total) + " s !" + " Too Slow, Try Harder");
					}
				} else {
					frame.setContentPane(panel_1);
					panel_1.setVisible(true);
					EndA = System.currentTimeMillis();
					long result = EndA - StartA;
					seconds = TimeUnit.MILLISECONDS.toSeconds(result);
					// int Seconds = (result % 1000);
					total = seconds + seconds2;
					if (total <= 5) {
						textField.setText(String.valueOf(total) + " s !" + " Too fast !! Good Job!");
					} else if (total >= 5 && total <= 10) {
						textField.setText(String.valueOf(total) + " s !" + " Not Bad, You can do Better");
					} else {
						textField.setText(String.valueOf(total) + " s !" + " Too Slow, Try Harder");
					}
					// System.out.println(String.valueOf(EndA-StartA));
				}
				i++;
				// btnNewButton_1.removeActionListener(null);
				// btnNewButton.setVisible(false);
			}

		});

		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnNewRadioButton_1.isSelected()) {
					if (j == 0) {
						StartC = System.currentTimeMillis();
					}

					if (j < 4) {

						btnNewButton_5.setBounds((int) (Math.random() * (300 - 1)), (int) (Math.random() * (300 - 1)),
								48, 36);

						btnNewButton_5.setBorder(emptyBorder);
						btnNewButton.setEnabled(false);

					} else if (i < 4) {
						btnNewButton_5.setVisible(false);
						EndC = System.currentTimeMillis();
						long result2 = EndC - StartC;
						seconds2 = TimeUnit.MILLISECONDS.toSeconds(result2);
						total = seconds + seconds2;
						// int Seconds = (result % 1000);
						if (total <= 5) {
							textField.setText(String.valueOf(total) + " s !" + " Too fast !! Good Job!");
						} else if (total >= 5 && total <= 10) {
							textField.setText(String.valueOf(total) + " s !" + " Not Bad, You can do Better");
						} else {
							textField.setText(String.valueOf(total) + " s !" + " Too Slow, Try Harder");
						}
					} else {

						frame.setContentPane(panel_1);
						panel_1.setVisible(true);
						EndC = System.currentTimeMillis();
						long result2 = EndC - StartC;
						seconds2 = TimeUnit.MILLISECONDS.toSeconds(result2);
						total = seconds + seconds2;
						// int Seconds = (result % 1000);
						if (total <= 5) {
							textField.setText(String.valueOf(total) + " s !" + " Too fast !! Good Job!");
						} else if (total >= 5 && total <= 10) {
							textField.setText(String.valueOf(total) + " s !" + " Not Bad, You can do Better");
						} else {
							textField.setText(String.valueOf(total) + " s !" + " Too Slow, Try Harder");
						}
						// System.out.println(String.valueOf(EndA-StartA));
					}
					j++;

				}
			}
		});
	}
}
