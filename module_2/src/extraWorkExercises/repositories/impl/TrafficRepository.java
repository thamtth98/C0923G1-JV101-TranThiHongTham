package extraWorkExercises.repositories.impl;

import extraWorkExercises.models.Motorbike;
import extraWorkExercises.models.Traffic;
import extraWorkExercises.repositories.ITrafficRepository;

import java.util.ArrayList;
import java.util.List;

public class TrafficRepository implements ITrafficRepository {
    private static List<Traffic> traffics = new ArrayList<>();
    private static List<Traffic> truckList = new ArrayList<>();
    private static List<Traffic> motorList = new ArrayList<>();
    private static List<Traffic> carList = new ArrayList<>();

    static {
        Traffic moto1 = new Motorbike("74B1-30799", "1-Yamaha-Japan", "2023", "Tui", 1234d);
        Traffic moto2 = new Motorbike("74B1-51423", "2-Honda-Japan", "2023", "Ban tui", 1236d);
        motorList.add(moto1);
        motorList.add(moto2);
        traffics.add(moto1);
        traffics.add(moto2);
    }

    @Override
    public void addTheTruck(Traffic truck) {
        truckList.add(truck);
        traffics.add(truck);
    }

    @Override
    public void addTheCar(Traffic car) {
        carList.add(car);
        traffics.add(car);
    }

    @Override
    public void addTheMotorbike(Traffic motorbike) {
        motorList.add(motorbike);
        traffics.add(motorbike);
    }

    @Override
    public List<Traffic> showAll() {
        return traffics;
    }

    public List<Traffic> showTruckList() {
        return truckList;
    }

    public List<Traffic> showCarList() {
        return carList;
    }

    public List<Traffic> showMotorList() {
        return motorList;
    }


    @Override
    public Traffic findControlPlate(String controlPlate) {
        for (Traffic traffic : traffics) {
            if (traffic.getControlPlate().equals(controlPlate)) {
                return traffic;
            }
        }
        return null;
    }

    @Override
    public void remove(String controlPlate) {
        for (Traffic item : traffics) {
            if (item.getControlPlate().equals(controlPlate)) {
                traffics.remove(item);
                break;
            }
        }
    }

    @Override
    public List<Traffic> searchControlPlate(String controlPlate) {
        List<Traffic> listSearch = new ArrayList<>();
        for (Traffic item : traffics) {
            if (item.getControlPlate().contains(controlPlate)) {
                listSearch.add(item);
            }
        }
        return listSearch;
    }
}
