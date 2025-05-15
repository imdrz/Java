public class HiddenWord {
	private String word;
    
    public HiddenWord(String w) {
    	word = w;
    }
    
    public String getHint(String w) {
    	String toReturn = "";
        for (int i = 0; i < word.length(); i++) {
            String addon = "";
            for (int j = 0; j < w.length(); j++) {
                if (word.substring(i, i+1).equals(w.substring(j, j+1))) {
                    if (i == j) {
                        addon = word.substring(i, i+1);
                    } else {
                        addon = "+";
                    }
                    break;
                }
            }
            if (addon.length() < 1) {
                addon = "*";
            }
            toReturn = toReturn + addon;
        }
        return toReturn;
    }
}