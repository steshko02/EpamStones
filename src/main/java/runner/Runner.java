package runner;

import entity.Necklace;
import inititialization.InitContext;
import lombok.extern.slf4j.Slf4j;
import menu.MainMenu;


@Slf4j
public class Runner {
    public static void main(String[] args) {

        log.info("The application started...");

        MainMenu mainMenu = new MainMenu();

        InitContext initContext = new InitContext();

        Necklace necklace = initContext.createNecklace(mainMenu.inputCountOfStones());

        mainMenu.mainMenuNavigator(necklace);

    }
}
