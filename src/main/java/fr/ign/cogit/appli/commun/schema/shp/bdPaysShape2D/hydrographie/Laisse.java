package fr.ign.cogit.appli.commun.schema.shp.bdPaysShape2D.hydrographie;


import fr.ign.cogit.appli.commun.schema.shp.bdPaysShape2D.ElementBDPays;
import fr.ign.cogit.geoxygene.spatial.coordgeom.GM_LineString;

public abstract class Laisse extends ElementBDPays {

	/** Renvoie la géométrie de l'objet, castée plus précisément qu'avec la méthode getGeom() */
	public GM_LineString getGeometrie() {return (GM_LineString)geom;}
	/** Définit la géométrie de l'objet, castée plus précisément qu'avec la méthode setGeom() */
	public void setGeometrie(GM_LineString G) {this.geom = G;}

	protected String nature;
	public String getNature() {return this.nature; }
	public void setNature (String Nature) {nature = Nature; }

}
