package trainingpkg1;

public class BubbleSort {


	public void bubbleSortMethod () {

		int a[]= {1,2,3,4,5,6};

		int temp=0;


		for(int i=0;i<a.length; i++) { 

			for(int j=i;j<a.length;j++) {
			}

			if(a[i]>a[j]) {

				temp=a[i];
				a[i]=a[j];
				a[j]=temp;

			}

		}

		System.out.println(a[i]+" ");

	}
	public static void main(String[] args) {



		BubbleSort obj = new BubbleSort();
		obj.bubbleSortMethod();


	}
}			











