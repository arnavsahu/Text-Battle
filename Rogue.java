public class Rogue extends Hero 
{
    private double secondAttackChance; 
    
    public Rogue(String name, String[] inventory)
    {
        super(name, 70, 20, 30, inventory);
        secondAttackChance = 0.3; 
    }
    
    public void attack(Character enemy){
        super.attack(enemy); 
        if(Math.random() < 0.3){
            System.out.println(getName() + " can attack again!"); 
            super.attack(enemy); 
        }
    }
}
