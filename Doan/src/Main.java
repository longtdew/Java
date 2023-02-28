import java.util.Scanner;
public class Main {

    private static int attempts;

    public static void main(String[] args) {

        String answer;

        System.out.println("'⣿⣿⣿⣿⣿⣿⣿⣿⡿⠿⠛⠛⠛⠋⠉⠈⠉⠉⠉⠉⠛⠻⢿⣿⣿⣿⣿⣿⣿⣿");
        System.out.println("⣿⣿⣿⣿⣿⡿⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠛⢿⣿⣿⣿⣿");
        System.out.println("⣿⣿⣿⣿⡏⣀⠀⠀⠀⠀⠀⠀⠀⣀⣤⣤⣤⣄⡀⠀⠀⠀⠀⠀⠀⠀⠙⢿⣿⣿");
        System.out.println("⣿⣿⣿⢏⣴⣿⣷⠀⠀⠀⠀⠀⢾⣿⣿⣿⣿⣿⣿⡆⠀⠀⠀⠀⠀⠀⠀⠈⣿⣿");
        System.out.println("⣿⣿⣟⣾⣿⡟⠁⠀⠀⠀⠀⠀⢀⣾⣿⣿⣿⣿⣿⣷⢢⠀⠀⠀⠀⠀⠀⠀⢸⣿");
        System.out.println("⣿⣿⣿⣿⣟⠀⡴⠄⠀⠀⠀⠀⠀⠀⠙⠻⣿⣿⣿⣿⣷⣄⠀⠀⠀⠀⠀⠀⠀⣿");
        System.out.println("⣿⣿⣿⠟⠻⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠶⢴⣿⣿⣿⣿⣿⣧⠀⠀⠀⠀⠀⠀⣿");
        System.out.println("⣿⣁⡀⠀⠀⢰⢠⣦⠀⠀⠀⠀⠀⠀⠀⠀⢀⣼⣿⣿⣿⣿⣿⡄⠀⣴⣶⣿⡄⣿");
        System.out.println("⣿⡋⠀⠀⠀⠎⢸⣿⡆⠀⠀⠀⠀⠀⠀⣴⣿⣿⣿⣿⣿⣿⣿⠗⢘⣿⣟⠛⠿⣼");
        System.out.println("⣿⣿⠋⢀⡌⢰⣿⡿⢿⡀⠀⠀⠀⠀⠀⠙⠿⣿⣿⣿⣿⣿⡇⠀⢸⣿⣿⣧⢀⣼");
        System.out.println("⣿⣿⣷⢻⠄⠘⠛⠋⠛⠃⠀⠀⠀⠀⠀⢿⣧⠈⠉⠙⠛⠋⠀⠀⠀⣿⣿⣿⣿");
        System.out.println("⣿⣿⣧⠀⠈⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠟⠀⠀⠀⠀⢀⢃⠀⠀⢸⣿⣿⣿⣿");
        System.out.println("⣿⣿⡿⠀⠴⢗⣠⣤⣴⡶⠶⠖⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⡸⠀⣿⣿⣿⣿");
        System.out.println("⣿⣿⣿⡀⢠⣾⣿⠏⠀⠠⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠛⠉⠀⣿⣿⣿⣿");
        System.out.println("⣿⣿⣿⣧⠈⢹⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⣿⣿⣿⣿");
        System.out.println("⣿⣿⣿⣿⡄⠈⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣴⣾⣿⣿⣿⣿⣿");
        System.out.println("⣿⣿⣿⣿⣧⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿");
        System.out.println("⣿⣿⣿⣿⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
        System.out.println("⣿⣿⣿⣿⣿⣦⣄⣀⣀⣀⣀⠀⠀⠀⠀⠘⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
        System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡄⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
        System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⠀⠀⠀⠙⣿⣿⡟⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿");
        System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠇⠀⠁⠀⠀⠹⣿⠃⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿");
        System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⡿⠛⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⢐⣿⣿⣿⣿⣿⣿⣿⣿⣿");
        System.out.println("⣿⣿⣿⣿⠿⠛⠉⠉⠁⠀⢻⣿⡇⠀⠀⠀⠀⠀⠀⢀⠈⣿⣿⡿⠉⠛⠛⠛⠉⠉");
        System.out.println("⣿⡿⠋⠁⠀⠀⢀⣀⣠⡴⣸⣿⣇⡄⠀⠀⠀⠀⢀⡿⠄⠙⠛⠀⣀⣠⣤⣤⠄⠀");
        System.out.println("|-------------DaGame----------------|");


        Scanner input = new Scanner(System.in);
        System.out.println("\tHELP SCREEN:\n");
        System.out.println("\tEnter yes to start\n");
        input.nextLine();
        input.nextLine();

        System.out.println("\n\t\t\t\t\t\t           Backroom\n");

        Scanner sc = new Scanner(System.in);
        int lives = 3;

        System.out.println("\tIt's Dark... Pitch Black. A throbbing headache bursts into the front of your head.");
        System.out.println("As you begin to get up from where you are you realize that you are bound by strong");
        System.out.println("rope.\n");

        while (true) {
            System.out.print("Enter 'wait': ");
            answer = sc.nextLine();
            if (answer.equals("wait")) {
                System.out.println("You wait... the time is unknown\n");
                break;
            } else {
                System.out.println("\n\nThat answer is not a usable answer in this situation\n\n");
            }
        }

        System.out.println("\tYou hear footsteps faintly, distant but audible. They are getting louder and they");
        System.out.println("suddenly stop. A door creaks open and you hear it touch a wall\n");

        System.out.print("Enter 'listen' to listen or 'look' to see what happens next: ");
        answer = sc.nextLine();

        if (answer.equals("listen")) {
            System.out.println("\tYou hear a low whisper, almost a hiss, coming from a distant room\n");
        } else if (answer.equals("look")) {
            System.out.println("\tYou see a figure standing at the door. The figure is wearing a mask.\n");
        } else {
            System.out.println("\n\nThat answer is not a usable answer in this situation\n\n");
        }

        System.out.print("Enter 'shout' to get the figure's attention or 'keep quiet' to stay hidden: ");
        answer = sc.nextLine();

        if (answer.equals("shout")) {
            System.out.println("\tThe figure rushes to the room and hits you hard. You lose a life.\n");
            lives--;
        } else if (answer.equals("keep quiet")) {
            System.out.println("\tYou manage to stay hidden. The figure leaves the room.\n");
        } else {
            System.out.println("\n\nThat answer is not a usable answer in this situation\n\n");
        }

        boolean hasKey = false;
        boolean hasKnife = false;
        boolean hasMeat = false;
        boolean gameOver = false;
        int actionsLeft = 3;

        while (!gameOver) {
            System.out.println("\tYou look around the room and see three doors. Door 1 is to the left of the room, door 2 is to the");
            System.out.println("right of the room, and door 3 is directly in front of you.\n");
            System.out.println("Actions Left: " + actionsLeft);
            System.out.println("\nWhich room would you like to explore? Enter 1, 2, 3, or 4: ");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("\nYou enter the first room.");
                System.out.println("You find nothing of interest here.");
                actionsLeft--;
            } else if (choice == 2) {
                System.out.println("\nYou enter the second room.");
                if (hasKnife || hasMeat) {
                    System.out.println("You see the monster sleeping in the corner of the room.");
                    System.out.print("Enter 1 to sneak past the monster: ");
                    int sneakChoice = scanner.nextInt();
                    if (sneakChoice == 1) {
                        System.out.println("\nYou successfully sneak past the monster.");
                    } else {
                        System.out.println("\nInvalid choice. You lose an action.");
                        actionsLeft--;
                    }
                } else {
                    System.out.println("You see a key and a knife on the table.");
                    System.out.print("Enter 1 to take the key, enter 2 to take the knife: ");
                    int itemChoice = scanner.nextInt();
                    if (itemChoice == 1) {
                        hasKey = true;
                        System.out.println("\nYou take the key.");
                    } else if (itemChoice == 2) {
                        hasKnife = true;
                        System.out.println("\nYou take the knife.");
                    } else {
                        System.out.println("\nInvalid choice. You lose an action.");
                        actionsLeft--;
                    }
                }
                actionsLeft--;
            } else if (choice == 3) {
                System.out.println("\nYou enter the third room.");
                if (!hasMeat) {
                    System.out.println("You see a creature blocking the way.");
                    if (hasKnife) {
                        System.out.print("Enter 1 to kill the creature with the knife: ");
                        int killChoice = scanner.nextInt();
                        if (killChoice == 1) {
                            System.out.println("\nYou kill the creature.");
                        } else {
                            System.out.println("\nInvalid choice. You lose an action.");
                            actionsLeft--;
                        }
                    } else {
                        System.out.println("You have no weapon to attack the creature.");
                    }
                } else {
                    System.out.println("You see the creature eating the meat you found earlier.");
                    System.out.print("Enter 1 to tame the creature: ");
                    int tameChoice = scanner.nextInt();
                    if (tameChoice == 1) {
                        System.out.println("\nYou tame the creature and it becomes your ally.");
                    } else {
                        System.out.println("\nInvalid choice. You lose an action.");
                        actionsLeft--;
                    }
                }
                actionsLeft--;
            } else if (choice == 4) {
                System.out.println("\nYou enter the fourth room.");
                System.out.println("You find yourself in a locked room.");
                System.out.println("You look around and see a keyhole on the door.");
                System.out.print("Enter 1 to try and unlock the door with a key: ");
                int unlockChoice = scanner.nextInt();
                if (unlockChoice == 1) {
                    System.out.println("You try the key in the lock.");
                    if (hasKey) {
                        System.out.println("The lock clicks and the door swings open.");
                        System.out.println("You have unlocked the door!");
                        System.out.println("You step through the door and find yourself outside.");
                        System.out.println("Congratulation you escaped!! ");
                        return;
                    } else {
                        System.out.println("You don't have the right key to unlock the door.");
                        System.out.println("You will need to search for the key.");
                        actionsLeft--;
                    }
                } else {
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                    actionsLeft--;
                }
            }
            if (actionsLeft == 0) {
                System.out.println("You have no actions left.");
                System.out.println("Game over.");
                gameOver = true;
                break;
            }
        }

            if (gameOver) {
                return;
            }

            System.out.println("You have explored the mansion but have not found a way out.");
            System.out.println("You are trapped!");
        }
    }