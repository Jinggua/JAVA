/*
某人有100,000元, 每经历一个路口, 需要缴费, 规则如下:
1) 当现金 > 50000时, 每次交 5%
2) 当现金<=50000时, 每次交1000
计算该人可以经过多少个路口, 使用while 和 break 完成
 */
public class HomeWork01 {
	public static void main(String[] args) {
		int total = 0;
		double money = 100000;
		while(true) {
			if (money > 50000) {
				total++;
				money -= money * 0.05;
			} else if(money >= 1000) {
				money -= 1000;
				total++;
			} else  {
				// 钱不够了
				break;
			}
		}
		System.out.println(100000 + "可以过" + total + "个路口");
	}
}