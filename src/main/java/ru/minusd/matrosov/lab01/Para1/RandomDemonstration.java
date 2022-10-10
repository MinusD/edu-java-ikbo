package lab01.Para1;

public class RandomDemonstration {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            arr[i] = (int) (Math.random() * 250);
            sum += arr[i];
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
        ;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
        ;
        System.out.println();
        System.out.println(sum);

        /*int[] arr = new int[10];
        int sum = 0;
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            arr[i] = random.nextInt(1000);
            sum += arr[i];
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        };
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        };
        System.out.println();
        System.out.println(sum);
    }*/
    }
}


