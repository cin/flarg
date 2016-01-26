package com.cinple.flarg.html;

import com.cinple.flarg.core.Flarg;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.gwt.GwtApplication;
import com.badlogic.gdx.backends.gwt.GwtApplicationConfiguration;

public class FlargHtml extends GwtApplication {
	@Override
	public ApplicationListener getApplicationListener () {
		return new Flarg();
	}
	
	@Override
	public GwtApplicationConfiguration getConfig () {
		return new GwtApplicationConfiguration(480, 320);
	}
}
