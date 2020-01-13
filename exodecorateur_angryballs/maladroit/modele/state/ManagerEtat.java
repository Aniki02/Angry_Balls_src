package exodecorateur_angryballs.maladroit.modele.state;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Vector;

import exodecorateur_angryballs.maladroit.modele.decorator.Bille;
import exodecorateur_angryballs.maladroit.vues.Billard;

public class ManagerEtat implements MouseMotionListener ,MouseListener{

	
	ControlleurEtat cc; //controlleur courant
	ControlleurEtatLibre libre; // controleur libre
	ControlleurEtatAttrape attrape; // controlleur attrapé 
	
	Vector<Bille> billes; // le modele
	Billard billard; // la vue 
	
	
	public ManagerEtat(Vector<Bille> billes, Billard billard) {
		this.billes = billes;
		this.billard = billard;
		
		this.billard.addMouseListener(this);
		this.billard.addMouseMotionListener(this);
		
		this.installeControlleur();
	}
	
	/**
	 * Construit le graphe des controlleur d'etat 
	 */
	private void installeControlleur() {
		this.libre = new ControlleurEtatLibre(null, this);
		this.attrape = new ControlleurEtatAttrape(this.libre, this);
		
		this.libre.suivant = this.attrape;
		
		this.cc = this.libre;
	}
	
	
	
	@Override
	public void mousePressed(MouseEvent e) {
		this.cc.traiteMousePressed(e);
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		this.cc.traiteMouseReleased(e);
		
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		this.cc.traiteMouseDragged(e);
	}
	
	
	public ControlleurEtat getCc() {
		return cc;
	}

	public void setCc(ControlleurEtat cc) {
		this.cc = cc;
	}
	
	

	// Fonction inutile a notre application venant le l'implémentation de MouseListener et MouseMotionListener
	@Override
	public void mouseClicked(MouseEvent e) {}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}

	@Override
	public void mouseMoved(MouseEvent e) {}



}
