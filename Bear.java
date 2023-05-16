import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Actually a wombat
 * 
 * @author (Rick) 
 * @version (May 2023)
 */
public class Bear extends Actor
{
    /**
     * Act - do whatever the Bear wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    
    
    public void act()
    {
        if(Greenfoot.isKeyDown("left")){
            move(-3);
        }
        
        if(Greenfoot.isKeyDown("right")){
            move(3);
        }
        
        
        eat();  
    }
    //eat bread and spawn new bread
    public void eat()
    {
        if(isTouching(Bread.class))
        {
            removeTouching(Bread.class);
            MyWorld world = (MyWorld) getWorld();
            world.createBread();
        }
    }
}
