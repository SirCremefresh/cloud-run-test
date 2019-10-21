package ch.sircremefresh;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

@Entity
@Table(name = "test_table")
public class TestEntity {
    @Id
    private String id;

    @Column
    private String timeString;

    public TestEntity() {
        this.id = UUID.randomUUID().toString();
        this.timeString = LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME);
    }

    public String getId() {
        return id;
    }

    public String getTimeString() {
        return timeString;
    }

    @Override
    public String toString() {
        return "TestEntity{" +
                "id='" + id + '\'' +
                ", timeString='" + timeString + '\'' +
                '}';
    }
}
