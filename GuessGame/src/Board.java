
public class Board {
	String [] districtBD={"Dhaka","Barishal","Khulna","Pabna","Rajshahi","Magura",
			"Bhola","Dinajpur","Gazipur"};
	private  int score=0;
	private static int maxScore=0;
	private String name="";
	public Board(String name){
		this.name=name;
	}
	public void addScore(){
		score+=10;
	};
	public String getName(){
		return name;
	}
	public int getScore(){
		return score;
	}
	public String getString(int index){
		return districtBD[index];
	}
	public void setMaxScore(int score,int preMax){
		if(score>preMax)
			maxScore=score;
	}
	public int getMaxScore(){
		return maxScore;
	}
}
