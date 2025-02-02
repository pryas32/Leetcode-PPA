public class comparableinterface implements Comparable<comparableinterface>{
int rollno;

    public int compareTo(comparableinterface s){
        return this.rollno-s.rollno;
    }


    //we use comparable interface when we want to compare element different from natural ordering eg

    //if we have student adn we need to sort it acc to x and sometime acc to x and sometime acc to y co-ordinate
    //use comparable interface


// non primitive data type libraries that implements comparable interface
//integer ,long ,float ,double ,short ,byte ,data ,character

    // if we create arraylist,priority_queue,treemap,treeset of comparableinterface then it will sort acc to roll no .
    //we implement comparable if we want to sort different from the natural ordering

   //we will create object of comparableinertface adn them will pass it to compareTo(studwent s) method

   /// s.compareTo(s1)//in this s.rollno and s1.rollno









}
