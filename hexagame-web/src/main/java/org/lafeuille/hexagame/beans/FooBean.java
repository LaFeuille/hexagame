package org.lafeuille.hexagame.beans;

import javax.ejb.EJB;

import org.lafeuille.hexagame.services.HexagameService;

public class FooBean {

    @EJB
    private HexagameService hexagameService;

}
