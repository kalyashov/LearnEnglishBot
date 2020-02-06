package org.telegram.bot.config;

/**
 * Конфиг бота
 * Created by kalyashov-ga on 2020-01-15.
 */
public class BotConfig {

    private static final PropertyConfig botConfig = new PropertyConfig("bot_config.properties");

    private static final String BOT_NAME_PARAM = "bot_name";
    private static final String BOT_TOKEN_PARAM = "bot_token";
    private static final String BROADCAST_CHANNEL_NAME_PARAM = "broadcast_channel";
    private static final String LEARN_ENGLISH_API_URL = "learn_english_api_url";

    /**
     * @return имя бота
     */
    public static String getBotName() {
        return botConfig.getProperty(BOT_NAME_PARAM);
    }

    /**
     * @return токен
     */
    public static String getBotTokenParam() {
        return botConfig.getProperty(BOT_TOKEN_PARAM);
    }

    /**
     * @return наименование канала для рассылки
     */
    public static String getBroadcastChannelName() {
        return botConfig.getProperty(BROADCAST_CHANNEL_NAME_PARAM);
    }

    public static String getAPIUrl() {
        return botConfig.getProperty(LEARN_ENGLISH_API_URL);
    }
}
