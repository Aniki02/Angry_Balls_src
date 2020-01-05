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
		// TODO Auto-generated constructor stub
	}

	@Override
	public void gestionAcceleration(Vector<Bille> billes) {
		// TODO Auto-generated method stub
		this.billeDecore.gestionAcceleration(billes);
		this.getAcceleration().ajoute(MecaniquePoint.freinageFrottement(this.billeDecore.masse(), this.getVitesse()));
		
	}

}
