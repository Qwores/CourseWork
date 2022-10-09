## 12.while loop

    //while loop = executes a block of code as long as it`s condition remains true
    

    //do loop = is a variation of a while loop, but we do action at least once

import java.util.Scanner;

public class Main {
public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = "";

        while (name.isBlank()) { //it`s stops when it`s false
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }

        System.out.println("Hello, "+name);
    }
}

## 13.for loop

    //for loop = executes a block of code a limited amount of times 

## 14.nested loops

    nested loops - it`s a loop inside of a loop



## 22.methods

    //method - is a block of code that is executed whenever it`s called upon

The variables that we pass to method is known as ARGUMENTS. We need matching arguments and parameters.

    // return types - there is local variables, so you can declare vars with same name. 
    And you can return something like "return x + y;" to shorten everithing


25.final keyword

it`s like constanta and in classes. We can`t change thing under the "final"

## 26.objects(OOP)

Object = an instance of a class that may contain attributes(characteristics that object has)
and methods(actions this object can perform)

example: (phone, desk, computer, coffee cup)

If you want to declare class in the same file - make sure it`s outside Main class.

## 27.constructors

## 28.variable scope

local variables and global

    //local - declared inside a method
    //      visible only to the method

    //global - declared outside a method, but within a class
    //      visible to all parts of class      

## 46.FileWriter(write to a file)

import java.io.FileWriter;
import java.io.IOException;
public class Main {
public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("base.txt");
            //writer.write("Rose are red");
            writer.write("Roses are red \npidor \nxuy \ndodik");
            writer.close();

        } catch (IOException e) {
            // TODO auto-generated catch block
            e.printStackTrace();
        }
    }
}

1 step

    //import java.io.FileWriter;
    //import java.io.IOException;
    
    //FileWriter name = new FileWriter("name.txt");
    
    //try {
            FileWriter writer = new FileWriter("base.txt");
        } catch (IOException e) {
            // TODO auto-generated catch block
            e.printStackTrace();
        }

How to write to file :
    
    //writer.write("Roses are red \npidor \nxuy \ndodik");
    //writer.close(); 

Writer.close(); is closing your write function

## 47.FileReader(read a file)

import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
public static void main(String[] args) {

        //FileReader = read the contents of a file as a stream of characters. One by one
        //             read() returns an int value which contains the byte value
        //             when read() returns -1, there is no more data to be read

        try {
            FileReader reader = new FileReader("base.txt");
            int data = reader.read();
            while (data != -1) {
                System.out.print((char)data); // print NOT println, because it will add char after every line
                data = reader.read();
            }
            reader.close();

        } catch (FileNotFoundException e) {
            // TODO auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO auto-generated catch block
            e.printStackTrace();
        }


    }
}

## 48.audio