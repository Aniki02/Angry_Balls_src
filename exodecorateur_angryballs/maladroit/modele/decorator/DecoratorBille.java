package exodecorateur_angryballs.maladroit.modele.decorator;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Vector;

import exodecorateur_angryballs.maladroit.modele.decorator.dessinateur.Dessinateur;
import mesmaths.geometrie.base.Vecteur;

/**
 * Pour implémenter le DP Decorator. Toutes les fonctionnalitées (Décorations) qu'on pourra ajouter a une 
 * bille hériteront de DecoratorBille.
 * @author aniki01
 *
 */
public abstract class DecoratorBille implements Bille{
	public Bille billeDecore;
	
	
	public DecoratorBille(Bille billeDecore) {
		this.billeDecore = billeDecore;
	}

	@Override
	public Vecteur getPosition() {
		return this.billeDecore.getPosition();
	}

	@Override
	public double getRayon() {
		return this.billeDecore.getRayon();
	}

	@Override
	public Vecteur getVitesse() {
		return this.billeDecore.getVitesse();
	}

	@Override
	public Vecteur getAcceleration() {
		return this.billeDecore.getAcceleration();
	}

	@Override
	public int getClef() {
		return this.billeDecore.getClef();
	}
	
	@Override
	public Color getCouleur() {
		return this.billeDecore.getCouleur();
	}

	@Override
	public double masse() {
		return this.billeDecore.masse();
	}

	@Override
	public void deplacer(double deltaT) {
		this.billeDecore.deplacer(deltaT);	
	}

	@Override
	public void dessine(Dessinateur d) {
		this.billeDecore.dessine(d);
		
	}

	@Override
	public boolean gestionCollisionBilleBille(Vector<Bille> billes) {
		return this.billeDecore.gestionCollisionBilleBille(billes);
	}
	
	public String toString() 
	{
		return this.billeDecore.toString();
	}

	
	
	
	
	
}
