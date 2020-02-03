package org.telegram.app.service;

import org.telegram.app.entity.EnglishWord;
import org.telegram.app.repository.EnglishWordRepository;

/**
 * Created by kalyashov-ga on 2020-01-17.
 */
public class EnglishWordService {

    public String getRandomWords(int count) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= count; i++) {
            sb.append(i).append(": ").append(getRandomWord()).append("%20");
        }

        return sb.toString();
    }

    public String getRandomWord() {
        EnglishWordRepository repository = new EnglishWordRepository();
        EnglishWord englishWord = repository.getEnglishWord();
        return englishWord.toString();
    }
}
