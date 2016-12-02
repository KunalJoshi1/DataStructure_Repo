package algorithms.array;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

/**
 * Created by joshik on 10/20/16.
 */
public class OrderedArray {

    private long[] a;
    private int nElem;
    int j;

    public OrderedArray(int max){
        a = new long [max];
        nElem = 0;
    }

    public int size(){
        return nElem;
    }

    // Find ************************************************************************

    public int find(long sKey){
        int lowBound = 0;
        int upBound = nElem -1;
        int cInd;


        while(true){
            cInd = (lowBound + upBound)/2;

            if(a[cInd] == sKey){
                return cInd;                  // found
            }
            //System.out.println("Found it!!");
            else if(lowBound > upBound){
                return nElem;                 // not found, invalid search range
            }
            //System.out.println("Not found!!");
            else{
                if(a[cInd] < sKey){
                    lowBound =  cInd + 1;
                }
                else{
                    upBound = cInd - 1;
                }
            }
        }
    }

    //*********************************************************************************

    // Display ************************************************************************



    // Insert *************************************************************************

    public void insert(long value){
        for(j=0; j<nElem; j++){
            if(a[j] > value){
                break;
            }
        }

        for(int k = nElem; k > j; k--){
            a[k] = a[k-1];
        }

        a[j] = value;
        nElem++;
    }

    // Delete *************************************************************************

    public boolean delete (long value){

        j = find(value);
        if(j == nElem){
            return false;
        }else{
            for(int k = j; k<nElem; k++) {
                a[k] = a[k + 1];
            }
            nElem--;
            return true;
        }
    }

    // Display ************************************************************************

    public void display(){
        for(j=0; j<nElem; j++){
            System.out.println(a[j] + " ");
            System.out.println(" ");
        }
    }

}
