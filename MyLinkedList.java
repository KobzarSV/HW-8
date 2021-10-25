package ua.goit.HomeWork8;


public class MyLinkedList<E>  {

    private Node<E> firstNode;
    private Node<E> lastNode;
    private int size = 0;

    public MyLinkedList() {
        lastNode = new Node<E>(null, firstNode, null );
        firstNode = new Node<E>(null, null, lastNode);
    }

    public void add(E e) {
        Node<E> prevElement = lastNode;
        prevElement.setElement(e);
        lastNode = new Node<E>(null, prevElement, null);
        prevElement.setNextElement(lastNode);
        size++;
    }

    public int size() {
        return size;
    }

    public E get(int index) {
        Node<E> target = firstNode.getNextElement();
        for (int i = 0; i < index; i++) {
            target = getNextElement(target);
        }
        return target.getElement();
    }
    private Node<E> getNextElement(Node<E> current) {
        return current.getNextElement();
    }

    public void clear() {
        for (Node<E> x = firstNode; x != null; ) {
            Node<E> nextElement = x.nextElement;
            x.element = null;
            x.nextElement = null;
            x.prevElement = null;
            x = nextElement;
        }
        firstNode = lastNode = null;
        size = 0;
     }

    public boolean remove(int index) {
        if (index < 0 || index > size - 1) {
            throw new IllegalArgumentException();
        }
        if (index == 0) {
            firstNode = firstNode.nextElement;
        } else {
            Node<E> node = findNodeBeforeByIndex(index);
            Node<E> tmp = findByIndex(index);
            node.nextElement = tmp.nextElement;
        }
        size--;
        return false;
    }

    private Node<E> findByIndex(int index) {
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException();
        }
        int tmpIndex = 0;
        if (firstNode == null) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            return firstNode;
        }
        Node<E> node = firstNode;
        while (node.nextElement != null) {
            node = node.nextElement;
            tmpIndex++;
            if (tmpIndex == index) {
                return node;
            }
        }
        throw new IndexOutOfBoundsException();
    }

    private Node<E> findNodeBeforeByIndex(int index) {
        if (index <= 0 || index > size - 1) {
            return null;
        }
        int count = 0;
        Node<E> node = firstNode;
        while (node.nextElement != null) {
            if (count == index - 1) {
                return node;
            }
            count++;
            node = node.nextElement;
        }
        return null;
    }

    private class Node<E> {
        private E element;
        private Node<E> nextElement;
        private Node<E> prevElement;

        public Node(E element, Node<E> prevElement, Node<E> nextElement) {
            this.element = element;
            this.nextElement = nextElement;
            this.prevElement = prevElement;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getNextElement() {
            return nextElement;
        }

        public void setNextElement(Node<E> nextElement) {
            this.nextElement = nextElement;
        }

        public Node<E> getPrevElement() {
            return prevElement;
        }

        public void setPrevElement(Node<E> prevElement) {
            this.prevElement = prevElement;
        }
    }

    public Node<E> getFirstNode() {
        return firstNode;
    }

    public void setFirstNode(Node<E> firstNode) {
        this.firstNode = firstNode;
    }

    public Node<E> getLastNode() {
        return lastNode;
    }

    public void setLastNode(Node<E> lastNode) {
        this.lastNode = lastNode;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public static void printList(MyLinkedList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
