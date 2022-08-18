import java.util.SortedMap;

public class Mars {
    public static void main(String[] args) throws InterruptedException {
        String colonyName = "SpaceX";
        int shipPopulation = 300;
        double shipFood = 4000.00;
        boolean landing = true;
//        The landing process takes 2 days, calculate how much food is left after landing Equation: Food = Food - (Pop * 0.75); Use the equation twice
        shipFood -= shipPopulation * 0.75;
        shipFood -= shipPopulation * 0.75;
        System.out.println(shipFood);
        shipFood += shipFood*0.5;
        shipPopulation += 5;

        String landingLocation = "The Hill";
        if(landingLocation.toLowerCase().equals("The Plain".toLowerCase()))
        {
            System.out.println("Bbzzz Landing on the Plain");
        } else {
            System.out.println("ERROR!!! Flight plan already set. Landing on the Plain");
        }
        landing = landingCheck(100);
        new GuessingGame();
//        /Mars Adventure Game part 3

//After playing the GuessingGame it is finally time for the expedition team to pack and head out
//Run the MarsExpedition by calling a new MarsExpedition constructor
        new MarsExpedition();
    }

    /**
     * Function Name landingCheck
     * @param loops (int)
     * @return landing boolean
     * */

    public static boolean landingCheck(int loops) throws InterruptedException {
        for(int i =0 ; i<=loops;i++ ){
            if(i%3== 0 && i % 5 == 0 ){
                System.out.println("Keep Center");
            }else if( i % 5 == 0){
                System.out.println("right");
            }else if(i %3 == 0){
                System.out.println("Left");
            }else {
                System.out.println("Calculating");
            }
            Thread.sleep(250);
        }
        System.out.println("Landed");
        return false;
    }
}
