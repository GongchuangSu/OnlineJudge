/**
 * @description 计算日期到天数转换
 * @author GongchuangSu
 * @since 2016.08.12
 * @explain 输入某年某月某日，判断这一天是这一年的第几天？
 *          输入：输入三行，分别是年，月，日
 *          输出：成功，则返回outDay输出计算后的第几天
 *                失败，则返回-1
 *          样例：
 *              输入：2012
 *                    12
 *                    31
 *              输出：366
 * @知识点    字符串
 */
import java.util.*;

public class Main {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	while(sc.hasNext()){
    		int year = Integer.valueOf(sc.nextLine());
    		int month = Integer.valueOf(sc.nextLine());
    		int day = Integer.valueOf(sc.nextLine());
    		if(month < 1 || month > 12 || day <= 0 || day > daysOfMonth(year, month)){
    			System.out.println("-1");
    			break;
    		}
    		int count = 0;
    		for(int i = 1; i < month; i++){
    			count += daysOfMonth(year, i);
    		}
        	System.out.println(count + day);
    	}
    	sc.close();
    }
    
    /**
     * 功能：根据年月确定某月的天数
     */
    public static int daysOfMonth(int year, int month){
    	int days = 0;
    	switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			days = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		case 2:
			if(isLeapYear(year))
				days = 29;
			else
				days = 28;
			break;				
		}
    	return days;
    }
    
    /**
     * 功能：判断是否为闰年
     */
    public static boolean isLeapYear(int year){
    	if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
    		return true;
    	else {
			return false;
		}
    }
}