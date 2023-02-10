package com.example.sql_rocks;

import javax.persistence.*;

@Entity
@Table(name="card_info")

public class LibraryCard {
    @Id
    private int cardNo;
    private int fine;
    private int bookIssued;
    @Enumerated(value=EnumType.STRING) //to store in db in string format
    private CardStatus cardStatus;
    @OneToOne //describing maoing relation between child and parent class
    @JoinColumn//telling to add a foriegn key,by default fk is pk of parent class
    User user;

}
