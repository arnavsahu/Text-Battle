public class Mage extends Hero 
{
    private int mana;
    
    public Mage(String name, String[] inventory)
    {
        super(name, 85, 15, 25, inventory);
        this.mana = 50; 
    }
    
    public void attack(Character enemy){
        int rand = (int)(Math.random() * (maxDamage - minDamage + 1)) + minDamage;
        mana -= 10; 
        if(mana <= 0){
            mana = 0; 
            System.out.println("Not enough mana!"); 
        } else {
            super.attack(enemy); 
        }
    }
    
    public void useItem(int choice){ 
        String userChoice = this.inventory[choice-1];     
        if(userChoice.equals("Mana potion")){
                mana += 30; 
                System.out.println(getName() + " now has " + mana + " mana."); 
                this.inventory[choice - 1] = "empty"; 
        }
        super.useItem(choice); 
    }
}
