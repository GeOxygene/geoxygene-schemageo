package fr.ign.cogit.appli.commun.schema.shp.bdPaysShape2D.ferre;


import fr.ign.cogit.appli.commun.schema.shp.bdPaysShape2D.ElementBDPays;
import fr.ign.cogit.geoxygene.spatial.coordgeom.GM_Polygon;

public abstract class AireDeTriage extends ElementBDPays {

	/** Renvoie la géométrie de l'objet, castée plus précisément qu'avec la méthode getGeom() */
	public GM_Polygon getGeometrie() {return (GM_Polygon)geom;}
	/** Définit la géométrie de l'objet, castée plus précisément qu'avec la méthode setGeom() */
	public void setGeometrie(GM_Polygon G) {this.geom = G;}

	protected double z_moyen;
	public double getZ_moyen() {return this.z_moyen; }
	public void setZ_moyen (double Z_moyen) {z_moyen = Z_moyen; }

}
