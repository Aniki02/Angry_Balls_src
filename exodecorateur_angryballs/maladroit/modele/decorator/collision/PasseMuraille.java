package exodecorateur_angryballs.maladroit.modele.decorator.collision;

import exodecorateur_angryballs.maladroit.modele.decorator.Bille;
import mesmaths.cinematique.Collisions;


/**
 * Passe a travers les mur et reapparait de l'autre côté
 * @author aniki01
 *
 */
public class PasseMuraille extends Collision{

	public PasseMuraille(Bille billeDecore) {
		super(billeDecore);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void collisionContour(double abscisseCoinHautGauche, double ordonneeCoinHautGauche, double largeur,
			double hauteur) {
		// TODO Auto-generated method stub
		Collisions.collisionBilleContourPasseMuraille( this.getPosition(), abscisseCoinHautGauche, ordonneeCoinHautGauche, largeur, hauteur);
		
	}

}
