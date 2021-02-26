package com.CodeWars.Problems;

public class Main {

    public static void main(String[] args) {
        String names[] = new String[] {"Sheldon","Leonard", "Penny", "Rajesh", "Howard"};
        DoubleCola colaLine = new DoubleCola();
        for (String name:names) {
            colaLine.add(name);

        }
        System.out.println(calculateNthPerson(colaLine,52));

    }
    public static String calculateNthPerson(DoubleCola line, int nThPerson){
        String name = "";
        //for every removed item add two new ones
        for(int people = 0; people < nThPerson; people++){
            name = (String) line.remove();
            for(int doublingEffect =0 ; doublingEffect<2; doublingEffect++){
                line.add(name);
            }
        }
        return (String)line.peek();
    }
}
