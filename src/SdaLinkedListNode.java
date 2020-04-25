public class SdaLinkedListNode<T> {

    private T data;

    private SdaLinkedListNode<T> next;

    public void setData(T toAdd) {
        this.data = toAdd;
    }

    public void setNext(SdaLinkedListNode<T> next) {
        this.next = next;
    }

    public SdaLinkedListNode<T> getNext(){
        return next;
    }

    public T getData(){
        return data;
    }
}
