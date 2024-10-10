package TaskComponents;
import java.util.*;

/*
 * Клас "Літак" успадковується від класу літального засобу і має п'ять полів:
 * кількість пасажирів, пілоти (у вигляді списку), компанія, кількість двигунів та
 * об'єм одного двигуна.
 * 
 * Для класу передбачено конструктор та методи гетери і сетери для всіх атрибутів.
 * 
 * Перевизначено метод toString для полегшення виведення у консоль об'єкту.
 * Перевизначено методи "польоту" і "посадки" від батьківського класу.
 */

public class Flight extends FlyingTransport {
    
    private int amountOfPassangers;
    List<Human> pilots;
    private String ownerCompany;
    private int amountOfEngines;
    private double volumeOfEngine;
    

    public Flight(final int amountOfPassangers, final List<Human> pilots, final String ownerCompany,
    final int amountOfEngines, final double volumeOfEngine)
    {
        this.amountOfPassangers = amountOfPassangers;
        this.pilots = pilots;
        this.ownerCompany = ownerCompany;
        this.amountOfEngines = amountOfEngines;
        this.volumeOfEngine = volumeOfEngine;
    }

    public void setAmountOfPassangers(final int amountOfPassangers)
    {
        this.amountOfPassangers = amountOfPassangers;
    }

    public void setPilots(final List<Human> pilots)
    {
        this.pilots = pilots;
    }

    public void setOwnerCompany(final String ownerCompany)
    {
        this.ownerCompany = ownerCompany;
    }

    public void setAmountOfEngines(final int amountOfEngines)
    {
        this.amountOfEngines = amountOfEngines;
    }

    public void setVolumeOfEngine(final double volumeOfEngine)
    {
        this.volumeOfEngine = volumeOfEngine;
    }

    public final int getAmountOfPassangers()
    {
        return this.amountOfPassangers;
    }

    public final String getOwnerCompany()
    {
        return this.ownerCompany;
    }

    public final List<Human> getPilots()
    {
        return this.pilots;
    }

    public final int getAmountOfEngines()
    {
        return this.amountOfEngines;
    }

    public final double getVolumeOfEngine()
    {
        return this.volumeOfEngine;
    }

    @Override
    public void fly()
    {
        System.out.println("Flight is flying");
    }

    @Override
    public void layDown()
    {
        System.out.println("Flight is laying down");
    }

    @Override
    public String toString()
    {
        String result = "";
        result += "Owner company: " + this.getOwnerCompany() + "\n";
        result += "Passangers: " + this.getAmountOfPassangers() + "\n";
        result += "Engines: " + this.getAmountOfEngines() + "\n";
        result += "Volume of the engine: " + this.getVolumeOfEngine() + "\n";
        result += "Pilots: \n";
        for (Human human : pilots) {
            result += human + "\n";
        }
        return result;
    }

}
