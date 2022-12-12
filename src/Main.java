import animals.Cat;
import transport.Bus;
import transport.Car;
import transport.Train;

import javax.print.attribute.standard.PrinterInfo;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada","granta",2010,"Россия", "седан",5,
        " АКПП",55);

        Car audi = new Car("Audi ", "A8 50 L TDI quattro ", 2020, " Англия",
                "седан", 5, " АККП",40);


        Car bmv = new Car("BMW ", "Z 8, ", -2021, " Германия", "седан",
                7, "АККП",10);


        Car kia = new Car("Kia ", "Sportage 4-го поколения, ", 2010, " Южная Корея ",
                "седан", 5, " РКПП", 100);

        Car hyundai = new Car("Hyundai ", "Avante, ", 2020, " Южная Корея ",
                "седан", 5, " РКПП ",98);
        printInfo(lada);
        printInfo(audi);
        printInfo(bmv);
        printInfo(kia);
        printInfo(hyundai);

        /*Поезд «Ласточка», модель B-901, 2011 год выпуска в России, скорость передвижения — 301 км/ч, отходит от
        Белорусского вокзала и следует до станции Минск-Пассажирский. Цена поездки — 3500 рублей, в поезде 11 вагонов.
                Поезд «Ленинград», модель D-125, 2019 год выпуска в России, скорость передвижения — 270 км/ч, отходит
                от Ленинградского вокзала и следует до станции Ленинград-Пассажирский. Цена поездки — 1700 рублей, в
                поезде 8 вагонов.*/


        Train lastochka = new Train("B-901",2020,"Россия,", 3500,25,
                "Белорусский вокзал","Минск-Пассажирский",11,58);
        Train leningrad = new Train("D-125",2021, "Россия",1700,56,
                "Ленинградский вокзал","Ленинград-Пассажирский",8,99);
        printInfo2(lastochka);
        printInfo2(leningrad);

        Bus bus12=new Bus("12", 2022, " Россия ",100, 99);
        Bus bus15=new Bus("15", 2021, " Россия ",85,12);
        Bus bus155=new Bus("155", 2021, " Россия ",110,12);
        printInfo3(bus12);
        printInfo3(bus15);
        printInfo3(bus155);






    }
    private static void printInfo(Car car) {
        System.out.println(car.getBrand() + " " + car.getModel() + ", год выпуска: " + car.getYear() + ", страна: "
                + car.getCountry() + ", объем двигателя " + car.getEngineVolume()+", коробка передач"
                +car.getTransmission()+", тип кузова "+car.getBodyType()+", рег номер: "+ car.getRegistrtionNumber()+
                ", количество мест"+ car.getNumberOfSeats()+", "+(car.isTypeOfRubber()?"летняя":"зимняя")+" резина"+
                ", "+(car.getKey().isKeylessAccess()?"безключевой доступ":"ключевой доступ")+
                ", "+(car.getKey().isRemoteEngineStart()? "удаленный запуск": "обычный запуск")+", номер страховки"+
                car.getInsurance().getNumber()+", стоимость страховки: " +car.getInsurance().getCost()+
                ", срок действия страховки: "+car.getInsurance().getExpireDate()+", Можно заправлять бензином, дизелем " +
                "или заряжать на электропарковках,"+car.getFuelPercentage()+"%");
    }
    private static void printInfo2(Train train){
        System.out.println("Модель "+train.getBrand()+", год выпуска "+train.getYear()+", Страна производитель: "
                +train.getCountry()+", цеа билета: "+train.getPriceOfTrip()+", время в пути "+train.getTravelTime()+
                " , Станция отбытия "+ train.getStationName()+", станция прибытия "+ train.getFinalStop()+
                ", количество вагонов:"+train.getNamberOfWagons()+"Можно заправлять дизелем "+train.getFuelPercentage()+"%");
    }

    private static void printInfo3(Bus bus) {
        System.out.println("Модель " + bus.getBrand() + ", год выпуска " + bus.getYear() + ", Страна производитель: "
                + bus.getCountry() + ", максимальная скорось: " + bus.getMaxSpeed()+" Можно заправлять бензином " +
                "или дизелем "+bus.getFuelPercentage()+"%");
    }


}
