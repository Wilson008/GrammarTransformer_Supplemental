/*
 * generated by Xtext 2.25.0
 */
package org.xtext.example.myspectra.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class MySpectraAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/xtext/example/myspectra/parser/antlr/internal/InternalMySpectra.tokens");
	}
}