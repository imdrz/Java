
/**
1st Driver:
1st Navigator:
Date: March 4, 2025
 */
import java.util.Arrays;
import java.util.Scanner;

public class Thesaurus {
    String[][] words; // Contains all words in Thesaurus
    String[][] synonyms; // Contains the synonyms, each element has a corresponding element in words

    // let's pass in some 2d arrays with data that we can use to populate our 2D
    // array fields, words and synonyms:
    public Thesaurus(String[][] starterWords, String[][] starterSyns) {
        // each row corresponds to letter
        int maxR = 26;
        // up to 100 words for each letter
        int maxC = 100;

        words = new String[maxR][maxC];
        synonyms = new String[maxR][maxC];

        // First job: finish these for loop headers:
        for (int r = 0; r < starterWords.length; r++) {
            for (int c = 0; c < starterWords[r].length; c++) {
                words[r][c] = starterWords[r][c];
                synonyms[r][c] = starterSyns[r][c];
            }
        }

        // System.out.println(Arrays.toString(words));
    }

    /**
     * This is a private method used by findSynonyms and addWord to quickly find the
     * correct row in the words 2D array based on the first letter w of the String
     * passed in.
     * 
     * For example if w = "apple", getRow should return 0, because the 'a' indicates
     * apple would be stored in row 0.
     * 
     * - w is a String value containg a word to search for
     * 
     * - return an int containing the appropriate row number in words for w.
     */
    private int getRow(String w) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String firstLetter = w.substring(0, 1);
        int position = alphabet.indexOf(firstLetter.toLowerCase());

        return position;

    }

    /**
     * This method returns the synonyms for the parameter w.
     * 
     * 
     * Its first check is if w exists in the words 2D array.
     * 
     * If it exists, return the corresponding element in the synonyms 2D array.
     * 
     * getRow() should be used so that the entire 2D array does not need to be
     * searched.
     * 
     * If w does not exist in the words 2D array, look for it in the synonyms 2D
     * array, if it exists return, the other synonyms for this element and the
     * corresponding element in the words 2D array.
     * 
     * Otherwise, return "not found" message.
     * 
     * w: a String value containg a word to search for
     * 
     * return a String consisting of synonyms for w.
     */
    public String findSynonyms(String w) {
        if (getRow(w) > -1) {
            int rowPos = getRow(w);
            boolean inWords = false;
            for (int i = 0; i < words[rowPos].length; i++) {
                if (words[rowPos][i] != null) {
                    if (words[rowPos][i].equals(w)) {
                        inWords = true;
                    }
                }

            }
            if (inWords) {
                System.out.println(rowPos);
                int colPos = 0;
                for (int i = 0; i < 100; i++) {
                    if (words[rowPos][i] != null) {
                        if (words[rowPos][i].equals(w)) {
                            colPos = i;
                        }
                    }
                }
                // int commaI = synonyms[rowPos][colPos].indexOf(",");
                return synonyms[rowPos][colPos];
                // .substring(0, commaI);
            } else {
                int l = 0;
                for (String[] row : synonyms) {
                    int j = 0;
                    for (String syns : row) {
                        if (syns != null) {
                            if (syns.contains(w)) {
                                int i = syns.indexOf(w);
                                syns = syns.replace(syns.substring(i, i + w.length()), "") + words[l][j];
                                return syns;

                            }
                        }
                        j++;
                    }
                    l++;
                }
                return "Not found";
            }

        } else {
            return "Not found";
        }

    }

    /**
     * 
     * This method adds a word to the Thesaurus.
     * 
     * getRow() should be called to find the correct row in the 2D arrays.
     * 
     * Once the row is found, check to see there is room to insert a word.
     * 
     * Use the insert algorithm, to ensure alphabetical order of array is preserved.
     * 
     * Use String's compareTo method to find the correct spot to insert the word.
     * 
     * Otherwise, return "not found" message.
     * 
     * Insert the synonyms String
     * 
     * w: a String value containg a word to search for
     * syns: a String value containg synonyms for the word to be inserted
     * 
     * return a boolean indicating whether the word could be inserted.
     */
    public boolean addWord(String w, String syn) {
        int rowPos = getRow(w);
        int colPos = 0;
        for (int i = 0; i < 100; i++) {
            if (words[rowPos][i] == null) {
                // finding proper alphabetical position
                for (String word : words[rowPos]) {
                    if (word != null) {
                        if (w.compareTo(word) < 0) {
                            // shifting all element right from index in both arrays
                            for (int j = 100 - 1; j > colPos; j--) {
                                words[rowPos][j] = words[rowPos][j - 1];
                                synonyms[rowPos][j] = synonyms[rowPos][j - 1];
                            }
                            words[rowPos][colPos] = w;
                            synonyms[rowPos][colPos] = syn + ", ";

                            return true;
                        } else if (w.compareTo(word) == 0) {
                            // synonyms[rowPos][colPos] += ", " + syn;
                            // return true;
                            return false;
                        }
                    } else {
                        words[rowPos][colPos] = w;
                        synonyms[rowPos][colPos] = syn;
                        return true;
                    }
                    colPos++;
                }
            }
        }
        return false;
    }

    public String toString() {
        String result = "Words:\n";
        for (int i = 0; i < 26; i++) {
            boolean newLine = false;
            for (int j = 0; j < 100; j++) {
                if (words[i][j] != null) {
                    result += words[i][j] + ", ";
                    newLine = true;
                }
            }
            if (newLine) {
                result += "\n";
            }
        }
        result += "Synonyms:\n";
        for (int i = 0; i < 26; i++) {
            boolean newLine = false;
            for (int j = 0; j < 100; j++) {
                if (synonyms[i][j] != null) {
                    result += "[" + synonyms[i][j] + "], ";
                    newLine = true;
                }
            }
            if (newLine) {
                result += "\n";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[][] starterWords = {
                { "able", "average" },
                { "bad", "bald", "big" },
                { "carefree", "cold", "cute" },
                { "dangerous", "daring", "dead", "desperate" },
                { "eager", "excited" },
                { "far", "friendly" } };

        String[][] syns = {
                { "capable, skillful", "regular, mean" },
                { "terrible, awful, lousy", "hairless", "large, gigantic, enormous" },
                { "happy, worry-free", "frigid, icy", "adorable" },
                { "risky", "adventurous, risktaking", "gone", "dire" },
                { "excited, intent", "animated, enthusiastic" },
                { "distant, remote", "affable, welcoming" } };

        Thesaurus myThesauraus = new Thesaurus(starterWords, syns);

        System.out.println(myThesauraus);

        Scanner reader = new Scanner(System.in);
        while (true) {
            System.out.println("1) Enter a word to look up");
            System.out.println("2) Add a word to Thesauraus");
            System.out.println("3) View Thesauraus");
            String choice = reader.nextLine();
            int option = 0;
            switch (choice) {
                case "1":
                    option = 1;
                    break;
                case "2":
                    option = 2;
                    break;
                case "3":
                    option = 3;
                    break;
                default:
                    option = 0;
                    break;
            }
            if (option == 1) {

                System.out.println("Enter a word to look up");
                String word = reader.nextLine();
                word = word.toLowerCase();
                word = word.trim();
                if (word.indexOf(" ") > -1) {
                    word = word.substring(0, word.indexOf(" "));

                }
                System.out.println(myThesauraus.findSynonyms(word));
            } else if (option == 2) {
                System.out.println("Enter a word to add");
                String word = reader.nextLine();
                word = word.trim();
                if (word.indexOf(" ") > -1) {
                    word = word.substring(0, word.indexOf(" "));

                }
                System.out.println("Enter synonyms for " + word);
                String synonyms = reader.nextLine();

                if (myThesauraus.addWord(word, synonyms) == false) {
                    System.out.println("No room");
                }
            } else if (option == 3) {
                System.out.println(myThesauraus);
            }

        }

    }
}