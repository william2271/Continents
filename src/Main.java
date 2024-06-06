import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // this program shows a continent and the largest city in said continent.
        Scanner myObj = new Scanner(System.in);
        System.out.println("Select a continent to show it's biggest city");
        System.out.println("1.North America" );
        System.out.println("2.South America" );
        System.out.println("3.Europe" );
        System.out.println("4.Africa" );
        System.out.println("5.Asia" );
        System.out.println("6.Australia" );
        System.out.println("7.Antarctica" );
        int continent= myObj.nextInt();

        switch(continent){
            case 1:
                System.out.println("North America: Mexico City, Mexico");
                break;
            case 2:
                System.out.println("South America: Sao Paulo, Brazil");
                break;
            case 3:
                System.out.println("Europe: Moscow, Russia");
                break;
            case 4:
                System.out.println("Africa: Lagos, Nigeria");
                break;
            case 5:
                System.out.println("Asia: Shanghai, China");
                break;
            case 6:
                System.out.println("Australia: Sydney, Australia");
                break;
            case 7:
                System.out.println("Antarctica: McMurdo Station, US");
            default:
                System.out.println("undefined continent!");





        }
    }
}