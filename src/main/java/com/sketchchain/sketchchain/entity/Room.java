package com.sketchchain.sketchchain.entity;

import lombok.*;
import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Room {

    @Id
    @GeneratedValue
    private int id;

    @Column(length = 16, nullable = false)
    private String name;

    @Column(length = 6)
    private String password;

    @Column(nullable = false)
    private int round;

    @Column(nullable = false)
    private int time;

    @Builder
    public Room(String name, String password, int round, int time) {
        this.name = name;
        this.password = password;
        this.round = round;
        this.time = time;
    }

}
