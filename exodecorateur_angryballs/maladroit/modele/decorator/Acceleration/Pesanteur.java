package exodecorateur_angryballs.maladroit.modele.decorator.Acceleration;

import java.util.Vector;

import exodecorateur_angryballs.maladroit.modele.decorator.Bille;
import mesmaths.geometrie.base.Vecteur;

/**
 * Attiré par le sol
 * @author aniki01
 *
 */
public class Pesanteur extends Acceleration{
	
	Vecteur pesanteur;

	public Pesanteur(Bille billeDecore, Vecteur pesanteur) {
		super(billeDecore);
		this.pesanteur = pesanteur;
	}

	@Override
	protected void addAcceleration(Vector<Bille> billes) {
		this.getAcceleration().ajoute(this.pesanteur);
		
	}

}
