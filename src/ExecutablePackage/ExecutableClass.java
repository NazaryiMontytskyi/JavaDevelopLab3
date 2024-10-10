package ExecutablePackage;
import TaskComponents.*;
import java.util.*;

/*
 * Цей виконавчий клас містить два методи
 * 
 * Метод createFlights() - в ручному режимі створює набір літаків,
 * які будуть використовуватися в програмі.
 * 
 * Метод run() - реалізовує головну логіку цього класу: створити масив літаків,
 * відсортувати літаки за спаданням і зростанням та продемонструвати результати.
 */

public class ExecutableClass {
    
    public void run()
    {
        FlightsSorter sorter = new FlightsSorter(createFlights());

        System.out.println("Flights: ");
        System.out.println(sorter);
        System.out.println("Sorting by volume of engine descending: ");
        sorter.sortDescVolume();
        System.out.println(sorter);
        System.out.println("Sorting by amount of passangers ascending");
        sorter.sortAscPassangers();;
        System.err.println(sorter);

    }

    private Flight[] createFlights()
    {
        return new Flight[]{
            new Flight(150, 
                new ArrayList<Human>() {
                    {
                        add(new Pilot("Adam", "Roberts", 5, "Turkish Airlines"));
                        add(new Pilot("Suleyman", "Mekhmed oglu", 12, "Turkish Airlines"));
                    }
                }, "Turkish Airlines", 4, 55.0),
    
            new Flight(180, 
                new ArrayList<Human>() {
                    {
                        add(new Pilot("James", "Smith", 8, "Delta Airlines"));
                        add(new Pilot("John", "Doe", 10, "Delta Airlines"));
                    }
                }, "Delta Airlines", 2, 60.0),
    
            new Flight(200, 
                new ArrayList<Human>() {
                    {
                        add(new Pilot("Peter", "Parker", 6, "Qatar Airways"));
                        add(new Pilot("Bruce", "Wayne", 15, "Qatar Airways"));
                    }
                }, "Qatar Airways", 2, 65.0),
    
            new Flight(120, 
                new ArrayList<Human>() {
                    {
                        add(new Pilot("Clark", "Kent", 7, "Emirates"));
                        add(new Pilot("Lois", "Lane", 14, "Emirates"));
                    }
                }, "Emirates", 4, 50.0),
    
            new Flight(170, 
                new ArrayList<Human>() {
                    {
                        add(new Pilot("Bruce", "Banner", 9, "Lufthansa"));
                        add(new Pilot("Natasha", "Romanoff", 13, "Lufthansa"));
                    }
                }, "Lufthansa", 3, 55.5),
    
            new Flight(140, 
                new ArrayList<Human>() {
                    {
                        add(new Pilot("Tony", "Stark", 11, "British Airways"));
                        add(new Pilot("Pepper", "Potts", 10, "British Airways"));
                    }
                }, "British Airways", 2, 58.0),
    
            new Flight(160, 
                new ArrayList<Human>() {
                    {
                        add(new Pilot("Steve", "Rogers", 12, "Air France"));
                        add(new Pilot("Bucky", "Barnes", 14, "Air France"));
                    }
                }, "Air France", 4, 62.5),
    
            new Flight(130, 
                new ArrayList<Human>() {
                    {
                        add(new Pilot("Diana", "Prince", 7, "KLM"));
                        add(new Pilot("Arthur", "Curry", 10, "KLM"));
                    }
                }, "KLM", 3, 60.0),
    
            new Flight(190, 
                new ArrayList<Human>() {
                    {
                        add(new Pilot("Barry", "Allen", 6, "Aeroflot"));
                        add(new Pilot("Iris", "West", 8, "Aeroflot"));
                    }
                }, "Aeroflot", 4, 57.5),
    
            new Flight(210, 
                new ArrayList<Human>() {
                    {
                        add(new Pilot("Oliver", "Queen", 11, "Singapore Airlines"));
                        add(new Pilot("Felicity", "Smoak", 9, "Singapore Airlines"));
                    }
                }, "Singapore Airlines", 2, 65.0)
        };
    }

}
