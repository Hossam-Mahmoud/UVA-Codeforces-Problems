
public class WhichDay {
	public static String getDay(String[] notOnThisDay){
		boolean[] week = {true,true,true,true,true,true,true};
		String[] days = {"Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday"};
		for(int i=0; i<notOnThisDay.length; i++){
			if(notOnThisDay[i].equals("Saturday")){
				week[0]= false;
			}else if(notOnThisDay[i].equals("Sunday")){
				week[1]= false;
			}else if(notOnThisDay[i].equals("Monday")){
				week[2]=false;
			}else if(notOnThisDay[i].equals("Tuesday")){
				week[3]=false;
			}else if(notOnThisDay[i].equals("Wednesday")){
				week[4]=false;
			}else if(notOnThisDay[i].equals("Thursday")){
				week[5]=false;
			}else if(notOnThisDay[i].equals("Friday")){
				week[6]=false;
			}
		}int j =0;
		while(j<week.length){
			if(week[j] == true){
				break;
			}
			j++;
		}
		return days[j];
	}
}
