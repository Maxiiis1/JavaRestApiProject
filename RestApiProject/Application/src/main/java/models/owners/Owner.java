package models.owners;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import models.cats.Cat;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "owner")
public class Owner{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String name;

    @Column(name = "born_date")
    private LocalDate bornDate;

    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL)
    private List<Cat> cats;
    private String password;
    private String role;
}
