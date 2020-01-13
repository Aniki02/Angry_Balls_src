package exodecorateur_angryballs.maladroit.modele.decorator;

import java.awt.Color;
import java.util.Vector;

import exodecorateur_angryballs.maladroit.modele.decorator.dessinateur.Dessinateur;
import mesmaths.cinematique.Cinematique;
import mesmaths.geometrie.base.Geop;
import mesmaths.geometrie.base.Vecteur;

/**
 * Toutes les decoration devront être appliquer sur une bille nue. Elle doit être le dernier maillon
 * de la chaine de decoration.
 * @author aniki01
 *
 */
public class BilleNue implements Bille{
	
	public  Vecteur position;   // centre de la bille
	public  double rayon;            // rayon > 0
	public  Vecteur vitesse;
	public  Vecteur acceleration;
	public int clef;                // identifiant unique de cette bille

	private Color couleur;

	private static int prochaineClef = 0;

	public static double ro = 1;        // masse volumique
	
	/**
	 * @param centre
	 * @param rayon
	 * @param vitesse
	 * @param acceleration
	 * @param couleur
	 */
	protected BilleNue(Vecteur centre, double rayon, Vecteur vitesse, Vecteur acceleration, Color couleur){
		this.position = centre;
		this.rayon = rayon;
		this.vitesse = vitesse;
		this.acceleration = acceleration;
		this.couleur = couleur;
		this.clef = BilleNue.prochaineClef ++;
	}

	/**
	 * @param position
	 * @param rayon
	 * @param vitesse
	 * @param couleur
	 */
	public BilleNue(Vecteur position, double rayon, Vecteur vitesse, Color couleur)
	{
	this(position,rayon,vitesse,new Vecteur(),couleur);
	}

	@Override
	public Vecteur getPosition() {
		return this.position;
	}

	@Override
	public double getRayon() {
		return this.rayon;
	}

	@Override
	public Vecteur getVitesse() {
		return this.vitesse;
	}

	@Override
	public Vecteur getAcceleration() {
		return this.acceleration;
	}

	@Override
	public int getClef() {
		return this.clef;
	}
	@Override
	public Color getCouleur() {
		return this.couleur;
	}

	@Override
	public double masse() {
		return ro*Geop.volumeSphere(rayon);
	}

	@Override
	public void deplacer(double deltaT) {
		Cinematique.mouvementUniformementAccelere( this.getPosition(), this.getVitesse(), this.getAcceleration(), deltaT);
		
	}

	@Override
	public void gestionAcceleration(Vector<Bille> billes) {
		this.getAcceleration().set(Vecteur.VECTEURNUL);
		
	}

	@Override
	public boolean gestionCollisionBilleBille(Vector<Bille> billes) {
		return OutilsBilleDecorator.gestionCollisionBilleBille(this, billes);
	}

	@Override
	public void collisionContour(double abscisseCoinHautGauche, double ordonneeCoinHautGauche, double largeur,
			double hauteur) {}

	@Override
	public void dessine(Dessinateur d) {
		d.dessine(this);
		
	}
	
	public String toString() 
	{
		return "centre = " + this.getPosition() + " rayon = "+this.getRayon() +  " vitesse = " + this.getVitesse() + " acceleration = " + this.getAcceleration() + " couleur = " + this.couleur + "clef = " + this.getClef();
	}
	
	public Bille clone() {
		return new BilleNue(new Vecteur(this.position), this.rayon, new Vecteur(this.vitesse), this.couleur);
	}

}
