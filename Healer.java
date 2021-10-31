public class Healer extends Hero 
{
    private double missChance; 
    
    public Healer(String name, String[] inventory)
    {
        super(name, 75, 5, 15, inventory);
        this.missChance = 0.7; 
    }
    
    public void attack(Character enemy){
        double chance = Math.random(); 
        if(missChance < chance){
            System.out.println(name + " used their healing ability!");
            health += 10;
            System.out.println(getName() + " has " + getHealth() + " health left."); 
            if(health > 75){
                health = 75; 
            }
        } 
        super.attack(enemy); 
    }
}
