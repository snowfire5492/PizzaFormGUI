import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.util.Date;
									
public class BetterPizzaOrderForm extends JFrame implements ActionListener{
	
	JRadioButton small = new JRadioButton("small");
	JRadioButton med = new JRadioButton("medium");
	JRadioButton large = new JRadioButton("large");
	
	JCheckBox pep	= new JCheckBox("pepperoni");
	JCheckBox mush	= new JCheckBox("mushrooms");
	
	JButton order = new JButton("Order");
	
	
	public BetterPizzaOrderForm(){
		setSize(400,275);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Pizza Delivery");
		
		order.setMnemonic('O');
		
		setIconImage(new ImageIcon("C://Users//Eric//Desktop//Programs//CS245_JavaSwingGUI//JPizza.png").getImage());
		
		ButtonGroup btgp = new ButtonGroup();
		btgp.add(small);
		btgp.add(med);
		btgp.add(large);
		
		small.addActionListener(this);
		med.addActionListener(this);
		large.addActionListener(this);
		
		pep.addActionListener(this);
		mush.addActionListener(this);
		
		order.addActionListener(this);
		
		JLabel sizes = new JLabel("sizes: ");
		JLabel toppings = new JLabel("toppings: ");
		
		
		JPanel gridPan = new JPanel(new GridLayout(4,2));
		JPanel bttnPan	= new JPanel();
		
		bttnPan.add(order);
		
		gridPan.add(sizes);
		gridPan.add(toppings);
		gridPan.add(small);
		gridPan.add(pep);
		gridPan.add(med	);
		gridPan.add(mush);
		gridPan.add(large);
		
		add(gridPan, BorderLayout.CENTER);
		
		add(bttnPan, BorderLayout.PAGE_END);
		
		
		
	}
	
	
	public void actionPerformed(ActionEvent ae){
		
		String temp = "";
		
		if(small.isSelected()){
			temp += "small ";
		}else if(med.isSelected()){
			temp += "med ";
		}else if(large.isSelected()){
			temp += "large ";
		}
		
		
		if(pep.isSelected())
			temp += "pepperoni ";
		if(mush.isSelected()){
			temp += "mushroom ";
		}
		
		if(ae.getActionCommand().equals("Order")){
			System.out.println(temp + "pizza ordered!");
		}
		
		
	}
	
	public static void main(String[] args){
		SwingUtilities.invokeLater(() ->
		new BetterPizzaOrderForm());
	}
	
	
	
}
