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
 */
package fr.ign.cogit.geoxygene.schemageo.impl.administratif;

import fr.ign.cogit.geoxygene.schemageo.api.administratif.ChefLieu;
import fr.ign.cogit.geoxygene.schemageo.api.administratif.UniteAdministrativeComposite;
import fr.ign.cogit.geoxygene.schemageo.impl.support.partition.ZoneCompositeImpl;

/**
 * @author JGaffuri 21 octobre 2009
 * 
 */
public class UniteAdministrativeCompositeImpl extends ZoneCompositeImpl
    implements UniteAdministrativeComposite {

  /**
   * le chef lieu eventuel de l'objet
   */
  private ChefLieu chefLieu = null;

  @Override
  public ChefLieu getChefLieu() {
    return this.chefLieu;
  }

  @Override
  public void setChefLieu(ChefLieu chefLieu) {
    this.chefLieu = chefLieu;
  }

  /**
   * le code de l'objet
   */
  private String code = null;

  @Override
  public String getCode() {
    return this.code;
  }

  @Override
  public void setCode(String code) {
    this.code = code;
  }

  /**
   * le nom de l'objet
   */
  private String nom = null;

  @Override
  public String getNom() {
    return this.nom;
  }

  @Override
  public void setNom(String nom) {
    this.nom = nom;
  }

}
