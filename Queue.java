import java.util.*;
public class Queue {
	int pos = 0;
	int front = 0;
	int MAX = 5;
	char arr[] = new char[MAX];
	public void enqueue(char data){
		if(front == 0)
			arr[pos] = data;
		else {
			for(int i=front;i>0;i--){
				arr[i] = arr[i-1]; 
			}
			arr[pos] = data;
		}
		front++;
	}
	public void dequeue(){
		if(front == 0)
			System.out.println("Queue is empty");
		else {
			front--;
		}
	}
	public boolean underflow(){
		if(front == 0)
			return true;
		else
			return false;
	}
	public boolean overflow(){
		if(front == MAX)
			return true;
		else
			return false;
	}
	
	public void display(){
		if(front == 0)
			System.out.println("Queue is empty");
		else {
			System.out.println("Elements in queue:");
			for(int i=front-1;i>=0;i--)
				System.out.print(arr[i]+" ");
			System.out.println();
		}
		if(underflow())
			System.out.println("Queue is in underflow condition");
		if(overflow())
			System.out.println("Queue is in overflow condition");
	}
	public static void main(String args[]){
		Queue q = new Queue();
		q.enqueue('m');
		q.enqueue('u');
		q.enqueue('n');
		q.enqueue('i');
		q.display();
		q.dequeue();
		q.dequeue();
		q.display();
		q.dequeue();
		q.dequeue();
		q.display();
	}
}
		