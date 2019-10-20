/* Name: Ellis Sentoso
 *  Professor: Ladawn Meade
 *  Class: CS2 - Java
 *  Assignment: Lab 2 - Find Waldo
 *  Email: ellissentoso@gmail.com
 *  Date: 10/19/2019
 */

public class list {
    public list() {
        first = null; // constructor for list class.
    }

    private IntNode first;

    class IntNode {
        public tourist _item; // the data is an object of a travelling tourist (class obj)
        public IntNode _next;

        private IntNode(tourist item, IntNode n) {
            _item = item;
            _next = n;
        }
    }
    public class tourist {
        private String _Name;
        private String _Passport_Number;
        private String _Destination;

        public tourist(String n, String p, String d) {
            _Name = n;
            _Passport_Number = p;
            _Destination = d;
        }

        public String getFirstName() {
            return _Name;
        }

        public String getFirstPassport() {
            return _Passport_Number;
        }

        public String getFirstDes() {
            return _Destination;
        }
    }
    public void addFirst(String touristName, String passportNumber, String destinationCity) {
        first = new IntNode(new tourist(touristName, passportNumber, destinationCity), first);

    }
    public tourist getFirst()
    {
        return first._item;
    }
    ; //adds a new tourist to the beginning of the list

    public int size() {
        IntNode p = first;
        int totalSize = 0;
        while (p != null) {
            totalSize++;
            p = p._next;
        }
        return totalSize;
    }

    ; //returns the number of tourists in the list

    public String findNode(String touristName) {

        IntNode temp = first;
        while (temp != null) {
            if  (temp._item.getFirstName().equals(touristName)) {
                return temp._item.getFirstDes();
            }
            temp = temp._next;
        }

        return "Tourist does not exist";

    } /* finds the tourist's name in the list and returns the destination.  Use iteration or recursion to traverse the list */


    public static void main(String[] args) {
        list L = new list();
        L.addFirst("Waldo","1234","Indonesia");
        L.addFirst("Mario","123456","China");
        L.addFirst("Luigi","12346789","China");
        System.out.println(L.findNode("Ellis"));
        System.out.println(L.findNode("Waldo"));

        System.out.println(L.getFirst().getFirstName());
        System.out.println(L.getFirst().getFirstDes());
        System.out.println(L.getFirst().getFirstPassport());



    }
}

/*
Not found
Luigi
China
12346789

Indonesia
Luigi
China
12346789
 */
