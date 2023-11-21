import java.math.BigInteger;

public class Fibonacchi {
  BigInteger[] arr = new BigInteger[50];
  {
	  arr[0] = new BigInteger("1"); arr[1] = new BigInteger("1");
	  for (int i = 2; i < arr.length; i++) {
		  arr[i] = arr[i - 1].add(arr[i - 2]);
	  }
  }
  public BigInteger get(int i) {
	  if (i < arr.length) {
		  return arr[i];
	  }
	  BigInteger fibPrev = arr[arr.length - 2];
	  BigInteger fib = arr[arr.length - 1];
	  for (int j = arr.length; j <= i; j++) {
		  BigInteger nextFib = fib.add(fibPrev);
		  fibPrev = fib;
		  fib = nextFib;
	  }
	  return fib;
  }
}
