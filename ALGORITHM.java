import javax.swing.JOptionPane;

public class ALGORITHM
{
    // declare an array which can store DATA objects
    private DATA[] dataList;

    // constructor
    public ALGORITHM()
    {
        // set the size of the array
        dataList = new DATA[200];
    }

    // populate the array with DATA objects
    public void setUpDataList()
    {
        for (int i=0; i<200; i++) {
            //create a new DATA object and store in next array position
            dataList[i] = new DATA();
            System.out.print(dataList[i].getData());
        }
        System.out.println();
    }

    // standard algorithm to find smallest value, tracking position of value
    public void findMinData()
    {
        // choose position of first value
        int minDataPosition = 0;

        // repeat for the rest of the array
        for (int i=1; i<200; i++) {

            //compare current value with best value
            if (dataList[i].getData() <
            dataList[minDataPosition].getData()) {
                // update the position of the best value
                minDataPosition = i;
            }
        }

        // display results: position and the best (max) value
        System.out.print("Position is:" + minDataPosition + " , Value is:");
        dataList[minDataPosition].displayData();
        System.out.println();
    }

    public void countValue() {
        int count = 0;
        // loop for each item
        for (int i = 0; i < 200; i++)
        {
            // decide if the item should be counted
            if (dataList[i].getData() == 'a' )
            {
                // add 1 to count
                count = count +1;
            }
        }

        // display the final count
        System.out.println("Total is : " + count);
    }
    
    private char enterChar() {
        char userChar = JOptionPane.showInputDialog("Enter character").charAt(0);
        return userChar;
    }

    public void searchA() {
        char target = enterChar();
        boolean found = false;
        for (int i=0; i<200; i++) {
            if(dataList[i].getData() == target) {
                found = true;
            }
        }

        if (found) {
            System.out.println("Found " + target);
        } else {
            System.out.println("Not Found " + target);
        }
    }

    public void searchB() {
        char target = enterChar();
        boolean found = false;

        long startTime = System.nanoTime();

        for (int i=0; i<200; i++) {
            if(dataList[i].getData() == target) {
                found = true;
                System.out.println("Found " + target +" at " + i);
            }
        }

        if (!found) {
            System.out.println("Not Found " + target);
        }

        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("Time " + estimatedTime);

    }

    public void searchC() {
        char target = enterChar();
        boolean found = false;
        int index = 0;
        int listLimit = dataList.length;

        long startTime = System.nanoTime();

        do {
            if(dataList[index].getData() == target) {
                found = true;
                System.out.println("Found " + target +" at " + index);
            }
            index++;
        } while ((index<listLimit) && (found != true));

        if (!found) {
            System.out.println("Not Found " + target);
        }

        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("Time " + estimatedTime);
    }
}
