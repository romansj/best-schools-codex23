package io.bootify.my_app.schools;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "school")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class School {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private String name;

    @Column
    private String location;

}
