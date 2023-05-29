import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen.
 * 
 * @author Rick 
 * @version May 29, 2023
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("Bread Bear", 100);
    Label pressSpace = new Label("Press <Space> to Begin", 25);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);

        addObject(titleLabel, getWidth()/2, getHeight()/2);
        addObject(pressSpace, getWidth()/2, 300);
        prepare();
    }

    /**
     * the main world act loop
     */
    public void act()
    {
        //starts game when space pressed
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        
    }
}
