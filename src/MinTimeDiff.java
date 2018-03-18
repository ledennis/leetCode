import java.util.*;

/**
 * User: dennisle
 * Problem #: 539
 * Attempted on: 3/11/18
 * Solved on:
 * Runtime: O(n) where n = time points
 * Solution: The difference of times between two points is shortest if the time points are right next to each other.
 *           Therefore, just find the difference between each nearest two points and also the first and last points
 *           and return the shortest diff.
 */
public class MinTimeDiff {
    public TimeNode head = null;

    public int runList(List<String> timePoints) {
        int smallestDiff = 1440;
        int currentDiff;
        String head = null;
        String tail = null;
        String currentStr;
        String prevStr = null;

        Collections.sort(timePoints);
        Collections.reverse(timePoints);
        System.out.println(timePoints);

        for (Iterator<String> it = timePoints.iterator(); it.hasNext();) {
            currentStr = it.next();

            if (head == null) {
                head = currentStr;
            }

            if (prevStr != null) {
                currentDiff = compareTime(prevStr, currentStr);

                if (currentDiff == 0) {
                    return 0;
                }

                if (currentDiff < smallestDiff) {
                    smallestDiff = currentDiff;
                }
            }

            prevStr = currentStr;

            if (!it.hasNext()) {
                tail = currentStr;
            }
        }

        int tailMinHead = headTailDiff(head, tail);

        if (smallestDiff < tailMinHead) {
            return smallestDiff;
        }
        else {
            return tailMinHead;
        }
    }

    public int runWithNodeStruct(List<String> timePoints) {

        for (Iterator<String> it = timePoints.iterator(); it.hasNext();) {
            TimeNode currentNode = new TimeNode(it.next());
            addNode(currentNode);
        }

        int smallestDiff = 1440;
        TimeNode currentNode = this.head;
        while (currentNode.nextNode != null) {
            int diff = compareTime(currentNode.time, currentNode.nextNode.time);
            if (smallestDiff > diff) {
                smallestDiff = diff;
            }
            currentNode = currentNode.nextNode;
        }

        int tailMinHead = headTailDiff(this.head.time, currentNode.time);

        printList();
        if (smallestDiff < tailMinHead) {
            return smallestDiff;
        }
        else {
            return tailMinHead;
        }
    }

    public void printList() {
        TimeNode currentNode = this.head;
        System.out.println("Starting printing list");

        while (currentNode != null) {
            System.out.println(currentNode.time);
            currentNode = currentNode.nextNode;
        }

        System.out.println("Finish printing list");
    }


    public void addNode(TimeNode newNode) {
        if (this.head == null) {
            this.head = newNode;
        }
        else {
            Boolean set = false;
            TimeNode currentNode = this.head;
            TimeNode prevNode = null;
            while (!set) {
                if (greaterTime(currentNode.time, newNode.time)) {
                    if (currentNode.nextNode == null) {
                        currentNode.setNextNode(newNode);
                        set = true;
                    } else {
                        prevNode = currentNode;
                        currentNode = currentNode.nextNode;
                    }
                }
                else {
                    if (currentNode.equals(this.head)) {
                        newNode.setNextNode(this.head);
                        this.head = newNode;
                        set = true;
                    }
                    else {
                        prevNode.setNextNode(newNode);
                        newNode.setNextNode(currentNode);
                        currentNode.setPrevNode(newNode);
                        set = true;
                    }
                }
            }
        }
    }

    public int headTailDiff (String head, String tail) {
        int diff = timeToMinutes(tail) - timeToMinutes(head);

        if (diff < 0) {
            return diff + (24 * 60);
        }
        else {
            return diff;
        }

    }

    public int timeToMinutes(String time) {
        Integer hours = Integer.parseInt(time.substring(0, 2));
        Integer minutes = Integer.parseInt(time.substring(3,5));
        minutes = (hours * 60) + minutes;

        return minutes;
    }

    public Boolean greaterTime (String timeA, String timeB) {
        Integer hourA = Integer.parseInt(timeA.substring(0,2));
        Integer hourB = Integer.parseInt(timeB.substring(0,2));

        if (hourA > hourB) {
            return true;
        }
        else if (hourA < hourB) {
            return false;
        }
        else {
            Integer minuteA = Integer.parseInt(timeA.substring(3,5));
            Integer minuteB = Integer.parseInt(timeB.substring(3,5));

            if (minuteA > minuteB) {
                return true;
            }
            else {
                return false;
            }
        }
    }

    public int compareTime (String greater, String lesser) {
        Integer gHour = Integer.parseInt(greater.substring(0,2));
        Integer lHour = Integer.parseInt(lesser.substring(0,2));
        Integer gMin = Integer.parseInt(greater.substring(3,5));
        Integer lMin = Integer.parseInt(lesser.substring(3,5));

        int hoursToMinutes = (gHour - lHour) * 60;
        int totalMin = hoursToMinutes + (gMin - lMin);

        return totalMin;
    }

}
