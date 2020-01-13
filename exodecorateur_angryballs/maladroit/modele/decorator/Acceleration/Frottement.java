package exodecorateur_angryballs.maladroit.modele.decorator.Acceleration;

import java.util.Vector;

import exodecorateur_angryballs.maladroit.modele.decorator.Bille;
import mesmaths.mecanique.MecaniquePoint;

/**
 * Frottement de l'air qui ralentit la bille
 * @author aniki01
 *
 */
public class Frottement extends Acceleration{

	public Frottement(Bille billeDecore) {
		super(billeDecore);
	}

	@Override
	protected void addAcceleration(Vector<Bille> billes) {
		this.getAcceleration().ajoute(MecaniquePoint.freinageFrottement(this.billeDecore.masse(), this.getVitesse()));
		
	}
	

}
