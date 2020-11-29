package main.tutorials.dataStructures.Queues;

public class Main {
    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane","Jones",123);
        Employee johnDoe = new Employee("John","Doe",4567);
        Employee marySmith = new Employee("Mary","Smith",22);
        Employee mikeWilson = new Employee("Mike","Wilson",3245);

        Employee billEnd = new Employee("Bill", "End", 128);

        ArrayQueue queue = new ArrayQueue(5);

        queue.add(janeJones);
        queue.add(johnDoe);
        queue.remove();
        queue.add(marySmith);
        queue.remove();
        queue.add(mikeWilson);
        queue.remove();
        queue.add(billEnd);
        queue.remove();
        queue.add(janeJones);

        System.out.println();
//        queue.print();
//
//        queue.remove();
//
//        System.out.println(queue.size());
//        System.out.println(queue.peek());
//
//        queue.remove();
//        queue.remove();
//        queue.remove();
//
//        queue.add(mikeWilson);

//        queue.print();


    }
}
