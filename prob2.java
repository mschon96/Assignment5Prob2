
/*
Name: Mariah Schon
Class : 3320-002
Program # : 5 prob2
Due Date : November 3
Honor Pledge: On my honor as a student of the University
 of Nebraska at Omaha, I have neither given nor received
  unauthorized help on this homework assignment.
NAME: Mariah Schon
NUID: 581
EMAIL: mschon@unomaha.edu
Partners: CSLC
This program allows the user to create a D heap, insert elements, delete the minimum value, and change teh D*/

import java.util.Scanner;



public class prob2{

    public static void main (String[] args){
        int choice = 1;


        Scanner input = new Scanner(System.in);
        //        Scanner dinput = new Scanner(System.in);
        //        Scanner cinput = new Scanner(System.in);

        //prompts user for information, enters the information into variable ELEMENTS
        System.out.println("Enter heap elements: ");
        String elements = input.nextLine();

        /*
           String arr[]= elements.split(" ");
           for (int i = 0; i < arr.length ; i ++){
           System.out.printf("%s\n", arr[i]);
           }

*/
        //break up numbers and put into array
        String arr[]= elements.split(" ");
        int intArr[] = new int[arr.length];
        for (int i = 0; i < intArr.length; ++i) {
            intArr[i] = Integer.parseInt(arr[i]);
            //  System.out.printf("%d\n", intArr[i]);
        }


        System.out.print("Enter d: ");
        int d = input.nextInt();

        //  System.out.printf("%d\n", d);


        //        System.out.printf("Press (1) for insert, (2) for deleteMin, (3) for new d value, (4) to quit");
        //        choice = input.nextInt();


        myDHeap dheap = new myDHeap(intArr, d);
  while(choice > 0 && choice < 5){


            dheap.printOutput();

            System.out.printf("\n");

            System.out.printf("Press (1) for insert, (2) for deleteMin, (3) for new d value, (4) to quit: ");
            choice = input.nextInt();


            if(choice !=4){
                switch(choice){
                    case 1: //insert
                        System.out.print("Enter element to insert: ");
                        int e = input.nextInt();

                        // System.out.printf("Element: %d", e);

                        dheap.insert(e);


                        break;

                    case 2: // deleteMin

                        dheap.deleteMin();


                //        dheap.printOutput();


                        break;

                    case 3: // new d
                        System.out.print("Enter d: ");
                        d = input.nextInt();

                        dheap.setD(d);
                        dheap.buildHeap();
                        break;

                    case 4: //quit
                        System.out.printf("Program Terminated");
                        break;

                }
            }

            else{
                System.out.println("Program Terminated");
                break;
            }


        }
    }
}
