import java.util.*;

public class NearbyCars {

    static class Point implements Comparable<Point> { // Use Comparable for custom ordering
        int x;
        int y;
        int distSq;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
            this.distSq = x * x + y * y; // Calculate distance squared efficiently
        }

        @Override
        public int compareTo(Point other) {
            return this.distSq - other.distSq; // Sort by distance squared
        }
    }

    public static void main(String[] args) {
        int[][] pts = {{3, 3}, {5, -1}, {-2, 4}};
        int k = 2;

        PriorityQueue<Point> pq = new PriorityQueue<>();
        for (int i = 0; i < pts.length; i++) {
            pq.add(new Point(pts[i][0], pts[i][1])); // Create Point objects without idx
        }

        // Print nearest K cars based on distance squared
        for (int i = 0; i < k; i++) {
            Point nearest = pq.remove();
            System.out.println("(" + nearest.x + "," + nearest.y + ")");
        }
    }
}
