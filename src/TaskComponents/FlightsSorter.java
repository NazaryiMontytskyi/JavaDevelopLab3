package TaskComponents;

import java.util.Arrays;
import java.util.Comparator;

/*
 * Клас FlightSorter - це клас, який відповідатиме за сортування масиву літаків за певними ознаками
 * У класів визначено конструктор з передачею параметру масиву. Існують методи:
 * 1. Сортування за об'ємом двигуна за спаданням
 * 2. Сортування за кількістю пасажирів за зростанням
 * 
 * Перевизначено метод toString для виведення об'єктів на екран
 */

public class FlightsSorter {
    
    Flight[] arrayOfFlights;

    public FlightsSorter(final Flight[] arr)
    {
        this.arrayOfFlights = arr;
    }

    public void sortDescVolume()
    {
        Arrays.sort(arrayOfFlights, Comparator.comparingDouble((Flight flight) -> flight.getVolumeOfEngine()).reversed());
    }

    public void sortAscPassangers()
    {
        Arrays.sort(arrayOfFlights, Comparator.comparingInt((Flight flight) -> flight.getAmountOfPassangers()));
    }

    @Override
    public String toString()
    {
        String result = "";
        result += String.format("%-20s %-10s %-10s %-10s %-10s",
        "Company", "Passangers", "Engines", "Volume", "Pilots") + "\n";
        for (Flight flight : arrayOfFlights) {
           result += String.format("%-20s %-10s %-10s %-10s %-10s", 
           flight.getOwnerCompany(),
           flight.getAmountOfPassangers(),
           flight.getAmountOfEngines(),
           flight.getVolumeOfEngine(),
           flight.getPilots().size()) + "\n";
        }
        return result;
    }

}
