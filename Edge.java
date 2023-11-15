package Java_advanced.Lessons.Lesson_14;

public class Edge {
    private int source;
    private int destination;
    /*

        3 - > 2
        ^
        |
        4

        3 , 2
        4 , 3
     */

    public Edge(int source, int destination) {
        this.source = source;
        this.destination = destination;
    }

    public int getSource() {
        return source;
    }

    public void setSource(int source) {
        this.source = source;
    }

    public int getDestination() {
        return destination;
    }

    public void setDestination(int destination) {
        this.destination = destination;
    }
}
