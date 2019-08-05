package by.java_tutorial.week4.aggregation_and_composition.task1;

public class Word {
    String lexeme;

    Word(String lexeme) {
        this.lexeme = lexeme;
    }

    public String get() {
        return lexeme;
    }

    public void set(String lexeme) {
        this.lexeme = lexeme;
    }
}
