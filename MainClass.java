



class Queue{
    public int[] arr;
    public int fp,rp ;

    Queue(){
        arr=new int[10];
        fp=0;
        rp=0;
    }

    public void enQueue(int x){
        arr[rp++]=x;

    }
    public int deQueue(){
        return(arr[fp++]);
    }
    public void printQueue(){
        for(int i=fp;i<rp;i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

}
public class MainClass{

    public static void main(String args[]){
        Queue Q1=new Queue();
        Q1.enQueue(6);
        Q1.enQueue(7);
        Q1.enQueue(8);
        Q1.printQueue();
        Q1.deQueue();
        Q1.printQueue();
        
    }
}