package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Cookies thinMint = new Cookies();
        thinMint.name = "Thin Mint";
        Cookies thinReccess = new Cookies();
        thinReccess.name = "Thin Reccess";
        Cookies thinMMS = new Cookies();
        thinMMS.name = "Thin M&M Cookies";
        Cookies thinMint = new Cookies();
        thinMint.name = "Thin Mint";
        Cookies thinReccess = new Cookies();
        thinReccess.name = "Thin Reccess";
        Cookies thinMMS = new Cookies();
        thinMMS.name = "Thin M&M Cookies";
        Object[] cookieArray = { thinMint.name, thinMMS.name, thinReccess.name };
        for (int i = 0; i < cookieArray.length; i++) {
            System.out.println(cookieArray[i]);
            System.out.println("-");
        }
        System.out.println("What kind of cookie do you want?");
        Scanner readStuff = new Scanner(System.in);
        String choice = readStuff.nextLine();

        for (int i = 0; i < cookieArray.length; i++) {
            if (choice.equals(cookieArray[i])) {
                System.out.println("You want this huh? " + cookieArray[i]);
            } else {
                System.out.println("We Dont Have That");
            }
        }
    }
}