package algorithms.array;

/**
 * Created by joshik on 10/19/16.
 */
public class LowArrayApp {
    public static void main(String[] args) {
        LowArray arr = new LowArray(100);

        int nElem;
        int j;
        int k;

        // setting the values into array at specific indices

        arr.setElem(0, 77);
        arr.setElem(1, 59);
        arr.setElem(2, 87);
        arr.setElem(3, 55);
        arr.setElem(4, 95);
        arr.setElem(5, 40);
        arr.setElem(6, 30);
        arr.setElem(7, 20);
        arr.setElem(8, 100);
        arr.setElem(9, 67);

        nElem = 10;


        //display ********************************************************

        for(j=0; j<nElem; j++){
            System.out.println(arr.getElem(j) + " ");
            System.out.println(" ");
        }


//        //Search *********************************************************
//
//        int s3Key = 10;
//
//        for(j=0; j<nElem; j++){
//            if(arr.getElem(j)==s3Key);
//            break;
//        }
//
//        if(j==nElem){
//            System.out.println( "Not found!!");
//        }
//        else{
//            System.out.println("Search Key value found!! " + s3Key);
//        }

        //Delete ********************************************************

        int s4Key = 30;

        for(j=0; j<nElem; j++){
            if(arr.getElem(j) == s4Key){
                break;
            }
        }

        for(k=j; k<nElem-1; k++){
            arr.setElem(k, arr.getElem(k + 1));
        }
        nElem--;

        //Display ********************************************************
        System.out.println(" -------------------------- ");
        for(j=0; j<nElem; j++){
            System.out.println(arr.getElem(j) + " ");
        }

    }
}
