/*
 * generated by Xtext 2.25.0
 */
package org.omg.qvt10.myqvto;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class MyQvtoStandaloneSetup extends MyQvtoStandaloneSetupGenerated {

	public static void doSetup() {
		new MyQvtoStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
