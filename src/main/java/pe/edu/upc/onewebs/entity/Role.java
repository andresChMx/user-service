package pe.edu.upc.onewebs.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;



@Entity
@Table(name="roles")
@Data
@NoArgsConstructor
public class Role{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private ERole name;

    public Role(ERole name) {
        this.name = name;
    }
}

enum ERole {
    ROLE_STUDENT,
    ROLE_INSTRUCTOR,
    ROLE_NONE
}