/**
 * @author huangyingw
 * 
 */
public class big_multiple {
	public static void main(String args[]) {
		long x, y;

//		x = 1234;
//		y = 2564;
//		System.out.println(mult(x, y, num(x), num(y)));
//
//		x = 1234;
//		y = 25645;
//		System.out.println(mult(x, y, num(x), num(y)));

		x = 3;
		y = 25645;
		System.out.println(mult(x, y, num(x), num(y)));// 76935

		x = 1234892;
		y = 25645;
		System.out.println(mult(x, y, num(x), num(y)));// 31668805340
		// 3163976
		// 31645930
		// 7518135
		// 316182655340
	}

	static long mult(long x, long y, int nx, int ny) {
		long a, b, c, d, s;
		if (nx == 1 && ny == 1) // 起初这里落了个＝号
			return x * y;
		else {
			a = (long) (x / Math.pow(10, (nx / 2))); // 取x的左半部分
			b = (long) (x % (Math.pow(10, (nx / 2)))); // 取x的右半部分
			c = (long) (y / Math.pow(10, (ny / 2))); // 取y的左半部分
			d = (long) (y % (Math.pow(10, (ny / 2)))); // 取y的右半部分
			s = (long) (mult(a, c, num(a), num(c))
					* Math.pow(10, (nx + ny) / 2) + mult(a, d, num(a), num(d))
					* Math.pow(10, nx / 2) + mult(b, c, num(b), num(c))
					* Math.pow(10, ny / 2) + mult(b, d, num(b), num(d))); // 书上的公式
			return (s);
		}
	}

	static int num(long x) // 判断输入的数字的位数
	{
		int i = 0;
		if (x <= 9)
			return 1;
		else {
			while (x != 0) {
				i++;
				x = x / 10;
			}
			return i;
		}
	}
}
