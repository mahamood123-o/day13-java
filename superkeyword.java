class a
{
    public void r()
    {
        System.out.println("Mahamood");
    }
}
class b extends a
{
    public void r1()
    {
        super.r();
        System.out.println("From CSE-DS");
    }
}
class Main{
    public static void main(String args[])
    {
        b n=new b();
        n.r1();
    }
}