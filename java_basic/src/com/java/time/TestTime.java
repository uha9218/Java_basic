package com.java.time;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class TestTime {

	public static void main(String[] args) {

//		���� ��¥ -> �ð�, KST, �⵵�� ���� ȣ��Ǿ� �����
		Date toDay_date = new Date();
		System.out.println(toDay_date);
//		������ �ν��Ͻ� ���� �Ұ�
		Calendar toDay_calendar = Calendar.getInstance();
		toDay_calendar.setTime(toDay_date);
		System.out.println(toDay_calendar.YEAR + "/" + toDay_calendar.MONTH + "/" + toDay_calendar.DATE);

//		�̰ŷ� �ٲ�
		LocalDate toDay_localDate = LocalDate.now();
		LocalDateTime toDay_localDateTime = LocalDateTime.now();
		System.out.println(toDay_localDate);
		System.out.println(toDay_localDateTime);

//		Ư�� ��¥
		Date theDay1_date = new Date(2000 - 1900, 06, 17); // yyyy, MM, dd
		Date theDay2_date = new Date(2000 - 1900, 06, 17, 17, 8, 46); // yyyy, MM, dd, HH, mm, ss
		System.out.println(theDay1_date);
		System.out.println(theDay2_date);

		Calendar theDay1_calendar = Calendar.getInstance();
		theDay1_calendar.set(2000, Calendar.JUNE + 1, 17, 17, 8, 30);
		System.out.println(theDay1_calendar.get(Calendar.YEAR) + "/" + theDay1_calendar.get(Calendar.MONTH) + "/"
				+ theDay1_calendar.get(Calendar.DATE) + " " + theDay1_calendar.get(Calendar.HOUR_OF_DAY) + ":"
				+ theDay1_calendar.get(Calendar.MINUTE) + ":" + theDay1_calendar.get(Calendar.SECOND));

//		�ð� ��� X
		LocalDate theDay1_localDate = LocalDate.of(2000, 06, 17);
		LocalDate theDay1_localDate_format = LocalDate.parse("2000-06-17");
		System.out.println(theDay1_localDate);
		System.out.println(theDay1_localDate_format);

		System.out.println("������ �١ڡ� ������");

//		��¥ ��ȯ : ���ڿ� -> ��¥
		String dateStr1 = "2023/06/12";
		String dateStr2 = "2023/06/12 10:53:12";

		try {
			Date date1 = new SimpleDateFormat("yyyy/MM/dd").parse(dateStr1);
			Date date2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").parse(dateStr2);
			
			System.out.println(date1);
			System.out.println(date2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
//		��¥ ��ȯ : ��¥ -> ����ȭ(���ڿ�)
		Date target = new Date();
		String dayStr = new SimpleDateFormat("yyyy�� MM�� dd��").format(target);
		System.out.println(dayStr);
		
		
		
		
	}

}