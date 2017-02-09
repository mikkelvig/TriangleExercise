
package triangleexercise;

import java.util.Scanner;

/**
 *
 * @author Mikkel
 */
public class TriangleExercise {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int a = inputScanner.nextInt();
        int b = inputScanner.nextInt();
        int c = inputScanner.nextInt();

        System.out.println(whatTriangle(a,b,c));
    }
    
    public static String whatTriangle(int a, int b, int c){
        String returnString = "";
        
        if (a <= 0 || b <= 0 || c <= 0){ // Er a, b eller c = 0 eller negative tal?
            returnString = "Not a triangle";
        } else if(a==b && b==c){
            returnString = "Equilateral (ligesidet)";
        }  else if(a >= (b+c) || c >= (b+a) || b >= (a+c)) { // Kan tallene samles til en trekant?
            returnString = "Not a triangle";
        } else if ((a==b && b!=c ) || (a!=b && c==a) || (c==b && c!=a)){
            returnString = "Isosceles (ligebenet)";
        } else if (a!=b && b!=c && c!=a){
            returnString = "Scalene (ingen ens sider)";
        }
        return returnString;
    }
}
