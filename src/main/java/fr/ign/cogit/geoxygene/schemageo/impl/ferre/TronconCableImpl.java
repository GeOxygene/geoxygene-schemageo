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
 * @author julien Gaffuri 26 juin 2009
 */
package fr.ign.cogit.geoxygene.schemageo.impl.ferre;

import fr.ign.cogit.geoxygene.schemageo.api.ferre.TronconCable;
import fr.ign.cogit.geoxygene.schemageo.impl.support.reseau.ArcReseauImpl;

/**
 * telepherique, remontee mecanique, funiculaire, etc.
 * 
 * @author julien Gaffuri 26 juin 2009
 * 
 */
public class TronconCableImpl extends ArcReseauImpl implements TronconCable {

  /**
   * l'altitude maximale de l'objet
   */
  private double zMax;

  @Override
  public double getZMax() {
    return this.zMax;
  }

  @Override
  public void setZMax(double zMax) {
    this.zMax = zMax;
  }

  /**
   * l'altitude minimale de l'objet
   */
  private double zMin;

  @Override
  public double getZMin() {
    return this.zMin;
  }

  @Override
  public void setZMin(double zMin) {
    this.zMin = zMin;
  }

  private double zIni = 0;

  @Override
  public double getZIni() {
    return this.zIni;
  }

  @Override
  public void setZIni(double zIni) {
    this.zIni = zIni;
  }

  private double zFin = 0;

  @Override
  public double getZFin() {
    return this.zFin;
  }

  @Override
  public void setZFin(double zFin) {
    this.zFin = zFin;
  }

}
