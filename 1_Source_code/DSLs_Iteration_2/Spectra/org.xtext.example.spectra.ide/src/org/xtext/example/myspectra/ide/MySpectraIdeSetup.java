/*
 * generated by Xtext 2.25.0
 */
package org.xtext.example.myspectra.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.example.myspectra.MySpectraRuntimeModule;
import org.xtext.example.myspectra.MySpectraStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class MySpectraIdeSetup extends MySpectraStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new MySpectraRuntimeModule(), new MySpectraIdeModule()));
	}
	
}
