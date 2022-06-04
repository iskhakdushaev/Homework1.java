package lesson10;

public class Main1 {
    public static void main(String[] args) {
        double[][] nums1 = {{2, 1, 5, 3},
                {1, 3, 6, 8},
                {5, 6, 4, 5}};
        Matrix matrix1 = new Matrix(nums1);
//        System.out.println(matrix1.getRows());
//        System.out.println(matrix1.getColumns());
//        System.out.println(matrix1.getValueAt(3, 3));
        double[][] nums2 = {{4, 5, 2, 7},
                {3, 3, 2, 2},
                {2, 0, 9, 1}};

        Matrix matrix2 = new Matrix(nums2);

        IMatrix resultAdd = matrix1.add(matrix2);
    }
}
