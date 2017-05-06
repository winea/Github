
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class Jogo extends JFrame implements ActionListener {
		JButton [][]b;
		JButton bt1,bt2,bt3,bt4,bt5;
		JLabel l1,l2;
		JPanel p;
		JPanel tab;
		
		
		Jogo( ) {
		super("Jogo Soma 28");
		setSize(600,600); //tamanho janela
		Tela();
		setVisible(true);
	}
		
		public void Tela(){
		JPanel p = new JPanel(new FlowLayout());
		p.add(l1 = new JLabel ("   Player 1: 0      "));
		p.add(bt1 = new JButton("9"));  
		p.add(bt2 = new JButton("8"));
		p.add(bt3 = new JButton("6"));
		p.add(bt4 = new JButton("5"));
		p.add(bt5 = new JButton("2"));
		p.add(l2 = new JLabel ("       Player 2: 0    "));
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		bt3.addActionListener(this);
		bt4.addActionListener(this);
		bt5.addActionListener(this);
		getContentPane().add(p,BorderLayout.NORTH );
		p.setBackground(Color.cyan);
	    
	    
	    tab = new JPanel(new GridLayout (4,4));
		b= new JButton [4][4];

		int x =100;
		for(int i=0;i<4;i++){
			int y=100;
			for (int j=0;j<4;j++){
				b[i][j]=new JButton("");
				b[i][j].addActionListener(this);
				getContentPane().add(b[i][j]).setBounds(x,y,60,60);
				y=y+100;
				}
				x=x+100;
			}
		
	    getContentPane().add(tab,BorderLayout.CENTER );
	    tab.setBackground(Color.lightGray);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void actionPerformed (ActionEvent e) {
		if (e.getSource()==bt1) {
			
			
			}
		
		((JButton)e.getSource()).setEnabled(false);
		setBackground( Color.red );
		JOptionPane.showMessageDialog(this, ((JButton) e.getSource()).getText()+" foi clicado");    
		
		
		((JButton)e.getSource()).setText(" oi");   
		setBackground( Color.red );
 	  // painel2.setBackground( Color.blue );      
	}       
		
	/*public void Score() {
   if (){
   l1= l1+100;
	}
   else {
   l2= l2+100;
	}
	l1.setBounds(5, 5, WIDTH, HEIGHT);
	l1.setText("Score: " + l1);
	l2.setBounds(5, 5, WIDTH, HEIGHT);
	l2.setText("Score: " + l2);
  
	}
	*/
	static public void main(String[] args) {
			new Jogo( );
 }
}
