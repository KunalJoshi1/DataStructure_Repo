package algorithms.array;

/**
 * Created by joshik on 10/20/16.
 */
public class HighArray {

    private long[] a;

    private int nElem;
    int j;

    // Constructor *****************************************************

    public HighArray(int max){
        a = new long[max];
    }

    // Search ************************************************************

    public boolean find (long sKey){

        for(j=0; j<nElem; j++){
            if(a[j] == sKey){
                break;
            }
        }

        if(j == nElem){
            return false;
        }else{
            return true;
        }
    }
    // Insert ************************************************************

    public void insert(long value){
        a[nElem]=value;
        nElem++;
    }

    // Delete ************************************************************

    public boolean delete(long s2Key){

        for(j=0; j<nElem; j++){
            if(a[j] == s2Key){
                break;
            }
        }

        if(j == nElem){
            return false;
        }else{
            for(int k =j; k<nElem; k++)
            { a[k] = a[k+1];
            }
            nElem--;
            return true;
        }
    }
    // Display ***********************************************************

    public void display(){
        for(j=0; j<nElem; j++){
            System.out.println(a[j] + " ");
        }

    }

    public long getMaxVal(){

        if(a.length == 0){
            return -1;
        }
        long maxVal = a[0];
        for(j=0; j<nElem; j++){
            if(a[j]>maxVal){
                maxVal = a[j]; // if value @a[j] is greater that assigned maxVal, change the value of maxVal to value @a[j]
            }
        }
        return maxVal;
    }

    public long getMinVal(){

        if(a.length == 0){
            return -1;
        }
        long minVal = a[0];
        for(j=0; j<nElem; j++){
            if(a[j] < minVal){
                minVal = a[j];
            }
        }
        return minVal;
    }

    public void removeMaxVal(){
       long k = getMaxVal();
        int i;
        for(i=0; i<nElem; i++){
            if(a[i] == k){
                break;
            }
        }

        for(int j=i; j<nElem; j++){
            a[j]= a[j+1];

        }
        nElem--;
        return;
    }


}
