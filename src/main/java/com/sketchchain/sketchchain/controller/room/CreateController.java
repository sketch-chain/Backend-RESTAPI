package com.sketchchain.sketchchain.controller.room;

import com.sketchchain.sketchchain.dto.RoomCreateRequestDto;
import com.sketchchain.sketchchain.entity.Room;
import com.sketchchain.sketchchain.repository.RoomRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@AllArgsConstructor
public class CreateController {

    private RoomRepository roomRepository;

    @GetMapping("/room/")
    public List<Room> showRoomList() {
        return roomRepository.findAll();
    }

    @PostMapping("/room/")
    public void createRoom(@RequestBody RoomCreateRequestDto dto) {
        roomRepository.save(dto.toEntity());
    }

    @PatchMapping("/room/join")
    @ResponseBody
    public String joinRoom(@RequestParam String roomId) { return ("roomId=" + roomId); }
}
