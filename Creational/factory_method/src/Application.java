package Creational.factory_method.src;




import java.util.Scanner;

import Creational.factory_method.src.factory.Dialog;
import Creational.factory_method.src.factory.WebDialog;
import Creational.factory_method.src.factory.WindowsDialog;



public class Application {

    static Dialog dialog;

    static void initialize(String os){
        if("Windows".equals(os)){
            dialog = new WindowsDialog();
        }
        else if("Web".equals(os)){
            dialog = new WebDialog();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter platform: ");
        String os = sc.nextLine();

        initialize(os);
        System.out.print("Enter a dialog: ");
        String closeDialoge = sc.nextLine();
        dialog.render(closeDialoge);
    }
    
}
