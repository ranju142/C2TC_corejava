abstract class Animal
{
 abstract void eat1();
}
class Herbivores extends Animal
{
void eat1()
{
System.out.print("I am a vegetarian");
}
}
class carnivores extends Animal {
void eat()
{
System.out.print("I am non-vegetarian");
}
public static void main(String args[])
{
Animal goat = new Animal();
}
}
