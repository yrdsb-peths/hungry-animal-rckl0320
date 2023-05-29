import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Bread.
 * 
 * @author (Rick) 
 * @version (May 2023)
 */
public class Bread extends Actor
{
    int speed = 1;
    
    /**
     * Act - do whatever the Bread wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        int x = getX();
        int y = getY() + speed;
        setLocation(x, y);
        
        //remove apple and game over
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight())
        {
            world.gameOver();
            world.removeObject(this);
        }
    }
    
    public void setSpeed(int sped)
    {
        speed = sped; 
    }
}
