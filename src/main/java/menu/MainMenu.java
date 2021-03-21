package menu;

import characteristic.Transparency;
import entity.Necklace;
import lombok.extern.slf4j.Slf4j;
import service.searching.SearchByTransparency;
import service.sorting.SortByCost;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

@Slf4j
public class MainMenu {

    public int inputCountOfStones(){
        System.out.print("Input number of objects: ");

        int countOfObjects;
        try {
            Scanner scanner = new Scanner(System.in);
            countOfObjects = scanner.nextInt();
            if(countOfObjects<=0){
                throw new IllegalArgumentException("number of objects less than 0.");
            }
        } catch (InputMismatchException | IllegalArgumentException e) {
            log.error("Exception: " + e);
            return inputCountOfStones();
        }
        return countOfObjects;
    }

    public void mainMenuNavigator(Necklace necklace){

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println(" \n 1 - Output stones. \n "
                    + "2 - Total weight \n "
                    + "3 - Sort stones by cost.\n "
                    + "4 - Total cost. \n "
                    + "5 - Search by transparency range. \n "
                    + "0- Exit \n"
            );

            System.out.print("Input command ");
            byte command = scanner.nextByte();

            switch (command) {

                case 1: {
                    System.out.println(necklace);
                    break;
                }
                case 2: {
                    System.out.println("Total weight: " + necklace.fullCarat());
                    break;
                }
                case 3: {
                    new SortByCost().sort(necklace.getStones());
                    break;
                }
                case 4: {
                    System.out.println("Total cost: " + necklace.fullCost());
                    break;
                }
                case 5: {
                    System.out.println("Search by transparency range(" +
                            Arrays.toString(Transparency.values()) + ")" +
                            new SearchByTransparency().search(necklace.getStones(),
                                    Transparency.getElementByIndex(1),Transparency.getElementByIndex(2)));
                    break;
                }
                case 0: {
                    log.info("The application has finished working...");
                    System.exit(0);
                    break;
                }
                default: break;
            }
        }while (true);

    }
}
