import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


@SuppressWarnings("serial")
public class Casella extends JButton implements ActionListener{
	
	private Image immagine;
	private int id;
	private boolean confermato;
	private boolean visualizzato;
	
	public Casella(int id){
		this.id = id;
		this.immagine = Toolkit.getDefaultToolkit().getImage(Integer.toString(id) + ".jpg");
		super.setBackground(Color.GRAY);
		confermato = false;
		visualizzato = false;
	}

	//listener
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(!confermato){
			if(visualizzato){
				this.copri();
			}else{
				super.setIcon((Icon) immagine);
				visualizzato = true;
			}
		}
		
	}

	public void setConfermato(boolean confermato) {
		this.confermato = confermato;
	}
	
	public void copri(){
		if(!confermato){
			super.setIcon(null);
			super.setBackground(Color.GRAY);
			visualizzato = false;
		}
	}
}
