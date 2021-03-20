package Lab_ObjectsAndClases.Exercise_ObjectsAndClasses;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleCatalogue_06 {

    static class Car {
        String type = "Car";
        String model;
        String color;
        int horsepower;

        private Car(String model, String color, int horsepower) {
            this.model = model;
            this.color = color;
            this.horsepower = horsepower;
        }

        private Car() {

        }

        public String toString() {
            return String.format("Type: %s%nModel: %s%nColor: %s%nHorsepower: %d",
                    type, model, color, horsepower);
        }

    }

    static class Truck {
        String type = "Truck";
        String model;
        String color;
        int horsepower;

        private Truck(String model, String color, int horsepower) {
            this.model = model;
            this.color = color;
            this.horsepower = horsepower;
        }

        private Truck() {

        }

        public String toString() {
            return String.format("Type: %s%nModel: %s%nColor: %s%nHorsepower: %d",
                    type, model, color, horsepower);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String command = scan.nextLine();

        List<Car> cars = new ArrayList<>();
        List<Truck> trucks = new ArrayList<>();

        while (!command.equals("End")) {
            String[] vehicleAsArray = split(command);

            if (vehicleAsArray[0].equals("truck")) {
                Truck truck = new Truck(vehicleAsArray[1], vehicleAsArray[2],
                        Integer.parseInt(vehicleAsArray[3]));
                trucks.add(truck);

            } else if (vehicleAsArray[0].equals("car")) {
                Car car = new Car(vehicleAsArray[1], vehicleAsArray[2],
                        Integer.parseInt(vehicleAsArray[3]));
                cars.add(car);

            }

            command = scan.nextLine();
        }


        command = scan.nextLine();
        while (!command.equals("Close the Catalogue")) {

            for (Car car : cars) {
                if (car.model.equals(command)) {
                    System.out.println(car.toString());
                }
            }

            for (Truck truck : trucks) {
                if (truck.model.equals(command)) {
                    System.out.println(truck.toString());
                }
            }

            command = scan.nextLine();
        }


        double averageHorsepower = 0;
        for (Car car : cars) {
            averageHorsepower += car.horsepower;
        }
        System.out.printf("Cars have average horsepower of: %.2f.%n",
                averageHorsepower / cars.size());

        averageHorsepower = 0;
        for (Truck truck : trucks) {
            averageHorsepower += truck.horsepower;
        }
        System.out.printf("Trucks have average horsepower of: %.2f."
                , averageHorsepower / trucks.size());

    }

    static String[] split(String a) {
        String[] finalArray = new String[4];
        String[] defaultArray = a.split(" ");

        finalArray[0] = defaultArray[0];
        finalArray[2] = defaultArray[defaultArray.length-2];
        finalArray[3] = defaultArray[defaultArray.length - 1];

        String model = "";
        for (int i = 1; i < defaultArray.length - 2; i++) {
            if (i + 1 == defaultArray.length - 2) {
                model += defaultArray[i];
                finalArray[1] = model;
                break;
            }
            model += defaultArray[i] + " ";
        }

        return finalArray;
    }

}
