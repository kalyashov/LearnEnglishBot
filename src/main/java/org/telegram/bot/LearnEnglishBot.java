package org.telegram.bot;

import org.telegram.bot.commands.StartCommand;
import org.telegram.bot.config.BotConfig;

/**
 * Бот для изучения английских слов, с определенной периодичностью
 * отправляет сообщение со списком рандомных слов в канал
 * Created by kalyashov-ga on 2020-01-15.
 */
public class LearnEnglishBot extends BaseTelegramBot {

    public LearnEnglishBot() {
        register(new StartCommand());
    }

    public String getBotUsername() {
        return BotConfig.getBotName();
    }

    public String getBotToken() {
        return BotConfig.getBotTokenParam();
    }
}
