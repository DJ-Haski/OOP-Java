package Problem3;
import java.util.Scanner;

public class Temperature{
public static void main(String [] args){
    double farenheit, celsium;
    farenheit = 0;
    celsium = 0;
    Scanner in = new Scanner (System.in);
    System.out.println("Enter C to convert C to F, or Enter F to convert F to C:");
    String symbol = in.next();
    if (symbol.equals("C")) 
        celsiumToFarenheit();
    else
        farenheitToCelsium();
}

public static void celsiumToFarenheit(){
	double farenheit=0;
	double celsium=0;
    Scanner scan = new Scanner (System.in);
    System.out.println("Please enter C:");
    celsium = scan.nextDouble();
    farenheit = (9*celsium/5)+32;
    System.out.println(celsium + "  C is " + farenheit + " F");
}

public static void farenheitToCelsium(){
    double farenheit=0;
    double celsium = 0;
    Scanner scan = new Scanner (System.in);
    System.out.println("Please enter F:");
    farenheit = scan.nextDouble();
    celsium = ((5*farenheit-32)/9);
    System.out.println(farenheit + "F is " + celsium + " C");
}


}