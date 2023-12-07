package case_study.services;

import case_study.models.facility.Facility;
import case_study.models.facility.House;
import case_study.models.facility.Room;
import case_study.models.facility.Villa;

import java.util.Map;

public interface IFacilityService{
    Map<Facility, Integer> displayFacility();

    void addVilla(Villa villa);

    void addHouse(House house);

    void addRoom(Room room);

    Map<Facility, Integer> listMaintenance();

    Facility findIdService(String idService);


    void delFacility(Facility facility);
}
