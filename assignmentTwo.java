public static void findAverage(int[] arr) {
    int arrayTotal = 0;
    int arrayAverage = 0;
    for (int i = 0; i < arr.length; i++) {
            arrayTotal += arr[i];
    }
    arrayAverage = arrayTotal / arr.length;
    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i] - arrayAverage);
    }
}
