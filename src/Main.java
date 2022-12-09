import animals.Cat;
import transport.Car;

import javax.print.attribute.standard.PrinterInfo;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada","granta",2010,"Россия", "седан",5,
        " АКПП");

        Car audi = new Car("Audi ", "A8 50 L TDI quattro ", 2020, " Англия",
                "седан", 5, " АККП");


        Car bmv = new Car("BMW ", "Z 8, ", -2021, " Германия", "седан",
                7, "АККП");


        Car kia = new Car("Kia ", "Sportage 4-го поколения, ", 2010, " Южная Корея ",
                "седан", 5, " РКПП");

        Car hyundai = new Car("Hyundai ", "Avante, ", 2020, " Южная Корея ",
                "седан", 5, " РКПП ");
        printInfo(lada);
        printInfo(audi);
        printInfo(bmv);
        printInfo(kia);
        printInfo(hyundai);



    }
    private static void printInfo(Car car) {
        System.out.println(car.getBrand() + " " + car.getModel() + ", год выпуска: " + car.getYear() + ", страна: "
                + car.getCountry() + ", объем двигателя " + car.getEngineVolume()+", коробка передач"
                +car.getTransmission()+", тип кузова "+car.getBodyType()+", рег номер: "+ car.getRegistrtionNumber()+
                ", количество мест"+ car.getNumberOfSeats()+", "+(car.isTypeOfRubber()?"летняя":"зимняя")+" резина"+
                ", "+(car.getKey().isKeylessAccess()?"безключевой доступ":"ключевой доступ")+
                ", "+(car.getKey().isRemoteEngineStart()? "удаленный запуск": "обычный запуск")+", номер страховки"+
                car.getInsurance().getNumber()+", стоимость страховки: " + car.getInsurance().getCost()+
                ", срок действия страховки: "+car.getInsurance().getExpireDate());
    }


}
