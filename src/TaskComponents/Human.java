package TaskComponents;

/*
 * Абстракний клас Людина, який має два строкових поля імені та прізвища. 
 * Для класу передбачені методи гетери і сетери для полів, а також декілька конструкторів.
 * Зокрема передбачено порожній конструктор і конструктор з параметрами, які ініціалізують
 * поля класу.
 * 
 * Така структура забезпечує дотримання принципу Dependency Injection з використанням
 * конструкторів та сетерів.
 * 
 * У класі також перевизначено метод toString для зручності виведення об'єкту в консоль
 */

public abstract class Human {
    
    private String name;
    private String surname;

    public Human()
    {
        
    }

    public Human(final String name, final String surname)
    {
        this.name = name;
        this.surname = surname;
    }

    public void setName(final String name)
    {
        this.name = name;
    }

    public void setSurname(final String surname)
    {
        this.surname = surname;
    }

    public final String getName()
    {
        return this.name;
    }

    public final String getSurname()
    {
        return this.surname;
    }

    @Override
    public String toString()
    {
        String result = "";
        result += "Name: " + this.name + "\n" +
        "Surname: " + this.surname;
        return result;
    }

}
