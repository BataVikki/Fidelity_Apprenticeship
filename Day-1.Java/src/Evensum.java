public class Evensum {
    public static void main(String[] args) {
        int[] arr = new int[]{2,4,3,5,8,9,6};
        int Evensum = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                Evensum += arr[i];
            }
        }
        System.out.println("the sum of even integers in an array"+Evensum);

    }
}
