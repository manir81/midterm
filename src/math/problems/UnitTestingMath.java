package math.problems;

//import org.testng.Assert;

public class UnitTestingMath {



    public int addition(int x, int y) {
        int  total = x+y;
        return total;

    }
    public int Substraction(int a, int b) {
        int Total= a-b;
        return Total;
    }

    public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.


      UnitTestingMath cal = new UnitTestingMath();
       int addResult = cal.addition(80, 50);
       int subResult = cal.Substraction(80, 50);
       System.out.println(addResult);
       System.out.println(subResult);
    }
}
