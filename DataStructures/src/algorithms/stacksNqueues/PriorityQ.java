package algorithms.stacksNqueues;

/**
 * Created by joshik on 10/27/16.
 */
public class PriorityQ {
    private int maxSize;
    private long[] queArr;
    private int nElems;

    public PriorityQ(int s){
        maxSize = s;
        queArr = new long[maxSize];
        nElems = 0;
    }

    public void insert(long val){
        int j;

        if(nElems == 0){
            queArr[nElems++] = val;
        } else{
            for(j= nElems-1; j >= 0; j--){ //WHY j--
                if(val >queArr[j]){
                    queArr[j+1] = queArr[j];
                }else{
                    break;
                }
            }
            queArr[j+1] = val;
            nElems++;
        }
    }

    public long remove(){
        return queArr[--nElems];
    }

    public long minPeek(){
        return queArr[nElems-1];  //WHY?
    }

    public boolean isEmpty(){
        return (nElems==0);
    }

    public boolean isFull(){
        return (nElems == maxSize);
    }

}
