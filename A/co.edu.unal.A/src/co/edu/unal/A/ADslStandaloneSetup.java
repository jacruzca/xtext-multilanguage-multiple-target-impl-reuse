/*
* generated by Xtext
*/
package co.edu.unal.A;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class ADslStandaloneSetup extends ADslStandaloneSetupGenerated{

	public static void doSetup() {
		new ADslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
