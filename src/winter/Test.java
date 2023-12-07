package winter;

import java.sql.Timestamp;
import java.util.UUID;

public class Test {

	public static void main(String[] args) {

		String ok = UUID.randomUUID().toString();

		System.out.println(ok);

	}

	/**
	 * 打印信息
	 * 
	 * @param o
	 */
	public static void log(Object o) {

		String time = (new Timestamp(System.currentTimeMillis())).toString().substring(0, 19);

		System.out.println("[" + time + "] " + (o == null ? null : o.toString()));

	}

}
