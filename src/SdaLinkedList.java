public class SdaLinkedList<T> { //T oznacza templete, typ którego jeszcze nie znamy (innego niż Object, Person)

    private SdaLinkedListNode<T> first;

    public T getLast() {
        //albo lista jest pusta
        if (first == null) {
            return null;
        } else { //albo nie
            SdaLinkedListNode<T> current = first;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            return current.getData();
        }
    }

    //add as first object
    public void add(T toAdd) {
        //albo lista jest pusta
        if (first == null) {
            first = new SdaLinkedListNode<T>();
            first.setData(toAdd);
        } else { //albo już jest piwerszy element
            SdaLinkedListNode<T> newFirst = new SdaLinkedListNode<T>();
            newFirst.setData(toAdd);
            newFirst.setNext(first);
            first = newFirst;
        }
    }
}
