package com.sketchchain.sketchchain.repository;

import com.sketchchain.sketchchain.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
