
import lombok.Getter;
import lombok.Setter;

/**
 *The DirectAddressTables program implements direct-address table
 *from chapter 11, page 254 of CLRS
 *
 * @author: Tran Ly Vu
 * @version 1.0
 * @since   2017-01-14
 */

@Getter
@Setter
public class DirectAddressTables {

  Object[] table;
  int key;

  public DirectAddressTables(Object[] table, int key) {
    this.table = table;
    this.key = key;
  }

  public DirectAddressTables(int key) {
    this.table =new Object[key];
  }

  public Object search(int k) {
    return table[k];
  }

  public void insert(Object x, int k) {
    table[k] = x;
  }

  public void delete(Object x) {
    int temp = 0 ;
    for (int i = 0; i < table.length; i++) {
        if (table[i] == x) temp = i;
    }
    table[temp] = null;
  }

}
