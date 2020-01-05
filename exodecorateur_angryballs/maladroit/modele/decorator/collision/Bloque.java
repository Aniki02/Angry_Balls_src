package exodecorateur_angryballs.maladroit.modele.decorator.collision;

import exodecorateur_angryballs.maladroit.modele.decorator.Bille;
import mesmaths.cinematique.Collisions;

/**
 * Bloqué par les rebord
 * @author aniki01
 *
 */
public class Bloque extends Collision{

	public Bloque(Bille billeDecore) {
		super(billeDecore);
	}

	@Override
	public void collisionContour(double abscisseCoinHautGauche, double ordonneeCoinHautGauche, double largeur,
			double hauteur) {
		Collisions.collisionBilleContourAvecArretHorizontal(this.getPosition(), this.getRayon(), this.getVitesse(), abscisseCoinHautGauche, largeur);
		Collisions.collisionBilleContourAvecArretVertical(this.getPosition(), this.getRayon(), this.getVitesse(), ordonneeCoinHautGauche, hauteur);	
		
	}

}
