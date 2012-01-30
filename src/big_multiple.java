/**
 * @author huangyingw
 * 
 */
public class big_multiple {
	static long mult(long x, long y, int nx, int ny) {
		long a, b, c, d, s;
		if (nx == 1 && ny == 1) // 起初这里落了个＝号
			return x * y;
		else {
			a = (long) (x / Math.pow(10, (nx / 2))); // 取x的左半部分
			b = (long) (x % (Math.pow(10, (nx / 2)))); // 取x的右半部分
			c = (long) (y / Math.pow(10, (ny / 2))); // 取y的左半部分
			d = (long) (y % (Math.pow(10, (ny / 2)))); // 取y的右半部分
			s = (long) (mult(a, c, nx / 2, ny / 2)
					* Math.pow(10, (nx + ny) / 2)
					+ mult(a, d, nx / 2, ny - ny / 2) * Math.pow(10, nx / 2)
					+ mult(b, c, nx - nx / 2, ny / 2) * Math.pow(10, ny / 2) + mult(
					b, d, nx - nx / 2, ny - ny / 2)); // 书上的公式
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

	public static void main(String args[]) {
		long x = 1234, y = 2564;
		System.out.println(mult(x, y, num(x), num(y)));
	}
}
