package repository;

import domain.Champion;

import java.util.List;

// 저장소 관리를 위해서
public interface MockRepository {
    List<Champion> findAll();

    Champion findByName(String name);

    Champion updatePositionByName(String name, String position);

    void addChampion(Champion champion);
}
