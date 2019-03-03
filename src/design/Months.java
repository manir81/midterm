package design;

public enum Months {
    January, February, March, April, May, June, July, August, September, October, November, December
}



public class Emmonth {

     Months Months; //this come from enum Months

    public Emmonth() {}

    public Emmonth(Emmonth emmonth) {
        this.Months = Months; //this come from enum year
    }

    public void whichMonth(Months months) {
        switch(Months) { //this come from enum year
            case January:
                System.out.println("this is January month");
                break;
            case February:
                System.out.println("this is February");
                break;
            case March:
                System.out.println("this is March month");
                break;
            case April:
                System.out.println("this is April month");
                break;
            case May:
                System.out.println("this is May month");
                break;
            case June:
                System.out.println("this is June month");
                break;
            case July:
                System.out.println("this is July month");
                break;
            case August:
                System.out.println("this is August month");
                break;
            case September:
                System.out.println("this is September month");
                break;
            case October:
                System.out.println("this is Otober month");
                break;
            case November:
                System.out.println("this is November month");
                break;
            case December:
                System.out.println("this is December,MoMonth: month");
                break;

            default:
                break;
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Emmonth month = new Emmonth(); //this Month Come From EmMonth Class.
        month.whichMonth(Months.December);//this year come from enum Months.

    }

}
}