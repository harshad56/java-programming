
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("generice animal", "small", 34);
        doanimalStuff(animal, "slow");// here using parent class

        dog d = new dog("freindly-animnal", "semi-small", 67);
        doanimalStuff(d, "fast");// here using inhertence using parent class to child class(dog)

        dog labredour = new dog("labredour", "tall", 78);
        doanimalStuff(labredour, "slow");

        dog reterver = new dog("reterver", "semi-small", 100);
        doanimalStuff(reterver, "fast");

        // here we use see example of woof example for type
        dog woof = new dog("woof", "big", 467);
        doanimalStuff(woof, "slow");

        Fish goldie = new Fish("GoldFish", "small", 0.56, 2, 5);
        doanimalStuff(goldie, "slow");

    }

    public static void doanimalStuff(Animal ani, String speed) {
        ani.makenoise();
        ani.move(speed);
        System.out.println(ani);
        System.out.println("-----");
    }
}
