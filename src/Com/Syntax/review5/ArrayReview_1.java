package Com.Syntax.review5;

public class ArrayReview_1 {
    public static void main(String[] args) {

        int a=10;

        int [] arr=new int[3];
        arr [0]=10;
        arr [1]=20;
        arr [2]=30;

        System.out.println(arr[1]);
        System.out.println("Size of the array= " + arr.length);

        // how to get all value from the array?
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        for (int num:arr){
            System.out.println(num);
        }
        System.out.println("----------------------------");
        String [] colors= {"black","white","red","purple","blue"};
        //anytime we have arrays we can use enhanced for loop
        for (String col:colors){
            System.out.println(col + " ");
        }
        System.out.println("--------printing in reverse------------");

        for (int i = colors.length-1; i>=0 ; i--) {
            System.out.print(colors[i] + " ");
        }
    }
}
