/*
* generated by Xtext
*/
package co.edu.unal.C;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class CDslStandaloneSetup extends CDslStandaloneSetupGenerated{

	public static void doSetup() {
		new CDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
