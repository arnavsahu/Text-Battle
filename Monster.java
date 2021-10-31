public class Monster extends Character
{
    public double missChance; 
    
    public Monster(String name, int health, int min, int max)
    {
        super(name, health, min, max);
        this.missChance = 0.8; 
    }
    
    public void attack(Character enemy){
        double chance = Math.random(); 
        if(missChance < chance){
            System.out.println("The " + getName() + " missed!"); 
        } else {
            super.attack(enemy);  
        }
    }
}
