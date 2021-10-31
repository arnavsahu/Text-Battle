public class Character
{
    protected String name;
    protected int health;
    protected int minDamage; 
    protected int maxDamage; 
    
    public Character(String name, int health, int minDamage, int maxDamage){
        this.name = name; 
        this.health = health; 
        this.minDamage = minDamage; 
        this.maxDamage = maxDamage; 
    }   
    
    public int getHealth(){
        return health; 
    }
    public String getName(){
        return name; 
    }
    public int getmin(){
        return minDamage; 
    }
    public int getmax(){
        return maxDamage; 
    }
    
    public String toString(){
        return name; 
    }
    
    public void attack(Character enemy){
        int rand = (int)(Math.random() * (maxDamage - minDamage + 1)) + minDamage;
        System.out.println(name + " attacks the " + enemy.getName() + " doing " + rand + " damage."); 
        enemy.recieveDmg(rand); 
        System.out.println(" "); 
    }
    
    public void recieveDmg(int damage){
        health -= damage;
        if(health <= 0){
            health = 0; 
        }
        System.out.println(name + " has " + health + " health left."); 
    }
}

