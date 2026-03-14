import linkedlist.LinkedList;
import utils.InputOutput;

void main() {
    LinkedList<Integer> list = new LinkedList();
    InputOutput.printLinkedList(list);

    list.addFirst(1);
    InputOutput.printLinkedList(list);

    list.addFirst(2);
    InputOutput.printLinkedList(list);

    list.addFirst(3);
    InputOutput.printLinkedList(list);

    list.addLast(4);
    InputOutput.printLinkedList(list);

    list.deleteFirst();
    InputOutput.printLinkedList(list);

    list.deleteFirst();
    InputOutput.printLinkedList(list);

    list.deleteFirst();
    InputOutput.printLinkedList(list);

    list.deleteFirst();
    InputOutput.printLinkedList(list);



    list.addFirst(0);
    list.addLast(2);
    list.addLast(3);
    InputOutput.printLinkedList(list);

    list.deleteLast();
    list.deleteLast();
    InputOutput.printLinkedList(list);

    list.deleteLast();
    InputOutput.printLinkedList(list);


    list.addFirst(88);
    InputOutput.printLinkedList(list);


    list.addLast(555);
    list.deleteLast();
    list.addFirst(12);
    list.addFirst(45);
    InputOutput.printLinkedList(list);

    IO.println(list.contains(88));
    IO.println(list.contains(555));
    IO.println(list.contains(2));
    IO.println(list.contains(45));
    IO.println(list.contains(12));


}