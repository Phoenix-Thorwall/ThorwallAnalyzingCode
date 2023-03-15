import java.util.Scanner;

public class Game {
    private Space[][] grid;

    // constructor
    public Game() {
        setupGrid();
    }

    // private helper method
    private void setupGrid() {
        Space s1 = new Space("Trophy", "🏆");
        Space s2 = new Space("White Space", "⬜");
        Space s3 = new Space("Dragon", "🐉");
        Space s4 = new Space("Black Space", "⬛");
        Space s5 = new Space("Black Space", "⬛");
        Space s6 = new Space("Black Space", "⬛");
        Space s7 = new Space("White Space", "⬜");
        Space s8 = new Space("Black Space", "⬛");
        Space s9 = new Space("Black Space", "⬛");
        Space s10 = new Space("Black Space", "⬛");
        Space s11 = new Space("White Space", "⬜");
        Space s12 = new Space("Player", "🤖");

        grid = new Space[][]{{s1, s2, s3, s4}, {s5, s6, s7, s8}, {s9, s10, s11, s12}};
    }

    public void play() {

        // display board
        for (Space[] row : grid) {
            for (Space space : row) {
                System.out.print(space.getIcon());
            }
            System.out.println();
        }

        // input from user
        Scanner scan = new Scanner(System.in);
        System.out.print("Press enter to move left...");
        scan.nextLine();
        System.out.println("\nYou move onto: " + grid[2][2].getName());

        // call helper method to update spaces
        updateSpace(grid[2][2], "Player", "🤖");
        updateSpace(grid[2][3], "White Space", "⬜");

        // display updated board
        for (Space[] row : grid) {
            for (Space space : row) {
                System.out.print(space.getIcon());
            }
            System.out.println();
        }

        System.out.println("\nCongrats! You moved left!");
        System.out.println("This lame game is now over.");
    }

    // private helper method
    private void updateSpace(Space space, String newName, String newIcon) {
        space.setName(newName);
        space.setIcon(newIcon);
    }
}
