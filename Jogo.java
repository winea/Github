
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class Jogo extends JFrame implements ActionListener {

		JButton [][]b;
		JButton bt9,bt8,bt6,bt5,bt2;
		JLabel l1,l2;
		JPanel p;
		JPanel tab;

		int x9 = 9;
		int x8 = 8;
		int x6 = 6;
		int x5 = 5;
		int x2 = 2;
		int qtd9 = 6;
		int qtd8 = 3;
		int qtd6 = 2;
		int qtd5 = 4;
		int qtd2 = 1;
		
		int confirma;
		int i,j;

		Container frame;

		
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
		
		if (e.getSource()==bt9){

			if(qtd9 > 0){
				confirma = 9;
			}else if(qtd9==0){
				confirma = 0;
			}
		} 

		if (e.getSource()==bt8) {	
				
			if(qtd8 > 0){
				confirma = 8;
			}else if(qtd8 ==0){
				confirma = 0;
			}

		}

		if (e.getSource()==bt6) {		
			
			if(qtd6 > 0){
				confirma = 6;
			}else if(qtd6 ==0){
				confirma = 0;
			}
		}

		if (e.getSource()==bt5) {	
			
			if(qtd5 > 0){
				confirma = 5;
			}else if(qtd5 ==0){
				confirma = 0;
			}

		}

		if (e.getSource()==bt2) {	
			
			if(qtd2 > 0){
				confirma = 2;
			}else if(qtd2 ==0){
				confirma = 0;
			}

		}
		 
			for(i=0;i<4;i++){
				for(j=0;j<4;j++){

					if(e.getSource() == b[i][j] && confirma == 9){

						String teste = Integer.toString(x9);
						b[i][j].setText(teste);
						qtd9 --;
					}else if(e.getSource() == b[i][j] && confirma == 8){
						
						String teste = Integer.toString(x8);
						b[i][j].setText(teste);
						qtd8 --;
					}else if(e.getSource() == b[i][j] && confirma == 6){
						
						String teste = Integer.toString(x6);
						b[i][j].setText(teste);
						qtd6 --;
					}else if(e.getSource() == b[i][j] && confirma == 5){
						
						String teste = Integer.toString(x5);
						b[i][j].setText(teste);
						qtd5 --;
					}else if(e.getSource() == b[i][j] && confirma == 2){
						
						String teste = Integer.toString(x2);
						b[i][j].setText(teste);
						qtd2 --;
					}
						
					if(e.getSource() == b[i][j] && confirma==0){
						JOptionPane.showMessageDialog(frame, "Escolha outro valor", "Limite atingido",
                    	JOptionPane.ERROR_MESSAGE);
					}
								
		      }
			}


}

		// if ( e.getSource() == b[0][0]){
		// 	String teste = Integer.toString(a);
        //     b[0][0].setText(teste);
		//     }       
	public static void main(String[] args) {
			new Jogo( );
   }
}

