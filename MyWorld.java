import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Bear(wombat) world
 * 
 * @author (Rick) 
 * @version (May 2019)
 */
public class MyWorld extends World
{
    public int score = 0;
    Label scoreLabel = new Label(0, 100);
    int level = 3;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false);
        Bear sjo = new Bear();
        addObject(sjo, 150, 350);
        
        addObject(scoreLabel, 50, 50);
        createBread();
    }
    
    //increase score
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
        
        if(score % 5 == 0)
        {
            level += 1;
        }
    }
    //game over
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
        Greenfoot.stop();
    }
    //randomizes bread creation
    public void createBread()
    {
        Bread bred = new Bread();
        bred.setSpeed(level);
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(bred, x, y);
    }
}
