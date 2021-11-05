public class MainCar {

    public static void main(String[] args) {
        Car car1 = new Car(260,2000,2.7,"123RT456","BMW");
        Car car2 = new Car(250,2500,2.7,"123RT4567","Audi");

        System.out.println("Машины одинаковы? "+car1.equals(car2));
        if (car1.getMaxSpeed()> car2.getMaxSpeed() || car1.getVolume()>= car2.getVolume()){
            System.out.println("Вероятнее всего "+car1.getName()+" выйдет победителем");
        }
        else {
            System.out.println("Вероятнее всего "+car2.getName()+" выйдет победителем");
        }
        


    }
}
