package org.telegram.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

/**
 * Вспомогательный сервис для работы с API Telegram
 * Created by kalyashov-ga on 2020-01-17.
 */
public class TelegramService {

    private static final Logger LOG = LogManager.getLogger();
    private static final String TELEGRAM_URL = "https://api.telegram.org/bot%s/sendMessage?chat_id=%s&text=\"%s\"";

    /**
     * Отправка сообщения в чат
     * @param token - токен
     * @param chatId - идентификатор чата
     * @param message - сообщение
     */
    public static void sendMessage(String token, String chatId, String message) {
        try {
            String urlString = String.format(TELEGRAM_URL, token, chatId, message);

            URL url = new URL(urlString);
            URLConnection conn = url.openConnection();

            StringBuilder sb = new StringBuilder();
            InputStream is = new BufferedInputStream(conn.getInputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String inputLine = "";
            while ((inputLine = br.readLine()) != null) {
                sb.append(inputLine);
            }

            String response = sb.toString();
            LOG.info(response);

        } catch (IOException e) {
            LOG.error(e);
        }
    }
}

