public class Main {
    public static void main(String[] args) {

//        ShapeFactory shapeFactory = new ShapeFactory();
//        Shape shape = shapeFactory.getShape("RECTANGLE");
//        shape.draw();
        //System.out.println(nextGreaterElement(2147483646));
        Float f1 = new Float("3.0");
        System.out.println(f1.byteValue());
        System.out.println(f1.doubleValue());
        System.out.println(f1.intValue());
        System.out.println(f1.intValue()+f1.byteValue()+f1.doubleValue());

    }

    public static int nextGreaterElement(int n) {
        if (n >= Math.pow(2, 31) - 1) {
            return -1;
        }

        //Converting n to String;
        String num = String.valueOf(n);
        StringBuilder numBuilder = new StringBuilder(num);

        //Travesing num from right to left till we get num.charAt(index)<num.charAt(index+1)
        int index = numBuilder.length() - 2;
        int count[] = new int[10];
        count[numBuilder.charAt(numBuilder.length() - 1) - '0']++;
        while (index >= 0 && numBuilder.charAt(index) >= numBuilder.charAt(index + 1)) {
            count[numBuilder.charAt(index) - '0']++;
            index--;
        }

        //Num digits is in reverse order.For eg->4321 so no next greater is possible
        if (index < 0) {
            return -1;
        }

        //Swapping index and index+1 when numBuilder.charAt(index)<numBuilder.charAt(index+1)
        swap(index, index + 1, numBuilder);
        count[numBuilder.charAt(index+1) - '0']++;
        count[numBuilder.charAt(index) - '0']--;

        //Sorting elements from index+1 to numBuilder.size()
        int idx = index + 1;
        for (int i = 0; i < 10; ++i) {
            while (count[i] > 0) {
                numBuilder.setCharAt(idx, (char)(i+'0'));
                count[i]--;
                idx++;
            }
        }
        if(Long.parseLong(numBuilder.toString())>Integer.MAX_VALUE) {
            return -1;
        }
        return Integer.parseInt(numBuilder.toString());
    }

    private static void swap(int index1, int index2, StringBuilder builder) {
        char temp = builder.charAt(index1);
        builder.setCharAt(index1, builder.charAt(index2));
        builder.setCharAt(index2, temp);
    }
}