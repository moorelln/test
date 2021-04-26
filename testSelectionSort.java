import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;


public class testSelectionSort {
	@Test
	public void test() {
     testPositive();
	 testNegative();
	 testMixed();
	 testDuplicates();
	}


	public testSelectionSort() {    }


	public void testPositive(){
		int[] arr = new int[5];
		arr[0] = 8;
		arr[1] = 9;
		arr[2] = 7;
		arr[3] = 10;
		arr[4] = 2;
		int[] Sortedarr = new int[5];
		Sortedarr[0] = 2;
		Sortedarr[1] = 7;
		Sortedarr[2] = 8;
		Sortedarr[3] = 9;
		Sortedarr[4] = 10;
    SelectionSort temp1 = new SelectionSort();
		temp1.basicSelectionSort(arr);
		assertArrayEquals(Sortedarr, arr);
		/** add tests to check for this unit test **/
		}

	public void testNegative(){
    int[] arr = new int[5];
arr[0] = -2;
arr[1] = -9;        
arr[2] = -10;
arr[3] = -8;
arr[4] = -7;
int[] Sortedarr = new int[5];
Sortedarr[0] = -10;
Sortedarr[1] = -9;
Sortedarr[2] = -8;
Sortedarr[3] = -7;
Sortedarr[4] = -2;
SelectionSort temp2 = new SelectionSort();
temp2.basicSelectionSort(arr);
assertArrayEquals(Sortedarr,arr);
		/** Test data contains negative values only **/
		}

	public void testMixed(){
    int[] arr = new int[5];
		arr[0] =  7;
		arr[1] =  0;
		arr[2] =  2;
		arr[3] = -8;
		arr[4] =  -9;
		int[] Sortedarr = new int[5];
		Sortedarr[0] = -9;
		Sortedarr[1] = -8;
		Sortedarr[2] =  0;
		Sortedarr[3] =  2;
		Sortedarr[4] =  7;
		SelectionSort temp3 = new SelectionSort();
		temp3.basicSelectionSort(arr);
		assertArrayEquals(Sortedarr,arr);
        /** Test data contains with both positive, negative and zeros **/
		}

	public void testDuplicates(){
    int[] arr = new int[5];
		arr[0] =  7;
		arr[1] =  1;
		arr[2] = -9;
		arr[3] = -9;
		arr[4] =  1;
		int[] Sortedarr = new int[5];
		Sortedarr[0] = -9;
		Sortedarr[1] = -9;
		Sortedarr[2] =  1;
		Sortedarr[3] =  1;
		Sortedarr[4] =  7;
		SelectionSort temp4 = new SelectionSort();
		temp4.basicSelectionSort(arr);
		assertArrayEquals(Sortedarr,arr);
		/** Test data contains duplicates **/
		}
	}
