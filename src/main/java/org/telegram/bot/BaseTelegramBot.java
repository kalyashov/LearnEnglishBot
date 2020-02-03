package org.telegram.bot;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.telegram.telegrambots.extensions.bots.commandbot.TelegramLongPollingCommandBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

/**
 * Телеграм-бот - базовый класс
 * Created by kalyashov-ga on 2020-01-17.
 */
public abstract class BaseTelegramBot extends TelegramLongPollingCommandBot {

    private static final Logger LOG = LogManager.getLogger();

    @Override
    public void processNonCommandUpdate(Update update) {
        if (update.hasMessage()) {

            Message message = update.getMessage();

            if (message.hasText()) {
                SendMessage echoMessage = new SendMessage();
                echoMessage.setChatId(message.getChatId());
                echoMessage.setText("I don't know :(");

                sendMessage(echoMessage);
            }
        }
    }

    private void sendMessage(SendMessage sendMessage) {
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            LOG.error(e);
        }
    }
}
