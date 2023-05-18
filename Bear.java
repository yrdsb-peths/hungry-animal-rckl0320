import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Actually a wombat
 * 
 * @author (Rick) 
 * @version (May 2023)
 */
public class Bear extends Actor
{
    GreenfootSound breadEat = new GreenfootSound("good.mp3");
    GreenfootImage idleWalk = new GreenfootImage("images/bear_walk/bearWalk0.png");
    /**
     * Act - do whatever the Bear wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    //constructor   
    public Bear()
    {
        setImage(idleWalk);
    }
    
    
    public void act()
    {
        if(Greenfoot.isKeyDown("left")){
            move(-5);
        }
        
        if(Greenfoot.isKeyDown("right")){
            move(5);
        }
        
        
        eat();  
    }
    //eat bread and spawn new bread
    public void eat()
    {
        if(isTouching(Bread.class))
        {
            removeTouching(Bread.class);
            breadEat.play();
            MyWorld world = (MyWorld) getWorld();
            world.createBread();
            world.increaseScore();
        }
    }
}
