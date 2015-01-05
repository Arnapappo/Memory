import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class Supporto {
	private int c; // conta quante caselle sono state girate, da settare a 0 nel costruttore
	private int id_girato;
	
	class ButtonMouseListener implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent arg0) {
			c++;
			switch (c){
			case 1:
				id_girato = //prendo id da get source
			}
			
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
