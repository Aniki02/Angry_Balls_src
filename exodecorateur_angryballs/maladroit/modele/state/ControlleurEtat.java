package exodecorateur_angryballs.maladroit.modele.state;

import java.awt.event.MouseEvent;

import exodecorateur_angryballs.maladroit.modele.decorator.Acceleration.Pilote;


/**
 * Tous les controleur d'etat hériteront de ControlleurEtat. fait un traitement puit passe dans 
 * l'etats adéquat
 * @author aniki01
 *
 */
public abstract class ControlleurEtat {
	protected ControlleurEtat suivant; // etats suivant
	protected Pilote billePilote;
	
	protected ManagerEtat managerEtat;
	
	public ControlleurEtat(ControlleurEtat suivant, ManagerEtat me) {
		this.suivant = suivant;
		this.managerEtat = me;
	}
	
	/**
	 * traitement quand on presse la souris
	 * @param e
	 */
	public void traiteMousePressed(MouseEvent e) {}
	
	/**
	 * traitement quand on bouge avec la souris toujours pressé
	 * @param e
	 */
	public void traiteMouseDragged(MouseEvent e) {}
	
	/**
	 * traitement quand on relache la souris
	 * @param e
	 */
	public void traiteMouseReleased(MouseEvent e) {}
}
