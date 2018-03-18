/**
 * User: dennisle
 * Problem #:
 * Attempted on: 3/11/18
 * Solved on:
 * Runtime:
 */
public class TimeNode {
    public String time;
    public TimeNode nextNode;
    public TimeNode prevNode;

    public TimeNode(String _time) {
        this.time = _time;
        this.nextNode = null;
    }

    public void setNextNode(TimeNode next) {
        this.nextNode = next;
    }

    public void setPrevNode(TimeNode prev) {
        this.prevNode = prev;
    }

}
