import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Bear(wombat) world
 * 
 * @author (Rick) 
 * @version (May 2019)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        Bear sjo = new Bear();
        addObject(sjo, 150, 200);
        Label scoreLabel = new Label();
        createBread();
    }
    
    
    //randomizes bread creation
    public void createBread()
    {
        Bread bred = new Bread();
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(bred, x, y);
    }
}
