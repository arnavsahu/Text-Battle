public class Hero extends Character
{
    protected String inventory[] = new String[3]; 
    private int originalHealth;
    
    public Hero(String name, int health, int minDamage, int maxDamage, String[] inventory)
    {
        super(name, health, minDamage, maxDamage);
        originalHealth = health;
        this.inventory = inventory; 
    }
    
    public void useItem(int choice){
        String userChoice = inventory[choice-1];
        if(!userChoice.equals("empty")) {
            if(userChoice.equals("Health potion")){
                health += 20;
                if(health > originalHealth){
                    health = originalHealth; 
                }
                System.out.println(getName() + " now has " + getHealth() + " health.");
                inventory[choice - 1] = "empty"; 
            }
            if(userChoice.equals("Damage potion")){
               maxDamage += 10; 
               System.out.println(getName() + " can do more damage."); 
               inventory[choice - 1] = "empty"; 
            }
        } else {
            System.out.println("That inventory slot is empty");  
        }            
    }
    
    public void show_inventory(){
        System.out.print("Your inventory holds: "); 
        int count = 1; 
        for(String element: inventory){          
            System.out.print(count + "." + element);
            count++;
            System.out.print(" "); 
        }
        System.out.println(""); 
    }
}
