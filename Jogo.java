


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class Jogo extends JFrame implements ActionListener {

		//teste1
		
		JButton [][]b;
		JButton bt9,bt8,bt6,bt5,bt2;
		JLabel l1,l2;
		JPanel p;
		JPanel tab;
		int i=0,j=0;
		int qt9=6, qt8=3, qt6=2, qt5=4, qt2=1;
		int x9=9, x8=8, x6=6, x5=5, x2=2;
		int ok;
		Container frame;
		int somal=0, somac=0, somad=0, somae=0;
		int [][] m = new int [4][4];
		
		Jogo( ) {
		super("Jogo Soma 28");
		setSize(600,600); //tamanho janela
		Tela();
		setVisible(true);
	}
		
		public void Tela(){
		JPanel p = new JPanel(new FlowLayout());
		p.add(l1 = new JLabel ("   Player 1: 0      "));
		p.add(bt9 = new JButton("9"));  
		p.add(bt8 = new JButton("8"));
		p.add(bt6 = new JButton("6"));
		p.add(bt5 = new JButton("5"));
		p.add(bt2 = new JButton("2"));
		p.add(l2 = new JLabel ("       Player 2: 0    "));
		bt9.addActionListener(this);
		bt8.addActionListener(this);
		bt6.addActionListener(this);
		bt5.addActionListener(this);
		bt2.addActionListener(this);
	
		getContentPane().add(p,BorderLayout.NORTH );
		p.setBackground(Color.cyan);
	    
	    
	    tab = new JPanel(new GridLayout (4,4));
		b= new JButton [4][4];

		int x =100;
		for(int i=0;i<4;i++){
			int y=100;
			for (int j=0;j<4;j++){
				b[i][j]=new JButton(" ");
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
		
		if (e.getSource()==bt9){
 			if(qt9 > 0){
				ok = 9;
 			}else if(qt9==0){
 				ok= 0;
 		}
 		
	 }

		 if (e.getSource()==bt8){
 			if(qt8 > 0){
				ok = 8;
 			}else if(qt8==0){
 				ok = 0;
 		}
	 }

		if (e.getSource()==bt6){
 			if(qt6 > 0){
				ok = 6;
 			}else if(qt6==0){
 				ok = 0;
 		}
	}
	
		if (e.getSource()==bt5){
 			if(qt5 > 0){
				ok = 5;
 			}else if(qt5==0){
 				ok = 0;
 		}
	}

		 if (e.getSource()==bt2){
 			if(qt2 > 0){
				ok = 2;
 			}else if(qt2==0){
 				ok = 0;
 		}
	}
			for(i=0;i<4;i++){
					
 				for(j=0;j<4;j++){
 
 					if(e.getSource() == b[i][j] && ok == 9){
						
 						String n = Integer.toString(x9);
 						b[i][j].setText(n);
 						ok=-1;
 						qt9 --;
 						m[i][j]=x9;
 						soma28();
 					}
 					
					 else if(e.getSource() == b[i][j] && ok == 8){
 						
 						String n = Integer.toString(x8);
 						b[i][j].setText(n);
 						ok=-1;
 						qt8 --;
 						m[i][j]=x8;
 						soma28();
 					}
 					
 					 else if(e.getSource() == b[i][j] && ok == 6){
 						
 						String n = Integer.toString(x6);
 						b[i][j].setText(n);
 						ok=-1;
 						qt6 --;
 						m[i][j]=x6;
 						soma28();
 					}
 					
					  else if(e.getSource() == b[i][j] && ok == 5){
 						
 						String n = Integer.toString(x5);
 						b[i][j].setText(n);
 						ok=-1;
 						qt5 --;
 						m[i][j]=x5;
 						soma28();
 					}
 					
					  else if(e.getSource() == b[i][j] && ok == 2){
 						
 						String n = Integer.toString(x2);
 						b[i][j].setText(n);
 						ok=-1;
 						qt2 --;
 						m[i][j]=x2;
 						soma28();
 					}
 					
					if(e.getSource() == b[i][j] && ok==0){
						JOptionPane.showMessageDialog(frame, "Escolha outro valor", "Limite atingido", 
						JOptionPane.ERROR_MESSAGE);
 					}
 						   	
				 
				 }			
			}
			 
	}
	
					
	public void soma28 (){
		
		
		for(i=0;i<4;i++){
			somal=0;
			somac=0;
 				for(j=0;j<4;j++){
					somal += m[j][i];
					somac += m[i][j];
 					System.out.print(m[j][i]+" ");
 					
					}
					System.out.println( "somal:  "+somal);
					System.out.println( "somac:  "+somac);
					System.out.println();
						
			}
 					
			System.out.println("\n\n");
			
					somad = m[0][0]+m[1][1]+m[2][2]+m[3][3];
 					somae = m[3][0]+m[2][1]+m[1][2]+m[0][3];
 				
 					System.out.println( "somad:  "+somad );
 					System.out.println( "somae:  " +somae  );
					
				
}
		
		
		
		
	/*public void Score() {
   if (){
   l1= l1+100;
	}
   else {
   l2= l2+100;
	}
	
	l1.setText("Score: " + l1);
	
	l2.setText("Score: " + l2);
  
	}
	*/
	static public void main(String[] args) {
			new Jogo( );
			
			
}
}
