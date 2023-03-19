public class Main {
    public static void main(String[] args) {
        System.out.println(recyclePens(5, 10, 2, 3));
    }

    public static int recyclePens(int n, int r, int k, int c) {
        int maxUsablePens=Integer.MIN_VALUE;
        while(n>0) {
            int usablePens = r/c;
            if(usablePens>maxUsablePens) {
                maxUsablePens=usablePens;
            }
            r=r+k;
            n--;
        }
        return maxUsablePens;

    }

}