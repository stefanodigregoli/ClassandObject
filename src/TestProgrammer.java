// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class TestProgrammer {
    public static void main(String[] args){
        Programmer programmer1 = new Programmer();

        programmer1.name = " Stefano ";
        programmer1.age = 22;
        programmer1.wearGlasses = true;
        programmer1.drinkCoffee();
        programmer1.printDetails();

        Programmer programmer2 = new Programmer();

        programmer2.name = " Giovanni ";
        programmer2.age =  28;
        programmer2.wearGlasses = false;
        programmer2.printDetails();
        programmer2.hasGlasses();


    }
}