package weatherwatcher;

public class WeatherManager {
	
	public int calcScore(Double temp,Double windspeed, Double winddirection)
	{
		System.out.println("Input data received for calculating score "+ temp + "::"+ winddirection + "::"+ windspeed);
		int launchWindowScore =  (int) (java.lang.Math.abs(20-temp) + windspeed + java.lang.Math.abs(220 - winddirection) * 0.1);
		return launchWindowScore;		
		
	}

}
