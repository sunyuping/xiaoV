package org.androidtest.robotp.beans;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 周 java bean
 *
 * @author Vince蔡培培
 */
public class Week {
	private String weekNum;
	private int beginYear;
	private int endYear;
	// 周开始日期 格式: MM/dd
	private String weekBegin;
	// 周结束日期 格式: MM/dd
	private String weekEnd;

	public int getBeginYear() {
		return beginYear;
	}

	public void setBeginYear(int beginYear) {
		this.beginYear = beginYear;
	}

	public int getEndYear() {
		return endYear;
	}

	public void setEndYear(int endYear) {
		this.endYear = endYear;
	}

	public String getWeekBegin() {
		return weekBegin;
	}

	public void setWeekBegin(String weekBegin) {
		this.weekBegin = weekBegin;
	}

	/**
	 * 获取周开始日期 (yyyy/MM/dd)
	 *
	 * @return
	 */
	public Date getWeekBeginDate() {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
		String strDate = beginYear + "/" + weekBegin;
		Date date = new Date();
		try {
			date = formatter.parse(strDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	public String getWeekEnd() {
		return weekEnd;
	}

	public void setWeekEnd(String weekEnd) {
		this.weekEnd = weekEnd;
	}

	/**
	 * 获取周结束日期 (yyyy/MM/dd)
	 *
	 * @return
	 */
	public Date getWeekEndDate() {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
		String strDate = endYear + "/" + weekEnd;
		Date date = new Date();
		try {
			date = formatter.parse(strDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	public String getWeekNum() {
		return weekNum;
	}

	public void setWeekNum(String weekNum) {
		this.weekNum = weekNum;
	}

	@Override
	public String toString() {
		return beginYear + weekBegin + "-" + endYear + weekEnd + "(第" + weekNum
				+ "周)";
	}

}