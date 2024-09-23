package demo;

import java.io.IOException;
import java.util.List;

import org.languagetool.JLanguageTool;
import org.languagetool.Languages;
// import org.languagetool.language.AmericanEnglish;
import org.languagetool.rules.RuleMatch;
public class SPELL {
    
    public SpellCheckResponse checkSpelling(String text) throws IOException , Exception {
        JLanguageTool langTool = new JLanguageTool(Languages.getLanguageForShortCode("en-US"));
        SpellCheckResponse response = new SpellCheckResponse();
        System.out.println("language tool initialised");
        
        try {
            List<RuleMatch> matches = langTool.check(text);
            for (RuleMatch match : matches) {
                response.setErrorWord(match.getMessage());
                response.setSuggestions(match.getSuggestedReplacements());
                response.setOffset(match.getFromPos());
                response.setLength(match.getToPos() - match.getFromPos());
            }
        } catch (Exception e) {
            e.printStackTrace(); // Handle exceptions appropriately
        }
        return response;
        
    }
}

//slf4j-api-1.7.36.jar     slf4j-simple-1.7.36.jar