package com.soecode.lyf.entity;

public class Safetyrecord {
	private int id=-1;
	private String date;
	private String time;
	private int first=-1;
	private int second=-1;
	private int third=-1;
	private int fourth=-1;
	private int fifth=-1;
	private int sixth=-1;
	private int seventh=-1;
	private int eighth=-1;
	private int nineth=-1;
	private int tenth=-1;
	private int eleventh=-1;
	private int twelveth=-1;
	private int thirteenth=-1;
	
	private MyDate date1;
	
	public Safetyrecord(){}
	
	public Safetyrecord(int id,String date,String time,int first,int second,int third,
	int fourth,int fifth,int sixth,int seventh,int eighth,int nineth,int tenth,
	int eleventh,int twelveth,int thirteenth)
	{
		this.id=id;
		this.date=date;
		this.time=time;
		this.first=first;
		this.second=second;
		this.third=third;
		this.fourth=fourth;
		this.fifth=fifth;
		this.sixth=sixth;
		this.seventh=seventh;
		this.eighth=eighth;
		this.nineth=nineth;
		this.tenth=tenth;
		this.eleventh=eleventh;
		this.twelveth=twelveth;
		this.thirteenth=thirteenth;
		
	}
	
	/**
	 * @return the fourth
	 */
	public int getFourth() {
		return fourth;
	}
	/**
	 * @param fourth the fourth to set
	 */
	public void setFourth(int fourth) {
		this.fourth = fourth;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}
	/**
	 * @return the time
	 */
	public String getTime() {
		return time;
	}
	/**
	 * @param time the time to set
	 */
	public void setTime(String time) {
		this.time = time;
	}
	/**
	 * @return the first
	 */
	public int getFirst() {
		return first;
	}
	/**
	 * @param first the first to set
	 */
	public void setFirst(int first) {
		this.first = first;
	}
	/**
	 * @return the second
	 */
	public int getSecond() {
		return second;
	}
	/**
	 * @param second the second to set
	 */
	public void setSecond(int second) {
		this.second = second;
	}
	/**
	 * @return the third
	 */
	public int getThird() {
		return third;
	}
	/**
	 * @param third the third to set
	 */
	public void setThird(int third) {
		this.third = third;
	}
	/**
	 * @return the fifth
	 */
	public int getFifth() {
		return fifth;
	}
	/**
	 * @param fifth the fifth to set
	 */
	public void setFifth(int fifth) {
		this.fifth = fifth;
	}
	/**
	 * @return the sixth
	 */
	public int getSixth() {
		return sixth;
	}
	/**
	 * @param sixth the sixth to set
	 */
	public void setSixth(int sixth) {
		this.sixth = sixth;
	}
	/**
	 * @return the seventh
	 */
	public int getSeventh() {
		return seventh;
	}
	/**
	 * @param seventh the seventh to set
	 */
	public void setSeventh(int seventh) {
		this.seventh = seventh;
	}
	/**
	 * @return the eighth
	 */
	public int getEighth() {
		return eighth;
	}
	/**
	 * @param eighth the eighth to set
	 */
	public void setEighth(int eighth) {
		this.eighth = eighth;
	}
	/**
	 * @return the nineth
	 */
	public int getNineth() {
		return nineth;
	}
	/**
	 * @param nineth the nineth to set
	 */
	public void setNineth(int nineth) {
		this.nineth = nineth;
	}
	/**
	 * @return the tenth
	 */
	public int getTenth() {
		return tenth;
	}
	/**
	 * @param tenth the tenth to set
	 */
	public void setTenth(int tenth) {
		this.tenth = tenth;
	}
	/**
	 * @return the eleventh
	 */
	public int getEleventh() {
		return eleventh;
	}
	/**
	 * @param eleventh the eleventh to set
	 */
	public void setEleventh(int eleventh) {
		this.eleventh = eleventh;
	}
	/**
	 * @return the twelveth
	 */
	public int getTwelveth() {
		return twelveth;
	}
	/**
	 * @param twelveth the twelveth to set
	 */
	public void setTwelveth(int twelveth) {
		this.twelveth = twelveth;
	}
	/**
	 * @return the thirteenth
	 */
	public int getThirteenth() {
		return thirteenth;
	}
	/**
	 * @param thirteenth the thirteenth to set
	 */
	public void setThirteenth(int thirteenth) {
		this.thirteenth = thirteenth;
	}
	
	public MyDate getDate1()
	{
		String[] dat=this.date.split("-");
		this.date1=new MyDate(Integer.parseInt(dat[0]),Integer.parseInt(dat[1]),Integer.parseInt(dat[2]));
		return date1;
	}
	
	public int getHour()//获取时间中的hour
	{
		String[] tim=this.time.split(":");
		return Integer.parseInt(tim[0]); 
	}
	
	
	public char showint(int x)//在表中进行操作（打勾、打叉、无）
	{
		if(x==-1)return ' ';
	    else if(x==0)return '√';
		else return '×';
	}
	@Override
	public String toString() {
		
		return "Safetyrecord [Id=" + id + ", date=" + getDate1().getDay() + ", time=" + getHour() +", first=" + first+ "]";
	}
	

}
