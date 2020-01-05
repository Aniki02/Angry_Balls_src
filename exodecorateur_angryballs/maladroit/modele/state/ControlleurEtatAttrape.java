package exodecorateur_angryballs.maladroit.modele.state;

import java.awt.event.MouseEvent;

import exodecorateur_angryballs.maladroit.modele.decorator.Bille;
import mesmaths.geometrie.base.Vecteur;


/**
 * l'etat de l'application lorsqu'on a attrapé une bille 
 * @author aniki01
 *
 */
public class ControlleurEtatAttrape extends ControlleurEtat{

	public ControlleurEtatAttrape(ControlleurEtat suivant, ManagerEtat me) {
		super(suivant, me);
	}


	/**
	 * Calcul de la force et mise a jours par rapport a la position de la souris de la bille et de sa masse
	 */
	@Override
	public void traiteMouseDragged(MouseEvent e) {
		//Calcul de la force par rapport a la position de la souris et cellle de la bille 
		Vecteur force = new Vecteur(e.getX(), e.getY()).difference(this.suivant.billePilote.getPosition());
		//par rapport a la masse de la bille
		force.multiplie(1/this.suivant.billePilote.masse());
		//mise a jour de la force 
		this.suivant.billePilote.setForceLancer(force);
	}
	
	/**
	 * Supprime la decoration Piloté de la bille et passe dans l'etat suivant (etat libre)
	 */
	@Override
	public void traiteMouseReleased(MouseEvent e) {
		
		Bille billeSuivant = this.suivant.billePilote.billeDecore;
		this.managerEtat.billes.remove(this.suivant.billePilote);
		this.managerEtat.billes.add(billeSuivant);
		
		this.managerEtat.setCc(this.suivant);
	}
	
	
	
	
}
