package by.java_tutorial.week4.simple_class_and_object.task6;

public class TimeMoment {
	
	private static final int SECONDS_IN_MINUTE = 60;
	private static final int MINUTES_IN_HOUR = 60;
	private static final int HOURS_IN_DAY = 24;
	
	private int seconds;
	private int minutes;
	private int hours;
	
	private void update() {
		minutes += seconds / SECONDS_IN_MINUTE;
		seconds %= SECONDS_IN_MINUTE;
		
		hours += minutes / MINUTES_IN_HOUR;
		minutes %= MINUTES_IN_HOUR;
		
		hours %= HOURS_IN_DAY;
	}
	

	public TimeMoment() {
		setSeconds(0);
		setMinutes(0);
		setHours(0);
	}
	
	public TimeMoment(int seconds, int minutes, int hours) {
		setSeconds(seconds);
		setMinutes(minutes);
		setHours(hours);
	}
	
	public TimeMoment(String in) {
		if (in.matches("\\d\\d:\\d\\d:\\d\\d")) {
			
			int parsedHours = Integer.parseInt(in.substring(0, 2));
			setHours(parsedHours);
			
			int parsedMinutes = Integer.parseInt(in.substring(3, 5));
			setMinutes(parsedMinutes);
			
			int parsedSeconds = Integer.parseInt(in.substring(6));
			setSeconds(parsedSeconds);
		} else {
			setSeconds(0);
			setMinutes(0);
			setHours(0);
		}
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		if (seconds < 0 || seconds >= SECONDS_IN_MINUTE) {
			this.seconds = 0;
		} else {
			this.seconds = seconds;
		}
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		if (minutes < 0 || minutes >= MINUTES_IN_HOUR) {
			this.minutes = 0;
		} else {
			this.minutes = minutes;
		}
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		if (hours < 0 || hours >= HOURS_IN_DAY) {
			this.hours = 0;
		} else {
			this.hours = hours;
		}
	}
	
	public void addSeconds(int seconds) {
		if (seconds < 0) {
			return;
		}
		this.seconds += seconds;
		update();
	}
	
	public void addMinutes(int minutes) {
		if (minutes < 0) {
			return;
		}
		this.minutes += minutes;
		update();
	}
	
	public void addHours(int hours) {
		if (hours < 0) {
			return;
		}
		this.hours += hours;
		update();
	}


	@Override
	public String toString() {
		return String.format("%02d:%02d:%02d", hours, minutes, seconds);
	}
}
