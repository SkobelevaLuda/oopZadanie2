import animals.Cat;
import transport.Car;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada ", "Granta, ", 1.7, " желтая, ", 2015,
                " Россия");

        Car audi = new Car("Audi ", "A8 50 L TDI quattro ", -3.0, " черная, ",
                2020, " Германия");


        Car bmv = new Car("BMW ", "Z 8, ", 3.0, " черная, ", 2021,
                " Германия");


        Car kia = new Car("Kia ", "Sportage 4-го поколения, ", 2.4, " красная, ",
                2015, " Южная Корея");

        Car hyundai = new Car("Hyundai ", "Avante, ", 1.7, " оранжевая, ",
                -55, " Южная Корея");
        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmv);
        System.out.println(kia);
        System.out.println(hyundai);



        /*Cat myrzik = new Cat("Мурзик");
        myrzik.getAge();
        myrzik.meow();

        Cat begemot = new Cat("Бегемот",-5);
        begemot.meow();

        System.out.println(" У кота "+myrzik.getName()+" "+myrzik.getFriends().length+" друзей");
        myrzik.addFriend (begemot);

        System.out.println(" У кота "+myrzik.getName()+" "+myrzik.getFriends().length+" друзей");
        //myrzik.friends[]meow;*/
    }

}
