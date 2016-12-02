package algorithms.array;

/**
 * Created by joshik on 10/18/16.
 */
public class ArrayApp {
    public static void main(String[] args) {

        long[] arr = new long[100]; // new array with 100 spaces
        int nElem = 0; //number of items
        int j; //loop counter

        arr[0] = 2;
        arr[1] = 4;
        arr[2] = 6;
        arr[3] = 8;
        arr[4] = 10;
        arr[5] = 12;

        nElem = 6;

        //display arr ***************************************************************

        for (j=0; j<nElem;j++){
            System.out.println(arr[j] + " ");
            System.out.println(" ");
        }

        // search *******************************************************************

        int sKey = 6;

        for (j=0; j<nElem; j++){
            if(arr[j] == sKey){
                break;
            }
        }

        System.out.println(j);

        if(j==nElem){
            System.out.println("Cant find search key " + sKey);
        }else {
            System.out.println("Search Key value found, " + sKey);
        }

        //delete ********************************************************************

        int s2Key = 4;

        for(j=0; j< nElem; j++){
            if(arr[j]==s2Key){
                break;
            }

        }

        for(int k=j; k<nElem-1;k++){
            arr[k] = arr[k+1];
        }
        nElem--;

        for(j=0; j<nElem; j++){
            System.out.println(arr[j] + " ");
        }


    }
}
