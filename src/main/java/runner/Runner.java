package runner;

import characteristic.Transparency;
import entity.Necklace;
import inititialization.InitContext;
import javafx.application.Application;
import lombok.extern.slf4j.Slf4j;
import service.Searching.SearchByTransparency;
import service.Sorting.SortByCost;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;


@Slf4j
public class Runner {
    public static void main(String[] args) {
        log.info("The application started...");

        System.out.print("Input number of objects: ");

        int countOfObjects = 0;
        try {
            Scanner scanner = new Scanner(System.in);
            countOfObjects = scanner.nextInt();
            if(countOfObjects<=0){
                throw new IllegalArgumentException("number of objects <= 0.");
            }
        } catch (InputMismatchException | IllegalArgumentException e) {
            log.error("Exception: " + e);
        }

        InitContext initContext = new InitContext();

        Scanner scanner = new Scanner(System.in);

        Necklace necklace = initContext.createNecklace(countOfObjects);;

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
                    SortByCost.sort(necklace.getStones());
                    break;
                }
                case 4: {
                    System.out.println("Total cost" + necklace.fullCost());
                    break;
                }
                case 5: {
                    System.out.println("Search by transparency range(" +
                            Arrays.toString(Transparency.values()) + ")" +
                            SearchByTransparency.search(necklace.getStones(),
                                    Transparency.getElementByIndex(1),Transparency.getElementByIndex(2)));
                    break;
                }
                case 6: {
                    log.info("The application has finished working...");
                    System.exit(0);
                    break;
                }

                default: break;
            }
        }while (true);

    }
}
