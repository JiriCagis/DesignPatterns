package creator.builder;

/**
 * Created by osboxes on 06/01/18.
 */
public class CheapBuilder implements Builder {

    private Building building;

    @Override
    public void startNew() {
        building = new Building();
    }

    @Override
    public void buildFloor() {
        building.setFloor("laminate floor");
    }

    @Override
    public void buildWalls() {
        building.setWalls("panel walls");
    }

    @Override
    public void buildRoof() {
        building.setRoof("wooden roof");
    }

    @Override
    public Building getResult() {
        return building;
    }
}
