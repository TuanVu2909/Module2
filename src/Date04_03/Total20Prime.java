package Date04_03;

public class Total20Prime {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
            for (int i = 0; i < 500; i++) {
                int a =i;
                for (int j = 2; j <= a; j++) {
                    if (a == j) {
                        count++;
                        sum +=i;
                    }
                    if (a %j==0) {
                        break;
                }

                }if (count==20){
                    break;
                }

            }

        System.out.println(sum);
    }

}

