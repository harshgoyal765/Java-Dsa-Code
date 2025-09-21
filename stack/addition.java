public class addition {

    public static int[] polynomialAddition(int[] poly1, int[] poly2) {
        int degree1 = poly1.length - 1;
        int degree2 = poly2.length - 1;
        int maxDegree = Math.max(degree1, degree2);
        int[] result = new int[maxDegree + 1];

        for (int i = 0; i < poly1.length; i++) {
            result[i] += poly1[i];
        }

        for (int i = 0; i < poly2.length; i++) {
            result[i] += poly2[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] poly1 = {1, -3, 2, 0, 5}; // 5x^4 + 2x^2 - 3x + 1
        int[] poly2 = {2, 4, 0, 1};    // x^3 + 4x + 2

        int[] result = polynomialAddition(poly1, poly2);

        System.out.print("Result: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
} 
    

