package com.Tyrfing.spring.services;

import com.Tyrfing.models.areas.Room;
import com.Tyrfing.spring.repos.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomService {

    private RoomRepository repo;

    @Autowired
    public RoomService(RoomRepository ec){
        this.repo = ec;
    }

    public Iterable<Room> index() {
        return this.repo.findAll();
    }

    public Room create(Room room) {
        return repo.save(room);
    }

    public Room read(Long id) {
        return repo.findById(id).get();
    }

    public Room update(Long id, Room data) {
        Room orig = read(id);
        orig.setPrevId(data.getPrevId());
        orig.setHiddenPathId(data.getHiddenPathId());
        orig.setPathHidden(data.isPathHidden());
        orig.setSidePathId(data.getSidePathId());
        orig.setStraightPathId(data.getStraightPathId());
        return create(orig);
    }

    public Boolean delete(Long id) {
        repo.deleteById(id);
        return true;
    }

}
