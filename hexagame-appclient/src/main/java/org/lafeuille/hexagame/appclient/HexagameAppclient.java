package org.lafeuille.hexagame.appclient;

import javax.ejb.EJB;

import org.lafeuille.hexagame.services.HexagameService;

public class HexagameAppclient {

    @EJB
    private static HexagameService hexagameService;

    public static void main(final String... parameters) {
	Application.launch(HexagameApplication.class, parameters);
    }
}
