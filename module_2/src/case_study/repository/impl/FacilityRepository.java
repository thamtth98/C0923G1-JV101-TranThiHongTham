package case_study.repository.impl;

import case_study.models.facility.Facility;
import case_study.models.facility.House;
import case_study.models.facility.Room;
import case_study.models.facility.Villa;
import case_study.repository.IFacilityRepository;

import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityRepository implements IFacilityRepository {
    private static Map<Facility,Integer> facilityList = new LinkedHashMap<>();
    static {
        //String idService, String name, Double area, Double rentalCosts,
        // Integer numberOfPeople, String typeDate, String roomHouse, Integer numberOfFloorHouse
        Facility house = new House("H-01","green-house",100.0,1300000.0,5,"Short","505",13);
        facilityList.put(house,5);
    }

    @Override
    public Map<Facility, Integer> display() {
        return facilityList;
    }

    @Override
    public void addVilla(Villa villa) {
        facilityList.put(villa,0);
    }

    @Override
    public void addHouse(House house) {
        facilityList.put(house,0);
    }

    @Override
    public void addRoom(Room room) {
        facilityList.put(room,0);
    }

    @Override
    public Map<Facility, Integer> listMaintenance() {
        Map<Facility,Integer> listMaintenance = new LinkedHashMap<>();
        for (Map.Entry<Facility, Integer> temp: facilityList.entrySet()){
            if(temp.getValue()>= 5){
                listMaintenance.put(temp.getKey(), temp.getValue());
            }
        }
        return listMaintenance;
    }

    @Override
    public Facility findIdService(String idService) {
        for (Facility temp: facilityList.keySet()){
            if(temp.getIdService().equals(idService)){
                return temp;
            }
        }
        return null;
    }
}
