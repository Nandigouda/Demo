class A 
{
	public static void main(String[] args) 
	{
		Object obj[][][] = new Object[2][2][2];
obj[0][0][0] = "Hello";
obj[0][0][1] = "World";
obj[0][1][0] = 42;
obj[0][1][1] = true;
obj[1][0][0] = 3.14;
obj[1][0][1] = 'A';
obj[1][1][0] = false;
obj[1][1][1] = "Java";
	// Loop through each "slice" of the array
for (Object[][] slice : obj) {
    // Loop through each row of the slice
    for (Object[] row : slice) {
        // Loop through each element of the row
        for (Object element : row) {
            System.out.print(element + " ");
        }
        System.out.println(); // Move to the next line after each row
    }
    System.out.println(); // Add an extra line between slices
}
}}
