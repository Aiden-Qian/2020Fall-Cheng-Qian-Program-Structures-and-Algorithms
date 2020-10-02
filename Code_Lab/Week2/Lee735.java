public class Lee735{
  public int[] asteroidCollision(int[] a) {
          LinkedList<Integer> s = new LinkedList<>();
          for (int i = 0; i < a.length; i++) {
              if (a[i] > 0 || s.isEmpty() || s.getLast() < 0) {
                  s.add(a[i]);
              } else if (s.getLast() == -a[i]) {
                  s.pollLast();
              } else if (s.getLast() < -a[i]) {
                 s.pollLast();
                 i--;
             }
         }
         return s.stream().mapToInt(i -> i).toArray();
     }
}
