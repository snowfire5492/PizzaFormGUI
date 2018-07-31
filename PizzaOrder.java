import java.awt.event.*;
import java.awt.*;
import javax.swing.*;


public class PizzaOrder implements ActionListener{

	JRadioButton small = new JRadioButton("small");
	JRadioButton medium = new JRadioButton("medium");
	JRadioButton large = new JRadioButton("large");
	
	JCheckBox pepperoni = new JCheckBox("Pepperoni");
	JCheckBox mushrooms = new JCheckBox("Mushrooms");
	
	JButton order = new JButton("Order");
	
	JLabel success = new JLabel("");
	
	
	PizzaOrder(){
		
		ImageIcon icon = new ImageIcon("C://Users//Eric//Desktop//Programs//CS245_JavaSwingGUI//JPizza.png");
		
		
		JFrame frame = new JFrame("Pizza Order Form");
		frame.setSize(400,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		frame.setIconImage(icon.getImage());
		
		frame.setLocationRelativeTo(null);
		
		ButtonGroup sizes = new ButtonGroup();
		sizes.add(small);
		sizes.add(medium);
		sizes.add(large);
		
		order.setMnemonic('o');
		
		JLabel pSize = new JLabel("Sizes:");
		JLabel pTop = new JLabel("Toppings:");
		
		JPanel centerPane = new JPanel();
		centerPane.setLayout(new GridLayout(4,2));
		
		
		JPanel bottomPane = new JPanel();
		
		
		
		centerPane.add(pSize);
		centerPane.add(pTop);
		centerPane.add(small);
		centerPane.add(pepperoni);
		centerPane.add(medium);
		centerPane.add(mushrooms);
		centerPane.add(large);
		
		
		
		bottomPane.add(order);
		
		small.addActionListener(this);
		medium.addActionListener(this);
		large.addActionListener(this);
		
		pepperoni.addActionListener(this);
		mushrooms.addActionListener(this);
		
		order.addActionListener(this);
		
		
		
		
		frame.add(success,BorderLayout.PAGE_START);
		frame.add(centerPane, BorderLayout.CENTER);
		frame.add(bottomPane, BorderLayout.PAGE_END);
		
		
		
		
		
				
		
	}
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		
		String temp = "";
		
		
		if(small.isSelected()){
			temp += "small ";
		}else if(medium.isSelected())
			temp += "medium ";
		else if(large.isSelected())
			temp += "large ";
		
		if(pepperoni.isSelected())
			temp += "pepperoni ";
		if(mushrooms.isSelected())
			temp += "mushroom ";
		
		
		
		if(ae.getActionCommand().equals("Order")){
			
			temp += "pizza ordered!";
			System.out.println(temp);
		}
		
		
	}

	public static void main(String[] args){
		SwingUtilities.invokeLater(() ->				// so display doesnt show up without components loaded
		new PizzaOrder());
	}
}
