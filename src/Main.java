import com.sun.tools.jdeprscan.scan.Scan;

import java.util.Scanner;

public class Main {

    void printSuccess(){
        System.out.println("Print success ...");
    }


    void printError(){
        System.out.println("Testing Error");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Error ...");
        System.out.println("Hello world!");
    }
}