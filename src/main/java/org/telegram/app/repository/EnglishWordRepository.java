package org.telegram.app.repository;

import org.telegram.app.entity.EnglishWord;

/**
 * Created by kalyashov-ga on 2020-01-17.
 */
public class EnglishWordRepository {

    public EnglishWord getEnglishWord() {
        return new EnglishWord("Test", "Тест");
    }
}
