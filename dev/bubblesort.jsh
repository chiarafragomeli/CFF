int[] data = { 4, 5, 1, 8, 2 };
System.out.println("The array: " + java.util.Arrays.toString(data));
// java.util.Arrays.toString(data) è un metodo per trasformare un array in una stringa e stamparlo nella maniera corretta

// repeat n-1 times
for(int i = 0; i < data.length - 1; i++) {
    // compare the neighbors, and swap if required
    for(int j = 0; j < data.length - 1; j++) {
        if(data[j] > data[j+1]) {
            int temp = data[j];
            data[j] = data[j+1];
            data[j+1] = temp;
            System.out.println("Swap!");
        }
        System.out.printf("The parcial sorted array (iterazione %d-%d): %s%n", i, j, java.util.Arrays.toString(data)); // log
    }
    
}

System.out.println("The sorted array: " + java.util.Arrays.toString(data));