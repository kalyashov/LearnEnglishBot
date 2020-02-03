package org.telegram.bot.commands;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.telegram.telegrambots.extensions.bots.commandbot.commands.BotCommand;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Chat;
import org.telegram.telegrambots.meta.api.objects.User;
import org.telegram.telegrambots.meta.bots.AbsSender;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

/**
 * Команда приветствие
 * Created by kalyashov-ga on 2020-01-15.
 */
public class StartCommand extends BotCommand {

    private static final Logger LOG = LogManager.getLogger();

    private static final String START_TEXT = "Привет! Я бот для изучения английского языка. \n"
            + "@lazy_engl - канал, куда я ежедневно публикую английские слова";

    public StartCommand() {
        super("start", "Start command");
    }

    @Override
    public void execute(AbsSender absSender, User user, Chat chat, String[] strings) {

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chat.getId().toString());
        sendMessage.setText(START_TEXT);

        try {
            absSender.execute(sendMessage);
        } catch (TelegramApiException e) {
            LOG.error(e);
        }
    }
}
