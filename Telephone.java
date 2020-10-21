import java.util.*;//rajveer is shit
class Telephone
{
 int calls;
 double amt,total;
 String name;
 void input()
 {
 Scanner sc = new Scanner (System.in);
 System.out.println("Enter the calls being made");
  calls = sc.nextInt ();
 System.out.println("Enter the name of the Customer");
  name = sc.next ();
  sc.close();
 }
 void calc()
 {
  if (calls == 150)
  {
   amt = 150;
   total = 150;
  }
  else if (calls == 300)
  {
   amt = 300*2;
   total = amt+150;}
  }
   void display()
   {
    System.out.println("The name of customer is"+name);
    System.out.println("the calls being made are"+calls);
    System.out.println("the total is"+total);
   }
   public static void main(String[] args)
   {
    Telephone a = new Telephone();
    a.input ();
    a.calc();
    a.display();
   }}
