package exodecorateur_angryballs.maladroit.modele.decorator.Acceleration;

import java.util.Vector;

import exodecorateur_angryballs.maladroit.modele.decorator.Bille;
import exodecorateur_angryballs.maladroit.modele.decorator.DecoratorBille;
import mesmaths.geometrie.base.Vecteur;

/**
 * Peut être attrapé et lancé avec une certaine force
 * @author aniki01
 *
 */
public class Pilote extends Acceleration{

	private Vecteur forceLancer; // Force avec laquelle la bille va être lancée
	
	public Pilote(Bille billeDecore) {
		super(billeDecore);
		this.forceLancer = Vecteur.VECTEURNUL;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void gestionAcceleration(Vector<Bille> billes) {
		// TODO Auto-generated method stub
		this.billeDecore.gestionAcceleration(billes);
		this.getAcceleration().ajoute(this.forceLancer);
		
	}

	public Vecteur getForceLancer() {
		return forceLancer;
	}

	public void setForceLancer(Vecteur forceLancer) {
		this.forceLancer = forceLancer;
	}

	
	

}
