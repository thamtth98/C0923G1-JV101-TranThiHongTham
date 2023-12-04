package case_study.repository;

import case_study.models.facility.Facility;
import case_study.models.facility.House;
import case_study.models.facility.Room;
import case_study.models.facility.Villa;

import java.util.Map;

public interface IFacilityRepository {
    Map<Facility, Integer> display();

    void addVilla(Villa villa);

    void addHouse(House house);

    void addRoom(Room room);

    Map<Facility, Integer> listMaintenance();

    Facility findIdService(String idService);
}
