/*
 * generated by Xtext 2.25.0
 */
package org.omg.qvt13.myqvto.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.omg.qvt13.myqvto.parser.antlr.internal.InternalMyQvtoParser;
import org.omg.qvt13.myqvto.services.MyQvtoGrammarAccess;

public class MyQvtoParser extends AbstractAntlrParser {

	@Inject
	private MyQvtoGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalMyQvtoParser createParser(XtextTokenStream stream) {
		return new InternalMyQvtoParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "TopLevelGO";
	}

	public MyQvtoGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyQvtoGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
