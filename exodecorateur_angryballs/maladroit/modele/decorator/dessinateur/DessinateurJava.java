package exodecorateur_angryballs.maladroit.modele.decorator.dessinateur;

import java.awt.Color;
import java.awt.Graphics;

import exodecorateur_angryballs.maladroit.modele.decorator.Bille;

public class DessinateurJava implements Dessinateur{

	Graphics g;
	public DessinateurJava(Graphics g) {
		this.g = g;
	}
	@Override
	public void dessine(Bille b) {
		int width, height;
	    int xMin, yMin;
	    
	    xMin = (int)Math.round(b.getPosition().x-b.getRayon());
	    yMin = (int)Math.round(b.getPosition().y-b.getRayon());

	    width = height = 2*(int)Math.round(b.getRayon()); 

	    g.setColor(b.getCouleur());
	    g.fillOval( xMin, yMin, width, height);
	    g.setColor(Color.CYAN);
	    g.drawOval(xMin, yMin, width, height);
		
	}

}
