package com.directi.training.lsp.exercise;

public class Pool
{
    public void run()
    {
        Duck donaldDuck = new Duck();
        ElectronicDuck electricDuck = new ElectronicDuck();
        quack(donaldDuck);
        electricDuck.turnOn();
        quackElectric(electricDuck);
        
        swim(donaldDuck);
        swimElectric(electricDuck);
        electricDuck.turnOff();
    }

    private void quack(Duck... ducks)
    {
        for (Duck duck : ducks) {
            duck.quack();
        }
    }
    private void quackElectric(ElectronicDuck... ducks)
    {
        for (ElectronicDuck duck : ducks) {
            duck.quack();
        }
    }

    private void swim(Duck... ducks)
    {
        for (Duck duck : ducks) {
            duck.swim();
        }
    }
    private void swimElectric(ElectronicDuck... ducks)
    {
        for (ElectronicDuck duck : ducks) {
            duck.swim();
        }
    }

    public static void main(String[] args)
    {
        Pool pool = new Pool();
        pool.run();
    }
}
