import arrays.IntegerArray;
import utils.InputOutput;

void main() throws Exception {
    IntegerArray integerArray = new IntegerArray(3);
    integerArray.insert(3);
    integerArray.insert(4);
    integerArray.insert(5);
    integerArray.insert(6);
    InputOutput.printIntegerArray(integerArray);
    IO.println(integerArray.indexOf(6));
    IO.println(integerArray.indexOf(1));

    integerArray.removeAt(3);
    InputOutput.printIntegerArray(integerArray);

    integerArray.removeAt(0);
    InputOutput.printIntegerArray(integerArray);

    integerArray.insert(77);
    InputOutput.printIntegerArray(integerArray); //4,5,77,0,0

    integerArray.insert(78);
    integerArray.insert(79);

    InputOutput.printIntegerArray(integerArray); //4,5,77,78,79

    integerArray.insert(81);
    InputOutput.printIntegerArray(integerArray); //4,5,77,0,0

    integerArray.removeAt(5);
    InputOutput.printIntegerArray(integerArray);

    integerArray.removeAt(3);
    InputOutput.printIntegerArray(integerArray);

    IO.println(integerArray.getMaxValue());

    IO.println(Arrays.toString(integerArray.getIntersection(new int[]{5, 77})));

    IO.println(Arrays.toString(integerArray.reverse()));

    integerArray.insertAt(50, 0);
    InputOutput.printIntegerArray(integerArray);
}
