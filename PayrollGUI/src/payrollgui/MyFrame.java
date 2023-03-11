package payrollgui;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.*;
public class MyFrame extends JFrame implements ActionListener{
JTextField rphtext, hpdtext, nOdwtext, gstext, taxtext;
JTextField phhtext, ssstext, pgbgtext, nametext, idtext;
JTextField totaltext, nstext, ottext;
//button
JButton button = new JButton("Calculate");
JButton nb = new JButton("New");
	MyFrame(){
		JFrame frame = new JFrame();
		Toolkit toolkit = frame.getToolkit();
		Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
		ImageIcon logo = new ImageIcon("payrolllogo.png");
		
		
//Label
		JLabel rph = new JLabel();
		JLabel hpd = new JLabel();
		JLabel nOdw = new JLabel();
		JLabel bs = new JLabel();
		JLabel tax = new JLabel();
		JLabel phh = new JLabel();
		JLabel sss = new JLabel();
		JLabel pgbg = new JLabel();
		JLabel total = new JLabel();
		JLabel ns = new JLabel();
		JLabel heading = new JLabel();
		JLabel ot = new JLabel();
		JLabel name = new JLabel();
		JLabel id = new JLabel();
//Text fields
		rphtext = new JTextField();
		hpdtext = new JTextField();
		nOdwtext = new JTextField();
		gstext = new JTextField();
		taxtext = new JTextField();
		phhtext = new JTextField();
		ssstext = new JTextField();
		pgbgtext = new JTextField();
		totaltext = new JTextField();
		nstext = new JTextField();
		ottext = new JTextField();
		nametext = new JTextField();
		idtext = new JTextField();
		//Frame
		frame.setSize(800, 600);
		frame.setLocation(size.width/2 - frame.getWidth()/2, size.height /2- frame.getHeight()/2);
		frame.setTitle("Payroll Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setIconImage(logo.getImage());
		frame.getContentPane().setBackground(new Color(233,225,225));
		
//label editing
		heading.setText("PAYROLL CALCULATOR");
		heading.setBounds(295, 20, 220, 100);
		heading.setHorizontalAlignment(JLabel.RIGHT);
		heading.setVerticalAlignment(JLabel.TOP);
		heading.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		name.setText("Employee Name: ");
		name.setBounds(40, 81, 120, 100);
		name.setHorizontalAlignment(JLabel.LEFT);
		name.setVerticalAlignment(JLabel.TOP);
		
		id.setText("Employee ID : ");
		id.setBounds(40, 121, 120, 100);
		id.setHorizontalAlignment(JLabel.LEFT);
		id.setVerticalAlignment(JLabel.TOP);
		
		
		rph.setText("Rate Per Hour : PHP");
		rph.setBounds(40, 161, 120, 100);
		rph.setHorizontalAlignment(JLabel.LEFT);
		rph.setVerticalAlignment(JLabel.TOP);
		
		hpd.setText("Hour Per Day :");
		hpd.setBounds(40, 201, 100, 100);
		hpd.setHorizontalAlignment(JLabel.LEFT);
		hpd.setVerticalAlignment(JLabel.TOP);
		
		nOdw.setText("Working days :");
		nOdw.setBounds(40, 241, 150, 100);
		nOdw.setHorizontalAlignment(JLabel.LEFT);
		nOdw.setVerticalAlignment(JLabel.TOP);
		
		ot.setText("Over Time :");
		ot.setBounds(40, 281, 150, 100);
		ot.setHorizontalAlignment(JLabel.LEFT);
		ot.setVerticalAlignment(JLabel.TOP);
		
		
		bs.setText("Gross salary : PHP");
		bs.setBounds(40, 321, 125, 100);
		bs.setHorizontalAlignment(JLabel.LEFT);
		bs.setVerticalAlignment(JLabel.TOP);
		
		tax.setText("Tax 10% of monthly wage : PHP");
		tax.setBounds(418, 121, 180, 100);
		tax.setHorizontalAlignment(JLabel.LEFT);
		tax.setVerticalAlignment(JLabel.TOP);
		
		phh.setText("Philhealth 5% : PHP");
		phh.setBounds(482, 161, 180, 100);
		phh.setHorizontalAlignment(JLabel.LEFT);
		phh.setVerticalAlignment(JLabel.TOP);
		
		sss.setText("SSS 5% : PHP");
		sss.setBounds(518, 81, 180, 100);
		sss.setHorizontalAlignment(JLabel.LEFT);
		sss.setVerticalAlignment(JLabel.TOP);
		
		pgbg.setText("Pag-ibig 3% : PHP");
		pgbg.setBounds(495, 201, 180, 100);
		pgbg.setHorizontalAlignment(JLabel.LEFT);
		pgbg.setVerticalAlignment(JLabel.TOP);
		
		total.setText("Total Deduction : PHP");
		total.setBounds(473, 241, 180, 100);
		total.setHorizontalAlignment(JLabel.LEFT);
		total.setVerticalAlignment(JLabel.TOP);
		
		ns.setText("Net Salary : PHP");
		ns.setBounds(40, 361, 180, 100);
		ns.setHorizontalAlignment(JLabel.LEFT);
		ns.setVerticalAlignment(JLabel.TOP);
//Adding Text
		frame.add(heading);
		frame.add(rph);
		frame.add(hpd);
		frame.add(nOdw);
		frame.add(bs);
		frame.add(tax);
		frame.add(phh);
		frame.add(sss);
		frame.add(pgbg);
		frame.add(total);
		frame.add(ns);
		frame.add(ot);
		frame.add(name);
		frame.add(id);
//text box editing
		rphtext.setBounds(160, 160, 145, 20);
		rphtext.setHorizontalAlignment(JTextField.LEFT);
		rphtext.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		rphtext.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		rphtext.setEditable(true);
		
		hpdtext.setBounds(160, 200, 145, 20);
		hpdtext.setHorizontalAlignment(JTextField.LEFT);
		hpdtext.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		hpdtext.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		hpdtext.setEditable(true);
		
		nOdwtext.setBounds(160, 240, 145, 20);
		nOdwtext.setHorizontalAlignment(JTextField.LEFT);
		nOdwtext.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		nOdwtext.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		nOdwtext.setEditable(true);
		
		ottext.setBounds(160, 280, 145, 20);
		ottext.setHorizontalAlignment(JTextField.LEFT);
		ottext.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		ottext.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		ottext.setEditable(true);
		
		gstext.setBounds(160, 320, 145, 20);
		gstext.setHorizontalAlignment(JTextField.LEFT);
		gstext.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		gstext.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		gstext.setEditable(false);
		
		taxtext.setBounds(600, 120, 145, 20);
		taxtext.setHorizontalAlignment(JTextField.LEFT);
		taxtext.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		taxtext.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		taxtext.setEditable(false);
		
		phhtext.setBounds(600, 160, 145, 20);
		phhtext.setHorizontalAlignment(JTextField.LEFT);
		phhtext.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		phhtext.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		phhtext.setEditable(false);
		
		ssstext.setBounds(600, 80, 145, 20);
		ssstext.setHorizontalAlignment(JTextField.LEFT);
		ssstext.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		ssstext.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		ssstext.setEditable(false);
		
		pgbgtext.setBounds(600, 200, 145, 20);
		pgbgtext.setHorizontalAlignment(JTextField.LEFT);
		pgbgtext.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		pgbgtext.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		pgbgtext.setEditable(false);
		
		totaltext.setBounds(600, 240, 145, 20);
		totaltext.setHorizontalAlignment(JTextField.LEFT);
		totaltext.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		totaltext.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		totaltext.setEditable(false);
		
		nstext.setBounds(160, 360, 145, 20);
		nstext.setHorizontalAlignment(JTextField.LEFT);
		nstext.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		nstext.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		nstext.setEditable(false);
		
		nametext.setBounds(160, 80, 145, 20);
		nametext.setHorizontalAlignment(JTextField.LEFT);
		nametext.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		nametext.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		nametext.setEditable(true);
		
		idtext.setBounds(160, 120, 145, 20);
		idtext.setHorizontalAlignment(JTextField.LEFT);
		idtext.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		idtext.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		idtext.setEditable(true);
		
//adding text box		
		frame.add(rphtext);
		frame.add(hpdtext);
		frame.add(nOdwtext);
		frame.add(gstext);
		frame.add(taxtext);
		frame.add(phhtext);
		frame.add(ssstext);
		frame.add(pgbgtext);
		frame.add(totaltext);
		frame.add(nstext);
		frame.add(ottext);
		frame.add(nametext);
		frame.add(idtext);
//button editing
		frame.add(button);
		button.setBounds(600, 370, 120, 120);
		button.setBackground(Color.white);
		button.setFocusable(false);
		button.addActionListener(this);
		
		frame.add(nb);
		nb.setBounds(450, 370, 120, 120);
		nb.setBackground(Color.white);
		nb.setFocusable(false);
		nb.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	if (e.getSource()== button) {
		
		double input1, input2, input3, input4, gross_pay;
		double net_sal, sss_comp, tax_comp, phh_comp;
		double pgbg_comp, td_comp, ot_comp;
		input1 = Double.parseDouble(rphtext.getText());
		input2 = Double.parseDouble(hpdtext.getText());
		input3 = Double.parseDouble(nOdwtext.getText());
		input4 = Double.parseDouble(ottext.getText());
		
		ot_comp = input1*input4;
		gross_pay = input1 * input2 * input3 + ot_comp;
		gstext.setText(String.valueOf(String.format("%.2f", gross_pay)));
		
		sss_comp = gross_pay*0.05;
		tax_comp = gross_pay*0.10;
		phh_comp = gross_pay*0.05;
		pgbg_comp = gross_pay*0.03;
		td_comp = sss_comp + tax_comp + phh_comp + pgbg_comp;
		net_sal = gross_pay + ot_comp - td_comp;
		
		
		ssstext.setText(String.valueOf(String.format("%.2f", sss_comp)));
		taxtext.setText(String.valueOf(String.format("%.2f", tax_comp)));
		phhtext.setText(String.valueOf(String.format("%.2f", phh_comp)));
		pgbgtext.setText(String.valueOf(String.format("%.2f", pgbg_comp)));
		totaltext.setText(String.valueOf(String.format("%.2f", td_comp)));
		nstext.setText(String.valueOf(String.format("%.2f", net_sal)));
		
	}
	if (e.getSource()== nb) {
		rphtext.setText("");
		hpdtext.setText("");
		nOdwtext.setText("");
		gstext.setText("");
		taxtext.setText("");
		phhtext.setText("");
		ssstext.setText("");
		pgbgtext.setText("");
		nametext.setText("");
		idtext.setText("");
		totaltext.setText("");
		nstext.setText("");
		ottext.setText("");
		
		
	}
	}
}	