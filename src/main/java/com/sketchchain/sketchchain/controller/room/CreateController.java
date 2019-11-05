package com.sketchchain.sketchchain.controller.room;

import com.sketchchain.sketchchain.dto.RoomCreateRequestDto;
import com.sketchchain.sketchchain.repository.RoomRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class CreateController {

    private RoomRepository roomRepository;

    @PostMapping("/room/")
    public void createRoom(@RequestBody RoomCreateRequestDto dto) {
       roomRepository.save(dto.toEntity());
    }

}
