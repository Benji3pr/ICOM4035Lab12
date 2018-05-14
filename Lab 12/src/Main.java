import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	private static Scanner sc;
	//private static int[] array;
	private static BTNode current;

	public static void main(String[] args) {


		//BTNode node = null;
		//node.setData(5);



		sc = new Scanner(System.in);
		int n = sc.nextInt();
		BTNode root = null;
		//BTNode current = null;
		//int searches = 0;

		//int[] arrayN = new int[n];
		//array = new int[n];
		for(int j=0; j<n; j++){
			int k = sc.nextInt();
			int v = sc.nextInt();
			boolean done = false;
			current = root;
			//BTNode current = root;


			//BTNode parent = null;


			{//boolean done = false;

				if(k==1){


					//System.out.println("num 1");

					if(root == null){
						root = new BTNode(v);
						//System.out.println("added to root");
						continue;
					}
					//boolean done = false;
					while(!done){
						if(v>current.data){
							if (current.right == null){
								current.right = new BTNode(v);
								//System.out.println("added to right");
								done = true;
								break;
							}
							else								
								current = current.right;

						}else if(v<current.data) // v<current data
						{
							if (current.left == null){
								current.left = new BTNode(v);
								//System.out.println("added to left");

								done = true;
								break;
							}
							else
								current = current.left;

						} else break;

					}
				}

				else if(k==3){
					BTNode parent = null;
					while(true){

						if(v>current.data){
							if(current.right ==null){
								System.out.println("not found");

								break;
							}
							parent = current;
							current = current.right;

						}else if(v<current.data) // v<current data
						{
							if (current.left == null){
								System.out.println("not found");

								break;
							}
							parent = current;
							current = current.left;

						}
						else{// to erase a node that has two children go to the right and then left recursively and erase that most left child and put it in the node you want to erase
							if(parent.left.data == current.data){
								parent.left = null;
							}
							else{//it is right
								
							}
							
							System.out.println("erased");

							break;
						}
					}
				}




				else //k==2, search
				{
					//System.out.println("num 2");
					while(true){

						if(v>current.data){
							if(current.right ==null){
								System.out.println("no");

								break;
							}

							current = current.right;

						}else if(v<current.data) // v<current data
						{
							if (current.left == null){
								System.out.println("no");

								break;
							}
							current = current.left;

						}
						else{
							System.out.println("yes");

							break;
						}
					}
				}
			}

		}


	}
	static public class BTNode{
		int data;
		BTNode left;
		BTNode right;	
		public BTNode(int data){
			this.data = data;
			left = null;
			right = null;
		}

		public void setData(int data){
			this.data = data;
		}


	}
}