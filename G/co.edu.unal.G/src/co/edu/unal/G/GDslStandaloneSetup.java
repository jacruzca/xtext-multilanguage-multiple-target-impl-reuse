/*
* generated by Xtext
*/
package co.edu.unal.G;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class GDslStandaloneSetup extends GDslStandaloneSetupGenerated{

	public static void doSetup() {
		new GDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

