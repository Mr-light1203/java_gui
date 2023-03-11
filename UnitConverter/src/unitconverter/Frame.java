package unitconverter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Frame extends JFrame implements ActionListener {
ImageIcon logo = new ImageIcon("converterlogo.png");
Toolkit toolkit = this.getToolkit();
Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
String [] main_comboBox = {"Select a Unit","Length", "Weight", "Temperature", "Time"};
String [] from_comboBox = {};
String [] to_comboBox = {};
JComboBox<Object> comboBox = new JComboBox<Object>(main_comboBox);
JComboBox<Object> from = new JComboBox<Object>(from_comboBox);
JComboBox<Object> to = new JComboBox<Object>(to_comboBox);
JLabel first_label = new JLabel();
JLabel second_label = new JLabel();
JLabel third_label = new JLabel();
JLabel fourth_label = new JLabel();
JLabel fifth_label = new JLabel();
JTextField from_textbox = new JTextField();
JTextField to_textbox = new JTextField();
JButton calculate = new JButton("Convert");
JButton New = new JButton("New");
 Frame(){
 
	this.setSize(350, 400);
	this.setLocation(size.width/2 - this.getWidth()/2, size.height /2- this.getHeight()/2);
	this.setTitle("Unit Converter");
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setResizable(false);
	this.setVisible(true);
	this.setIconImage(logo.getImage());
	this.setLayout(null);
	
	//background
	ImageIcon BG = new ImageIcon("gg.jpg");
	ImageIcon size = new ImageIcon(BG.getImage().getScaledInstance(this.getWidth(), this.getHeight(), java.awt.Image.SCALE_SMOOTH));
	JLabel bg = new JLabel(size);
	bg.setSize(this.getWidth(), this.getHeight());
	this.setContentPane(bg);
	
	//Combo box
	comboBox.setBounds(120, 50, 100, 20);
	comboBox.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
	comboBox.setBackground(Color.WHITE);
	comboBox.setFocusable(false);
	comboBox.addActionListener(this);
	this.add(comboBox);
	
	from.setBounds(25, 130, 115, 20);
	from.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
	from.setBackground(Color.WHITE);
	from.setFocusable(false);
	from.addActionListener(this);
	this.add(from);
	
	to.setBounds(195, 130, 115, 20);
	to.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
	to.setBackground(Color.WHITE);
	to.setFocusable(false);
	to.addActionListener(this);
	this.add(to);
	
	//Labels
	first_label.setText("Unit Converter:");
	first_label.setBounds(125, 20, 125, 20);
	this.add(first_label);
	
	second_label.setText("From: ");
	second_label.setBounds(65, 170, 100, 20);
	this.add(second_label);
	
	third_label.setText("To: ");
	third_label.setBounds(240, 170, 100, 20);
	this.add(third_label);
	
	fourth_label.setText("Select a unit: ");
	fourth_label.setBounds(215, 110, 100, 20);
	this.add(fourth_label);
	
	fifth_label.setText("Select a unit: ");
	fifth_label.setBounds(45, 110, 100, 20);
	this.add(fifth_label);
	//Text Fields
	from_textbox.setBounds(10, 190, 145, 20);
	from_textbox.setHorizontalAlignment(JTextField.LEFT);
	from_textbox.setFont(new Font("Times New Roman", Font.PLAIN, 15));
	from_textbox.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
	from_textbox.setEditable(true);
	this.add(from_textbox);
	
	to_textbox.setBounds(170, 190, 155, 20);
	to_textbox.setHorizontalAlignment(JTextField.LEFT);
	to_textbox.setFont(new Font("Times New Roman", Font.PLAIN, 15));
	to_textbox.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
	to_textbox.setEditable(false);
	this.add(to_textbox);
	
	//buttons
	calculate.setBounds(180, 250, 120, 50);
	calculate.setBackground(Color.WHITE);
	calculate.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
	calculate.setFocusable(false);
	calculate.addActionListener(this);
	this.add(calculate);
	
	New.setBounds(35, 250, 120, 50);
	New.setBackground(Color.WHITE);
	New.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
	New.setFocusable(false);
	New.addActionListener(this);
	this.add(New);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource() == comboBox) {
	 if(comboBox.getSelectedItem().equals("Length")) {
		 from.removeAllItems();
		 from.setSelectedItem(null);
		 from.addItem("Millimeter(s)");
		 from.addItem("Centimeter(s)");
		 from.addItem("Meter(s)");
		 from.addItem("Kilometer(s)");
		 from.addItem("Mile(s)");
		 from.addItem("Yard(s)");
		 from.addItem("Foot/Feet");
		 from.addItem("Inch(es)");
		 
		 to.removeAllItems();
		 to.setSelectedItem(null);
		 to.addItem("Millimeter(s)");
		 to.addItem("Centimeter(s)");
		 to.addItem("Meter(s)");
		 to.addItem("Kilometer(s)");
		 to.addItem("Mile(s)");
		 to.addItem("Yard(s)");
		 to.addItem("Foot/Feet");
		 to.addItem("Inch(es)");
	 }
	 else if (comboBox.getSelectedItem().equals("Weight")) {
		 from.removeAllItems();
		 from.setSelectedItem(null);
		 from.addItem("Milligram(s)");
		 from.addItem("Gram(s)");
		 from.addItem("Kilogram(s)");
		 from.addItem("Pound(s)");
		 from.addItem("Ounce(s)");
		 
		 to.removeAllItems();
		 to.setSelectedItem(null);
		 to.addItem("Milligram(s)");
		 to.addItem("Gram(s)");
		 to.addItem("Kilogram(s)");
		 to.addItem("Pound(s)");
		 to.addItem("Ounce(s)");

		 
	 }
	 else if (comboBox.getSelectedItem().equals("Temperature")) {
		 from.removeAllItems();
		 from.setSelectedItem(null);
		 from.addItem("Celsius");
		 from.addItem("Fahrenheit");
		 from.addItem("Kelvin");
		 
		 to.removeAllItems();
		 to.setSelectedItem(null);
		 to.addItem("Celsius");
		 to.addItem("Fahrenheit");
		 to.addItem("Kelvin");

	 }
	 else if (comboBox.getSelectedItem().equals("Time")) {
		 from.removeAllItems();
		 from.setSelectedItem(null);
		 from.addItem("Millisecond(s)");
		 from.addItem("Second(s)");
		 from.addItem("Minute(s)");
		 from.addItem("Hour(s)");
		 from.addItem("Day(s)");
		 from.addItem("Week(s)");
		 from.addItem("Month(s)");
		 from.addItem("Year(s)");
		 
		 to.removeAllItems();
		 to.setSelectedItem(null);
		 to.addItem("Millisecond(s)");
		 to.addItem("Second(s)");
		 to.addItem("Minute(s)");
		 to.addItem("Hour(s)");
		 to.addItem("Day(s)");
		 to.addItem("Week(s)");
		 to.addItem("Month(s)");
		 to.addItem("Year(s)");
	 }
	 else if (comboBox.getSelectedItem().equals("Select a Unit")) {
		 from.removeAllItems();
		 from.setSelectedItem(null);
		 
		 to.removeAllItems();
		 to.setSelectedItem(null);
		 
	 }
	}
	if(e.getSource() == calculate) {
		//length mm
		if(from.getSelectedItem().equals("Millimeter(s)")&& to.getSelectedItem().equals("Millimeter(s)")) {
			double from_input;
		from_input = Double.parseDouble(from_textbox.getText());
		to_textbox.setText(String.valueOf(String.format("%.8f", from_input)));
		}
		else if (from.getSelectedItem().equals("Millimeter(s)")&& to.getSelectedItem().equals("Centimeter(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input*0.1;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Millimeter(s)")&& to.getSelectedItem().equals("Meter(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());	
		output = from_input/1000;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Millimeter(s)")&& to.getSelectedItem().equals("Kilometer(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input/1000000;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Millimeter(s)")&& to.getSelectedItem().equals("Mile(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input/1609344;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Millimeter(s)")&& to.getSelectedItem().equals("Yard(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input/914.4;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Millimeter(s)")&& to.getSelectedItem().equals("Foot/Feet")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input/304.8;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Millimeter(s)")&& to.getSelectedItem().equals("Inch(es)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input/25.4;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		//length cm
		else if (from.getSelectedItem().equals("Centimeter(s)")&& to.getSelectedItem().equals("Millimeter(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input*10;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Centimeter(s)")&& to.getSelectedItem().equals("Centimeter(s)")) {
			double from_input;
		from_input = Double.parseDouble(from_textbox.getText());	
		to_textbox.setText(String.valueOf(String.format("%.8f", from_input)));
		}
		else if (from.getSelectedItem().equals("Centimeter(s)")&& to.getSelectedItem().equals("Meter(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());	
		output = from_input/100;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Centimeter(s)")&& to.getSelectedItem().equals("Kilometer(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input/100000;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Centimeter(s)")&& to.getSelectedItem().equals("Mile(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());	
		output = from_input/160900;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Centimeter(s)")&& to.getSelectedItem().equals("Yard(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input/91.44;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Centimeter(s)")&& to.getSelectedItem().equals("Foot/Feet")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input/30.48;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Centimeter(s)")&& to.getSelectedItem().equals("Inch(es)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input/2.54;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		//length m
		else if (from.getSelectedItem().equals("Meter(s)")&& to.getSelectedItem().equals("Millimeter(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input*1000;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Meter(s)")&& to.getSelectedItem().equals("Centimeter(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input*100;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Meter(s)")&& to.getSelectedItem().equals("Meter(s)")) {
			double from_input;
		from_input = Double.parseDouble(from_textbox.getText());	
		to_textbox.setText(String.valueOf(String.format("%.8f", from_input)));
		}
		else if (from.getSelectedItem().equals("Meter(s)")&& to.getSelectedItem().equals("Kilometer(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input/1000;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Meter(s)")&& to.getSelectedItem().equals("Mile(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input/1609;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Meter(s)")&& to.getSelectedItem().equals("Yard(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input*1.094;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Meter(s)")&& to.getSelectedItem().equals("Foot/Feet")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input*3.281;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Meter(s)")&& to.getSelectedItem().equals("Inch(es)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input*39.37;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		//length km
		else if (from.getSelectedItem().equals("Kilometer(s)")&& to.getSelectedItem().equals("Millimeter(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input*1000000;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Kilometer(s)")&& to.getSelectedItem().equals("Centimeter(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input*100000;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Kilometer(s)")&& to.getSelectedItem().equals("Meter(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input*1000;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Kilometer(s)")&& to.getSelectedItem().equals("Kilometer(s)")) {
			double from_input;
		from_input = Double.parseDouble(from_textbox.getText());	
		to_textbox.setText(String.valueOf(String.format("%.8f", from_input)));
		}
		else if (from.getSelectedItem().equals("Kilometer(s)")&& to.getSelectedItem().equals("Mile(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input/1.609;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Kilometer(s)")&& to.getSelectedItem().equals("Yard(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input*1094;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Kilometer(s)")&& to.getSelectedItem().equals("Foot/Feet")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input*3281.84;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Kilometer(s)")&& to.getSelectedItem().equals("Inch(es)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input*39370.1;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		//length miles
		else if (from.getSelectedItem().equals("Mile(s)")&& to.getSelectedItem().equals("Millimeter(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input*1.609e+6;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Mile(s)")&& to.getSelectedItem().equals("Centimeter(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input*160934;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Mile(s)")&& to.getSelectedItem().equals("Meter(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input*1609.34;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Mile(s)")&& to.getSelectedItem().equals("Kilometer(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input*1.60934;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Mile(s)")&& to.getSelectedItem().equals("Mile(s)")) {
			double from_input;
		from_input = Double.parseDouble(from_textbox.getText());	
		to_textbox.setText(String.valueOf(String.format("%.8f", from_input)));
		}
		else if (from.getSelectedItem().equals("Mile(s)")&& to.getSelectedItem().equals("Yard(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input*1760;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Mile(s)")&& to.getSelectedItem().equals("Foot/Feet")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input*5280;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Mile(s)")&& to.getSelectedItem().equals("Inch(es)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input*63360;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		//length yard
		else if (from.getSelectedItem().equals("Yard(s)")&& to.getSelectedItem().equals("Millimeter(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input*914.4;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Yard(s)")&& to.getSelectedItem().equals("Centimeter(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input*91.44;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Yard(s)")&& to.getSelectedItem().equals("Meter(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input/0.9144;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Yard(s)")&& to.getSelectedItem().equals("Kilometer(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input/0.0009144;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Yard(s)")&& to.getSelectedItem().equals("Mile(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input/0.000568182;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Yard(s)")&& to.getSelectedItem().equals("Yard(s)")) {
			double from_input;
		from_input = Double.parseDouble(from_textbox.getText());	
		to_textbox.setText(String.valueOf(String.format("%.8f", from_input)));
		}
		else if (from.getSelectedItem().equals("Yard(s)")&& to.getSelectedItem().equals("Foot/Feet")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input*3;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Yard(s)")&& to.getSelectedItem().equals("Inch(es)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input*36;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		// length foot/feet
		else if (from.getSelectedItem().equals("Foot/Feet")&& to.getSelectedItem().equals("Millimeter(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input*304.8;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Foot/Feet")&& to.getSelectedItem().equals("Centimeter(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input*30.48;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Foot/Feet")&& to.getSelectedItem().equals("Meter(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input/3.281;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Foot/Feet")&& to.getSelectedItem().equals("Kilometer(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input/3281;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Foot/Feet")&& to.getSelectedItem().equals("Mile(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input/5280;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Foot/Feet")&& to.getSelectedItem().equals("Yard(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input/3;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Foot/Feet")&& to.getSelectedItem().equals("Foot/Feet")) {
			double from_input;
		from_input = Double.parseDouble(from_textbox.getText());	
		to_textbox.setText(String.valueOf(String.format("%.8f", from_input)));
		}
		else if (from.getSelectedItem().equals("Foot/Feet")&& to.getSelectedItem().equals("Inch(es)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input*12;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		//length inch
		else if (from.getSelectedItem().equals("Inch(es)")&& to.getSelectedItem().equals("Millimeter(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input*25.4;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Inch(es)")&& to.getSelectedItem().equals("Centimeter(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input* 2.54;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Inch(es)")&& to.getSelectedItem().equals("Meter(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input/0.0254;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Inch(es)")&& to.getSelectedItem().equals("Kilometer(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input/39370;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Inch(es)")&& to.getSelectedItem().equals("Mile(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input/1.57828e-5;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Inch(es)")&& to.getSelectedItem().equals("Mile(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input/63360;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Inch(es)")&& to.getSelectedItem().equals("Yard(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input/36;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Inch(es)")&& to.getSelectedItem().equals("Foot/Feet")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input/12;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Inch(es)")&& to.getSelectedItem().equals("Inch(es)")) {
			double from_input;
		from_input = Double.parseDouble(from_textbox.getText());	
		to_textbox.setText(String.valueOf(String.format("%.8f", from_input)));
		}
		//weight milligram
		else if (from.getSelectedItem().equals("Milligram(s)")&& to.getSelectedItem().equals("Milligram(s)")) {
			double from_input;
		from_input = Double.parseDouble(from_textbox.getText());	
		to_textbox.setText(String.valueOf(String.format("%.8f", from_input)));
		}
		else if (from.getSelectedItem().equals("Milligram(s)")&& to.getSelectedItem().equals("Gram(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input/1000;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Milligram(s)")&& to.getSelectedItem().equals("Kilogram(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input/1e+6;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Milligram(s)")&& to.getSelectedItem().equals("Pound(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input/453600;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Milligram(s)")&& to.getSelectedItem().equals("Ounce(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input/28350;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		//weight grams
		else if (from.getSelectedItem().equals("Gram(s)")&& to.getSelectedItem().equals("Milligram(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input*1000;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Gram(s)")&& to.getSelectedItem().equals("Gram(s)")) {
			double from_input;
		from_input = Double.parseDouble(from_textbox.getText());	
		to_textbox.setText(String.valueOf(String.format("%.8f", from_input)));
		}
		else if (from.getSelectedItem().equals("Gram(s)")&& to.getSelectedItem().equals("Kilogram(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input/1000;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Gram(s)")&& to.getSelectedItem().equals("Pound(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input/453.6;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Gram(s)")&& to.getSelectedItem().equals("Ounce(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input/28.35;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		//weight Kilograms
		else if (from.getSelectedItem().equals("Kilogram(s)")&& to.getSelectedItem().equals("Milligram(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input*1e+6;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Kilogram(s)")&& to.getSelectedItem().equals("Gram(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input*1000;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Kilogram(s)")&& to.getSelectedItem().equals("Kilogram(s)")) {
			double from_input;
		from_input = Double.parseDouble(from_textbox.getText());	
		to_textbox.setText(String.valueOf(String.format("%.8f", from_input)));
		}
		else if (from.getSelectedItem().equals("Kilogram(s)")&& to.getSelectedItem().equals("Pound(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input*2.205;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Kilogram(s)")&& to.getSelectedItem().equals("Ounce(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input*35.274;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		//weight pounds
		else if (from.getSelectedItem().equals("Pound(s)")&& to.getSelectedItem().equals("Milligram(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input*453600;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Pound(s)")&& to.getSelectedItem().equals("Gram(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input*453.6;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Pound(s)")&& to.getSelectedItem().equals("Kilogram(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input/2.205;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Pound(s)")&& to.getSelectedItem().equals("Pound(s)")) {
			double from_input;
		from_input = Double.parseDouble(from_textbox.getText());	
		to_textbox.setText(String.valueOf(String.format("%.8f", from_input)));
		}
		else if (from.getSelectedItem().equals("Pound(s)")&& to.getSelectedItem().equals("Ounce(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input*16;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		//weight ounces
		else if (from.getSelectedItem().equals("Ounce(s)")&& to.getSelectedItem().equals("Milligram(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input*28350;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Ounce(s)")&& to.getSelectedItem().equals("Gram(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input*28.35;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Ounce(s)")&& to.getSelectedItem().equals("Kilogram(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input/35.274;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Ounce(s)")&& to.getSelectedItem().equals("Pound(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input/16;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Ounce(s)")&& to.getSelectedItem().equals("Ounce(s)")) {
			double from_input;
		from_input = Double.parseDouble(from_textbox.getText());	
		to_textbox.setText(String.valueOf(String.format("%.8f", from_input)));
		}
		//Temperature Celsius
		else if (from.getSelectedItem().equals("Celsius")&& to.getSelectedItem().equals("Celsius")) {
			double from_input;
		from_input = Double.parseDouble(from_textbox.getText());	
		to_textbox.setText(String.valueOf(String.format("%.8f", from_input)));
		}
		else if (from.getSelectedItem().equals("Celsius")&& to.getSelectedItem().equals("Fahrenheit")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = (from_input*1.8)+32;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Celsius")&& to.getSelectedItem().equals("Kelvin")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input+273.15;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		//Temperature Fahrenheit
		else if (from.getSelectedItem().equals("Fahrenheit")&& to.getSelectedItem().equals("Celsius")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = (from_input-32)*1.8;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Fahrenheit")&& to.getSelectedItem().equals("Fahrenheit")) {
			double from_input;
		from_input = Double.parseDouble(from_textbox.getText());	
		to_textbox.setText(String.valueOf(String.format("%.8f", from_input)));
		}
		else if (from.getSelectedItem().equals("Fahrenheit")&& to.getSelectedItem().equals("Kelvin")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = (from_input-32)*1.8+273.15;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		// Temperature Kelvin
		else if (from.getSelectedItem().equals("Kelvin")&& to.getSelectedItem().equals("Celsius")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input-273.15;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Kelvin")&& to.getSelectedItem().equals("Fahrenheit")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = (from_input-273.15)*1.8+32;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Kelvin")&& to.getSelectedItem().equals("Kelvin")) {
			double from_input;
		from_input = Double.parseDouble(from_textbox.getText());	
		to_textbox.setText(String.valueOf(String.format("%.8f", from_input)));
		}
		// time milliseconds
		else if (from.getSelectedItem().equals("Millisecond(s)")&& to.getSelectedItem().equals("Millisecond(s)")) {
			double from_input;
		from_input = Double.parseDouble(from_textbox.getText());	
		to_textbox.setText(String.valueOf(String.format("%.8f", from_input)));
		}
		else if (from.getSelectedItem().equals("Millisecond(s)")&& to.getSelectedItem().equals("Second(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input/1000;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Millisecond(s)")&& to.getSelectedItem().equals("Minute(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input/60000;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Millisecond(s)")&& to.getSelectedItem().equals("Hour(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input/3.6e+6;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Millisecond(s)")&& to.getSelectedItem().equals("Day(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input/8.64e+7;
		to_textbox.setText(String.valueOf(output));
		}
		else if (from.getSelectedItem().equals("Millisecond(s)")&& to.getSelectedItem().equals("Week(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input/6.048e+8;
		to_textbox.setText(String.valueOf(output));
		}
		else if (from.getSelectedItem().equals("Millisecond(s)")&& to.getSelectedItem().equals("Month(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input/2.628e+9;
		to_textbox.setText(String.valueOf(output));
		}
		else if (from.getSelectedItem().equals("Millisecond(s)")&& to.getSelectedItem().equals("Year(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input/3.154e+10;
		to_textbox.setText(String.valueOf(output));
		}
		//time seconds
		else if (from.getSelectedItem().equals("Second(s)")&& to.getSelectedItem().equals("Millisecond(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input*1000;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Second(s)")&& to.getSelectedItem().equals("Second(s)")) {
			double from_input;
		from_input = Double.parseDouble(from_textbox.getText());	
		to_textbox.setText(String.valueOf(String.format("%.8f", from_input)));
		}
		else if (from.getSelectedItem().equals("Second(s)")&& to.getSelectedItem().equals("Minute(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input/60;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Second(s)")&& to.getSelectedItem().equals("Hour(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input/3600;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Second(s)")&& to.getSelectedItem().equals("Day(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input/86400;
		to_textbox.setText(String.valueOf(output));
		}
		else if (from.getSelectedItem().equals("Second(s)")&& to.getSelectedItem().equals("Week(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input/604800;
		to_textbox.setText(String.valueOf(output));
		}
		else if (from.getSelectedItem().equals("Second(s)")&& to.getSelectedItem().equals("Month(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input/2.628e+6;
		to_textbox.setText(String.valueOf(output));
		}
		else if (from.getSelectedItem().equals("Second(s)")&& to.getSelectedItem().equals("Year(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input/3.154e+7;
		to_textbox.setText(String.valueOf(output));
		}
		//time minutes
		else if (from.getSelectedItem().equals("Minute(s)")&& to.getSelectedItem().equals("Millisecond(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input*60000;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Minute(s)")&& to.getSelectedItem().equals("Second(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input*60;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Minute(s)")&& to.getSelectedItem().equals("Minute(s)")) {
			double from_input;
		from_input = Double.parseDouble(from_textbox.getText());	
		to_textbox.setText(String.valueOf(String.format("%.8f", from_input)));
		}
		else if (from.getSelectedItem().equals("Minute(s)")&& to.getSelectedItem().equals("Hour(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input/60;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Minute(s)")&& to.getSelectedItem().equals("Day(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input/1440;
		to_textbox.setText(String.valueOf(output));
		}
		else if (from.getSelectedItem().equals("Minute(s)")&& to.getSelectedItem().equals("Week(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input/10080;
		to_textbox.setText(String.valueOf(output));
		}
		else if (from.getSelectedItem().equals("Minute(s)")&& to.getSelectedItem().equals("Month(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input/43800;
		to_textbox.setText(String.valueOf(output));
		}
		else if (from.getSelectedItem().equals("Minute(s)")&& to.getSelectedItem().equals("Year(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input/525600;
		to_textbox.setText(String.valueOf(output));
		}
		//Time hour
		else if (from.getSelectedItem().equals("Hour(s)")&& to.getSelectedItem().equals("Millisecond(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input*3.6e+6;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Hour(s)")&& to.getSelectedItem().equals("Second(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input*3600;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Hour(s)")&& to.getSelectedItem().equals("Minute(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input*60;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Hour(s)")&& to.getSelectedItem().equals("Hour(s)")) {
			double from_input;
		from_input = Double.parseDouble(from_textbox.getText());	
		to_textbox.setText(String.valueOf(String.format("%.8f", from_input)));
		}
		else if (from.getSelectedItem().equals("Hour(s)")&& to.getSelectedItem().equals("Day(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input/24;
		to_textbox.setText(String.valueOf(output));
		}
		else if (from.getSelectedItem().equals("Hour(s)")&& to.getSelectedItem().equals("Week(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input/168;
		to_textbox.setText(String.valueOf(output));
		}
		else if (from.getSelectedItem().equals("Hour(s)")&& to.getSelectedItem().equals("Month(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input/730;
		to_textbox.setText(String.valueOf(output));
		}
		else if (from.getSelectedItem().equals("Hour(s)")&& to.getSelectedItem().equals("Year(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input/8760;
		to_textbox.setText(String.valueOf(output));
		}
		// time days
		else if (from.getSelectedItem().equals("Day(s)")&& to.getSelectedItem().equals("Millisecond(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input*8.64e+7;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Day(s)")&& to.getSelectedItem().equals("Second(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input*86400;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Day(s)")&& to.getSelectedItem().equals("Minute(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input*1440;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Day(s)")&& to.getSelectedItem().equals("Hour(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input*24;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Day(s)")&& to.getSelectedItem().equals("Day(s)")) {
			double from_input;
		from_input = Double.parseDouble(from_textbox.getText());	
		to_textbox.setText(String.valueOf(String.format("%.8f", from_input)));
		}
		else if (from.getSelectedItem().equals("Day(s)")&& to.getSelectedItem().equals("Week(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input/7;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Day(s)")&& to.getSelectedItem().equals("Month(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input/30.417;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Day(s)")&& to.getSelectedItem().equals("Year(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input/365;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		//time week
		else if (from.getSelectedItem().equals("Week(s)")&& to.getSelectedItem().equals("Millisecond(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input*6.048e+8;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Week(s)")&& to.getSelectedItem().equals("Second(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input*604800;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Week(s)")&& to.getSelectedItem().equals("Minute(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input*10080;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Week(s)")&& to.getSelectedItem().equals("Hour(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input*168;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Week(s)")&& to.getSelectedItem().equals("Day(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input*7;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Week(s)")&& to.getSelectedItem().equals("Week(s)")) {
			double from_input;
		from_input = Double.parseDouble(from_textbox.getText());	
		to_textbox.setText(String.valueOf(String.format("%.8f", from_input)));
		}
		else if (from.getSelectedItem().equals("Week(s)")&& to.getSelectedItem().equals("Month(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input/4.345;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Week(s)")&& to.getSelectedItem().equals("Year(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input/52.143;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		//time month
		else if (from.getSelectedItem().equals("Month(s)")&& to.getSelectedItem().equals("Millisecond(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input*2.628e+9;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Month(s)")&& to.getSelectedItem().equals("Second(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input*2.628e+6;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Month(s)")&& to.getSelectedItem().equals("Minute(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input*43800;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Month(s)")&& to.getSelectedItem().equals("Hour(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input*730;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Month(s)")&& to.getSelectedItem().equals("Day(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input*30.417;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Month(s)")&& to.getSelectedItem().equals("Week(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input*4.345;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Month(s)")&& to.getSelectedItem().equals("Month(s)")) {
			double from_input;
		from_input = Double.parseDouble(from_textbox.getText());	
		to_textbox.setText(String.valueOf(String.format("%.8f", from_input)));
		}
		else if (from.getSelectedItem().equals("Month(s)")&& to.getSelectedItem().equals("Year(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input/12;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		//Time years
		else if (from.getSelectedItem().equals("Year(s)")&& to.getSelectedItem().equals("Millisecond(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input*3.154e+10;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Year(s)")&& to.getSelectedItem().equals("Second(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input*3.154e+7;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Year(s)")&& to.getSelectedItem().equals("Minute(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input*525600;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Year(s)")&& to.getSelectedItem().equals("Hour(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input*8760;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Year(s)")&& to.getSelectedItem().equals("Day(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input*365;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Year(s)")&& to.getSelectedItem().equals("Week(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input*52.143;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Year(s)")&& to.getSelectedItem().equals("Month(s)")) {
			double from_input, output;
		from_input = Double.parseDouble(from_textbox.getText());
		output = from_input*12;
		to_textbox.setText(String.valueOf(String.format("%.8f", output)));
		}
		else if (from.getSelectedItem().equals("Year(s)")&& to.getSelectedItem().equals("Year(s)")) {
			double from_input;
		from_input = Double.parseDouble(from_textbox.getText());	
		to_textbox.setText(String.valueOf(String.format("%.8f", from_input)));
		}	
	}

	if (e.getSource()== New) {
		from_textbox.setText("");
		to_textbox.setText("");	
}
}
}
