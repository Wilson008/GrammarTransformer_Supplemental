/*
 * generated by Xtext 2.25.0
 */
package org.eclipse.eatxt.full.optimized;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class EatxtStandaloneSetup extends EatxtStandaloneSetupGenerated {

	public static void doSetup() {
		new EatxtStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
