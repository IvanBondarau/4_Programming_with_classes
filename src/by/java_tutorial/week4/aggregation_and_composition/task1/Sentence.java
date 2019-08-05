package by.java_tutorial.week4.aggregation_and_composition.task1;



public class Sentence {

    private Word[] words;

    public Sentence(String sentence) {
        this.set(sentence);
    }

    public void set(String sentence) {

        String[] splitted = sentence.split(" |,");
        words = new Word[splitted.length];

        for (int i = 0; i < splitted.length; i++) {
            words[i] = new Word(splitted[i]);
        }
    }


    public String get() {
        String res = "";

        for (int i = 0; i < words.length; i++) {
            res += words[i].get();
            if (i != words.length - 1) {
                res += " ";
            }
        }

        return res;
    }

}
