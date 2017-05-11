


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
		int player =1;
		int jogador1, jogador2;
		
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
				b[j][i]=new JButton(" ");
				b[j][i].addActionListener(this);
				getContentPane().add(b[j][i]).setBounds(x,y,60,60);
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
<<<<<<< HEAD
 						trocaPlayer();
=======
>>>>>>> origin/master
 					}
 					
					 else if(e.getSource() == b[i][j] && ok == 8){
 						
 						String n = Integer.toString(x8);
 						b[i][j].setText(n);
 						ok=-1;
 						qt8 --;
 						m[i][j]=x8;
 						soma28();
<<<<<<< HEAD
 						trocaPlayer();
=======
>>>>>>> origin/master
 					}
 					
 					 else if(e.getSource() == b[i][j] && ok == 6){
 						
 						String n = Integer.toString(x6);
 						b[i][j].setText(n);
 						ok=-1;
 						qt6 --;
 						m[i][j]=x6;
 						soma28();
<<<<<<< HEAD
 						trocaPlayer();
=======
>>>>>>> origin/master
 					}
 					
					  else if(e.getSource() == b[i][j] && ok == 5){
 						
 						String n = Integer.toString(x5);
 						b[i][j].setText(n);
 						ok=-1;
 						qt5 --;
 						m[i][j]=x5;
 						soma28();
<<<<<<< HEAD
 						trocaPlayer();
=======
>>>>>>> origin/master
 					}
 					
					  else if(e.getSource() == b[i][j] && ok == 2){
 						
 						String n = Integer.toString(x2);
 						b[i][j].setText(n);
 						ok=-1;
 						qt2 --;
 						m[i][j]=x2;
 						soma28();
<<<<<<< HEAD
 						trocaPlayer();
=======
>>>>>>> origin/master
 					}
 					
					if(e.getSource() == b[i][j] && ok==0){
						JOptionPane.showMessageDialog(frame, "Escolha outro valor", "Limite atingido", 
						JOptionPane.ERROR_MESSAGE);
 					}
 						   	
<<<<<<< HEAD
				 }			
			}	 
=======
				 
				 }			
			}
			 
>>>>>>> origin/master
	}
	
					
	public void soma28 (){
		
		
<<<<<<< HEAD
		for(int i=0;i<4;i++){
			somal=0;
			somac=0;
 				for(int j=0;j<4;j++){
					somal += m[i][j];
					somac += m[j][i];
 					System.out.print(m[i][j]+" ");
 					somad = m[0][0]+m[1][1]+m[2][2]+m[3][3];
 					somae = m[3][0]+m[2][1]+m[1][2]+m[0][3];
 					
 					if (somal == 28) {
						for (int col=0; col<4;col++){
							b[i][col].setBackground(Color.green);
							Score();
							}
						}
					
					if (somac == 28) {
						for (int l=0; l<4;l++){
							b[l][j].setBackground(Color.green);
							
							}
						}
						
						if (somad == 28) {
							
							 b[0][0].setBackground(Color.green);
							 b[1][1].setBackground(Color.green);
							 b[2][2].setBackground(Color.green);
							 b[3][3].setBackground(Color.green);;
							}
						
						
						if (somae == 28) {
						
							b[3][0].setBackground(Color.green);
							b[2][1].setBackground(Color.green);
							b[1][2].setBackground(Color.green);
							b[0][3].setBackground(Color.green);
							}
						
					
			
					}
					System.out.println( "somal: "+somal + "  somac: "+somac);
					
						
			}
 					
					System.out.println("\n\n");
			
					
 				
 					System.out.println( "somad:  "+somad );
 					System.out.println( "somae:  " +somae  );
								
								
}
		
		public void trocaPlayer(){
        if(player == 1)
            player = 2;
        else
            player = 1;
}
=======
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
		
		
		
>>>>>>> origin/master
		
		
	public void Score() {
   if (player == 1){
   jogador1= jogador1+100;
	}
   else {
   jogador2= jogador2+100;
	}
	
	l1.setText(Integer.toString(jogador1));
	l2.setText(Integer.toString(jogador2));
	
  
	}
	
	static public void main(String[] args) {
			new Jogo( );
			
			
}
}
