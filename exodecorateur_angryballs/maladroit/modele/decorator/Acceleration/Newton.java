package exodecorateur_angryballs.maladroit.modele.decorator.Acceleration;

import java.util.Vector;

import exodecorateur_angryballs.maladroit.modele.decorator.Bille;
import exodecorateur_angryballs.maladroit.modele.decorator.OutilsBilleDecorator;

/**
 * Attiré par d'autre bille
 * @author aniki01
 *
 */
public class Newton extends Acceleration{

	public Newton(Bille billeDecore) {
		super(billeDecore);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void gestionAcceleration(Vector<Bille> billes) {
		// TODO Auto-generated method stub
		this.billeDecore.gestionAcceleration(billes);
		this.getAcceleration().ajoute(OutilsBilleDecorator.gestionAccelerationNewton(this.billeDecore, billes));
		
	}

}
