public class SinglyListClass {

    private Node header;
    private long size;

    public Node getHeader() {
        return header;
    }

    public SinglyListClass() {
        header = null;
        //size = 0;
    }
    public SinglyListClass(Node header) {
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
        if(header == null) {
            return true;
        }else {
            return false;
        }
    }


    public void addLast(Integer element) {
        Node newNode = new Node(element);

        if (header == null) {
            header = newNode;
            //size++;
            return;
        }

        Node  tmpHeader = header;
        while (tmpHeader.getNext() != null) {
            tmpHeader = tmpHeader.getNext();
        }
        tmpHeader.setNext(newNode);

    }

    public Integer first() {
        if(isEmpty()) {
            return null;
        }else {
            return header.getElement();
        }
    }

    public Integer last() {
        if(isEmpty()) {
            return header.getElement();
        }

        Node current = header;
        while(current.getNext() != null) {
            current = current.getNext();
        }
        return current.getElement();
    }

    public void addFirst(Integer element) {
        Node tmpHeader = new Node(element);
        tmpHeader.setNext(header);
        this.header = tmpHeader;
    }

    @Override
    public String toString() {
        if (header == null) return "";
        StringBuilder sb = new StringBuilder(header.toString());
        Node current = header;
        while (current.getNext() != null) {
            current = current.getNext();
            sb.append("," + current.toString());
        }

        return sb.toString();
    }

    public Node removeFirst() {
        if (isEmpty()) {
            return null;
        }
        else {
            header = header.getNext();
            return header;
        }
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

        public String toString() {
            return element.toString();
       }

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
        SinglyListClass maListe = new SinglyListClass();
        SinglyListClass maListe2 = new SinglyListClass();
        maListe.addLast(5);
        maListe.addLast(6);
        maListe.addLast(7);
        System.out.println(maListe2.isEmpty());
        System.out.println("test2 (5):" + maListe.getHeader() + "\n");
        System.out.println("test2 (6):" + maListe.getHeader().getNext() + "\n");
        System.out.println("test2 (7):" + maListe.getHeader().getNext().getNext() + "\n");
        System.out.println("to String : " + maListe.toString() + "\n");
        maListe.addFirst(9);
        System.out.println("On ajoute un 9 au debut : " + maListe.getHeader() + ", Le premier chiffre est bien " + maListe.first() + "\n");
        System.out.println("to String : " + maListe.toString() + "\n");
        maListe2.addFirst(485);
        System.out.println(maListe2.toString() + "\n");
    }


}
