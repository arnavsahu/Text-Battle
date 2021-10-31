import java.util.Scanner; 
public class Battle
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in); 
        System.out.println("Enter a name for your character: "); 
        String name = scan.nextLine(); 
        System.out.println("Choose a class for your character (1 for warrior, 2 for rogue, 3 for mage, 4 for healer): "); 
        int character = scan.nextInt();
        System.out.println(" "); 
        Hero main;
        if(character == 1){
            String[] inv = new String[3]; 
            inv[0] = "Health potion";
            inv[1] = "Damage potion"; 
            inv[2] = "Health potion";
            main = new Warrior(name, inv); 
        } else if(character == 2){
            String[] inv  = new String[3]; 
            inv[0] = "Damage potion"; 
            inv[1] = "Health potion"; 
            inv[2] = "Damage potion"; 
            main = new Rogue(name, inv); 
        } else if(character == 3){
            String[] inv = new String[3];
            inv[0] = "Mana potion"; 
            inv[1] = "Damage potion";
            inv[2] = "Health potion";
            main = new Mage(name, inv);
        } else{
            String[] inv = new String[3];
            inv[0] = "Damage potion"; 
            inv[1] = "Health potion";
            inv[2] = "Damage potion"; 
            main = new Healer(name, inv); 
        }
        Monster monster; 
        int rand = (int)((Math.random() * 3) + 1); 
        if(rand == 1){
            monster = new Monster("Witch", 70, 10, 20); 
        } else if(rand ==2){
            monster = new Monster("Dragon", 100, 15, 25); 
        } else{
            monster = new Monster("Troll", 70, 5, 25); 
        }
        boolean play = true; 
        int round = 1; 
        System.out.println(name + " has encountered a " + monster.getName());
        while(play == true){
            System.out.println("++++++++++++++++++++++++++++++++++++ ROUND " +  round + " ++++++++++++++++++++++++++++++++++++"); 
            System.out.println(" "); 
            round += 1; 
            main.show_inventory(); 
            System.out.println(" "); 
            System.out.println("Type 0 to attack or type an inventory slot number: ");
            int choice = scan.nextInt(); 
            System.out.println(" "); 
            if(choice == 0){
                main.attack(monster);
                if(monster.getHealth() <= 0){
                    System.out.println("You have defeated the " + monster.getName() + "!");
                    break; 
                }
            } else{
                main.useItem(choice);
            }
            monster.attack(main); 
            if(main.getHealth() <= 0){
                System.out.println("The " + monster.getName() + " has defeated you!"); 
                break; 
            }
            round++; 
            System.out.println(" "); 
        }
    }
}
