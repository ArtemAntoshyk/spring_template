package devtitans.antoshchuk.spring_template.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "group_table")
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name", unique = true, nullable = false)
    private String name;

    @OneToMany(mappedBy = "group")
//    @JoinColumn(name = "group_id", referencedColumnName = "id")
    private List<Student> students;

}
