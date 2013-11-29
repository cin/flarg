package com.cinple.flarg.android;

import com.badlogic.gdx.graphics.Texture;
import com.cinple.flarg.core.Flarg;

import android.os.Bundle;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;

public class FlargActivity extends AndroidApplication {

	@Override
	public void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
            Texture.setEnforcePotImages(false);
			AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
			config.useGL20 = true;
			initialize(new Flarg(), config);
	}
}
