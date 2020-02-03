package org.telegram;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.telegram.bot.LearnEnglishBot;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;

/**
 * Created by kalyashov-ga on 2020-01-15.
 */
@SpringBootApplication
@EnableScheduling
public class Application {

    private static final Logger LOG = LogManager.getLogger();

    public static void main(String[] args) {

        try {
            ApiContextInitializer.init();
            TelegramBotsApi telegramBotsApi = new TelegramBotsApi();

            LearnEnglishBot learnEnglishBot = new LearnEnglishBot();
            telegramBotsApi.registerBot(learnEnglishBot);

            SpringApplication.run(Application.class, args);

        } catch (Exception e) {
            LOG.error(e);
        }
    }
}
