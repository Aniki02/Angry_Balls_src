package exodecorateur_angryballs.maladroit.modele.decorator.collision;


import exodecorateur_angryballs.maladroit.modele.decorator.Bille;
import mesmaths.cinematique.Collisions;

/**
 * Rebondit sur les mur
 * @author aniki01
 *
 */
public class Rebond extends Collision{

	public Rebond(Bille billeDecore) {
		super(billeDecore);
	}


	@Override
	public void collisionContour(double abscisseCoinHautGauche, double ordonneeCoinHautGauche, double largeur,
			double hauteur) {
		//this.billeDecore.collisionContour(abscisseCoinHautGauche, ordonneeCoinHautGauche, largeur, hauteur);
		Collisions.collisionBilleContourAvecRebond(this.getPosition(), this.getRayon(), 
				this.getVitesse(),
				abscisseCoinHautGauche, ordonneeCoinHautGauche, largeur, hauteur);
		
			
	}

}
