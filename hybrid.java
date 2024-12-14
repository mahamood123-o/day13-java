class gp
{
    public void r()
    {
        System.out.println("Hlo i'm grand parent");
    }
}
class p1 extends gp
{
    public void r1()
    {
        System.out.println("hlo i'm parent1");
    }
}
interface p2
{
  void r2();
}
class d extends p1 implements p2
{
  public void r2()
  {
     System.out.println("I'm parent2");
  }
  public void r3()
  {
      System.out.println("i'm a child class");
  }
}
class Main{
    public static void main(String args[])
    {
        d h1=new d();
        h1.r();
        h1.r1();
        h1.r2();
        h1.r3();
    }
}