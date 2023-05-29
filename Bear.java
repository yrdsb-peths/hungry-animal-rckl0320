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
    GreenfootImage[] idleWalkRight = new GreenfootImage[4];
    GreenfootImage[] idleWalkLeft = new GreenfootImage[4];
    SimpleTimer animationTimer = new SimpleTimer();
    
    //Direction storing variable
    String facing = "right";
    /**
     * Act - do whatever the Bear wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    /**
     * constructor
     */   
    public Bear()
    {
        for(int i=0; i<idleWalkRight.length; i++)
        {
            idleWalkRight[i] = new GreenfootImage("images/bear_walk/bearWalk" + i + ".png");
            idleWalkRight[i].scale(120, 90);
        }
        
        for(int i=0; i<idleWalkLeft.length; i++)
        {
            idleWalkLeft[i] = new GreenfootImage("images/bear_walk/bearWalk" + i + ".png");
            idleWalkLeft[i].mirrorHorizontally();
            idleWalkLeft[i].scale(120, 90);
        }
        
        animationTimer.mark();
        
        setImage(idleWalkRight[0]);
    }
    
    /**
     * Animates bear
     */
    int imageIndex = 0;
    public void animateBear()
    {
        if(animationTimer.millisElapsed() < 25)
        {  
            return;
        }
        animationTimer.mark();
        if(facing.equals("right"))
        {
            setImage(idleWalkRight[imageIndex]);
            imageIndex = (imageIndex + 1) % idleWalkRight.length;
        }
        else
        {
            setImage(idleWalkLeft[imageIndex]);
            imageIndex = (imageIndex + 1) % idleWalkLeft.length; 
        }
    
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("left")){
            move(-6);
            facing = "left";
        }
        
        if(Greenfoot.isKeyDown("right")){
            move(6);
            facing = "right";
        }
        
        //activate eating
        eat(); 
        //activate animations
        animateBear();
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
