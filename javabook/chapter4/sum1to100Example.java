package javabook.chapter4;

public class sum1to100Example {
    public static void main(String[] args) {
        int sum=0;

        for(int i=1;i<=100;i++)
            sum+=i;
        System.out.println(sum);
    }
}
