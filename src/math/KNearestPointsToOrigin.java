package math;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

/**
 * O(nlogn) due to the use of a heap.
 * Use distance squared instead of full hypotenuse to prevent square root.
 */
public class KNearestPointsToOrigin {
	
	static Collection<Point> getNearest(List<Point> points, int k, int x, int y) {
		PriorityQueue<Point> heap = new PriorityQueue<>(k, Collections.reverseOrder());
		
		for (Point point : points) {
//			point.distance = Math.hypot(point.x - x, point.y - y);
			int xx = point.x - x;
			int yy = point.y - y;
			point.distance = xx*xx + yy*yy;
			if (heap.size() == k) {
				if (heap.peek().distance > point.distance) {
					heap.poll();
					heap.add(point);
				}
			} else {
				heap.add(point);
			}
		}
		
		return heap;
	}

	public static class Point implements Comparable<Point> {
		int x;
		int y;
		double distance;
		
		Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		public String toString() {
			return "[" + x + "," + y + "]";
		}
		
		public int compareTo(Point o) {
			return (int) (distance - o.distance);
		}
	}
	

	public static void main(String[] args) {
		List<Point> points = new ArrayList<>();
		points.add(new Point(4,4));
		points.add(new Point(5,5));
		points.add(new Point(1,1));
		points.add(new Point(2,2));
		points.add(new Point(3,3));
		System.out.println(getNearest(points, 3, 0, 0));
	}
}
