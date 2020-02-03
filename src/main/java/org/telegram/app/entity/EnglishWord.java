package org.telegram.app.entity;

/**
 * Английское слово
 * Created by kalyashov-ga on 2020-01-17.
 */
public class EnglishWord {

    private String word;
    private String translation;

    public EnglishWord() {
    }

    public EnglishWord(String word, String translation) {
        this.word = word;
        this.translation = translation;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    @Override
    public String toString() {
        return word + ", [" + translation + "]";
    }
}
