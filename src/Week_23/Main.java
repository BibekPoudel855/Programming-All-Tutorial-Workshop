//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package Week_23;
public class Main {
    public static void main(String[] args) {
        //new GUI();
        System.out.println("Number of ears for 50 rabbits is "+computeEars(50));
    }
    public static int computeEars(int rabbits)
    {
        if(rabbits == 0)
            return 0;
        return 2+computeEars(rabbits-1);
    }
}

