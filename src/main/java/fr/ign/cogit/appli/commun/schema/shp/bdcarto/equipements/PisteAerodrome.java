package fr.ign.cogit.appli.commun.schema.shp.bdcarto.equipements;

import fr.ign.cogit.geoxygene.spatial.coordgeom.GM_LineString;


/** Classe geographique. Classe generee automatiquement par le chargeur de la plate-forme Oxygene*/

public abstract class PisteAerodrome extends fr.ign.cogit.appli.commun.schema.shp.bdcarto.ElementBDCarto {

	/** Renvoie la géométrie de l'objet, castée plus précisément qu'avec la méthode getGeom() */
	public GM_LineString getGeometrie() {return (GM_LineString)geom;}
	/** Définit la géométrie de l'objet, castée plus précisément qu'avec la méthode setGeom() */
	public void setGeometrie(GM_LineString G) {this.geom = G;}


}
