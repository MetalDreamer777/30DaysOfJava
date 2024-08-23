package ep018to056;

public class Ep053Class_vs_Object {
// https://youtu.be/72z4xQyGmbI?si=RGMXL5Ss7md7RnfO
}
/* Notes
 * When you need to bake a bunch of variables that follow the same structure, instead of making them all individually
 * you can create a class with a blueprint of that structure, and then create a bunch of copies of it as objects.
 * 
 * In a class, you are going to be defining a structure with variables and methods. You can then "instantiate" the class to create
 * numerous unique copies of that class. Each of these copies that are created are called objects.
 * 
 * Lets imagine you have a class that defines a person. It has a name variable and a method that allows each person to talk().
 * We can instantiate objects of this class. We have three instances, and their names are Caleb, Emily, and Charels. And they all can
 * talk with the method talk().
 * 
 * So the class allows us to make many entities that are very similar.
 * A string is a type of object by the way.
 * 
 * The class is defined inside a file, while the objects are created as variables.
 * 
 * We may do something were we create a type of variable that we reference like this:
 * 'Person x;' 
 * This is basically the same thing as saying 'int x;' or 'String x;'
 * int and String and variable types, and in this case we created
 * a custom type called 'person' where 'x' is the identifier of that person. x is the variable of that type
 * we can then also create methods that have parameters of that type
 * 
 * Summary:
 * - Class - is the blueprint, the structure, it's the cookie cutter.
 * - Object - and object is an instance of a class. Like taking a cookie cutter and making three cookies. (Me made people, Caleb, Emily, and Charels)
 * - When we are creating a class, we are essentially creating a custom type. and we instantiate it by making a variable of that type.
 */
