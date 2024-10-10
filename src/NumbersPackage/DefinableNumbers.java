package NumbersPackage;

/*
 * Цей enum містить в собі значення C11, яке за допомогою
 * методів цього enum обраховується
 * 
 * Вручну передається значення, від якого потрібно рахувати остачу від ділення
 */

public enum DefinableNumbers {
    
    C11(11);

    private int value;

    private DefinableNumbers(final int value)
    {
        this.value = value;
    }

    public final int result(final int number)
    {
        return number % this.value;
    }

}
