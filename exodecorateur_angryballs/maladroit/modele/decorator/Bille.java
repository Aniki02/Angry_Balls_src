package exodecorateur_angryballs.maladroit.modele.decorator;

import java.awt.Graphics;
import java.util.Vector;

import mesmaths.geometrie.base.Vecteur;

/**
 * Interface décrivant une bille
 * @author aniki01
 *
 */
public interface Bille {

	/**
	 * @return the position
	 */
	public Vecteur getPosition();

	/**
	 * @return the rayon
	 */
	public double getRayon();

	/**
	 * @return the vitesse
	 */
	public Vecteur getVitesse();

	/**
	 * @return the acceleration
	 */
	public Vecteur getAcceleration();

	/**
	 * @return the clef
	 */
	public int getClef();

	public double masse();
	
	/**
	 * mise a jour de position et vitesse a t+deltaT a partir de position et vitesse a l'instant t
	 * 
	 * modifie le vecteur position et le vecteur vitesse
	 * 
	 * laisse le vecteur acceleration intact
	 *
	 * La bille subit par defaut un mouvement uniformement accelere
	 * */
	public  void  deplacer( double deltaT);

	/**
	 * calcul (c-a-d mise a jour) eventuel  du vecteur acceleration. 
	 * billes est la liste de toutes les billes en mouvement
	 * Cette methode peut avoir besoin de "billes" si this subit l'attraction gravitationnelle des autres billes
	 * La nature du calcul du vecteur acceleration de la bille  est definie dans les classes derivees
	 * A ce niveau le vecteur acceleration est mis a zero (c'est a dire pas d'acceleration)
	 * */
	public  void gestionAcceleration(Vector<Bille> billes);

	/**
	 * gestion de l'eventuelle  collision de cette bille avec les autres billes
	 *
	 * billes est la liste de toutes les billes en mouvement
	 * 
	 * Le comportement par defaut est le choc parfaitement elastique (c-a-d rebond sans amortissement)
	 * 
	 * @return true si il y a collision et dans ce cas les positions et vecteurs vitesses des 2 billes impliquees dans le choc sont modifiees
	 * si renvoie false, il n'y a pas de collision et les billes sont laissees intactes 
	 * */
	public boolean gestionCollisionBilleBille(Vector<Bille> billes);




	/**
	 * gestion de l'eventuelle collision de la bille (this) avec le contour rectangulaire de l'ecran defini par (abscisseCoinHautGauche, ordonneeCoinHautGauche, largeur, hauteur)
	 * 
	 * detecte si il y a collision et le cas echeant met a jour position et vitesse
	 * 
	 * La nature du comportement de la bille en reponse a cette collision est definie dans les classes derivees
	 * */
	public void collisionContour(double abscisseCoinHautGauche, double ordonneeCoinHautGauche, double largeur, double hauteur);



	public void dessine (Graphics g);


	public String toString();


}
