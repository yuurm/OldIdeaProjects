
public class Cat
{
    private double originWeight;
    private double weight;

    private double minWeight;
    private double maxWeight;

    private String name;



    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;

    }

    public Cat(double weight, String name, CatColor color){

    }



    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setCatColor(CatColor color){
    }

    public CatColor getCatColor(){
        return CatColor.BLACK_CAT;
    }









    public Cat(String name){
        this();
        this.name = name;

    }

    public Cat(double weight){
        this();
        this.weight = weight;

    }

    public void meow()
    {
        weight = weight - 1;
        System.out.println("Meow");
    }

    public void feed(Double amount)
    {
        weight = weight + amount;
    }

    public void drink(Double amount)
    {
        weight = weight + amount;
    }

    public Double getWeight()
    {
        return weight;
    }

    public String getStatus()
    {
        if(weight < minWeight) {
            return "Dead";
        }
        else if(weight > maxWeight) {
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }


}

