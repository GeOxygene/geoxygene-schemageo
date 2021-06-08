/*
 * This file is part of the GeOxygene project source files. GeOxygene aims at
 * providing an open framework which implements OGC/ISO specifications for the
 * development and deployment of geographic (GIS) applications. It is a open
 * source contribution of the COGIT laboratory at the Institut Géographique
 * National (the French National Mapping Agency). See:
 * http://oxygene-project.sourceforge.net Copyright (C) 2005 Institut
 * Géographique National This library is free software; you can redistribute it
 * and/or modify it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of the License,
 * or any later version. This library is distributed in the hope that it will be
 * useful, but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser
 * General Public License for more details. You should have received a copy of
 * the GNU Lesser General Public License along with this library (see file
 * LICENSE if present); if not, write to the Free Software Foundation, Inc., 59
 * Temple Place, Suite 330, Boston, MA 02111-1307 USA
 * 
 * @author julien Gaffuri 20 juil. 2009
 */
package fr.ign.cogit.geoxygene.schemageo.impl.support.reseau;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Table;

import fr.ign.cogit.geoxygene.feature.FT_FeatureCollection;
import fr.ign.cogit.geoxygene.schemageo.api.support.reseau.ElementLieAuReseau;
import fr.ign.cogit.geoxygene.schemageo.api.support.reseau.Reseau;

/**
 * @author julien Gaffuri 20 juil. 2009
 * 
 */
@Entity
@Table(name = "reseau")
public class ReseauImpl extends AgregatReseauImpl implements Reseau {

  /**
   * le nom de l'objet
   */
  String nom = "";

  @Override
  public String getNom() {
    return this.nom;
  }

  @Override
  public void setNom(String nom) {
    this.nom = nom;
  }

  /**
   * elements non topologiques lies au reseau
   */
  Collection<ElementLieAuReseau> elementsLiesAuReseau = new FT_FeatureCollection<ElementLieAuReseau>();

  @Override
  public Collection<ElementLieAuReseau> getElementsLiesAuReseau() {
    return this.elementsLiesAuReseau;
  }
}
