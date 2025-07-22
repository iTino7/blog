package tinoborrelli.blog.entities;


import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Blog {
    private int id;
    private String category;
    private String title;
    private String cover;
    private String content;
    private int readingTime;
}
