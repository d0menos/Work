public class Car extends Vehicle {
    public String name = "Cosmolet";
    public String sayHello = "Welcome to " + name;

    @Override
    String startEngine() {
        return "Автомобіль  стартував , трактор у полі тртртр ";
    }
    @Override
    String stopEngine() {
        return "Автомобіль заглох, трактор у полі вже не тртртр";
    }
    @Override
    String drive() {
        return "По полям, по полям\n" +
                "Синий трактор едет к нам\n" +
                "У него в прицепе кто-то пеcенку поёт!\n" +
                "А ну, малыш, давай!\n" +
                "Попробуй отгадай\n" +
                "Кто же, кто же, кто же, кто же песенку поёт?!";
    }
}
