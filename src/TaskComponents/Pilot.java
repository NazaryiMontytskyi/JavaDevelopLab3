package TaskComponents;

/*
 * Клас пілота, що успадковується від класу людини. У класі доповнено поведінку батьківського (супер-) класу
 * шляхом додавання полів років досвіду та компанії працевлаштування. Для нових полів створено гетери і сетери.
 * У конструктор передаємо параметри, що вимагає як цей клас, так і батьківський.
 * 
 * За допомогою методу super() у конструктор батьківського класу передаємо необхідні параметри.
 */

public class Pilot extends Human {
    
    private int yearExperience;
    private String companyOfEmployence;

    public Pilot(final String name, final String surname, final int yearExperience, final String companyOfEmployence)
    {
        super(name, surname);
        this.yearExperience = yearExperience;
        this.companyOfEmployence = companyOfEmployence;
    }

    public void setYearExperience(final int yearExperience)
    {
        this.yearExperience = yearExperience;
    }

    public void setCompany(final String company)
    {
        this.companyOfEmployence = company;
    }

    public final int getYearExperience()
    {
        return this.yearExperience;
    }

    public final String getCompanyEmployence()
    {
        return this.companyOfEmployence;
    }

    @Override
    public String toString()
    {
        return super.toString() + "\nCompany of employence: " + this.getCompanyEmployence() + "\n" +
        "Experience: " + this.getYearExperience() + " years"; 
    }

}
