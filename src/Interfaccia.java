import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JFrame;


@SuppressWarnings("serial")
public class Interfaccia extends JFrame{
	
	Random random_position;
	Casella casella[] = new Casella[6];
	boolean positions[] = new boolean[16];
	
	public Interfaccia() {
		super.setSize(400, 400);
		super.setLayout(new GridLayout(4, 4, 10, 10));
		random_position = new Random();
		
		int pos;
		for(int i=0; i<6; i++) {
			casella[i] = new Casella(i);
			casella[i].addMouseListener(new ButtonMouseListener());
			
			do{
				pos = random_position.nextInt(15);
				if(!positions[pos]) {
					break;				} 
			}while(true);
			
		}
		
		
		
	}
	
	class ButtonMouseListener implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
}
