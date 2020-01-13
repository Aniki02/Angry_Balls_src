package exodecorateur_angryballs.maladroit.modele.decorator.collision;

import java.util.Vector;

import exodecorateur_angryballs.maladroit.modele.decorator.Bille;
import exodecorateur_angryballs.maladroit.modele.decorator.DecoratorBille;

/**
* Collision : toutes les fonctionnalité d'une bille qui impacteront ses collisions heriteront de Collision.
* Elle sert à factoriser le code de gestionAcceleration pour toutes les accelerations et avoir une organisation
* claire du code. 
* */
public abstract class Collision extends DecoratorBille{

	public Collision(Bille billeDecore) {
		super(billeDecore);
	}

	@Override
	public void gestionAcceleration(Vector<Bille> billes) {
		this.billeDecore.gestionAcceleration(billes);	
	}

}
