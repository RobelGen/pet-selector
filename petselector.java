import java.util.Scanner;

public class petselector {
    public static void main(String[] args){
Scanner scan = new Scanner(System.in);
System.out.println("hey what's your name?");
String name= scan.nextLine().toLowerCase();
 if ("abcdefghijklmnopqrstuvwxyz".indexOf(name.substring(0, 1)) == -1) {
               System.out.println("that's not a real name!"); 
               return; // exit program
 }

String color;
String season;
String name;
String pet;

color= "Enter your favorite color:" + "";

if (!color.equals ("blue") && !color.equals ("red") && !color.equals ("green")) {
    System.out.println("Enter a valid color");
}
if ( color.equals("blue") && season.equals("fall")) {

System.out.println("Your perfect pet is: Alligator");} 

if ( color.equals("blue") && season.equals("spring")) {

    System.out.println("Your perfect pet is: Ostrich");}

if ( color.equals("green") && "aeiou".indexOf(name.substring(0, 1))==-1 && season.equals("winter")) {

    System.out.println("Your perfect pet is: Girrafe");}

if ( color.equals("green")  && season.equals("winter") || season.equals ("summer") || season.equals ("spring") && !pet.equals ("Giraffe")){

    System.out.println("Your perfect pet is: Dog");}

if ( color.equals("red")  && "aeiou".indexOf(name.substring(0, 1))==1){

    System.out.println("Your perfect pet is: Porcupine");}

if ( season.equals("summer")  && !pet.equals ("Dog") && !pet.equals ("Panda") && !pet.equals ("Porcupine")){

    System.out.println("Your perfect pet is: Pony");}

if ("aeiou".indexOf(name.substring(0, 1)==-1 && color.equals("blue") && !season.equals ("summer") && !season.equals ("fall"))
    System.out.println("Your perfect pet is: Pony");}
    
if ( !pet.equals("Pony") && !pet.equals("Porcupine") && !pet.equals("Dog") && !pet.equals("Girrafe") && !pet.equals("Ostrich") && !pet.equals("Alligator")) {  
    System.out.println("Your perfect pet is: rock");
}

}



