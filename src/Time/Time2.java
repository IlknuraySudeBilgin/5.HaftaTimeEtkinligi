package Time;

public class Time2 {

	
	private int hour;
	private int second;
	private int minute;
	
	public Time2 ( ) {
		
	}
	public Time2(int saat) {
		this.hour=saat;
	}
	public Time2(int saat,int dakika) {
		this.minute=dakika;
		this.hour=saat;
	}
	
	public Time2(int saat,int dakika,int saniye) {
		this.minute=dakika;
		this.hour=saat;
		this.second=saniye;
	}
	
	public void setSaat(int saat) {
		if(hour<0 || hour>23  )
		{
			System.out.println("yanlis saat degerleri girdiniz");
		}
			
		this.hour= hour;
		
	}
	
	
	public void setSaatDakika(int saat,int dakika) {
		
		if(hour<0 || hour>23 || minute<0 || minute>59 )
		{
			System.out.println("yanlis saat degerleri girdiniz");
		}
			
		this.hour= hour;
		this.minute= minute;
	}
	
	
	public void setSaatDakikaSaniye(int saat,int minute,int saniye) {
		if(hour<0 || hour>23 || minute<0 || minute>59 || second<0 || second>59)
		{
			System.out.println("yanlis saat degerleri girdiniz");
		}
			
		this.hour= hour;
		this.minute= minute;
		this.second= second;
		
		
	}
	public String saat() //yaz bu kısmı eksik kaldı
	{
		return String.format("%02d:%02d:%02d",hour,minute,second );
	}

}
