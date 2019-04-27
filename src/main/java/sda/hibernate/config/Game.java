package sda.hibernate.config;


import javax.persistence.*;
import java.util.Set;

@Entity
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private double price;
    private String publisher;

    @ManyToMany(mappedBy = "games")
    private Set<User> user;

}
