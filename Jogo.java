
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

		int a = 9;
		int qtda = 6;
		int qtdc = 3;
		int c = 8;
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
		
		if (e.getSource()==bt1){

			if(qtda > 0){
				confirma = 1;
			}else if(qtda==0){
				confirma = 0;
			}
		} 

		if (e.getSource()==bt2) {	
				
			if(qtdc > 0){
				confirma = 2;
			}else if(qtdc ==0){
				confirma = 0;
			}

		}

		if (e.getSource()==bt3) {		
			
		}

		if (e.getSource()==bt4) {	
			
		}

		if (e.getSource()==bt5) {	
			
		}
		 
			for(i=0;i<4;i++){
				for(j=0;j<4;j++){

					if(e.getSource() == b[i][j] && confirma == 1){

						String teste = Integer.toString(a);
						b[i][j].setText(teste);
						qtda --;
					}else if(e.getSource() == b[i][j] && confirma == 2){
						
						String teste = Integer.toString(c);
						b[i][j].setText(teste);
						qtdc --;
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

