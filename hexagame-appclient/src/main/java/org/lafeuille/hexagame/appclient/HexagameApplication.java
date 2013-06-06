package org.lafeuille.hexagame.appclient;

import javax.swing.JColorChooser;
import javax.swing.JComponent;
import javax.swing.JLabel;

import org.jdesktop.application.SingleFrameApplication;

public class HexagameApplication extends SingleFrameApplication {

    @Override
    protected void startup() {

	getMainView().setComponent(createMainComponent());
	getMainView().setStatusBar(createStatusBar());

	show(getMainView());
    }

    JComponent createMainComponent() {
	return new JColorChooser();
    }

    JComponent createStatusBar() {
	final JLabel countLabel = new JLabel();
	countLabel.setName("countLabel");
	return countLabel;
    }
}
