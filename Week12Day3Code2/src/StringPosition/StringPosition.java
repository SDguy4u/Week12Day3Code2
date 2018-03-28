package StringPosition; 
public class StringPosition { 
private static String data[] = {"Saarth", "Saksham" ,"Vivek" , "Nikku" , "Sakshu", "Rupen" , "Yugal" , "Harshit" , "Nishu" , "Ashi"}; 

public static int iterativeSearch (String d[], String g) { 
int ndx = 0; 
    while (ndx < d. length && d[ndx] != g) ndx++;
    if (ndx >=d. length) return -1; 
    if (g == d[ndx]) return ndx;
    else return -1; 
}
public static void main (String [] args) { 
    String goal = "Sakshu";
    int result = iterativeSearch(data, goal); 
    if (result < 0) 
    System.out.println("The search could not find: " + goal);
  else 
    System.out.println("The goal of " + goal + " was found at index: " + result);
}
}
