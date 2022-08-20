package com.shirzad;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DriverClass implements ActionListener {

	// defining variables
	JFrame frame;
	JPanel pnl;
	JLabel lbl1, lbl2, lbl3, lbl4;
	JLabel £lbl1, £lbl2, £lbl3, lbl5;
	JButton resultBtn, clrBtn, closeBtn;
	JTextField totalTextfield, comissionTextfield, toKeepTextfield, toPayTextField;
	Font myFont = new Font("Vardana", Font.BOLD, 15);

	// constructor
	DriverClass() {
		frame = new JFrame("Comission Percentage System");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(470, 300);
		frame.setLayout(null);

		pnl = new JPanel();
		pnl.setBounds(10, 10, 460, 290);
		pnl.setLayout(null);
		// pnl.setBackground(Color.BLACK);

		lbl1 = new JLabel("Total Amount");
		lbl1.setBounds(10, 10, 100, 50);
		lbl1.setFont(myFont);

		totalTextfield = new JTextField();
		totalTextfield.setBounds(150, 25, 100, 25);
		totalTextfield.setFont(myFont);
		totalTextfield.addActionListener(this);
		totalTextfield.setBorder(javax.swing.BorderFactory.createBevelBorder(1));

		lbl2 = new JLabel("Total Comission");
		lbl2.setBounds(10, 50, 120, 50);
		lbl2.setFont(myFont);

		comissionTextfield = new JTextField();
		comissionTextfield.setBounds(150, 60, 100, 25);
		comissionTextfield.setFont(myFont);
		comissionTextfield.addActionListener(this);
		comissionTextfield.setBorder(javax.swing.BorderFactory.createBevelBorder(1));

		lbl3 = new JLabel("To Keep");
		lbl3.setBounds(10, 85, 120, 50);
		lbl3.setFont(myFont);

		toKeepTextfield = new JTextField();
		toKeepTextfield.setBounds(150, 100, 100, 25);
		toKeepTextfield.setFont(myFont);
		toKeepTextfield.setEditable(false);
		toKeepTextfield.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		toKeepTextfield.setBackground(Color.WHITE);

		lbl4 = new JLabel("To Pay");
		lbl4.setBounds(10, 125, 120, 50);
		lbl4.setFont(myFont);

		toPayTextField = new JTextField();
		toPayTextField.setBounds(150, 140, 100, 25);
		toPayTextField.setFont(myFont);
		toPayTextField.setEditable(false);
		toPayTextField.addActionListener(this);
		toPayTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		toPayTextField.setBackground(Color.WHITE);

		/*
		 *
		 * Labels code here
		 */
		£lbl1 = new JLabel("£");
		£lbl1.setBounds(130, 10, 100, 50);
		£lbl1.setFont(myFont);

		£lbl2 = new JLabel("£");
		£lbl2.setBounds(130, 85, 100, 50);
		£lbl2.setFont(myFont);

		£lbl3 = new JLabel("£");
		£lbl3.setBounds(130, 125, 100, 50);
		£lbl3.setFont(myFont);

		lbl5 = new JLabel("%");
		lbl5.setBounds(250, 50, 100, 50);
		lbl5.setFont(myFont);

		/*
		 * Buttons code here
		 */

		// "Result" button code here
		resultBtn = new JButton("Result");
		resultBtn.setBounds(10, 200, 80, 30);
		resultBtn.addActionListener(this);
		resultBtn.setFocusable(false);
		resultBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder());

		// "Clear" button code here
		clrBtn = new JButton("Clear");
		clrBtn.setBounds(95, 200, 80, 30);
		clrBtn.setFocusable(false);
		clrBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		clrBtn.addActionListener(this);

		// "Close" button code here
		closeBtn = new JButton("Close");
		closeBtn.setBounds(340, 200, 80, 30);
		closeBtn.addActionListener(this);
		closeBtn.setFocusable(false);
		closeBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder());

		// add items to the panel
		pnl.add(totalTextfield);
		pnl.add(comissionTextfield);
		pnl.add(toKeepTextfield);
		pnl.add(toPayTextField);
		pnl.add(lbl1);
		pnl.add(lbl2);
		pnl.add(lbl3);
		pnl.add(lbl4);
		pnl.add(£lbl1);
		pnl.add(£lbl2);
		pnl.add(£lbl3);
		pnl.add(lbl5);
		pnl.add(resultBtn);
		pnl.add(clrBtn);
		pnl.add(closeBtn);
		// add items to the frame
		frame.add(pnl);
		// frame visibility
		frame.setVisible(true);

	}

	// main method
	public static void main(String[] args) {
		new DriverClass();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == resultBtn) {
			double sum1 = 0;
			double sum2 = 0;
			double totalAmount = (int) Double.parseDouble(totalTextfield.getText());
			double comissionAmount = (int) Double.parseDouble(comissionTextfield.getText());
			sum1 = (totalAmount * comissionAmount) / 100;
			// sum2 = (totalAmount * (100 - comissionAmount) / 100);
			sum2 = totalAmount - sum1;
			// System.out.println("i");
			toKeepTextfield.setText(String.valueOf(sum1));
			toPayTextField.setText(String.valueOf(sum2));

		}
		if (e.getSource() == closeBtn) {
			frame.dispose();
		}
		if (e.getSource() == clrBtn) {
			totalTextfield.setText("");
			comissionTextfield.setText("");
			toKeepTextfield.setText("");
			toPayTextField.setText("");
		}

	}

}
