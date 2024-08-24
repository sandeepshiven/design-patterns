import java.util.Scanner;

import factories.GUIFactory;
import factories.MacOsFactory;
import factories.WindowsFactory;

public class Demo {

    static App configure(String os){
        App app;
        GUIFactory factory = null;
        if("Windows".equals(os)){
            factory = new WindowsFactory();
        }
        else if ("MacOs".equals(os)){
            factory = new MacOsFactory();
        }
        app = new App(factory);
        return app;
    }

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the OS: ");
        String os = sc.nextLine();

        App app = configure(os);
        app.execute();


    }
}
