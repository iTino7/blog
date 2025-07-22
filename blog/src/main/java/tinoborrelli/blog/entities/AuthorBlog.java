package tinoborrelli.blog.entities;

import java.time.LocalDate;

public class AuthorBlog {
    private int id;
    private String name;
    private String surname;
    private String email;
    private LocalDate birthday;
    private String avatar;

    public AuthorBlog(String name, String surname, String email, LocalDate birthday) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.birthday = birthday;
        this.avatar = "https://ui-avatar.com/api/?name" + name + "+" + surname;
    }
}
