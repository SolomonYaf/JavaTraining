import java.awt.*;

public class DataTypeExample {
    public static void main(String[] args) {

        Point coordinate = new Point();
        coordinate.x = 17;
        coordinate.y = 21;
        System.out.println(coordinate);

        Point secondCoordinate = coordinate;
       // System.out.println(secondCoordinate);

        coordinate.x = 10;
        coordinate.y = 8;

        //System.out.println(secondCoordinate);

        String name = "hanna kebede";

//        System.out.println(name.charAt(0));
//        System.out.println(name.toUpperCase());

        float phValue= 5;
        String ph = phValue>7? "Basic":"Acidic";

       // System.out.println(ph);

        float savingAmount=100_000;
        float loanAmount=1_000_000;
        String saving= (savingAmount>=0.25*loanAmount)?"Qualified" : "Not Qualified";

        //System.out.println(saving);

        float weight=90;

        String classify= weight>80? "Fat" :"Skinny";
       // System.out.println(classify);

    }
}
