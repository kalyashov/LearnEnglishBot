package org.telegram.app.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.telegram.app.service.EnglishWordService;
import org.telegram.bot.config.BotConfig;
import org.telegram.util.TelegramService;

/**
 * Шедулер для рассылки сообщений со списком слов в канал
 * Created by kalyashov-ga on 2020-01-17.
 */
@Component
public class EnglishWordMessageScheduler {

    private static final EnglishWordService englishWordService = new EnglishWordService();

    @Scheduled(fixedRate = 40000)
    public void sendMessage() {
        TelegramService.sendMessage(BotConfig.getBotTokenParam(), BotConfig.getBroadcastChannelName(), englishWordService.getRandomWords(3));
    }
}
