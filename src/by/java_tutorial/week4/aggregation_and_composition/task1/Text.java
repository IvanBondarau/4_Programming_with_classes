package by.java_tutorial.week4.aggregation_and_composition.task1;

import java.lang.reflect.Array;

public class Text {

    private int length = 0;
    private int capacity = 0;
    private Sentence[] sentences = null;
    private String title = null;

    public Text(String text, String title) {
        this.set(text);
        this.setTitle(title);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void set(String text) {
        if (text == null) {
            this.sentences = null;
            return;
        }

        String[] splitted = text.split("\\.|\\!|\\?");
        length = splitted.length;
        capacity = 1;
        while (capacity < length) {
            capacity *= 2;
        }
        sentences = new Sentence[capacity];

        for (int i = 0; i < splitted.length; i++) {
            sentences[i] = new Sentence(splitted[i]);
        }
    }

    public String get() {
        String res = "";
        res += title == null ? "" : title + "\n\n";

        for (int i = 0; i < length; i++) {
            res += sentences[i].get();
            res += ".";
        }

        return res;
    }

    public void add(Sentence sentence) {
        if (length == 0) {
            set(sentence.get());
            return;
        }

        if (length == capacity) {
            capacity *= 2;
            Sentence[] newData = new Sentence[capacity];
            for (int i = 0; i < length; i++) {
                newData[i] = sentences[i];
            }
            sentences = newData;
        }
        sentences[length++] = sentence;
    }
}
