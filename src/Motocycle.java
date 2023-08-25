public class Motocycle extends Vehicle{
 public int speed;
 public String turnovers;

    @Override
    String startEngine() {
        return "TRtrrrrtrt";
    }

    @Override
    String stopEngine() {
        return "tshh";
    }

    @Override
    String drive() {
        return "VRrvvrvrrvvrrrrrrrrrrrrrrrrrrrrvrrrrrrrrrr";
    }
}
