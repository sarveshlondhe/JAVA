class Goods
{
    String description;
    int price;
    Goods(String description,int price)
    {
        this.description=description;
        this.price=price;
    }
    void display()
    {
        System.out.println("description ="+description);
        System.out.println("price ="+price);
    }
}
class Food extends Goods{
   String calories;
   Food(String description,int price,String calories)
   {
    super(description,price);
    this.calories= calories;
   }
   void display1()
   {
    System.out.println("calories="+calories);
   }
}
class Book extends Goods
{
    String author;
    Book(String description,int price, String author)
    {
      super(description,price);
      this.author=author;

    }
    void display2()
    {
        System.out.println("author="+author);
    }

}
class Toy extends Goods{
    String minage;
    Toy(String description, int price, String minage)
    {
        super(description,price);
        this.minage=minage;
    }
    void display3()
    {
        System.out.println("minage="+minage);
    }
}
class Demo 
{
    public static void main(String args[])
    {
        Food f1=new Food("long",50,"cal");
        Toy t1 =new Toy("long",50,"min");
        Book b1 =new Book("long",50,"ram");
        //b1.dispaly();
        f1.display1();
        t1.display3();
        b1.display2();
        f1.display();
        
    }
}