package exodecorateur_angryballs.maladroit.modele.decorator.Acceleration;


import java.util.Vector;

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
	
	@Override
	public void gestionAcceleration(Vector<Bille> billes) {
		this.billeDecore.gestionAcceleration(billes);
		this.addAcceleration(billes);
	}
	
	
	protected abstract void addAcceleration(Vector<Bille> billes);

}
