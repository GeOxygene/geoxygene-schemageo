package fr.ign.cogit.appli.commun.schema.shp.bdcarto.hydrographie;

import fr.ign.cogit.appli.commun.schema.shp.bdcarto.ElementBDCarto;
import fr.ign.cogit.geoxygene.spatial.geomprim.GM_Point;


public abstract class ObjetHydrographiquePonctuel extends ElementBDCarto {

	/** Renvoie la géométrie de self */
	public GM_Point getGeometrie() {return (GM_Point)geom;}
	/** Définit la géométrie de self */
	public void setGeometrie(GM_Point geometrie) {this.geom = geometrie;}


	protected String type_;
	public String getType_() {return this.type_; }
	public void setType_ (String Type_) {type_ = Type_; }

	protected String nature;
	public String getNature() {return this.nature; }
	public void setNature (String Nature) {nature = Nature; }

	protected String toponyme;
	public String getToponyme() {return this.toponyme; }
	public void setToponyme (String Toponyme) {toponyme = Toponyme; }

	protected double cote;
	public double getCote() {return this.cote; }
	public void setCote (double Cote) {cote = Cote; }

}
