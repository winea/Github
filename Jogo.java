
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class Jogo extends JFrame implements ActionListener {
		JButton [][]b;
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
		p.add(new JButton("9"));  
		p.add(new JButton("8"));
		p.add(new JButton("6"));
		p.add(new JButton("5"));
		p.add(new JButton("2"));
		//p.addActionListener(this);
		getContentPane().add(p,BorderLayout.NORTH );
		p.setBackground(Color.yellow);
		
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
	    tab.setBackground(Color.gray);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void actionPerformed (ActionEvent e) {
		((JButton)e.getSource()).setEnabled(false);
		setBackground( Color.red );
		JOptionPane.showMessageDialog(this, ((JButton) e.getSource()).getText()+" foi clicado");    
		
		
		((JButton)e.getSource()).setText(" oi");   
		setBackground( Color.red );
 	  // setBackground( Color.blue );      
	}       
		
	
	static public void main(String[] args) {
			new Jogo( );
 }
}
