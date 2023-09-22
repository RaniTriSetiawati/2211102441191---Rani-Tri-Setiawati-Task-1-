import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FirstStage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FirstStage extends MyWorld
{

    /**
     * Constructor for objects of class FirstStage.
     * 
     */
    public FirstStage()
    {

        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Plane plane = new Plane();
        addObject(plane,92,88);
        snack snack = new snack();
        addObject(snack,484,88);
        snack snack2 = new snack();
        addObject(snack2,470,100);
        snack snack3 = new snack();
        addObject(snack3,451,118);
        snack snack4 = new snack();
        addObject(snack4,486,82);
        snack2.setLocation(374,252);
        snack.setLocation(440,458);
        snack.setLocation(235,76);
        snack2.setLocation(274,98);
        snack snack5 = new snack();
        addObject(snack5,246,425);
        snack snack6 = new snack();
        addObject(snack6,695,140);
        snack snack7 = new snack();
        addObject(snack7,655,468);
        snack snack8 = new snack();
        addObject(snack8,74,447);
    }
}
