package demo;
import java.util.List;

public class SpellCheckResponse {
    private String errorWord;
    private List<String> suggestions;
    private int offset;
    private int length;

    // Getters and Setters

    public String getErrorWord() {
        return errorWord;
    }

    public void setErrorWord(String errorWord) {
        this.errorWord = errorWord;
    }

    public List<String> getSuggestions() {
                return suggestions;
    }

    public void setSuggestions(List<String> suggestions) {
        this.suggestions = suggestions;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    public void display(){
        System.err.println("errorword : " + errorWord);
        System.out.println("offset : " + offset);
        System.out.println("suggestions : { ");
        for(String s : suggestions){
            System.out.println(s);
        }
        System.out.println(" }");
        System.out.println("length : " + length);
    }
    
}