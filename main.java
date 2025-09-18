import java.util.Scanner;

public class main {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("TimeEasyTools - ver.0.1  Author: Dmitry Khorov ( tg: @jpegweb)\nDK Studio Production (c) 2023-2025\n");
		System.out.print("Введите данное время (Пример: 15:30): ");
        String time = input.nextLine();
		
		System.out.print("Введите сколько прибавить минут (Пример: 30 БЕЗ СИМВОЛОВ И слов просто цифра): ");
        String timeOutString = input.nextLine();
		int HDK = 0;
		try {
		  HDK  = Integer.parseInt(timeOutString);
		  int timeOut = HDK;
        String[] word = time.split(":");
	    System.out.println("Время до:"+word[0] +":"+ word[1]);
        String x = word[0];
		String y = word[1];
		int timeOne = 0;
        int timeSecond = 0;
		try{
		   timeOne = Integer.parseInt(x);
		   timeSecond = Integer.parseInt(y);
		   if (timeOne > 23){
		    System.out.print("Нельзя использовать выше 23ч там 24,25,26,... не поддерживается. Используйте 00,01,02 и т.п\n");
			System.out.print("Your time set is 00h.");
			timeOne = 0;
		   }
		    if (timeSecond > 59){
		    System.out.print("Нельзя использовать выше 59мин там 60,70,80,... не поддерживается. Используйте 00,10,20 и т.п\n");
			System.out.print("Your time set is 00min.");
			timeSecond = 0;
		   }
		   int JPK = timeSecond + timeOut;
		   int totalMinutes = 0;
		   int newHours = 0;
		   int newMinutes = 0;
		    totalMinutes = timeOne * 60 + timeSecond + timeOut;
		    newHours = (totalMinutes / 60) % 24;
		    newMinutes = totalMinutes % 60;
		   String EndResult1 = String.valueOf(JPK);
		   System.out.printf("Время после %d мин: %02d:%02d\n", HDK, newHours, newMinutes);
		} catch (NumberFormatException e) {
		   System.out.println("Ошибка: введено не число");
        };
		
		}catch(NumberFormatException e){
	      System.out.print("Error!");
		}
		
		
		
    }
}
