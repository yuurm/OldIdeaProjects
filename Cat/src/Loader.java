
public class Loader
{
    public static void main(String[] args)
    {
        Cat murka = new Cat("Murka");
        System.out.println(murka.getName());
        System.out.println(murka.getWeight());

        Cat vaska = new Cat(3.01);
        System.out.print("Ves kota po imeni " + murka.getName());
        System.out.println(" " + vaska.getWeight() + " kg");

        Cat cat = new Cat();
        cat.setCatColor(CatColor.BLACK_CAT);
        System.out.println(cat.getCatColor());

        Cat barsik = new Cat();
        barsik.setName("Barsik");
        Cat tom = barsik;
        tom.setName("Tom");

        System.out.println(barsik.getName());

        Cat zhorik = new Cat(vaska.getWeight(),
                vaska.getName(), vaska.getCatColor());
        System.out.println(zhorik.getWeight()+" "+
                zhorik.getName()+" "+ zhorik.getCatColor());




    }
}
