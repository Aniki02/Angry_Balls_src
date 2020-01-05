package exodecorateur_angryballs.maladroit.modele.state;

import java.awt.event.MouseEvent;

import exodecorateur_angryballs.maladroit.modele.decorator.Bille;
import exodecorateur_angryballs.maladroit.modele.decorator.Acceleration.Pilote;
import mesmaths.geometrie.base.Geop;
import mesmaths.geometrie.base.Vecteur;


/**
 * l'etat de l'application lorsque qu'aucune bille est attraper ( en attente ) 
 * @author aniki01
 *
 */
public class ControlleurEtatLibre extends ControlleurEtat{

	public ControlleurEtatLibre(ControlleurEtat suivant, ManagerEtat me) {
		super(suivant, me);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Si on clique sur une bille on lui ajoute la decoration Piloté et on passe dans l'etat suivant ( Etat attrapé)
	 */
	@Override
	public void traiteMousePressed(MouseEvent e) {
		
		for(Bille b : this.managerEtat.billes) {
			if(Geop.appartientDisque(new Vecteur(e.getX(), e.getY()), b.getPosition(), b.getRayon())) {
				this.billePilote = new Pilote(b);
				this.managerEtat.billes.remove(b);
				this.managerEtat.billes.add(this.billePilote);
				this.managerEtat.setCc(this.suivant);
				break;
			}
		}
	}

	
	

}
