package pro.sky.telegrambot.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * Класс, представляющий сущность задачи уведомления.
 * Хранит информацию о задаче, включая идентификатор чата, текст сообщения и время уведомления.
 */
@Entity
public class NotificationTask {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Идентификатор чата, в который будет отправлено уведомление.
     */
    @Column(name = "chat_id")
    private Long chatId;

    /**
     * Текст сообщения для уведомления.
     */
    @Column(name = "message_text")
    private String messageText;

    /**
     * Дата и время, когда должно быть отправлено уведомление.
     */
    @Column(name = "notification_date_time")
    private LocalDateTime notificationDateTime;

    public NotificationTask() {
    }

    public NotificationTask(Long id, Long chatId, String messageText, LocalDateTime notificationDateTime) {
        this.id = id;
        this.chatId = chatId;
        this.messageText = messageText;
        this.notificationDateTime = notificationDateTime;
    }

    public Long getId() {
        return id;
    }

    public Long getChatId() {
        return chatId;
    }

    public String getMessageText() {
        return messageText;
    }

    public LocalDateTime getNotificationDateTime() {
        return notificationDateTime;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setChatId(Long chatId) {
        this.chatId = chatId;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public void setNotificationDateTime(LocalDateTime notificationDateTime) {
        this.notificationDateTime = notificationDateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NotificationTask that = (NotificationTask) o;
        return Objects.equals(id, that.id) && Objects.equals(chatId, that.chatId) && Objects.equals(messageText, that.messageText) && Objects.equals(notificationDateTime, that.notificationDateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, chatId, messageText, notificationDateTime);
    }

    @Override
    public String toString() {
        return "NotificationTask{" +
                "id=" + id +
                ", chatId=" + chatId +
                ", messageText='" + messageText + '\'' +
                ", notificationDateTime=" + notificationDateTime +
                '}';
    }

}
