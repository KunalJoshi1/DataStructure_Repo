package algorithms.array;

/**
 * Created by joshik on 10/21/16.
 */
public class ClassDataArray {

    private Person[] a;
    private int nElem;
    int j;
    int k;

    public ClassDataArray(int max){
        a = new Person[max];
        nElem = 0;
    }

    public Person find(String searchName){
        for(j = 0; j<nElem; j++){
            if(a[j].getLastName().equals(searchName)){
                return a[j];

            }
        }
        return null;
    }

    public void insert(String last, String first, int age){
        a[nElem] = new Person(last, first, age);
        nElem++;
    }

    public boolean delete(String searchName){
        for(j=0; j<nElem; j++){
            if(a[j].getLastName().equals(searchName)){
                break;
            }
        }

        if(j == nElem){
            return false;
        }else{
            for(k=j; k<nElem; k++){
                a[k] = a[k+1];
            }
            nElem--;
            return true;

        }

    }

    public void displayA(){
        for(j=0; j<nElem; j++){
            a[j].displayPerson();
        }
    }


}
