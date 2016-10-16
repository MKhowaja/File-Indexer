import java.util.*;
import java.io.*;

/**
 * A class that provides a CLI which takes n files as input and returns the top 10 most common words in the files.
 * @version 1.00 15 Oct 2016
 * @author Mustaqeem Khowaja
 */
public class FileIndexer {
    // Delimited by non alphanumeric characters
    private static final String REGEX = "[^a-zA-Z0-9]+";

    private static int N = 10;

    public static void main(String [] args){
        if (args.length == 0) {
            System.out.println("Please include one or more input files.");
        }

        // Collection to store word tokens as they are read
        Map <String, Word> wordMap = new HashMap<>();

        // Iterate through each file and read its contents
        for (int i = 0; i < args.length; i++){
            BufferedReader reader;
            try {
                reader = new BufferedReader(new InputStreamReader(new FileInputStream(args[i])));
                String line;
                while ((line = reader.readLine()) != null) {
                    // split line of words into array of tokens
                    String[] tokens = line.split(REGEX);
                    for (String token : tokens) {

                        // Not a word
                        if (token.equals("")) {
                            continue;
                        }

                        Word curWord = wordMap.get(token);
                        if (curWord == null) {
                            curWord = new Word(token);
                            wordMap.put(token, curWord);
                        }
                        curWord.incrementCount();
                    }
                }
                reader.close();
            }
            catch (IOException e){
                System.err.println("Could not read file " + args[i]);
                continue;
            }
        }

        // Define a Sorted set to hold the words in descending order of occurrence
        SortedSet <Word> sortedWordSet = new TreeSet<Word>(wordMap.values());
        int i = 0;
        for (Word word : sortedWordSet){
            if (i == N){
                break;
            }
            System.out.println(i+1 + ".\t" + word.Word() + "\t" + word.Count());
            i++;
        }
    }
}
