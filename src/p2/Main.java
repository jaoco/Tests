package p2;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Random;

public class Main
{

    public static void main(String[] args)
    {
        //initializing array/size
	    double[][] grades = new double[4][3];
        String[] names = new String[]{"John", "Mac", "Papi", "Boul"};

        //Initializes avg grades variables
        double avgGrade1 = 0;
        double avgGrade2 = 0;
        double avgGrade3 = 0;
        double avgGrade4 = 0;

        double avgTest1 = 0;
        double avgTest2 = 0;
        double avgTest3 = 0;

        //Initializes random generator
        Random ran = new Random();

        //Formats to 2 decimal places
        DecimalFormat df = new DecimalFormat("#.##");

        //Sets the formatter to round up
        df.setRoundingMode(RoundingMode.CEILING);

        for (int x = 0; x < 4; x++)
        {
            for (int y = 0; y < 3; y++)

            {
                //defines each array position using random number generator
                grades[x][y] = 70 + (100 - 70) * ran.nextDouble();

            }

        } //Ends Initial For Loop

        for (int i = 0; i < 3; i++)

        {
            //Adds the three test grades
            avgGrade1 = grades[0][i] + avgGrade1;
            avgGrade2 = grades[1][i] + avgGrade2;
            avgGrade3 = grades[2][i] + avgGrade3;
            avgGrade4 = grades[3][i] + avgGrade4;

        }

        double[] array = new double[]{avgGrade1, avgGrade2, avgGrade3, avgGrade4};

        for (int x = 0; x < 4; x++)
        {
           System.out.println(names[x] + "'s average grade is: " + df.format(array[x]/3));
        }

        for (int i = 0; i < 4; i++)
        {
            avgTest1 = grades[i][0] + avgTest1;
            avgTest2 = grades[i][1] + avgTest2;
            avgTest3 = grades[i][2] + avgTest3;

        }

        double[] arrayTest = new double[]{avgTest1, avgTest2, avgTest3};

        String[] testNames = new String[]{"Test 1", "Test 2", "Test 3"};

        for (int x = 0; x < 3; x++)
        {
            System.out.println(testNames[x] + "'s average grade is: " + df.format(arrayTest[x]/4));
        }

    }

}//Ends Main
