package org.lafeuille.hexagame.services;

import org.lafeuille.hexagame.services.HexagameService;

import javax.ejb.Remote;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Remote(HexagameService.class)
public class HexagameEjb {

    @PersistenceContext
    private EntityManager entityManager;

}
