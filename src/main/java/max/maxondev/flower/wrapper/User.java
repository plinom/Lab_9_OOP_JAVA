package max.maxondev.flower.wrapper;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class User {
    @Id
    private long id;
    private String email;
    private String dob;
    private int age;
    public User() {}
    public User(long id, String email, String dob, int age) {
        this.id = id;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }
    public User(String email, String dob, int age) {
        this.email = email;
        this.dob = dob;
        this.age = age;
    }
}
