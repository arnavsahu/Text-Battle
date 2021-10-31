public class Warrior extends Hero 
{
    private double critChance;
    
    public Warrior(String name, String[] inventory)
    {
        super(name, 100, 10, 20, inventory);
        this.critChance = 0.5; 
    }
    
    public void attack(Character enemy){ 
        int rand = (int)(Math.random() * (maxDamage - minDamage + 1)) + minDamage;
        double critRand = Math.random(); 
        if(critRand > critChance){
            System.out.println(getName() + " can attack doing critical damage!"); 
            rand *= 2; 
        }
        System.out.println(getName() + " attacks the " + enemy.getName() + " doing " + rand + " damage.");
        enemy.recieveDmg(rand);  
    }
}
