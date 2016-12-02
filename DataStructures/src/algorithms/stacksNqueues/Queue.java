package algorithms.stacksNqueues;

/**
 * Created by joshik on 10/26/16.
 */
public class Queue {

    private int maxSize;
    private long queArr[];
    private int front;
    private int rear;
    private int nElem;

    public Queue(int s){
        maxSize = s;

        queArr = new long[maxSize];
        front = 0;
        rear = -1;
        nElem = 0;
    }

    // Insert

    public void insert(long j){
        if(rear == maxSize-1){
            rear = -1;            // to deal with wraparound situation
        }

        queArr[++rear] = j;
        nElem++;
    }

    // Remove

    public long remove(){

        long temp = queArr[front++];
        if(front == maxSize){
            front = 0;
        }
        nElem--;
        return temp;
    }

    // Peek front

    public long peekFront(){
        return queArr[front];
    }

    public boolean isEmpty(){
        return (nElem == 0);
    }

    public boolean isFull(){
        return (nElem == maxSize);
    }

    public int size(){
        return nElem;
    }

}
