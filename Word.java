/**
 * A class that stores a word and its number of occurrences.
 * @version 1.00 15 Oct 2016
 * @author Mustaqeem Khowaja
 */
public class Word implements Comparable<Word>{
    private String word;
    private int count;

    /**
     * Creates a Word instance based on the passed in value.
     * Initializes count to 0.
     * @param word The word to set
     */
    public Word (String word){
        this.word = word;
        count = 0;
    }

    /**
     * Increments the instance variable count
     */
    public void incrementCount(){
        count+=1;
    }

    public String Word (){
        return word;
    }

    @Override
    public int hashCode()
    {
        return Word().hashCode();
    }

    @Override
    public boolean equals(Object obj)
    {
        return this.Word().equals(((Word)obj).Word());
    }

    public int Count() {
        return count;
    }

    /**
     * A comparator to be used by sort methods to sort in descending order.
     * @param other The Word to compare with
     * @return An int value which if positive means other has a higher count and vice versa for negative.
     */
    @Override
    public int compareTo(Word other){
        return other.Count()-this.Count();
    }

}
