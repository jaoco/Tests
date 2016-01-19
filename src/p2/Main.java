package p2;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Random;

public class Main
{

    public static void main(String[] args)
    {
        //initializing array/size
	    double[] monthlySales = new double[12];

        //Initializes random generator
        Random ran = new Random();

        //Formats to 2 decimal places
        DecimalFormat df = new DecimalFormat("#.##");

        //Sets the formatter to round up
        df.setRoundingMode(RoundingMode.CEILING);

        for (int x = 0; x < 12; x++)
        {
            //defines each array position using random number generator
            monthlySales[x] = 0 + (10000 - 0) * ran.nextDouble();

        }

        for (double each : monthlySales)
        {
            //prints the array in format
            System.out.println(df.format(each));

        }

    }

}
