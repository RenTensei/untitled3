public class MainCar {

    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        boolean compare;
        car1.maxSpeed = 270;
        car1.weight = 1195;
        car1.volume = 1.8;
        car1.name = "какая-то ламба";
        car2.maxSpeed = 300;
        car2.weight = 950;
        car2.volume = 1.8;
        car2.name = "какая-то феррари";
        car1 = car2;


        compare = car1.equals(car2);
        System.out.println("Машины одинаковы? "+compare);
        if (car1.maxSpeed> car2.maxSpeed || car1.volume>= car2.volume){
            System.out.println("Вероятнее всего "+car1.name+" выйдет победителем");
        }
        else {
            System.out.println("Вероятнее всего "+car2.name+" выйдет победителем");
        }

    }
}
