
/**
*  @author : Pankaj Tirpude
*  @note  : can be solve using stack and on traversal but it will cost extra O(N) space complexity.
*  Implemented solution has O(1) space complexity and O(N) time complexity.
*
*/

public class GetNthNodeFromLast {


  public int solve(Node head, int n)
  {
     Node t = head;
     Node ans = head;
     int cnt = 0;

    while(t != null)
    {
       if(cnt >= n) ans = ans.next;
       cnt++;
       
       t = t.next;
    }

   if(ans != null && cnt >= n) return ans.data;

   return -1;

   }

}

class Node {

  public int data;
  public Node next;

  public Node(int data)
  {
    this.data = data;
  }

}
