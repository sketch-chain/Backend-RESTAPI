package com.sketchchain.sketchchain.dto;

import com.sketchchain.sketchchain.entity.Room;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class RoomCreateRequestDto {

    private String name;
    private String password;
    private int round;
    private int time;

    public Room toEntity() {
        return Room.builder()
                .name(name)
                .password(password)
                .round(round)
                .time(time)
                .build();
    }
}
