import jakarta.persistence.*;


import java.util.List;

@Entity
public class Division {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String district;

    @ManyToOne
    @JoinColumn(name = "president_id")
    private Miembro president;

    @OneToMany(mappedBy = "division", cascade = CascadeType.ALL)
    private List<Miembro> members;

    // Getters and Setters
}
