public class SimplyListClass {

    private Node header;
    private long size;

    public Node getHeader() {
        return header;
    }

    public SimplyListClass() {
        header = null;
        //size = 0;
    }
    public SimplyListClass(Node header) {
        this.header = header;
        //size = 1;

    }

    public int size () {
        header = getHeader();
        if (header == null) {
            return 0;
        }
        int count = 1;
        while (true) {
            if (header.getNext() != null) {
                ++count;
            }
            else break;
        }
        return count;
    }

    public boolean isEmpty() {
        return false;
    }

    public void addLast(Integer element) {
        Node newNode = new Node(element);

        if (header == null) {
            header = newNode;
            //size++;
            return;
        }

        if (header.getNext() != null) {
            header.setNext(newNode);
        }

        Node  tmpHeader = header;
        while (tmpHeader.getNext() != null) {
            tmpHeader = tmpHeader.getNext();
        }
        tmpHeader.setNext(newNode);

    }

    public void addFirst(Integer element) {
        Node tmpHeader=this.header;
        this.header=new Node(element);
        this.header.setNext(tmpHeader);
    }

    @Override
    public String toString() {
        if (header == null) return "";
        StringBuilder sb = new StringBuilder(header.toString());
        Node current = header;
        while (current.getNext() != null) {
            current = current.getNext();
            sb.append("." + current.toString());
        }

        return sb.toString();
    }

    private static class Node {

        private Integer element;
        private Node next;


        public Node(Integer element) {
            this.element = element;
        }

        public Node(Integer element, Node next) {
            this.element = element;
            this.next = next;
        }

        //public String toString() {
        //    return element.toString();
       // }

        public Integer getElement () {
            return element;
        }

        public Node getNext() {
            return next;
        }

        public void setElement(Integer newElem) {
            element = newElem;
        }

        public void setNext (Node newNext) {
            next = newNext;
        }

    }

    public static void main(String[] args) {
        SimplyListClass maListe = new SimplyListClass();
        SimplyListClass maListe2 = new SimplyListClass();
        System.out.println(maListe.getHeader());
        maListe.addLast(5);
        maListe.addLast(6);
        maListe.addLast(7);
        System.out.println("test2 (5):" + maListe.getHeader() + "\n");
        System.out.println("test2 (6):" + maListe.getHeader().getNext() + "\n");
        System.out.println("test2 (7):" + maListe.getHeader().getNext().getNext() + "\n");
        System.out.println(maListe.toString());


    }


}
