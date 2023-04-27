int[] data = { 4, 5, 1, 8, 2 };
System.out.println("The array: " + java.util.Arrays.toString(data));

// for each position (but the last one)
for(int i = 0; i < data.length - 1; i++) {
    // find the position of the smallest element to the right
    int pos = i; // posizione dell'indice corrente
    for(int j = i + 1; j < data.length; j++) {
        if(data[j] < data[pos]) {
            pos = j; // posizione del nuovo minimo
        }
    }

    // swap current and minimal elements
    int temp = data[i];
    data[i] = data[pos];
    data[pos] = temp;

    System.out.printf("The parcial sorted array (iterazione %d): %s%n", i, java.util.Arrays.toString(data)); // log
}

System.out.println("The sorted array: " + java.util.Arrays.toString(data));