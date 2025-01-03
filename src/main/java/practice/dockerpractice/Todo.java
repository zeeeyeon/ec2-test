package practice.dockerpractice;
import lombok.*;

@Getter @Setter
public class Todo {
    private Long id;
    private String title;
    private boolean completed;

    public Todo() {}

    public Todo(Long id, String title, boolean completed) {
        this.id = id;
        this.title = title;
        this.completed = completed;
    }
}

