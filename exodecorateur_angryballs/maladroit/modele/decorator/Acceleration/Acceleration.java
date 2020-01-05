package exodecorateur_angryballs.maladroit.modele.decorator.Acceleration;


import exodecorateur_angryballs.maladroit.modele.decorator.Bille;
import exodecorateur_angryballs.maladroit.modele.decorator.DecoratorBille;

/**
 * Acceleration : toutes les fonctionnalité d'une bille qui impacteront l'acceleration heriteront de Acceleration.
 * Elle sert à factoriser le code de collision Contour pour toutes les accelerationset avoir une organisation
 * claire du code. 
 * */

public abstract class Acceleration extends DecoratorBille{

	public Acceleration(Bille billeDecore) {
		super(billeDecore);
	}


	@Override
	public void collisionContour(double abscisseCoinHautGauche, double ordonneeCoinHautGauche, double largeur,double hauteur) {
		this.billeDecore.collisionContour(abscisseCoinHautGauche, ordonneeCoinHautGauche, largeur, hauteur);
	}

}
