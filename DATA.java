import java.util.Random;
import javax.swing.JOptionPane;    

public class DATA
{
    // randomLetter is the key 
    private char randomLetter;

    // create a source for random values
    private Random randomGenerator = new Random();

    public DATA()
    {
        makeData();
    }

    public void makeData() {
        // add a random number (0-25) to 'a' to make other letters
        randomLetter = (char) ('a' + randomGenerator.nextInt(26));
    }

    public void enterData() {
        randomLetter = JOptionPane.showInputDialog("Enter a letter ;").charAt(0);
        while ((randomLetter <= 'a') || (randomLetter >= 'z')) {
            randomLetter = (JOptionPane.showInputDialog("Error, enter a letter a-z;")).charAt(0); //
        }
    }

    public char getData()
    {
        // data flow OUT 
        return randomLetter;
    }
    
    public void setData(char data) {
        randomLetter = data;
    }

    public void displayData()
    {
        System.out.print(randomLetter);
    }

}
