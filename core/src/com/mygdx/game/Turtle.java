package com.mygdx.game;

public class Turtle extends ActorBeta
{
    public final static int IDLE=0;
    public final static int LEFT=1;
    public final static int TOP=2;
    public final static int RIGHT=3;
    public final static int BOTTOM=4;

    private int direction=0;
    private int speed=10;

    public Turtle()
    {
        super();

        setDirection(Turtle.IDLE);
    }

    public void setDirection(int d)
    {
        direction=d;
    }

    public void act(float dt)
    {
        super.act(dt);

        if(direction==Turtle.LEFT)
        {
            this.moveBy(-speed, 0);
            setDirection(Turtle.IDLE);
        }
        else if(direction==Turtle.TOP)
        {
            this.moveBy(0, speed);
            setDirection(Turtle.IDLE);
        }
        else if(direction==Turtle.RIGHT)
        {
            this.moveBy(speed, 0);
            setDirection(Turtle.IDLE);
        }
        else if(direction==Turtle.BOTTOM)
        {
            this.moveBy(0, -speed);
            setDirection(Turtle.IDLE);
        }
    }
}
